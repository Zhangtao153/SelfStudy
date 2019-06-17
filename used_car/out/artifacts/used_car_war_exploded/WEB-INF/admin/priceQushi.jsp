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
                    <h5>价格趋势</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/新车价格趋势图.png" style="height: 400px">
                    <div class="text-center" style="font-size: 16px">
                        <br>
                        平均值：13.7万<br>
                        截断平均值：13.9万<br>
                        中位数：14万<br>
                        众数：14万<br>
                        IQR：2.2万<br>
                        标准差：1.88<br>
                        离群点：9.5 万、16.5 万<br>
                        离群点在9.5万（2012年），考虑到中日钓鱼岛关系紧张，导致日系车出现销售瓶颈，所以降价促销<br>
                        平均值在13.7万，且价格浮动主要在12-14万之间，随时间上升，在2018年达到峰值16.5万元<br>
                        新车市场情况较为理想，价格相对稳定.2019年价格下降，考虑到国五到国六的交替<br>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
