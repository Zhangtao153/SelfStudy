<%--
  @author zth
  @create  2019-04-23 18:00
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>panel</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>

<div class="layui-container layui-col-md8 layui-col-md-offset2  layui-col-lg8 layui-col-lg-offset2">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend> 卡片面板</legend>
    </fieldset>

    <div style="padding: 20px; background-color: #e2e2e2">
        <div class="layui-row layui-col-space15">
            <div class="layui-col-lg6 layui-col-lm6">
                <div class="layui-card">
                    <div class="layui-card-header">卡片面板</div>
                    <div class="layui-card-body">
                        纵有红颜，百生千劫。
                    </div>
                </div>
            </div>

            <div class="layui-col-lg6 layui-col-lm6">
                <div class="layui-card  ">
                    <div class="layui-card-header">卡片面板</div>
                    <div class="layui-card-body">
                        难消君心，万古情愁。
                    </div>
                </div>
            </div>

            <div class="layui-col-md12">
                <div class="layui-card">
                    <div class="layui-card-header">标题</div>
                    <div class="layui-card-body">
                        内容
                    </div>
                </div>
            </div>
        </div>
    </div>


    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>手风琴折叠</legend>
    </fieldset>
    <div class="layui-collapse" lay-accordion="">
        <div class="layui-colla-item " >
            <h2 class="layui-colla-title ">纵有红颜</h2>
            <div class="layui-colla-content layui-show">南京的雨不停的下</div>
        </div>
        <div class="layui-colla-item">
            <h2 class="layui-colla-title">纵有红颜</h2>
            <div class="layui-colla-content">南京的雨不停的下</div>
        </div>
        <div class="layui-colla-item">
            <h2 class="layui-colla-title">纵有红颜</h2>
            <div class="layui-colla-content">南京的雨不停的下</div>
        </div>
    </div>

</div>


<script type="text/javascript">
    layui.use(['element','layer'], function(){
        var layer = layui.layer
            ,element = layui.element;


    });
</script>

</body>
</html>
