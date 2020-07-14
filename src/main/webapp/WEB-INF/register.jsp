<%--
  Created by IntelliJ IDEA.
<<<<<<< HEAD:web/WEB-INF/region.jsp
  User: xiao
  Date: 2020/7/11
  Time: 14:34
=======
  User: Administrator
  Date: 2020/7/10
  Time: 15:05
>>>>>>> 59ce9c6266c5c7c6b4e381c86dddf84a9e73c85a:src/main/webapp/WEB-INF/register.jsp
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>login UI</title>
    <link rel="stylesheet" href="/css/login.css">
    <script>
        function check(){
                    if(document.form1.username.value=='admin')
                    document.form1.submit();
                    else if(document.form1.username.value.length<8||document.form1.username.value=='输入账号不能为空'){
                        window.alert("账号位数不得少于8位");
                        return false
                    }
    else if(document.form1.username.value.length>16)
{
    window.alert("账号位数不得多于16位");
    return false;
}    else if(document.form1.password.value.length<8){
                        window.alert("密码不得少于8位");
                        return false;
                    }

    else if(document.form1.password.value!=document.form1.password2.value){
                        window.alert("两次输入密码不匹配");
                        return false;
                    }
    else if(document.form1.userType.value!="1"&&document.form1.userType.value!="2"){
                        window.alert("请选择用户类型");
                        return false;
                    }
    else
    {

    document.form1.submit();

    }

    }
    </script>
</head>
<body>
<div class="box">
    <h2>大学生就业咨询</h2>
    <form action="/addUser" id="form1" name="form1">
        <div class="inputBox">
            <input type="text" name="username" required="required" >
            <label>用户名</label>
        </div>
        <div class="inputBox">
            <input type="password" name="password" required="required">
            <label>密码</label>
        </div>
        <div class="inputBox">
            <input type="password" name="password2" required="required">
            <label>确认密码</label>
        </div>
        <div>
            <td><label>身份选择:</label></td>
            <td><input type="radio" name="userType" value="1"> 用人单位
                <input type="radio" name="userType" value="2"> 毕业生
            </td>
        </div>
        <div><h1>                          </h1> </div>
        <input type="button" name="" value="注册" onclick="check()">
    </form>
</div>
</body>
</html>
