<%-- 
    Document   : mainpage
    Created on : Sep 25, 2017, 7:42:08 PM
    Author     : 578291
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html" />

        <h1>Main Page</h1>
        <p>
            Hello ${user.name} 
            <br><a href="login?message=Logged out.">Log out</a>
        </p>

    <c:import url="/includes/footer.html" />