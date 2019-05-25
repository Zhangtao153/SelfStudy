<%@ page import="com.zth.LineChart01" %><%--
  @author zth
  @create  2019-05-25 10:08
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>折线图</title>
</head>
<body>
<center>
    <img src="DisplayChart?filename=<%=LineChart01.getLineChart(session)%>">
</center>
</body>
</html>
