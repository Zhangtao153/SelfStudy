<%--
  @author zth
  @create  2019-05-03 21:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分页</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="col-md-offset-2 col-md-8">
    <nav>
        <ul class="pagination">
            <li>
                <a href="#"><span>&laquo;</span></a>
            </li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#"><span>&raquo;</span></a>
            </li>
        </ul>
    </nav>

    <br><br>
    <h3>禁用</h3>
    <nav>
        <ul class="pagination">
            <li class="disabled">
                <a href="#"><span>&laquo;</span></a>
            </li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#"><span>&raquo;</span></a>
            </li>
        </ul>
    </nav>

    <br><br>
    <h3>尺寸</h3>
    <nav>
        <ul class="pagination pagination-lg">
            <li>
                <a href="#"><span>&laquo;</span></a>
            </li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#"><span>&raquo;</span></a>
            </li>
        </ul>
    </nav>
    <br>
    <nav>
        <ul class="pagination pagination-sm">
            <li>
                <a href="#"><span>&laquo;</span></a>
            </li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#"><span>&raquo;</span></a>
            </li>
        </ul>
    </nav>
    <br><br>
    <h3>翻页</h3>
    <ul class="pager">
        <li><a href="#">前一页</a></li>
        <li><a href="#">后一页</a></li>
    </ul>

    <br><br>
    <h3>对齐连接</h3>
    <ul class="pager">
        <li class="previous"><a href="#">前一页</a></li>
        <li class="next"><a href="#">后一页</a></li>
    </ul>
</div>
</body>
</html>
