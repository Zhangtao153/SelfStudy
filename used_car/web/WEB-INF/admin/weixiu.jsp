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
                    <h5>维修费用</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/维修费用图.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    <br>
                    平均值：4500元<br>
                    截断平均值：4300元<br>
                    中位数：4500元<br>
                    众数：6000元<br>
                    IQR：4000<br>
                    标准差：2.9<br>

                    考虑到二手车的欢迎程度主要源于价格折损，逍客的平均维修费用为4500元<br>
                    逍客最为一款市场上比较受众的二手车型，在收集客户信息的时候收到各年龄用户的受众<br>
                    系统建议售价中对于维修费用的权值收取费用为1.2，超过1万元费用的内容希望谨慎入库
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
