<%-- 
    Document   : insertTrip
    Created on : Feb 9, 2022, 7:21:06 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>UPDATE TRIP!</h1>
        <h3 style="color:red">${error}</h3>

        <form action="UpdateTrip" method="post">
            <table>
                <td><input type="hidden" name="tripId" value="${b.tripId}"/></td>
                <tr>
                    <td>Trip Name:</td>
                    <td><input type="text" name="tripName" value="${b.tripName}"/></td>
                </tr>
                <tr>
                    <td>Driver</td>
                    <td><input type="text" name="driver" value="${b.driver}"/></td>
                </tr>
                <tr>
                    <td>Date Making</td>
                    <td><input type="text" name="dateMaking" value="${b.dateMaking}"/></td>
                </tr>
                <tr>
                    <td>Guest</td>
                    <td><input type="number" name="guest" value="${b.guest}"/></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="number" name="price" value="${b.price}"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"/>
                        <input type="reset" value="Clear"/></td>
                </tr>
            </table>            
        </form>
    </body>
</html>
