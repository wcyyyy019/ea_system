<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<html>
<head>
<title> 主窗口 </title>
</head>
<body>
<form action="show.jsp" method="post">
信息一bai：<input type="text" name="info1"/>
信息二：du<input type="text" name="info2"/>
<input type="submit" value="在另一个页面显示结zhi果"/>
</form>
</body>
</html>
显示页面：
<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<html>
<head>
<title> 接收页面 </title>
</head>
<body>
信息一：<%=request.getParameter("info1")%><br/>
信息二：<%=request.getParameter("info2")%>
</body>
</html>