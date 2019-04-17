<%--
  @author zth
  @create  2019-04-17 22:47
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>layout</title>
    <script type="text/javascript" src="../layui/layui.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <style type="text/css">
        .div1{
            background-color: palegoldenrod;
            height: 20px;
        }
        .div2{
            background-color: pink;
            height: 20px;
        }
    </style>
</head>
<body>
<div class="layui-container">
    <div class="layui-row" >
        <div class="layui-col-md9">
            <div  class="div1">你的内容 9/12</div>
        </div>
        <div class="layui-col-md3" >
            <div class="div2">你的内容 3/12</div>
        </div>
    </div>

    移动设备、平板、桌面端的不同表现：
    <div class="layui-row">
        <div class="layui-col-xs6 layui-col-sm6 layui-col-md4" >
           <div class="div1"> 移动：6/12 | 平板：6/12 | 桌面：4/12</div>
        </div>
        <div class="layui-col-xs6 layui-col-sm6 layui-col-md4" >
            <div class="div2">移动：6/12 | 平板：6/12 | 桌面：4/12</div>
        </div>
        <div class="layui-col-xs4 layui-col-sm12 layui-col-md4" >
            <div class="div1">移动：4/12 | 平板：12/12 | 桌面：4/12</div>
        </div>
        <div class="layui-col-xs4 layui-col-sm7 layui-col-md8" >
           <div class="div2"> 移动：4/12 | 平板：7/12 | 桌面：8/12</div>
        </div>
        <div class="layui-col-xs4 layui-col-sm5 layui-col-md4" >
            <div class="div1">移动：4/12 | 平板：5/12 | 桌面：4/12</div>
        </div>
    </div>
    <div style="height: 20px"></div>


    <%--列间距--%>
    <div class="layui-row layui-col-space10">
        <div class="layui-col-md4">
            <div class="div1">md4</div>
        </div>
        <div class="layui-col-md4">
            <div class="div2">md4</div>
        </div>
        <div class="layui-col-md4">
            <div class="div1">md4</div>
        </div>
    </div>

    <div style="height: 20px"></div>
    <%--列偏移--%>
    <div class="layui-row">
        <div class="layui-col-xs12 layui-col-sm8 layui-col-sm-offset2 layui-col-md6 layui-col-md-offset3">
            <div class="div1">列偏移</div>
        </div>
    </div>

    
</div>
</body>
</html>
