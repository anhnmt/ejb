<%-- 
    Document   : insertTrip
    Created on : Feb 9, 2022, 7:21:06 PM
    Author     : Administrator
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DETAIL TRIP!</h1>

        <table>
            <tr>
                <td>Trip Id:</td>
                <td>${b.tripId}</td>
            </tr>
            <tr>
                <td>Trip Name:</td>
                <td>${b.tripName}</td>
            </tr>
            <tr>
                <td>Driver</td>
                <td>${b.driver}</td>
            </tr>
            <tr>
                <td>Date Making</td>
                <td>
                    <fmt:formatDate pattern="yyyy-MM-dd" value="${b.dateMaking}"/>
                </td>
            </tr>
            <tr>
                <td>Guest</td>
                <td>${b.guest}</td>
            </tr>
            <tr>
                <td>Price</td>
                <td>${b.price}</td>
            </tr>     
            <tr>
                <td><a href="index.jsp">Back</a></td>
                <td>
                    <a href="PreUpdateTrip?tripId=${b.tripId}">update</a>
                </td>
            </tr>
        </table>
        
    </body>
</html>
