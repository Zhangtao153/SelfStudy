<%--
  @author zth
  @create  2019-04-18 14:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body class="layui-bg-gray">
<div style="height: 30px"></div>

<div style="background-color: #FFFFFF" class=" layui-container layui-col-md6 layui-col-md-offset3  layui-col-lg6 layui-col-lg-offset3 ">
    <div style="height: 30px"></div>

    <div style="height: 30px;font-size: 20px">
        <label class="layui-form-label " style="text-align: center;width: 100%;margin: 0px;padding: 0px" >基本信息</label>
    </div>
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">用户名:</label>
            <div class="layui-input-block">
                <input type="text" name="uname" lay-verify="title" required autocomplete="off" placeholder="请输入用户名" class="layui-input" >
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">密 &nbsp;&nbsp;&nbsp;码:</label>
            <div class="layui-input-block">
                <input type="text" name="upwd" lay-verify="pwd" autocomplete="off" placeholder="请输入密码" class="layui-input" >
            </div>
        </div>

        <div class="layui-form-item">

            <div class="layui-inline">
                <label class="layui-form-label">电&nbsp;&nbsp;&nbsp;话:</label>
                <div class="layui-input-inline">
                    <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input" placeholder="请输入电话">
                </div>
                <label class="layui-form-label">邮&nbsp;&nbsp;箱:</label>
                <div class="layui-input-inline">
                    <input type="tel" name="phone" lay-verify="required|email" autocomplete="off" class="layui-input" placeholder="请输入邮箱">
                </div>
            </div>

        </div>
        <div class="layui-form-item">

            <div class="layui-inline">
                <label class="layui-form-label">身份证号:</label>
                <div class="layui-input-inline">
                    <input type="tel" name="identity" lay-verify="required|identity" autocomplete="off" class="layui-input" placeholder="请输入身份证号">
                </div>
                <label class="layui-form-label">出生日期:</label>
                <div class="layui-input-inline">
                    <input type="tel" name="date" id="date" lay-verify="required|date" autocomplete="off" class="layui-input" placeholder="yyyy-MM-dd">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性&nbsp;&nbsp;&nbsp;别</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="男" title="男" checked="">
                <input type="radio" name="sex" value="女" title="女">
                <input type="radio" name="sex" value="禁" title="禁用" disabled="">
            </div>
        </div>


        <div class="layui-form-item">
            <label class="layui-form-label">爱 &nbsp;&nbsp;&nbsp;好:</label>

            <div class="layui-input-block">
                <select name="interest" >
                    <option value=""></option>
                    <option value="0">写作</option>
                    <option value="1" selected="">阅读</option>
                    <option value="2">游戏</option>
                    <option value="3">音乐</option>
                    <option value="4">旅行</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">居住城市:</label>
                <div class="layui-input-inline">
                    <select name="addres" >
                            <option value="">请选择现居地</option>
                            <optgroup label="陕西">
                                <option value="0">西安</option>
                                <option value="1">安康</option>
                            </optgroup>
                            <optgroup label="甘肃">
                                <option value="2">兰州</option>
                                <option value="3" selected>天水</option>
                            </optgroup>
                    </select>
                </div>
            </div>


            <div class="layui-inline">
                <label class="layui-form-label">搜索选择:</label>
                <div class="layui-input-inline">
                    <select name="modules" required lay-search="">
                        <option value="">请选择现居地</option>
                            <option value="0">西安</option>
                            <option value="1">安康</option>
                            <option value="2">兰州</option>
                            <option value="3" selected>天水</option>
                    </select>
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">技&nbsp;&nbsp;&nbsp;能:</label>

            <div class="layui-input-block">
                <input type="checkbox" name="前端" title="前端">
                <input type="checkbox" name="后台" title="后台">
                <input type="checkbox" name="数据库" checked title="数据库">
                <input type="checkbox" name="996" disabled checked title="996">
            </div>
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">自我介绍</label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" name="introduction" class="layui-textarea"></textarea>
            </div>
        </div>

        <div style="height: 30px"></div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="demo1">提交</button>
                <button type="reset" class="layui-btn layui-btn-primary" >重置</button>
            </div>
        </div>


    </form>
</div>




<script type="text/javascript">

    layui.use(['form','layedit','laydate'],function () {
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layedit
            ,laydate = layui.laydate;

        // 日期
        laydate.render({
            elem:'#date'
            }
        );

        // 创建一个编辑器
       // var deitIndex = layedit.build("LAY_demo_editor");

        // 自定义校验规则
        form.verify({
            title:function (value) {
                if (value.length > 15) {
                    return '用户名太长'
                }else if (value.length <= 0) {
                    return '用户名不能为空啊'
                }
            }
            ,pwd:[
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
        });

        // 监听提交
        form.on('submit(demo1)',function (data) {
            layer.alert(JSON.stringify(data.field),{
                title:'最终提交的信息'
            })
            return false;
        });

    });
</script>

</body>
</html>
