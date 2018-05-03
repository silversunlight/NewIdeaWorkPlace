<%@ page import="java.util.Timer" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %><%--
  Created by IntelliJ IDEA.
  User: sunlang
  Date: 2018/4/29
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>refresh Header</title>
</head>
<body>
<h2>自动刷新实例</h2>
<%
    response.setIntHeader("Refresh", 2);
    Calendar calendar = new GregorianCalendar();
    String am_pm;
    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    if (calendar.get(Calendar.AM_PM) == 0) {
        am_pm = "AM";
    } else {
        am_pm = "PM";
    }
    String ct=hour+":"+minute+":"+second+" "+am_pm;
    out.println("当前时间: "+ct+"\n");
    %>
</body>
</html>
