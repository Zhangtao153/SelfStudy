<%--
  @author zth
  @create  2019-04-29 14:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>排版</title>
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/jquery.min.js"></script>
    <script type="text/javascript" src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<h2>标题</h2>
<br>
<h1>纵有红颜<small>纵有红颜</small></h1>
<h2>百生千劫<small>百生千劫</small></h2>
<h3>难消君心<small>难消君心</small></h3>
<h4>万古情愁<small>万古情愁</small></h4>

<p>Bootstrap是美国Twitter公司的设计师Mark Otto和Jacob Thornton合作基于HTML、CSS、JavaScript 开发的简洁、直观、
    强悍的前端开发框架，使得 Web 开发更加快捷。Bootstrap提供了优雅的HTML和CSS规范，它即是由动态CSS语言Less写成。
    <br><br>
    Bootstrap 将全局 font-size 设置为 14px，line-height 设置为 1.428。这些属性直接赋予 &lt;body&gt; 元素和所有
    段落元素。另外，&lt;p&gt; （段落）元素还被设置了等于 1/2 行高（即 10px）的底部外边距（margin）。
</p>
<P class="lead"><mark>Bootstrap</mark> 将全局 font-size 设置为 14px，line-height 设置为 1.428。这些属性直接赋予 &lt;body&gt; 元素和所有
    段落元素。另外，&lt;p&gt; （段落）元素还被设置了等于 1/2 行高（即 10px）的<del>底部外边距</del>（margin）。</P>

<h2>对齐</h2>
<P class="text-left">纵有红颜</P>
<P class="text-right">纵有红颜</P>
<P class="text-center">纵有红颜</P>
<P class="text-justify">纵有红颜</P>

<h2>改变大小写</h2>
<p class="text-lowercase">Hello World</p>
<p class="text-uppercase">Hello World</p>
<p class="text-capitalize">Hello WoRld</p>
<br>
<h2>内联列表</h2>
<ul class="list-inline">
    <li>万古情愁</li>
    <li>万古情愁</li>
    <li>万古情愁</li>
</ul>
</body>
</html>
