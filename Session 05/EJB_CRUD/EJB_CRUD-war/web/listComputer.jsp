<%-- 
    Document   : listComputer
    Created on : Feb 9, 2022, 7:13:54 PM
    Author     : Administrator
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LIST COMPUTERS!</h1>
        <c:if test="${not empty success}">
            <h3 style="color:green">${success}</h3>
        </c:if>
        <c:if  test="${not empty error}">
            <h3 style="color:red">${error}</h3>
        </c:if>
        <table border="1">
            <tr>
                <th>Computer Id</th>
                <th>Computer Name</th>
                <th>Producer</th>
                <th>Date Making</th>
                <th>Year Warranty</th>
                <th>Config</th>
                <th>Price</th>
                <th>Details</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${list}" var="b">
                <tr>
                    <td>${b.comId}</td>
                    <td>${b.comName}</td>
                    <td>${b.producer}</td>
                    <td>${b.dateMaking}</td>
                    <td>${b.yearWarranty}</td>
                    <td>${b.config}</td>
                    <td>${b.price}</td>
                    <td>
                        <a href="DetailComputer?comId=${b.comId}">detail</a>
                    </td>
                    <td>
                        <a href="DeleteComputer?comId=${b.comId}" onclick="return confirm('Sure?')">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="insertComputer.jsp">Add New Computer</a>
    </body>
</html>
