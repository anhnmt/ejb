/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.Computer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.ComputerBeanLocal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "UpdateComputer", urlPatterns = {"/UpdateComputer"})
public class UpdateComputer extends HttpServlet {

    @EJB
    private ComputerBeanLocal computerBean;

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
        Integer comId = Integer.parseInt(request.getParameter("comId"));
        String computerName = request.getParameter("computerName");
        String producer = request.getParameter("producer");
        
        Date dateMaking = null;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateMaking = sf.parse(request.getParameter("dateMaking"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        Integer yearWarranty = Integer.parseInt(request.getParameter("yearWarranty"));
        String config = request.getParameter("config");
        Double price = Double.parseDouble(request.getParameter("price"));
        
        Computer b = new Computer();
        b.setComId(comId);
        b.setComName(computerName);
        b.setProducer(producer);
        b.setDateMaking(dateMaking);
        b.setYearWarranty(yearWarranty);
        b.setConfig(config);
        b.setPrice(price);
        
        boolean bl = computerBean.updateComputer(b);
        if(bl){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{
            request.setAttribute("error", "Update failed!");
            request.setAttribute("b", b);
        request.getRequestDispatcher("updateComputer.jsp").forward(request, response);
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

}
