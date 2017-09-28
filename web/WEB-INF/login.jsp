<%-- 
    Document   : login
    Created on : Sep 25, 2017, 7:41:54 PM
    Author     : 578291
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

        <h1>Login</h1>
        <div>
            <form action="login" method="post">
                Username: <input type="text" name="username" value="${incorrect.name}"><br>
                Password: <input type="text" name="password"><br>
                <input type="submit" name="submit">
            </form>
            <p>
                ${message}
            </p>
        </div>

    <c:import url="/includes/footer.html" />
