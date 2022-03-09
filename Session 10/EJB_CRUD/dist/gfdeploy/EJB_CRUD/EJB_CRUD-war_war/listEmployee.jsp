<%-- 
    Document   : listEMPLOYEE
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
        <h1>LIST EMPLOYEES!</h1>
        <c:if test="${not empty success}">
            <h3 style="color:green">${success}</h3>
        </c:if>
        <c:if  test="${not empty error}">
            <h3 style="color:red">${error}</h3>
        </c:if>
        <table border="1">
            <tr>
                <th>Employee Id</th>
                <th>Employee Name</th>
                <th>Gender</th>
                <th>Birthday</th>
                <th>Country</th>
                <th>Company</th>
                <th>Salary</th>
                <th>Details</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${list}" var="b">
                <tr>
                    <td>${b.id}</td>
                    <td>${b.name}</td>
                    <td>${b.gender}</td>
                    <td>${b.birthday}</td>
                    <td>${b.country}</td>
                    <td>${b.company}</td>
                    <td>${b.salary}</td>
                    <td>
                        <a href="DetailEmployee?id=${b.id}">detail</a>
                    </td>
                    <td>
                        <a href="DeleteEmployee?id=${b.id}" onclick="return confirm('Sure?')">delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="insertEmployee.jsp">Add New Employee</a>
    </body>
</html>
