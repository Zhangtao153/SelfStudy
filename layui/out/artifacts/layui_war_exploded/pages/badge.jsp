<%--
  @author zth
  @create  2019-04-24 15:35
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>badge</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>

<div class="layui-container layui-container layui-col-md8 layui-col-md-offset2  layui-col-lg8 layui-col-lg-offset2 " >

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>小徽章、大家族</legend>
    </fieldset>

    <blockquote class="layui-elem-quote layui-quote-nm">
        圆点：
        <span class="layui-badge-dot "></span>
        <span class="layui-badge-dot layui-bg-orange"></span>
        <span class="layui-badge-dot layui-bg-green"></span>
        <span class="layui-badge-dot layui-bg-cyan"></span>
        <span class="layui-badge-dot layui-bg-blue"></span>
        <span class="layui-badge-dot layui-bg-black"></span>
        <span class="layui-badge-dot layui-bg-gray"></span>

        <br><br>
        常规弧形徽章
        <span class="layui-badge">3</span>
        <span class="layui-badge layui-bg-gray">3</span>
        <span class="layui-badge layui-bg-black">3</span>
        <span class="layui-badge layui-bg-orange">3</span>
        <span class="layui-badge layui-bg-cyan">3</span>
        <br><br>
        边框徽章
        <span class="layui-badge-rim">3</span>
        <span class="layui-badge-rim">hot</span>

    </blockquote>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>与其它元素的搭配</legend>
    </fieldset>

    <button class="layui-btn">查看消息<span class="layui-badge">1</span></button>

    <button class="layui-btn">动态<span class="layui-badge-dot"></span></button>
    <br><br>

    <ul class="layui-nav ">
    <li class="layui-nav-item">
        <a href="">控制台<span class="layui-badge">9</span></a>
    </li>
    <li class="layui-nav-item">
        <a href="">个人中心<span class="layui-badge-dot"></span></a>
    </li>
    </ul>

</div>

</body>
</html>
