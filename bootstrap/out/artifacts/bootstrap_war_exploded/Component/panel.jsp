<%--
  @author zth
  @create  2019-05-03 23:06
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>面板</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container col-md-8 col-md-offset-2">
    <div class="panel panel-default">
        <div class="panel-body">panel</div>
    </div>
    <br>
    <h3>带标题的面版</h3>
    <div class="panel panel-default">
        <div class="panel-heading">heading</div>
        <div class="panel-body">body</div>
    </div>

    <br>
    <h3>带脚注的面版</h3>
    <div class="panel panel-default">
        <div class="panel-heading">heading</div>
        <div class="panel-body">body</div>
        <div class="panel-footer">footer</div>
    </div>

    <br>
    <h3>情境效果</h3>
    <div class="panel panel-danger">
        <div class="panel-heading">heading</div>
        <div class="panel-body">body</div>
    </div>

</div>
</body>
</html>
