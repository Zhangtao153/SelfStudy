<%--
  @author zth
  @create  2019-06-11 11:41
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
                    <h5>价格分布</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/出库分析.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    <br>
                    众数：雁塔区（10）<br>
                    极差：6<br>

                    雁塔区的出库数量较大，因为考虑到雁塔区的库存费用比其他区域的费用高6元<br>
                    所以本着节约成本的角度从雁塔区开始出库，是一种主要平衡的方法<br>
                    系统建议重新分配库存，因为雁塔区的客户资讯数量并未与雁塔区的库存销售相匹配
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>

