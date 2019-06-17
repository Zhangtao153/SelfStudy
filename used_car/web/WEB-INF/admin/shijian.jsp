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
                    <h5>时间分布</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/车辆时间分布图.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    <br>
                    众数：2015<br>
                    该车库中各年代的车量分布比较平均，2015年购置的车数量最大<br>
                    参考车辆破损，2015年代额车的破损值最高为7，最低为0<br>
                    2012与2018紧随其后，车况均比较理想
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
