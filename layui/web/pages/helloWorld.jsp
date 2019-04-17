<%--
  @author zth
  @create  2019-04-17 21:06
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../layui/layui.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
</head>
<body>
<script type="text/javascript">
    layui.use(['layer','form'],function () {
        var layer = layui.layer
            ,form = layui.form;

        layer.msg("Hello world");
    });
</script>

</body>
</html>
