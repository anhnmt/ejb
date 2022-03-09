<%-- 
    Document   : listTrip
    Created on : Feb 9, 2022, 7:13:54 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LIST TRIPS!</h1>
        
        <form action="SearchTrips" method="get">
                <input type="text" name="keyword" id="keyword" placeholder="Search category..."
                       value="${search}">
                <button type="submit">Search</button>
        </form>
                
        <c:if test="${not empty success}">
            <h3 style="color:green">${success}</h3>
        </c:if>
        <c:if  test="${not empty error}">
            <h3 style="color:red">${error}</h3>
        </c:if>
        <table border="1">
            <tr>
                <th>Trip Id</th>
                <th>Trip Name</th>
                <th>Driver</th>
                <th>Date Making</th>
                <th>Guest</th>
                <th>Price</th>
                <th>Details</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${list}" var="b">
                <tr>
                    <td>${b.tripId}</td>
                    <td>${b.tripName}</td>
                    <td>${b.driver}</td>
                    <td>
                        <fmt:formatDate pattern="yyyy-MM-dd" value="${b.dateMaking}"/>
                    </td>
                    <td>${b.guest}</td>
                    <td>${b.price}</td>
                    <td>
                        <a href="DetailTrip?tripId=${b.tripId}">detail</a>
                    </td>
                    <td>
                        <a href="DeleteTrip?tripId=${b.tripId}" onclick="return confirm('Sure?')">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="insertTrip.jsp">Add New Trip</a>
    </body>
</html>
