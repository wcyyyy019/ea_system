<%--
  Created by IntelliJ IDEA.
<<<<<<< HEAD:out/artifacts/ea_system_war_exploded/WEB-INF/region.jsp
  User: xiao
  Date: 2020/7/11
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>login UI</title>
    <link rel="stylesheet" href="/css/login.css">
</head>
<body>
<div class="box">
    <h2>大学生就业咨询</h2>
    <form action="loginin">
        <div class="inputBox">
            <input type="text" name="username" required="false">
            <label>用户名</label>
        </div>
        <div class="inputBox">
            <input type="password" name="password" required="false">
            <label>密码</label>
        </div>
        <div>
            <td><label>身份选择:</label></td>
            <td><input type="radio" name="gender1" value="male1"> 用人单位
                <input type="radio" name="gender1" value="female1"> 毕业生
            </td>
        </div>
        <div><h1>                          </h1> </div>
        <input type="submit" name="" value="登录">

        <input type="button" value="注册" size="15"  onclick="window.location.href='ToRegister'">
    </form>
</div>
</body>
</html>
