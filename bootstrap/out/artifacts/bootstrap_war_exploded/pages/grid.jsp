<%--
  @author zth
  @create  2019-04-28 17:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>栅格</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <style type="text/css">
        .c{
            border: 1px solid gray;
        }
    </style>
</head>
<body>

<div class="container ">
    <div class="row">
        <div class="col-md-1 c">哈哈</div>
        <div class="col-md-1 c" >哈哈</div>
        <div class="col-md-1 c">哈哈</div>
        <div class="col-md-1 c" >哈哈</div>
        <div class="col-md-1 c">哈哈</div>
        <div class="col-md-1 c" >哈哈</div>
        <div class="col-md-1 c">哈哈</div>
        <div class="col-md-1 c" >哈哈</div>
        <div class="col-md-1 c">哈哈</div>
        <div class="col-md-1 c" >哈哈</div>
        <div class="col-md-1 c">哈哈</div>
        <div class="col-md-1 c" >哈哈</div>

    </div>
    <br><br>
    <div class="row">
        <div class="col-md-8 c">haha</div>
        <div class="col-md-4 c">hhah</div>
    </div>

    <br><br>
    <h4>手机、平板、桌面</h4>

    <div class="row">
        <div class="clearfix visible-sm-block"></div>
        <div class="col-xs-6 col-sm-4  c">hah</div>
        <div class="clearfix visible-sm-block"></div>
        <div class="col-xs-6 col-sm-4  c">haha</div>
        <div class="col-xs-6 col-sm-4  c">haha</div>
    </div>
    <div class="row">
        <div class="col-xs-12 col-sm-6 col-md-8  c">haha</div>
        <div class="col-xs-6 col-md-4 c">hhah</div>
    </div>

    <br><br>
    <h4>列偏移</h4>
    <div class="row">
        <div class="col-md-offset-4 col-md-4 c">hahha</div>
    </div>

    <div class="row">
        <div class="col-md-3 col-sm-6 col-md-offset-3  c">.col-md-3 .col-md-offset-3</div>
        <div class="col-md-3 col-sm-3 col-md-offset-3 c" >.col-md-3 .col-md-offset-3</div>
    </div>

    <br><br>
    <h4>列排序</h4>
    <div class="row">
        <div class="col-md-4 c col-md-push-8">4</div>
        <div class="col-md-8 c col-md-pull-4">8</div>
    </div>
</div>

</body>
</html>
