<%-- 
    Document   : viewcars
    Created on : Oct 2, 2022, 2:53:06 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="com.aptech.entity.*,java.util.*"%>  
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

        <h1>List of Persons</h1>  



        <table border="1" width="90%">  
            <tr><th>Id</th><th>Name</th><th>Country</th></tr>  
                    <c:forEach items="${persons}" var="u">  
                <tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getCountry()}</td></tr>  
                </c:forEach>  
        </table>  

    </body>
</html>

