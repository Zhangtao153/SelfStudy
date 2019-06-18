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
                    <h5>库存区域</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/库存位图.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    众数：雁塔区<br>
                    极差：21<br>
                    西安市雁塔区占有最大的库存量（24），参考客户表中，雁塔区并未占据最大的客户咨询量（7人）<br>
                    且雁塔区的存储费用为所有费用中最高的（28元每车每日），故建议移动12辆至莲湖区降低成本<br>
                    再移动3辆进入东城区，剩余的车辆保留，一定程度上满足资源合理分配
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
