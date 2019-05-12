<%--
  @author zth
  @create  2019-05-12 19:10
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>格式化标签</title>
</head>
<body>
<h3>数字格式化</h3>
<c:set var="balance" value="120010.2309"/>
<p>格式化数字1：<fmt:formatNumber value="${balance}" currencySymbol="$" type="currency"/> </p>
<p>格式化数字2：<fmt:formatNumber value="${balance}" type="number" maxIntegerDigits="5"/> </p>
<p>格式化数字3：<fmt:formatNumber value="${balance} " type="number" maxIntegerDigits="6" maxFractionDigits="2"/> </p>
<p>格式化数字4：<fmt:formatNumber value="${balance}" groupingUsed="false"/> </p>
<p>格式化数字5：<fmt:formatNumber value="${balance}" type="percent" maxIntegerDigits="4"/> </p>
<p>格式化数字6：<fmt:formatNumber value="${balance}" type="percent" minFractionDigits="7"/> </p>
<p>格式化数字7：<fmt:formatNumber value="${balance}" type="percent" maxIntegerDigits="3" /></p>
<p>格式化数字8：<fmt:formatNumber value="${balance}" type="number" pattern="###.###E0"/>  </p>

<h3>数字解析</h3>
<c:set var="num" value="1234004.456"/>

<p>数字解析1 ：<fmt:parseNumber value="${num} " /></p>
<p>数字解析2 ：<fmt:parseNumber  type="number" value="${num}" integerOnly="true"/> </p>
<fmt:parseNumber type="number" var="i" value="${num}" integerOnly="true"/>
<p>数字解析3 ：<c:out value="${i}"/></p>

<h3>日期格式化</h3>
<c:set var="now" value="<%=new java.util.Date()%>"/>

<p>日期格式化1：<fmt:formatDate value="${now}" type="time"/> </p>
<p>日期格式化2：<fmt:formatDate value="${now}" type="date"/> </p>
<p>日期格式化3：<fmt:formatDate value="${now}" type="both"/> </p>
<p>日期格式化4：<fmt:formatDate value="${now}" dateStyle="short" timeStyle="short" type="both"/> </p>
<p>日期格式化5：<fmt:formatDate value="${now}" dateStyle="medium" timeStyle="medium" type="both"/> </p>
<p>日期格式化6：<fmt:formatDate value="${now}" dateStyle="long" timeStyle="long" type="both"/> </p>
<p>日期格式化：<fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/> </p>

<h3>日期解析</h3>
<c:set var="now" value="12-5-2019"/>
<fmt:parseDate value="${now} " var="parseedEmpdate" pattern="dd-MM-yyyy"></fmt:parseDate>
<p>解析后的日期：<c:out value="${parseedEmpdate}"/></p>
</body>
</html>
