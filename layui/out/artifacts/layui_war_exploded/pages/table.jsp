<%--
  @author zth
  @create  2019-04-23 20:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>table</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script type="text/javascript" src="../layui/layui.js"></script>
</head>
<body>


<div  class="layui-container layui-container layui-col-md8 layui-col-md-offset2  layui-col-lg8 layui-col-lg-offset2 " >

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>默认表格</legend>
    </fieldset>

    <table class="layui-table">
        <colgroup>
            <col width="100">
            <col width="100">
            <col width="100">
        </colgroup>
        <thead>
        <tr>
            <th>姓名</th><th>性别</th><th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>张三</td><td>男</td><td>18</td>
        </tr>
        <tr>
            <td>李四</td><td>18</td><td>女</td>
        </tr>
        <tr>
            <td>王五</td><td>20</td><td>男</td>
        </tr>
        </tbody>
    </table>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>隔行背景</legend>
    </fieldset>

    <table class="layui-table" lay-even >
        <colgroup>
            <col width="100">
            <col width="100">
            <col width="100">
        </colgroup>
        <thead>
        <tr>
            <th>姓名</th><th>性别</th><th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>张三</td><td>男</td><td>18</td>
        </tr>
        <tr>
            <td>李四</td><td>18</td><td>女</td>
        </tr>
        <tr>
            <td>王五</td><td>20</td><td>男</td>
        </tr>
        </tbody>
    </table>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>行边框表格</legend>
    </fieldset>
    <table class="layui-table" lay-skin="line">
        <colgroup>
            <col width="100">
            <col width="100">
            <col width="100">
        </colgroup>
        <thead>
        <tr>
            <th>姓名</th><th>性别</th><th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>张三</td><td>男</td><td>18</td>
        </tr>
        <tr>
            <td>李四</td><td>18</td><td>女</td>
        </tr>
        <tr>
            <td>王五</td><td>20</td><td>男</td>
        </tr>
        </tbody>
    </table>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>列边框表格</legend>
    </fieldset>

    <table class="layui-table" lay-skin="row">
        <colgroup>
            <col width="100">
            <col width="100">
            <col width="100">
        </colgroup>
        <thead>
        <tr>
            <th>姓名</th><th>性别</th><th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>张三</td><td>男</td><td>18</td>
        </tr>
        <tr>
            <td>李四</td><td>18</td><td>女</td>
        </tr>
        <tr>
            <td>王五</td><td>20</td><td>男</td>
        </tr>
        </tbody>
    </table>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>无边框表格</legend>
    </fieldset>
    <table class="layui-table" lay-skin="nob">
        <colgroup>
            <col width="100">
            <col width="100">
            <col width="100">
        </colgroup>
        <thead>
        <tr>
            <th>姓名</th><th>性别</th><th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>张三</td><td>男</td><td>18</td>
        </tr>
        <tr>
            <td>李四</td><td>18</td><td>女</td>
        </tr>
        <tr>
            <td>王五</td><td>20</td><td>男</td>
        </tr>
        </tbody>
    </table>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>其它尺寸表格</legend>
    </fieldset>

    <table class="layui-table" lay-size="lg">
        <colgroup>
            <col width="100">
            <col width="100">
            <col width="100">
        </colgroup>
        <thead>
        <tr>
            <th>姓名</th><th>性别</th><th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>张三</td><td>男</td><td>18</td>
        </tr>
        <tr>
            <td>李四</td><td>18</td><td>女</td>
        </tr>
        <tr>
            <td>王五</td><td>20</td><td>男</td>
        </tr>
        </tbody>
    </table>

    <br><br>
    <table class="layui-table" lay-size="sm">
        <colgroup>
            <col width="100">
            <col width="100">
            <col width="100">
        </colgroup>
        <thead>
        <tr>
            <th>姓名</th><th>性别</th><th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>张三</td><td>男</td><td>18</td>
        </tr>
        <tr>
            <td>李四</td><td>18</td><td>女</td>
        </tr>
        <tr>
            <td>王五</td><td>20</td><td>男</td>
        </tr>
        </tbody>
    </table>


</div>

</body>
</html>
