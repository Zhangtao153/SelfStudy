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
                    <h5>破损</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/破损分布图.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    <br>
                    平均值：4.5处<br>
                    截断平均值：4.3处<br>
                    中位数：4.5处<br>
                    众数：6处<br>
                    IQR：4<br>
                    标准差：2.9<br>

                    平均值在4.5，且破损浮动主要在4——7万之间，2016年——2018年的新车普遍质量比较好<br>
                    考虑到逍客在2016年开始使用家族车身以及日产三菱的发动机，强化了发动机可用性<br>
                    2012,2013开始使用日产天籁的发动机，使得此件的车故障数量比较大
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
