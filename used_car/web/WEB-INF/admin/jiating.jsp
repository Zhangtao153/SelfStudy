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
                    <h5>家庭情况</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/客户家庭情况.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    <br>
                    平均值：2.9人<br>
                    截断平均值：2.88人<br>
                    中位数：2人<br>
                    众数：1人<br>
                    IQR：4<br>
                    标准差：1.79<br>

                    咨询客户的平均人数为2.9人，阶段平均人数为1.88人<br>
                    客户的主要是已婚以及已婚独子，对于客户来说，主要的年代为30代<br>
                    逍客的低廉的二手车价格以及较低的油耗，比较受中低收入群体以及3口之家的欢迎<br>
                    标准差1.79，表名对于大部分5人之家以内的客户，逍客具有普遍吸引力
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
