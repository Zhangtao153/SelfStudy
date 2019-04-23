<%--
  @author zth
  @create  2019-04-23 10:22
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body class="layui-bg-gray">

<div class="layui-container layui-col-md8 layui-col-md-offset2  layui-col-lg8 layui-col-lg-offset2">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px">
        <legend>水平导航菜单</legend>
    </fieldset>

    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="#">最新活动</a></li>
        <li class="layui-nav-item layui-this">
            <a href="#">产品</a>
            <dl class="layui-nav-child">
                <dd><a href="#">产品1</a></dd>
                <dd><a href="#">产品2</a></dd>
                <dd><a href="#">产品3</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="#">大数据</a></li>
        <li class="layui-nav-item ">
            <a href="#">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="#">移动模块</a></dd>
                <dd><a href="#">电商模块</a></dd>
                <dd><a href="#">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="#">社区</a></li>
    </ul>

    <fieldset class="layui-field-title layui-elem-field" style="margin-top: 50px">
        <legend class="layui-">导航带徽章和图片</legend>
    </fieldset>

    <ul class="layui-nav">
        <li class="layui-nav-item">
            <a href="#">控制台<span class="layui-badge">9</span></a>
        </li>
        <li class="layui-nav-item">
            <a href="#">个人中心<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item">
            <a href="#">
                <img src="../res/mao.jpg" class="layui-nav-img">我
            </a>
            <dl class="layui-nav-child">
                <dd><a href="#">修改信息</a></dd>
                <dd><a href="#">安全管理</a></dd>
                <dd><a href="#">退出</a></dd>
            </dl>
        </li>
    </ul>

    <fieldset class="layui-field-title layui-elem-field" style="margin-top: 50px">
        <legend class="layui-">垂直/侧边导航</legend>
    </fieldset>

    <ul class="layui-nav layui-nav-tree layui-nav-side ">

        <li class="layui-nav-item layui-nav-itemed layui-bg-cyan ">
            <a href="#">产品</a>
            <dl class="layui-nav-child">
                <dd><a href="#">产品1</a></dd>
                <dd><a href="#">产品2</a></dd>
                <dd><a href="#">产品3</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item layui-bg-cyan">
            <a href="#">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="#">移动模块</a></dd>
                <dd><a href="#">电商模块</a></dd>
                <dd><a href="#">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="#">云市场</a></li>
        <li class="layui-nav-item"><a href="#">社区</a></li>
    </ul>

    <ul class="layui-nav layui-nav-tree  ">

        <li class="layui-nav-item layui-nav-itemed layui-bg-cyan ">
            <a href="#">产品</a>
            <dl class="layui-nav-child">
                <dd><a href="#">产品1</a></dd>
                <dd><a href="#">产品2</a></dd>
                <dd><a href="#">产品3</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item layui-bg-cyan">
            <a href="#">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="#">移动模块</a></dd>
                <dd><a href="#">电商模块</a></dd>
                <dd><a href="#">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="#">云市场</a></li>
        <li class="layui-nav-item"><a href="#">社区</a></li>
    </ul>

    <fieldset class="layui-field-title layui-elem-field" style="margin-top: 50px">
        <legend class="layui-">面包屑</legend>
    </fieldset>

    <span class="layui-breadcrumb">
  <a href="">首页</a>
  <a href="">国际新闻</a>
  <a href="">亚太地区</a>
  <a><cite>正文</cite></a>
</span>
    <br><br><br>

    <span class="layui-breadcrumb " lay-separator="-">
  <a href="">首页</a>
  <a href="">国际新闻</a>
  <a href="">亚太地区</a>
  <a><cite>正文</cite></a>
</span>
    <br><br><br>

    <span class="layui-breadcrumb" lay-separator="|">
  <a href="">首页</a>
  <a href="">国际新闻</a>
  <a href="">亚太地区</a>
  <a><cite>正文</cite></a>
</span>
    <br><br><br>


</div>




<script type="text/javascript">
    layui.use('element',function () {
        var element = layui.element;

    })
</script>

</body>
</html>
