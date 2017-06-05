<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>My JSP 'admin.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<%-- <jsp:forward page="pages/HomePage.jsp"></jsp:forward> --%>
	<form action="user/addUser">
		用户名：<input type="text" name="username"><br /> 密码：<input
			type="text" name="password"><br /> <input type="submit"
			value="提交">
	</form>
</body>
</html>

