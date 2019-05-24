<%@ page import="com.zth.BarChart01" %><%--
  @author zth
  @create  2019-05-24 19:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>柱状图1</title>
</head>
<body>
<center>
    <%
        String fileName= BarChart01.getBarChart(session);
        System.out.println(fileName);
    %>
    <img src="DisplayChart?filename=<%=fileName %>"  border="0"/>
</center>
</body>
</html>
