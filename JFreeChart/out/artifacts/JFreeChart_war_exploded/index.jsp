<%@ page import="com.zth.BarChart01" %><%--
  @author zth
  @create  2019-05-24 10:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JFreeChart</title>
  </head>
  <body>
  <center>
      <a href="barChart01.jsp"><h3>柱状图01</h3></a>
          <%
              String fileName= BarChart01.getBarChart(session);
              System.out.println(fileName);
          %>
          <img src="DisplayChart?filename=<%=fileName %>"  border="0"/>
  </center>
  </body>
</html>
