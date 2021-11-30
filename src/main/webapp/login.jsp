<%@ include file="index.jsp" %>
<hr/>

<h3>Login Form</h3>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        }
    }
%>

<br/>
<form action="login.jsp" method="post">
    Username:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>

    <input type="submit" value="login"/>
</form>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
