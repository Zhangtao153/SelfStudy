<%--
  @author zth
  @create  2019-05-01 11:11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下拉菜单</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container col-lg-8 col-lg-offset-2 " style="padding-top: 50px">
    <div class="dropdown "> <%--dropup--%>
        <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown">
            菜单<span class="caret"></span>
        </button>
        <ul class="dropdown-menu">
            <li class="bg-info"><a href="#">菜单一</a></li>
            <li><a href="#">菜单一</a></li>
            <li><a href="#">菜单一</a></li>
            <li><a href="#">菜单一</a></li>
        </ul>
    </div>

    <br><br>
    <h3>对齐</h3>
    <div class="dropdown" style="width: 225px">
        <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown">
            菜单<span class="caret"></span>
        </button>
        <ul class="dropdown-menu dropdown-menu-right">
            <li><a href="#">菜单一</a></li>
            <li><a href="#">菜单一</a></li>
            <li><a href="#">菜单一</a></li>
            <li><a href="#">菜单一</a></li>
        </ul>

    </div>

    <br><br>
    <h3>标题</h3>
    <div class="dropdown ">
        <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown">
            地区<span class="caret"></span>
        </button>
        <ul class="dropdown-menu">
            <li class="dropdown-header">陕西</li>
            <li><a href="#">西安</a></li>
            <li><a href="#">安康</a></li>
            <li class="dropdown-header">甘肃</li>
            <li><a href="#">兰州</a></li>
            <li><a href="#">天水</a></li>
        </ul>
    </div>

    <br><br>
    <h3>分割线</h3>
    <div class="dropdown ">
        <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown">
            地区<span class="caret"></span>
        </button>
        <ul class="dropdown-menu">
            <li class="divider"></li>
            <li><a href="#">西安</a></li>
            <li class="disabled"><a href="#">安康</a></li>
            <li class="divider"></li>
            <li><a href="#">兰州</a></li>
            <li><a href="#">天水</a></li>
        </ul>
    </div>
</div>

</body>
</html>
