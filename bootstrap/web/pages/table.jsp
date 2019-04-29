<%--
  @author zth
  @create  2019-04-29 15:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表格</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container col-md-8 col-md-offset-2">
    <div style="margin-top: 50px">    </div>
    <table class="table table-striped table-bordered table-hover ">
        <tr><th>姓名</th><th>年龄</th><th>性别</th></tr>
        <tr><td>张三</td><td>18</td><td>男</td></tr>
        <tr><td>李四</td><td>16</td><td>女</td></tr>
        <tr><td>王五</td><td>17</td><td>男</td></tr>
    </table>

    <h2>状态类</h2>
    <table class="table table-striped table-bordered table-hover ">
        <tr class="active"><th>姓名</th><th>年龄</th><th>性别</th></tr>
        <tr class="success"><td>张三</td><td>18</td><td>男</td></tr>
        <tr class="warning"><td>李四</td><td>16</td><td>女</td></tr>
        <tr class="danger"><td>王五</td><td>17</td><td>男</td></tr>
        <tr class="info"><td>王五</td><td>17</td><td>男</td></tr>
    </table>


</div>


</body>
</html>
