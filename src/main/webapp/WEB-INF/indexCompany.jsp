<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/13
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>后台管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="icon" href="favicon.ico">     <!-- 网页顶部头图标 -->
    <link rel="stylesheet" href="/layui/css/layui.css" />   <!-- layui   css样式表 -->
    <link rel="stylesheet" type="text/css" href="/css/public.css" />  <!-- 公用的css样式表 -->
    <link rel="stylesheet" href="/css/index.css" />     <!-- 后台首页样式表 -->
</head>
<!-- IE10以下的版本低版本警告 -->
<!--[if lt IE 10]>
<div class="lt-ie10-bg">
    <p class="browsehappy">对不起，您正在使用的是 <strong>过时</strong> 的浏览器.</p>
    <p>请升级您的浏览器（IE10及其以上版本，或者是火狐、谷歌、Opera、Safari等现代浏览器），以改进您的用户体验！</p>
</div>
<style>
    .lt-ie10-bg{z-index:11111;position:fixed;top:0;left:0;right:0;bottom:0;background-color:#333;color:#999;padding:100px 20px;text-align:center;font-size:26px}
</style>
<![endif]-->
<body class="main_body white">
<div class="layui-layout layui-layout-admin">
    <!-- 顶部 -->
    <div class="layui-header header lt">
        <div class="layui-main mag0">
            <a href="#" class="logo" alt="文字标题">大学生就业咨询系统(企业)</a>
            <a href="#" class="logo" alt="图片" style="display: none;">
                <img src="" class="jzy_mg_top_20">
            </a>

            <!-- 显示/隐藏菜单 -->
            <a href="javascript:;" class="seraph hideMenu icon-caidan"></a>

            <!-- 顶部右侧菜单 -->
            <ul class="layui-nav top_menu">
                <li class="layui-nav-item" pc>
                    <a href="javascript:;" class="clearSession"><i class="layui-icon" data-icon="&#xe640;">&#xe640;</i><cite style="padding-left: 2px;">清除缓存</cite></a>
                </li>
                <li class="layui-nav-item" id="userInfo">
                    <a href="javascript:;">
                        <img src="/images/face.jpg" class="layui-nav-img userAvatar" width="35" height="35">
                        <cite class="adminName">BY</cite>&nbsp;</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-url="page/user/userInfoCompany.html"><i class="layui-icon">&#xe66f;</i><cite>企业资料</cite></a></dd>
                        <dd><a href="javascript:;" data-url="page/user/changePwd.html"><i class="layui-icon ">&#xe770;</i><cite>修改密码</cite></a></dd>

                        <dd><a href="/loginout" class="signOut"><i class="layui-icon">&#xe682;</i><cite>退出</cite></a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class=" main_body_content" style="overflow: hidden;">
        <!-- 左侧导航 -->
        <div class="layui-side layui-bg-black lt">
            <div class="navBar layui-side-scroll" id="navBar">
                <ul class="layui-nav layui-nav-tree">
                    <li class="layui-nav-item layui-this">
                        <a href="javascript:;" data-url="../page/main.html">
                            <i class="layui-icon" data-icon=""></i>
                            <cite>首页</cite>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- 主体内容 -->
        <div class="layui-tab-content clildFrame">
            <div class="layui-tab-item layui-show">
                <div class="main_hd with_extra">
                    <h2>首页</h2>
                </div>
                <iframe src="../page/main.html" frameborder="0" scrolling="no" id="iframe"></iframe>
            </div>
        </div>
    </div>

    <div class="footer">
        <p><span>© 09组技术支持</span></p>
    </div>


</div>


<!-- 移动导航 -->
<div class="site-mobile-shade"></div>
<div class="site-tree-mobile"><i class="layui-icon">&#xe66b;</i></div>



<!-- 返回顶部 -->
<div class="back-to-top" title="返回顶部"><i class="layui-icon">&#xe619;</i></div>




<script type="text/javascript" src="/layui/layui.js"></script>
<script type="text/javascript" src="/js/indexCompany.js"></script>

</body>
<<<<<<< HEAD
</html>
=======
</html>
>>>>>>> 307d215534b48da3d84e15f7a11c1097ed049f0e
