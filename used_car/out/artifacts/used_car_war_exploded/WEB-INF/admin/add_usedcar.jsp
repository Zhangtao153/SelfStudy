
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>二手车入库</title>
    <%@include file="header.jsp"%>
    <link rel="stylesheet" href="css/jquery-labelauty.css">
    <script charset="utf-8" src="kindeditor/kindeditor-all-min.js"></script>
    <script charset="utf-8" src="kindeditor/lang/zh-CN.js"></script>
    <style type="text/css">
        ul.dowebok {  margin: 0; padding: 0; list-style-type: none;}
        ul.dowebok li { display: inline-block;  margin: 0; padding: 0;}
        ul.dowebok li input.labelauty + label { font: 12px "Microsoft Yahei";}
    </style>
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>二手车入库</h5>
                </div>
                <div class="ibox-content" style="font-size: 12px">
                    <form class="form-horizontal" action="ruku" method="post">
                        <input type="hidden" name="action" value="saveadd"/>

                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">颜色</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="color"  class="form-control"  placeholder="请输入二手车颜色">
                            </div>
                        </div>
                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">使用年限</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="year"  class="form-control"  placeholder="请输入二手车年限">
                            </div>
                        </div>
                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">发动机年限</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="eng_year"  class="form-control"  placeholder="发动机年限">
                            </div>
                        </div>


                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">厂商</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="changshang"  class="form-control"  placeholder="请输入二手车厂商">
                            </div>
                        </div>
                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">破损程度</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="posun"  class="form-control"  placeholder="破损程度（1-10）">
                            </div>
                        </div>
                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">库存区域</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="kucun_area"  class="form-control"  placeholder="库存区域">
                            </div>
                        </div>

                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">维修价格</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="weixiu_price"  class="form-control"  placeholder="请输入维修价格">
                            </div>
                        </div>
                        <div class="form-group col-sm-4">
                            <label  class="col-sm-4 col-md-2 control-label">行驶里程</label>
                            <div class="col-sm-8 col-md-9">
                                <input type="text" name="distenct"  class="form-control"  placeholder="行驶里程">
                            </div>
                        </div>



                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-6">
                                <button type="submit" class="btn btn-info">添加库存</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


<%@include file="booter.jsp"%>

</body>
</html>
