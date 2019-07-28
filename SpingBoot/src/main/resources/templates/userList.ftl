<html>
<head>
    <title>JSP</title>
    <meta charset="UTF-8">
</head>
<body>
<table border="1" align="center" width="50%">
    <tr><th>姓名</th><th>年龄</th></tr>
    <#list userList as user>
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
</table>
</body>
</html>

