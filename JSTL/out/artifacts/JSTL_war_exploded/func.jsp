<%--
  @author zth
  @create  2019-05-12 22:54
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>JSTL 函数</title>
</head>
<body>
<c:set var="myString" value="i am from world"/>

<c:if test="${fn:contains(myString, 'world')}">
    <p>找到 world</p>
</c:if>

<c:if test="${fn:contains(myString, 'WORLD')}">
    <p>找到 WORLD</p>
</c:if>

<c:if test="${fn:containsIgnoreCase(myString,'world' )}">
    <p>找到 world</p>
</c:if>

<c:if test="${fn:containsIgnoreCase(myString, 'WORLD')}">
    <p>找到 WORLD</p>
</c:if>

<c:set var="String1" value="<p>Hello World</p>"></c:set>
<p>${String1}</p>
<p>${fn:escapeXml(String1)}</p>

<c:set var="String2" value="www baidu com"></c:set>
<c:set var="String3" value="${fn:split(String2, ' ')}"/>
<c:out value="${fn:join(String3, '.')}"/> <br>

<c:out value="${fn:substringAfter(String2, 'www')}"/> <br>
<c:out value="${fn:substringBefore(String2, 'baidu')}"/> <br>

<c:set var="String4" value=" baidu   "></c:set>
<p>${fn:trim(String4)}</p>

</body>
</html>
