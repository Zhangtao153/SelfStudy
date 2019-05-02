<%--
  @author zth
  @create  2019-05-02 22:13
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航条</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body style="height: 1200px">

<div class="container col-lg-offset-2 col-lg-8 ">
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed " data-toggle="collapse" data-target="#content">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="#" class="navbar-brand">Brand</a>
            </div>
            <div class="collapse navbar-collapse" id="content">
                <ul class="nav navbar-nav">
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

                <form action="#" class="navbar-form navbar-left">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
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

    </nav>

    
    <div style="height: 1500px"></div>
</div>
</body>
</html>
