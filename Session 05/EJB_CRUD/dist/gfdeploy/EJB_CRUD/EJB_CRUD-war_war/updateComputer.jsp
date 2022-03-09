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
        <h1>UPDATE COMPUTER!</h1>
        <h3 style="color:red">${error}</h3>
        
        <form action="UpdateComputer" method="post">
            <table>
                <tr>
                    <td>Computer Id:</td>
                    <td><input type="text" name="comId" disabled value="${b.comId}"/></td>
                </tr>
                <tr>
                    <td>Computer Name:</td>
                    <td><input type="text" name="computerName" value="${b.comName}"/></td>
                </tr>
                <tr>
                    <td>Producer</td>
                    <td><input type="text" name="producer" value="${b.producer}"/></td>
                </tr>
                <tr>
                    <td>Date Making</td>
                    <td><input type="date" name="dateMaking" value="${b.dateMaking}"/></td>
                </tr>
                <tr>
                    <td>Year Warranty</td>
                    <td><input type="number" name="yearWarranty" value="${b.yearWarranty}"/></td>
                </tr>
                <tr>
                    <td>Config</td>
                    <td><input type="number" name="config" value="${b.config}"/></td>
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
