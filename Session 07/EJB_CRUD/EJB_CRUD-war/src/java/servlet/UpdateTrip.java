/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.TripBeanRemote;
import entity.Trip;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "UpdateTrip", urlPatterns = {"/UpdateTrip"})
public class UpdateTrip extends HttpServlet {

    TripBeanRemote tripBean = lookupTripBeanRemote();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        Integer tripId = Integer.parseInt(request.getParameter("tripId"));
        String tripName = request.getParameter("tripName");
        String driver = request.getParameter("driver");

        Date dateMaking = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateMaking = sf.parse(request.getParameter("dateMaking"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        Integer guest = Integer.parseInt(request.getParameter("guest"));
        Double price = Double.parseDouble(request.getParameter("price"));

        Trip b = new Trip();
        b.setTripId(tripId);
        b.setTripName(tripName);
        b.setDriver(driver);
        b.setDateMaking(dateMaking);
        b.setGuest(guest);
        b.setPrice(price);

        TripBeanRemote tripBean = lookupTripBeanRemote();
        boolean bl = tripBean.updateTrip(b);
        if(bl){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{
            request.setAttribute("error", "Update failed!");
            request.setAttribute("b", b);
        request.getRequestDispatcher("updateTrip.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private TripBeanRemote lookupTripBeanRemote() {
        try {
            Context c = new InitialContext();
            return (TripBeanRemote) c.lookup("java:global/EJB_CRUD/EJB_CRUD-ejb/TripBean!bean.TripBeanRemote");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
