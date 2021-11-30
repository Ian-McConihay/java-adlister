<%--
  Created by IntelliJ IDEA.
  User: ianmcconihay
  Date: 11/30/21
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%! int counter = 0; int visits = 0; boolean visited = false;  %>

<%
    counter += 1;
    request.setAttribute("NumberOfVisits", counter);


    if(visits == 0) {
        request.setAttribute("hasUserBeenHere", false);
    } else {
    	request.setAttribute("hasUserBeenHere", true);
    }
    visits++;
%>








<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="partials/NavBar.jsp"%>

<%
    if (request.getParameter("reset") != null && request.getParameter("reset").equals("true")){
	counter = 0;
}

%>




<h1>The current count is <%= counter %>.</h1>
<h1>The current count is ${NumberOfVisits}.</h1>

<p>resetting counter: ${param.reset}</p>
<%--http://localhost:8080/Lecture.jsp?reset=true--%>

<p>Here are your results for ${param.searchTerm}</p>

<c:choose>
    <c:when test="${hasUserBeenHere}">
        <h2>Welcome Back</h2>
    </c:when>
    <c:otherwise>
        <h2>Hello </h2>
    </c:otherwise>
</c:choose>





<%@include file="partials/scripts.jsp"%>
</body>
</html>
