<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: sunlang
  Date: 2018/4/26
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
    <title>Auto Refresh Header Example</title>
</head>
<body>
<center>
    <h2>Auto Refresh Header Example</h2>
    <% response.setIntHeader("Refresh", 5);
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        if (calendar.get(Calendar.AM_PM)==0) am_pm="AM";
        else am_pm="PM";
        String CT=hour+":"+minute+":"+second+" "+am_pm;
        out.println("Current time is: "+CT+"\n");
    %>
</center>
</body>
</html>
