


<%@ page import="com.car.bean.Used_car" %>
<%@ page import="com.db.PageDiv" %><%--
  @author zth
  @create  2019-06-04 16:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <h5>车辆信息</h5>
                </div>
                <div class="ibox-content text-center">

                    <table class="table table-hover table-striped table-condensed table-responsive" style="font-size: 12px">
                        <tr><th>ID</th><th>颜色</th><th>购买时间</th><th>破损程度</th><th>维修费用</th><th>行驶里程</th></tr>
                        <c:forEach items="${ pageDiv.getList()}" var="car" varStatus="i">
                            <tr>
                                <td>${i.count}</td>
                                <td>${car.color}</td>
                                <td>${car.year}</td>
                                <td>${car.posun}</td>
                                <td>${car.weixiu_price}</td>
                                <td>${car.distenct}</td>
                            </tr>
                        </c:forEach>
                    </table>

                    <div class="row">
                        <div class="col-sm-8">
                            <div class="text-center">
                                <div class="btn-group">
                                    <%
                                        PageDiv<Used_car> pageDiv = (PageDiv<Used_car>)request.getAttribute("pageDiv");
                                    %>
                                    <a href="car_list?pageNo=<%=((pageDiv.getPageNO()-1)>1?(pageDiv.getPageNO()-1):1)%>" class="btn btn-white">
                                        <%--<span class="glyphicon glyphicon-menu-left"></span>--%>
                                        &lt;
                                    </a>
                                    <%
                                        for (int i = pageDiv.getStart(); i <=pageDiv.getEnd() ; i++) {
                                    %>
                                    <a href="car_list?&pageNo=<%=i%>" class="btn btn-white"><%=i%></a>
                                    <%
                                        }
                                    %>
                                    <a href="car_list?&pageNo=<%=((pageDiv.getPageNO()+1)<pageDiv.getTotalPage()?(pageDiv.getPageNO()+1):(pageDiv.getTotalPage()))%>" class="btn btn-white">
                                        <%--<span class="glyphicon glyphicon-menu-right"></span>--%>
                                        &gt;
                                    </a>

                                </div>
                            </div>
                        </div>
                        <%----%>
                        <div class="col-sm-4">
                            <h4>当前第${pageDiv.getPageNO()}页 &nbsp;&nbsp;总共${pageDiv.getTotalCount()}条</h4>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>



<%@include file="booter.jsp"%>
</body>
</html>
