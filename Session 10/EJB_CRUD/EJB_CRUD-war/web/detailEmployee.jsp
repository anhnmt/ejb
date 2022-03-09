<%-- 
    Document   : insertEMPLOYEE
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
        <h1>DETAIL EMPLOYEE!</h1>

        <table>
            <tr>
                <td>Employee Id:</td>
                <td>${b.id}</td>
            </tr>
            <tr>
                <td>Employee Name:</td>
                <td>${b.name}</td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>${b.gender}</td>
            </tr>
            <tr>
                <td>Birthday</td>
                <td>${b.birthday}</td>
            </tr>
            <tr>
                <td>Country</td>
                <td>${b.country}</td>
            </tr>
            <tr>
                <td>Company</td>
                <td>${b.company}</td>
            </tr>
            <tr>
                <td>Salary</td>
                <td>${b.salary}</td>
            </tr>     
            <tr>
                <td><a href="index.jsp">Back</a></td>
                <td>
                    <a href="PreUpdateEmployee?id=${b.id}">update</a>
                </td>
            </tr>
        </table>
        
    </body>
</html>
