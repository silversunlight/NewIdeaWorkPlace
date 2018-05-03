<%--
  Created by IntelliJ IDEA.
  User: sunlang
  Date: 2018/4/26
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int day=3; %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<% if (day == 1 | day == 7) {
    %>
<p>today is weekend!</p>
<% } else {
    %>
<p>today is not weekend!</p>
<% } %>

</body>
</html>
