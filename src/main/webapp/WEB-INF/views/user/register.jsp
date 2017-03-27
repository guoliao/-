<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>手机论坛注册</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/register/style.css" />
</head>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-2.1.0.min.js"></script>
<!--背景图片自动更换-->
<script
	src="${pageContext.request.contextPath}/resources/js/supersized.3.2.7.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/supersized-init.js"></script>

<body>

	<div class="register-container">
		<form action="${pageContext.request.contextPath}/pbs/user/userLogin" method="post" id="registerForm">
			<div>
				<input type="text" name="username" class="phone_number"
					placeholder="您的用户名" />
			</div>
			<div>
				<input type="password" name="password" class="password"
					placeholder="输入密码" oncontextmenu="return false"
					 />
			</div>
			<div>
				<input type="password" name="confirm_password"
					class="confirm_password" placeholder="再次输入密码"
					/>
			</div>
			
			<div>
				<input type="text" name="nickname" class="nickname" placeholder="输入昵称"/>
			</div>
			
			<div>
				<input type="text" name="address" class="address" placeholder="输入地址"/>
			</div>
			
			<div>
				<input type="email" name="email" class="email" placeholder="输入邮箱地址"
					 />
			</div>

			<button id="submit" type="submit">注 册</button>
		</form>
		<a href="${pageContext.request.contextPath}/user/login/to_Login">
			<button type="button" class="register-tis">已经有账号？</button>
		</a>
	</div>
</body>
</html>