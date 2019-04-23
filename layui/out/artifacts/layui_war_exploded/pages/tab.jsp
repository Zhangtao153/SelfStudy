<%--
  @author zth
  @create  2019-04-23 15:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tab 选项卡</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body class="layui-bg-gray">
<div class="layui-container layui-col-md8 layui-col-md-offset2  layui-col-lg8 layui-col-lg-offset2">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px">
        <legend>默认风格 Tab</legend>
    </fieldset>

    <div class="layui-tab layui-bg-green">
        <div class="layui-tab-title">
            <li class="layui-this">网站设置</li>
            <li>用户管理</li>
            <li>权限分配</li>
            <li>商品管理</li>
            <li>订单管理</li>
        </div>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show ">12</div>
            <div class="layui-tab-item ">12qee</div>
            <div class="layui-tab-item">1qwe2</div>
            <div class="layui-tab-item">qe12</div>
        </div>
    </div>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px">
        <legend>简洁风格 Tab</legend>
    </fieldset>

    <div class="layui-tab  layui-tab-brief" lay-filter="docDemoTabBrief">
        <div class="layui-tab-title" style="color: #0C0C0C">
            <li class="layui-this" style="color: #ff0000">网站设置</li>
            <li>用户管理</li>
            <li>权限分配</li>
            <li>商品管理</li>
            <li>订单管理</li>
        </div>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show ">12</div>
            <div class="layui-tab-item ">12qee</div>
            <div class="layui-tab-item">1qwe2</div>
            <div class="layui-tab-item">qe12</div>
        </div>
    </div>


    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px">
        <legend>卡片风格 Tab</legend>
    </fieldset>
    <div class="layui-tab layui-tab-card  " >
        <ul class="layui-tab-title ">
            <li class="layui-this">网站设置</li>
            <li>用户管理</li>
            <li>权限分配</li>
            <li>商品管理</li>
            <li>订单管理</li>
        </ul>
        <div class="layui-tab-content" style="height: 100px;">
            <div class="layui-tab-item layui-show">123</div>
            <div class="layui-tab-item">内容2</div>
            <div class="layui-tab-item">内容3</div>
            <div class="layui-tab-item">内容4</div>
            <div class="layui-tab-item">内容5</div>
        </div>
    </div>


    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>带删除的 Tab</legend>
    </fieldset>

    <div class="layui-tab layui-tab-card" lay-allowclose="true">
        <ul class="layui-tab-title " >
            <li class="layui-this">网站设置</li>
            <li>用户管理</li>
            <li>权限分配</li>
            <li>商品管理</li>
            <li>订单管理</li>
        </ul>
        <div class="layui-tab-content" style="height: 100px;">
            <div class="layui-tab-item layui-show">默认宽度是相对于父元素100%适应的</div>
            <div class="layui-tab-item">2</div>
            <div class="layui-tab-item">3</div>
            <div class="layui-tab-item">4</div>
            <div class="layui-tab-item">5</div>
            <div class="layui-tab-item">6</div>
        </div>
    </div>



</div>



<script type="text/javascript">
    layui.use('element',function () {
        var $ = layui.jquery;
        var element = layui.element;
    })
</script>
</body>
</html>
