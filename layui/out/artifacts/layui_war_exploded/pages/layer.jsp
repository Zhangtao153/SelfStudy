<%--
  @author zth
  @create  2019-04-24 18:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>layer</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body class="layui-bg-gray">
<div style="height: 40px"></div>
<div class="layui-container layui-container layui-col-md8 layui-col-md-offset2  layui-col-lg8 layui-col-lg-offset2 ">

    <div id="btns">
        <button data-method="myBtn" class="layui-btn">按钮</button>
        <button data-method="myBtn1" class="layui-btn">按钮</button>
        <button data-method="myBtn2" class="layui-btn">按钮</button>
    </div>
</div>

<script type="text/javascript">
    layui.use('layer',function () {
        var $ = layui.jquery;
        var layer = layui.layer;


        // 触发事件
        var active = {
            myBtn:function () {
                layer.open({
                        type:0
                    ,title:'你好啊'
                    ,content:'我不好！'
                    //,area:['300px','300px']
                    ,icon:3
                    }
                );
            },
            myBtn1:function () {
                layer.open({
                        type:0
                        ,title:'删除文件'
                        ,content:'确认删除'
                        ,icon:3
                    ,btn :['确认',"取消"]
                    ,closeBtn:1
                    ,time:3000
                    ,anim:6
                    }
                );
            },
            myBtn1:function () {
                layer.confirm();
            }
        };



        $('#btns .layui-btn').on('click',function () {
            var othis = $(this),method = othis.data('method');
            active[method]?active[method].call(this,othis):'';
        });

    });
</script>
</body>
</html>
