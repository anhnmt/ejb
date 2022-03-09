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
        <h1>INSERT NEW EMPLOYEE!</h1>
        <h3 style="color:red">${error}</h3>
        
        <form action="InsertEmployee" method="post">
            <table>
                <tr>
                    <td>Employee Name:</td>
                    <td><input type="text" name="name" value="${b.name}"/></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>Male <input type="checkbox" name="gender" value="true"/></td>
                </tr>
                <tr>
                    <td>Birthday</td>
                    <td><input type="date" name="birthday" value="${b.birthday}"/></td>
                </tr>
                <tr>
                    <td>Country</td>
                    <td><input type="text" name="country" value="${b.country}"/></td>
                </tr>
                <tr>
                    <td>Company</td>
                    <td><input type="text" name="company" value="${b.company}"/></td>
                </tr>
                <tr>
                    <td>Salary</td>
                    <td><input type="number" name="salary" value="${b.salary}"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Insert"/>
                        <input type="reset" value="Clear"/></td>
                </tr>
            </table>            
        </form>
    </body>
</html>
