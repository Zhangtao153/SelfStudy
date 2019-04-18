<%--
  @author zth
  @create  2019-04-18 9:11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>按钮</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>
<div style="height: 20px"></div>
<div class="layui-container layui-col-md8 layui-bg-black layui-col-md-offset1">
    <button class="layui-btn">标准按钮</button>
    <a class="layui-btn" href="helloWorld.jsp"></a>

    <%--主题--%>
    <button class="layui-btn layui-btn-primary">原始</button>
    <button class="layui-btn layui-btn-danger">警告</button>
    <button class="layui-btn layui-btn-normal">百搭</button>
    <button class="layui-btn layui-btn-warm">暖色</button>
    <button class="layui-btn layui-btn-disabled">禁用</button>

</div>

<div style="height: 20px ;clear: both" ></div>
<div class="layui-container layui-col-md8 layui-bg-black layui-col-md-offset1">

    <%--尺寸--%>

    <button class="layui-btn layui-btn-lg">大型</button>
    <button class="layui-btn ">默认</button>
    <button class="layui-btn layui-btn-sm">小型</button>
    <button class="layui-btn layui-btn-xs">迷你</button>

</div>


<div style="height: 20px ;clear: both" ></div>
<div class="layui-container layui-col-md8 layui-bg-black layui-col-md-offset1">

    <%--流体按钮--%>
    <button class="layui-btn layui-btn-fluid">流体按钮</button>

</div>

<div style="height: 20px ;clear: both" ></div>
<div class="layui-container layui-col-md8 layui-bg-black layui-col-md-offset1">

    <%--圆角--%>
        <button class="layui-btn layui-btn-radius layui-btn-primary">原始</button>
        <button class="layui-btn layui-btn-radius layui-btn-danger">警告</button>
        <button class="layui-btn layui-btn-radius layui-btn-normal">百搭</button>
        <button class="layui-btn layui-btn-radius layui-btn-warm">暖色</button>
        <button class="layui-btn layui-btn-radius layui-btn-disabled">禁用</button>

</div>

<div style="height: 20px ;clear: both" ></div>
<div class="layui-container layui-col-md8 layui-bg-black layui-col-md-offset1">

    <%--图标--%>
    <button class="layui-btn layui-btn-radius layui-btn-primary"><i class="layui-icon layui-icon-face-smile"></i></button>
    <button class="layui-btn layui-btn-radius layui-btn-danger"><i class="layui-icon layui-icon-login-wechat"></i></button>
    <button class="layui-btn layui-btn-radius layui-btn-normal"><i class="layui-icon layui-icon-login-qq"></i></button>
    <button class="layui-btn layui-btn-radius layui-btn-warm"><i class="layui-icon layui-icon-login-weibo"></i></button>
    <button class="layui-btn layui-btn-radius layui-btn-disabled"><i CLASS="layui-icon layui-icon-share"></i></button>

</div>

<div style="height: 20px ;clear: both" ></div>
<div class="layui-container layui-col-md8 layui-bg-black layui-col-md-offset1">

    <%--按钮组--%>
    <div class="layui-btn-group">
        <button class="layui-btn  "><i class="layui-icon layui-icon-add-1"></i></button>
        <button class="layui-btn "><i class="layui-icon layui-icon-edit"></i></button>
        <button class="layui-btn "><i class="layui-icon layui-icon-delete"></i></button>
        <button class="layui-btn  "><i class="layui-icon layui-icon-set"></i></button>
        <button class="layui-btn  "><i CLASS="layui-icon layui-icon-set-fill"></i></button>
    </div>

</div>

<div style="height: 20px ;clear: both" ></div>
<div class="layui-container layui-col-md8 layui-bg-black layui-col-md-offset1">

    <%--按钮组--%>
    <div class="layui-btn-container">
        <button class="layui-btn  "><i class="layui-icon layui-icon-add-1"></i></button>
        <button class="layui-btn "><i class="layui-icon layui-icon-edit"></i></button>
        <button class="layui-btn "><i class="layui-icon layui-icon-delete"></i></button>
        <button class="layui-btn  "><i class="layui-icon layui-icon-set"></i></button>
        <button class="layui-btn  "><i CLASS="layui-icon layui-icon-set-fill"></i></button>
    </div>

</div>



</body>
</html>
