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
                    <h5>收入分布</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/客户收入分布.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    <br>
                    平均值：26.6万元每年<br>
                    截断平均值：23.11万元每年<br>
                    中位数：23万元每年<br>
                    众数：23万元每年<br>
                    IQR：10<br>
                    标准差：20.36<br>
                    离群点：3万、7万、90万、130万

                    离群点在3万和7万元，考虑到咨询内容并非购买，且6年及以上的建议售价较低，相对比较合理<br>
                    离群点中的90、130万的客户让我对于资讯的真实性产生了怀疑，该收入群体对于二手车的需求应该很低<br>
                    阶段平均值为23.11万，所以逍客的主要受众群体还是中中低产阶级<br>
                    标准差为20.36，所以逍客的受众是社会各个阶层的群体，对于逍客的远景系统比较看好
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
