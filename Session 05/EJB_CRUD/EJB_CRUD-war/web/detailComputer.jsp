<%-- 
    Document   : insertComputer
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
        <h1>DETAIL COMPUTER!</h1>

        <table>
            <tr>
                <td>Computer Id:</td>
                <td>${b.comId}</td>
            </tr>
            <tr>
                <td>Computer Name:</td>
                <td>${b.comName}</td>
            </tr>
            <tr>
                <td>Producer</td>
                <td>${b.producer}</td>
            </tr>
            <tr>
                <td>Date Making</td>
                <td>${b.dateMaking}</td>
            </tr>
            <tr>
                <td>Year Warranty</td>
                <td>${b.yearWarranty}</td>
            </tr>
            <tr>
                <td>Config</td>
                <td>${b.config}</td>
            </tr>
            <tr>
                <td>Price</td>
                <td>${b.price}</td>
            </tr>     
            <tr>
                <td><a href="index.jsp">Back</a></td>
                <td>
                    <a href="PreUpdateComputer?comId=${b.comId}">update</a>
                </td>
            </tr>
        </table>
        
    </body>
</html>
