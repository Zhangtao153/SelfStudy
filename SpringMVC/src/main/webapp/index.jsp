<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<center>
    <center>
        <%--<form action="addUser" method="post"><br>
            姓名：<input type="text" name="name"/><br>
            年龄：<input type="text" name="age"><br>
            <input type="submit" value="提交"><br>
        </form>--%>

        <form action="upload" method="post" enctype="multipart/form-data"><br>
            姓名：<input type="text" name="name"/><br>
            <input type="file" name="file"><br>
            <input type="submit" value="上传"><br>
        </form>

        <br>
        <a href="addUser">添加</a>
        <br><br>
        <a href="download?fileName=mao.jpg">点击下载</a>
    </center>
</center>
</body>
</html>
