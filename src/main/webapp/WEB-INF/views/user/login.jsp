<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>手机论坛登陆</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login/style.css" />

<body>

<div class="login-container">
	
	
	<form action="${pageContext.request.contextPath}/user/login/userLogin" method="post" id="loginForm">
		<div>
			<input type="text" name="username" class="username" placeholder="用户名" autocomplete="off"/ >
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="密码"  oncontextmenu="return false" onpaste="return false" />
		</div>
		<button id="submit" type="submit">登 陆</button>
	</form>

	<a href="${pageContext.request.contextPath}/pbs/user/to_Register">
		<button type="button" class="register-tis">还有没有账号？</button>
	</a>

</div>
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/common.js"></script>
<!--背景图片自动更换-->
<script src="${pageContext.request.contextPath}/resources/js/supersized.3.2.7.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/supersized-init.js"></script>
<!--表单验证-->
<script src="${pageContext.request.contextPath}/resources/js/jquery.validate.min.js?var1.14.0"></script>

</body>
</html>