<%--
  @author zth
  @create  2019-05-12 15:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>核心标签库</title>
</head>
<body>
<h4>c:out</h4>
<c:out value="&lt未使用转义字符&gt" escapeXml="true" default="默认值"></c:out> <br>
<c:out value="&lt使用转义字符&gt" escapeXml="false" default="默认值"></c:out> <br>
<h4>c:set</h4>
<c:set var="salary" scope="session" value="20000"></c:set>
<c:out value="${salary}"></c:out>
<h4>c:remove</h4>
删除前：<c:out value="${salary}"></c:out> <br>
<c:remove var="salary"/>
删除后：<c:out value="${salary}"></c:out>
<h4>c:catch </h4>
<c:catch var="catchException">
    <% int x = 5/0;%>
</c:catch>
<c:if test="${catchException != null}">
    <p>异常为：${catchException} <br>
    发生了异常：${catchException.message}
    </p>
</c:if>
<h4>c:choose</h4>
<c:set var="salary" scope="session" value="20000"></c:set>
<p>工资：${salary}</p>

<c:choose>
    <c:when test="${salary <= 0}">
        太惨了
    </c:when>
    <c:when test="${salary >1000}">
        凑活
    </c:when>
    <c:otherwise>
        什么都没有
    </c:otherwise>
</c:choose>
<h4>c: forEach</h4>
<c:forEach var="i" begin="1" end="5">
    Item<c:out value="${i}"/> <br>
</c:forEach>

<h4>c:forTokens</h4>
<c:forTokens items="google,baidu,taobao" delims="," var="name">
    <c:out value="${name}"></c:out> <br>
</c:forTokens>

<h4>c:url</h4>
<a href="<c:url value="http://www.baidu.com"/>">baidu</a>

<h4>c:redirect</h4>
<c:redirect url="http://www.runoob.com"/>
</body>
</html>
