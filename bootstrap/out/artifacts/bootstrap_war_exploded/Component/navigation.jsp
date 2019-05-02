<%--
  @author zth
  @create  2019-05-02 9:51
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container col-lg-8 col-lg-offset-2 " style="padding-top: 50px;padding-bottom: 200px">
    <ul class="nav nav-tabs">
        <li class="active"><a href="#">首页</a></li>
        <li><a href="#">商城</a></li>
        <li><a href="#">我们</a></li>
    </ul>

    <br><br>
    <h3>胶囊式标签页</h3>
    <ul class="nav nav-pills">
        <li class="active"><a href="#">首页</a></li>
        <li><a href="#">商城</a></li>
        <li><a href="#">我们</a></li>
    </ul>

    <br><br>
    <h3>垂直排列胶囊式标签页</h3>
    <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#">首页</a></li>
        <li><a href="#">商城</a></li>
        <li><a href="#">我们</a></li>
    </ul>

    <br><br>
    <h3>两端对齐的标签页</h3>
    <ul class="nav nav-tabs nav-justified">
        <li class="active"><a href="#">首页</a></li>
        <li><a href="#">商城</a></li>
        <li><a href="#">我们</a></li>
    </ul>

    <br><br>
    <h3>禁用的连接标签页</h3>
    <ul class="nav nav-tabs nav-justified">
        <li class="active"><a href="#">首页</a></li>
        <li><a href="#">商城</a></li>
        <li class="disabled"><a href="#">我们</a></li>
    </ul>

    <br><br>
    <div class="bs-example">
        <h3>带下拉菜单的标签页</h3>
        <ul class="nav nav-tabs ">
            <li class="active"><a href="#">首页</a></li>
            <li><a href="#">商城</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"  role="button">我们
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">联系我们</a></li>
                    <li><a href="#">联系我们</a></li>
                    <li><a href="#">联系我们</a></li>
                </ul>
            </li>
        </ul>
    </div>

</div>

</body>
</html>
