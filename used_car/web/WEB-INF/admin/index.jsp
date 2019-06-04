<%--
  @author zth
  @create  2019-05-07 19:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>环球优路</title>
    <base href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"%>"/>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

    <link rel="shortcut icon" href="images/favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<div id="wrapper">
    <!--左侧导航开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close">
            <i class="fa fa-times-circle"></i>
        </div>
        <div class="sidebar-collapse">

            <ul class="nav" id="side-menu">
               <li>
                   <a class="navbar-minimalize J_menuItem">
                       <i class="fa fa-bars" style="font-size:20px;color:#FFF;"></i>
                       <span class="nav-label" style="font-size:20px;color:#FFF;">逍客二手车</span>
                   </a>
               </li>
                <li>
                    <a class="J_menuItem top_menu " href="ruku">
                        <i class="fa fa-th-list"></i>
                        <span class="nav-label">二手车录入</span>
                    </a>
                </li>

                <li>
                    <a href="#" class="hassubs_menu">
                        <i class="fa  fa-car "></i>
                        <span class="nav-label">入库分析</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="admin/city">价格趋势</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/focuspic">厂商分布</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/artchannel">地区分布</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/attach">破损评估</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/admin">时间分布</a>
                        </li>
                    </ul>
                </li>

                <%--模块二--%>
                <li>
                    <a href="#" class="hassubs_menu">
                        <i class="fa fa-wrench"></i>
                        <span class="nav-label">库存分析</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="druid">车辆信息</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/city">库存区域</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/focuspic">库存成本</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/artchannel">维修费用</a>
                        </li>
                    </ul>
                </li>


                <%--模块三--%>
                <li>
                    <a href="#" class="hassubs_menu">
                        <i class="fa fa-usd "></i>
                        <span class="nav-label">销售分析</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="druid">出库信息</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/city">销量分析</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/focuspic">利润分析</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/artchannel">期望值分析</a>
                        </li>
                    </ul>
                </li>

                <%--模块四--%>
                <li>
                    <a href="#" class="hassubs_menu">
                        <i class="fa fa-adn"></i>
                        <span class="nav-label">客户分析</span>
                        <span class="fa arrow"></span>
                    </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a class="J_menuItem" href="druid">信息列表</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/city">区域分布</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/focuspic">年龄分布</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/artchannel">收入分析</a>
                        </li>
                        <li>
                            <a class="J_menuItem" href="admin/artchannel">家庭情况</a>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
    <!--左侧导航结束-->
    <!--右侧部分开始-->
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row" style="height: 20px;line-height: 36px">
            <div class="navbar navbar-static-top" style="margin-bottom: 0; min-height: 35px ">
                <div class="pull-left" style="margin-left: 20px">
                    <span class="fa fa-home"></span>&nbsp;
                    <a href="admin/indexAdmin" style="color: #333; font-weight: bold;">首页</a>
                    <span id="one_show"></span>
                    <span id="jm_show"></span>
                </div>
                <div class="pull-right " style="margin-right: 20px;"  >
                    Welcome,${loged.email}! <a href="admin/login?action=logout">退出</a>

                </div>
            </div>
        </div>
        <div style="clear: both;"></div>

        <div class="row J_mainContent" id="content-main">
            <iframe id="J_iframe" name="iframe0" data-index="0"  width="100%" height="100%" src="admin/forward?page=admin/welcome.jsp" frameborder="0" data-id="admin/forward?page=admin/welcome.jsp" seamless></iframe>

            <!--  <iframe class="J_iframe" id="J_iframe" name="iframe0" width="100%" height="100%" src="admin/admin/welcome" frameborder="0" data-id="admin/admin/welcome" seamless></iframe> -->
        </div>
    <!--右侧部分结束-->
</div>

<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="js/plugins/layer/layer.min.js"></script>

<!-- 自定义js -->
<script src="js/hAdmin.js?v=4.1.0"></script>
<script type="text/javascript" src="js/index.js"></script>

<!-- 第三方插件 -->
<script src="js/plugins/pace/pace.min.js"></script>
<%--<%@include file="booter.jsp"%>--%>
    <script src="js/content.js"></script>
    <script src="js/sweetalert.min.js"></script>
</body>

</html>
