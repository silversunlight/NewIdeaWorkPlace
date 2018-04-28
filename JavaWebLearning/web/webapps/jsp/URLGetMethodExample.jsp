<%--
  Created by IntelliJ IDEA.
  User: sunlang
  Date: 2018/4/26
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Using GET Method to Read Form</title>
</head>
<body>
    <h1>Using GET Method to Read Form</h1>
    <ul>
    <li><p><b>First Name:</b>
    <%= request.getParameter("first_name")%></p></li>
    <li><p><b>Last Name:</b>
    <%= request.getParameter("last_name")%></p></li>
    </ul>
</body>
</html>
