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
                    <h5>年龄分布</h5>
                </div>
                <div class="ibox-content text-center">
                    <img src="tu/客户年龄分布.png" style="height: 400px">
                </div>
                <div class="text-center" style="font-size: 16px">
                    <br>
                    平均值：33.4岁<br>
                    截断平均值：32.5岁<br>
                    中位数：32岁<br>
                    众数：32岁<br>
                    IQR：10<br>
                    标准差：9.02<br>

                    资讯客户的平均年龄为33.4岁，且20年代与30年代的数量最高，均为19人。<br>
                    客户年龄分布从20岁涵盖到50岁，逍客的客户分布比较平均<br>
                    作为油耗较低的5座紧凑型SUV，逍客收到广大的欢迎，尤其是30年代<br>
                    高数量的标准差，代表者逍客的普遍受众性
                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
