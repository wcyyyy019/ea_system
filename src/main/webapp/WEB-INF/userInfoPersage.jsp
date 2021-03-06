<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>毕业生资料</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="../../layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="../../css/public.css">
    <link rel="stylesheet" href="use.css" media="all" />
</head>
<body class="childrenBody">
<form class="layui-form layui-row" style="padding: 20px;background-color: #fff;">
    <div class="layui-col-md3 layui-col-xs12 user_right" style="margin-bottom: 20px;">
        <div class="layui-upload-list" title="我要换一个头像">
            <img class="layui-upload-img layui-circle userFaceBtn userAvatar" id="userFace">
        </div>

    </div>
    <div class="layui-col-md8 layui-col-xs12" >
        <div class="layui-form-item">
            <label class="layui-form-label">用户组</label>
            <div class="layui-input-block">
                <input type="text" value="毕业生" disabled class="layui-input layui-disabled">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">毕业生ID</label>
            <div class="layui-input-block">
                <input type="number" id="graduateId" value="" placeholder="毕业生ID" lay-verify="QQ" class="layui-input userPhone">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户ID</label>
            <div class="layui-input-block">
                <input type="number" id="userId" value="" placeholder="请输入用户ID" lay-verify="QQ" class="layui-input userPhone">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">真实姓名</label>
            <div class="layui-input-block">
                <input type="text" id="name" value="" placeholder="请输入真实姓名" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">毕业学校</label>
            <div class="layui-input-block">
                <input id="school" type="text" value="" placeholder="请输入毕业学校" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">专业</label>
            <div class="layui-input-block">
                <input id="major" type="text" value="" placeholder="请输入专业" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">学位</label>
            <div class="layui-input-block">
                <input id="degree" type="text" value="" placeholder="请输入学位" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input id="sex" type="text" value="" placeholder="请输入性别" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">婚姻状况</label>
            <div class="layui-input-block">
                <input id="maritalStatus" type="text" value="" placeholder="请输入婚姻状况" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号码</label>
            <div class="layui-input-block">
                <input type="tel" id="phoneNumber" value="" placeholder="请输入手机号码" lay-verify="phone" class="layui-input userPhone">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">QQ号</label>
            <div class="layui-input-block">
                <input type="number" id="QQNumber" value="" placeholder="请输入QQ号" lay-verify="QQ" class="layui-input userPhone">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">身高</label>
            <div class="layui-input-block">
                <input type="tel" id="height" value="" placeholder="请输入身高" lay-verify="phone" class="layui-input userPhone">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">体重</label>
            <div class="layui-input-block">
                <input type="tel" id="weight" value="" placeholder="请输入体重" lay-verify="phone" class="layui-input userPhone">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">身份证号码</label>
            <div class="layui-input-block">
                <input type="tel" id="idCardNo" value="" placeholder="请输入身份证号码" lay-verify="phone" class="layui-input userPhone">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">邮政编码</label>
            <div class="layui-input-block">
                <input type="text" id="postalCode" value="" placeholder="请输入邮政编码" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">出生年月</label>
            <div class="layui-input-block">
                <input type="text" id="birthday" value="" placeholder="请输入出生年月" lay-verify="userBirthday" readonly class="layui-input userBirthday">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">国籍</label>
            <div class="layui-input-block">
                <input type="text" id="nationality" value="" placeholder="请输入国籍" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">籍贯</label>
            <div class="layui-input-block">
                <input type="text" id="nativePlace" value="" placeholder="请输入籍贯" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">住址</label>
            <div class="layui-input-block">
                <input type="text" id="address" value="" placeholder="请输入住址" lay-verify="required" class="layui-input realName">
            </div>
        </div>
        address
        <div class="layui-form-item">
            <label class="layui-form-label">掌握的技术</label>
            <div class="layui-input-block">
                <input type="text" id="computerRank" value="" placeholder="请输入特长" lay-verify="email" class="layui-input userEmail">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">自我评价</label>
            <div class="layui-input-block">
                <textarea id="self-assessment" placeholder="请输入内容" class="layui-textarea myself"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="changeUser">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </div>
</form>
<script type="text/javascript" src="../../layui/layui.js"></script>
<script type="text/javascript" src="userInfo.js"></script>
</body>
</html>
