<%--
  @author zth
  @create  2019-04-23 17:18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>progress</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>
<div class="layui-container layui-col-md8 layui-col-md-offset2  layui-col-lg8 layui-col-lg-offset2">

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>默认风格的进度条</legend>
    </fieldset>

    <div class="layui-progress">
        <div class="layui-progress-bar" lay-percent="40%"></div>
    </div>
    <br><br>
    <div class="layui-progress" style="width: 300px">
        <div class="layui-progress-bar" lay-percent="40%"></div>
    </div>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>设置颜色</legend>
    </fieldset>
    <br><br>
    <div class="layui-progress " >
        <div class="layui-progress-bar layui-bg-green" lay-percent="30%"></div>
    </div>
    <br><br>
    <div class="layui-progress " >
        <div class="layui-progress-bar layui-bg-blue" lay-percent="40%"></div>
    </div>
    <br><br>
    <div class="layui-progress layui-bg-orange">
        <div class="layui-progress-bar layui-bg-green" lay-percent="50%"></div>
    </div>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>大尺寸</legend>
    </fieldset>
    <br><br>
    <div class="layui-progress layui-progress-big" >
        <div class="layui-progress-bar layui-bg-green" lay-percent="30%"></div>
    </div>
    <br><br>
    <div class="layui-progress layui-progress-big " >
        <div class="layui-progress-bar layui-bg-blue " lay-percent="40%"></div>
    </div>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>显示进度比文本</legend>
    </fieldset>
    <br><br>
    <div class="layui-progress " lay-showpercent="true">
        <div class="layui-progress-bar layui-bg-green" lay-percent="30%"></div>
    </div>
    <br><br>
    <div class="layui-progress " lay-showpercent="yes">
        <div class="layui-progress-bar layui-bg-blue" lay-percent="1/3"></div>
    </div>
    <br><br>
    <div class="layui-progress layui-bg-orange" lay-showpercent="hah">
        <div class="layui-progress-bar layui-bg-green" lay-percent="50%"></div>
    </div>


    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>动态改变进度</legend>
    </fieldset>
    <br><br>
    <div class="layui-progress layui-progress-big" lay-showpercent="true" lay-filter="demo">
        <div class="layui-progress-bar layui-bg-red" lay-percent="0%"></div>
    </div>


    <div class="site-demo-button" style="margin-top: 20px; margin-bottom: 0;">
        <button class="layui-btn site-demo-active" data-type="setPercent">设置50%</button>
        <button class="layui-btn site-demo-active" data-type="loading">模拟loading</button>
    </div>
    <div style="height: 50px"></div>

</div>


<script type="text/javascript">
    layui.use('element', function(){
        var $ = layui.jquery
            ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块

        //触发事件
        var active = {
            setPercent: function(){
                //设置50%进度
                element.progress('demo', '50%')
            }
            ,loading: function(othis){
                var DISABLED = 'layui-btn-disabled';
                if(othis.hasClass(DISABLED)) return;

                //模拟loading
                var n = 0, timer = setInterval(function(){
                    n = n + Math.random()*10|0;
                    if(n>100){
                        n = 100;
                        clearInterval(timer);
                        othis.removeClass(DISABLED);
                    }
                    element.progress('demo', n+'%');
                }, 300+Math.random()*1000);

                othis.addClass(DISABLED);
            }
        };

        $('.site-demo-active').on('click', function(){
            var othis = $(this), type = $(this).data('type');
            active[type] ? active[type].call(this, othis) : '';
        });
    });
</script>
</body>
</html>
