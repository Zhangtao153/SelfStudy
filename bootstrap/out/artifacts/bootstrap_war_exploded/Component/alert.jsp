<%--
  @author zth
  @create  2019-05-03 22:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>警告框</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container col-md-8 col-md-offset-2">
    <div class="alert alert-success">success</div>
    <div class="alert alert-info">info</div>
    <div class="alert alert-warning">warning</div>
    <div class="alert alert-danger">danger</div>
    <br><br>
    <h3>可关闭的警告框</h3>
    <div class="alert-danger alert alert-dismissable">
        <button type="button" class="close " data-dismiss="alert">&times;</button>
        danger!!!!
    </div>
    <br>
    <h3>警告框中的链接</h3>
    <div class="alert alert-warning">
        <a href="http://www.baidu.com" class="alert-link">baidu</a>
    </div>
</div>
</body>
</html>
