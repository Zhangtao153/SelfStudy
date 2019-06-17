<%--
  @author zth
  @create  2019-06-04 16:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="header.jsp"%>
    <title>Title</title>
</head>
<body>

<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>库存成本</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/库存费用图.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    众数：雁塔区(28元每日每天)<br>
                    极差：6<br>
                    雁塔区是西安市主要的办公区，所以每日收取费用远高于东城和莲湖区<br>
                    新车的入库费用包括清洗、人员、车位的费用<br>
                    考虑到雁塔区主要为办公区，所以没有大量的客户涌入，系统建议重新分配库存<br>
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
