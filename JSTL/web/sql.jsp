<%--
  @author zth
  @create  2019-05-12 20:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>SQL 标签</title>
</head>
<body>

<sql:setDataSource var="con" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost/zth"
                   user="root"
                   password="mysql"/>

<sql:query dataSource="${con}"  var="result">
    select * from user;
</sql:query>

<table border="1" width="500px">
    <tr>
        <th>ID</th>
        <th> Name</th>
        <th>Uname</th>
        <th>sex</th>
    </tr>

    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.name}"/></td>
            <td><c:out value="${row.uname}"/></td>
            <td><c:out value="${row.sex}"/></td>
        </tr>
    </c:forEach>

    <%--<sql:update> 标签--%>
    <sql:update dataSource="${con}" var="count">
        insert into user values(13,"zth","zth","F","zth");
    </sql:update>

    <sql:query dataSource="${con}"  var="result">
    select * from user;
    </sql:query>

    <table border="1" width="500px">
        <tr>
            <th>ID</th>
            <th> Name</th>
            <th>Uname</th>
            <th>sex</th>
        </tr>

        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td><c:out value="${row.id}"/></td>
                <td><c:out value="${row.name}"/></td>
                <td><c:out value="${row.uname}"/></td>
                <td><c:out value="${row.sex}"/></td>
            </tr>
        </c:forEach>
</table>

</body>
</html>
