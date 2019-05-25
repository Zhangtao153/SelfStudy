<%@ page import="com.zth.PieChart02" %><%--
  @author zth
  @create  2019-05-24 19:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>饼状图</title>
</head>
<body>
<center>
    <%
        String fileName= PieChart02.getPieChart(session);
    %>
    <img src="DisplayChart?filename=<%=fileName %>"  border="0"/>
</center>
</body>
</html>
