<%--
  Created by IntelliJ IDEA.
  User: xiao
  Date: 2020/7/11
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>login UI</title>
    <link rel="stylesheet" href="Login.css">
</head>
<body>
<div class="box">
    <h2>大学生就业咨询</h2>
    <form>
        <div class="inputBox">
            <input type="text" name="" required="">
            <label>用户名</label>
        </div>
        <div class="inputBox">
            <input type="password" name="" required="">
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
    </form>
</div>
</body>
</html>
