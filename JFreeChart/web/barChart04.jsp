<%@ page import="com.zth.BarChart04" %><%--
  @author zth
  @create  2019-05-24 20:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>柱状图</title>
</head>
<body>
<center>
    <img src="DisplayChart?filename=<%=BarChart04.getBarChart(session)%>">
</center>
</body>
</html>
