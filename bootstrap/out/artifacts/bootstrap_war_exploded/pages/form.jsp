<%--
  @author zth
  @create  2019-04-29 18:45
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #eeeeee">

<div class="container col-lg-8 col-lg-offset-2 ">
    <div style="padding-top: 40px"></div>
    <form action="#">
        <div class="form-group">
            <label for="name1">姓名：</label>
            <input type="text" class="form-control" id="name1" placeholder="请输入姓名">
        </div>
        <div class="form-group">
            <label for="pwd1">密码：</label>
            <input type="password" id="pwd1" class="form-control">
        </div>
        <div class="form-group">
            <label for="file1">选择文件：</label>
            <input type="file" id="file1" >
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox"> 记住我
            </label>
        </div>
    </form>

    <br><br>
    <h3>内联表单</h3>
    <form class="form-inline">
        <div class="form-group">
            <label for="name2">姓名：</label>
            <input type="text" class="form-control" id="name2" placeholder="请输入姓名">
        </div>
        <div class="form-group">
            <label for="pwd2">密码：</label>
            <input type="password" id="pwd2" class="form-control">
        </div>
        <div class="col-sm-10"></div>
    </form>

    <br><br>
    <h3>水平排列的表单</h3>
    <form class="form-horizontal">
        <div class="form-group">
            <label for="name3" class="control-label col-sm-2">姓名：</label>
            <div class="col-sm-10">
                <input type="text" class="form-control " id="name3" placeholder="请输入姓名">
            </div>
        </div>
        <div class="form-group ">
            <label for="pwd3" class=" control-label col-sm-2">密码：</label>
            <div class="col-sm-10 ">
                <input type="password" id="pwd3" class="form-control">
            </div>
        </div>
        <div class="checkbox col-sm-10 col-sm-offset-2">
            <label>
                <input type="checkbox"> 记住我
            </label>
        </div>
    </form>

    <h3>输入框</h3>
    <input type="text" class="form-control" placeholder="text">
    <input type="password" class="form-control" placeholder="password">
    <input type="datetime-local" class="form-control" placeholder="datetime-local">
    <input type="date" class="form-control" placeholder="date">
    <input type="month" class="form-control" placeholder="month">
    <input type="time" class="form-control" placeholder="time">
    <input type="week" class="form-control" placeholder="week">
    <input type="number" class="form-control" placeholder="number">
    <input type="email" class="form-control" placeholder="email">
    <input type="url" class="form-control" placeholder="url">
    <input type="search" class="form-control" placeholder="search">
    <input type="tel" class="form-control" placeholder="tel">
    <input type="color" class="form-control" placeholder="color">

    <br><br>
    <h3>文本域</h3>
    <textarea name="text" id="" class="form-control" rows="3"></textarea>

    <br><br>
    <h3>内联单选和多选框</h3>
    <label class="checkbox-inline">
        <input type="checkbox" value="">1
    </label>
    <label class="checkbox-inline">
        <input type="checkbox" value="">2
    </label>
    <label class="checkbox-inline">
        <input type="checkbox" value="">3
    </label>

    <br>

    <label class="radio-inline">
        <input name="myRadio" type="radio" value="">1
    </label>
    <label class="radio-inline">
        <input name="myRadio" type="radio" value="">2
    </label>
    <label  class="radio-inline">
        <input name="myRadio" type="radio" value="">3
    </label>

    <br><br>
    <h3>下拉列表（select）</h3>
    <select class="form-control">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
    </select>






    <div style="padding-bottom: 50px"></div>

</div>

</body>
</html>
