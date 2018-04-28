<%--
  Created by IntelliJ IDEA.
  User: sunlang
  Date: 2018/4/26
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Using JavaBean in JSP</title>
</head>
<body>
<center>
    <h2>using beans in JSP</h2>
    <jsp:useBean id="test" class="bean.TestBean"/>
    <jsp:setProperty name="test" property="message" value="Hello JSP"/>
    <p>Got message</p>
    <jsp:getProperty name="test" property="message"/>
</center>
</body>
</html>
