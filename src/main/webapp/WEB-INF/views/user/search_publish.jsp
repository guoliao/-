<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="zh" class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<title>手机技术论坛</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/index/zzsc-demo.css">
<link href="${pageContext.request.contextPath}/resources/css/index/bootstrap.min.css" rel="stylesheet">
 <link href="${pageContext.request.contextPath}/resources/css/index/titlebar.css" rel="stylesheet"> 
 <script src="${pageContext.request.contextPath}/resources/js/login/jquery-2.1.1.min.js"></script> 
 <script src="${pageContext.request.contextPath}/resources/js/index/bootstrap.min.js"></script> 
 <link href="${pageContext.request.contextPath}/resources/css/index/index.css" rel="stylesheet"> 
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top ">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/pbs/user/to_index">手机论坛</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath}/pbs/user/to_index">华为专区</a></li>
				<li><a href="${pageContext.request.contextPath}/pbs/user/to_index">苹果专区</a></li>
				<li><a href="${pageContext.request.contextPath}/pbs/user/to_index">OPPO专区</a></li>
				<li><a href="${pageContext.request.contextPath}/pbs/user/to_index">三星专区</a></li>
				<li><a href="${pageContext.request.contextPath}/pbs/user/to_index">vivo专区</a></li>
			</ul>

			 <ul class="nav navbar-nav navbar-right user">
				<!-- <li><a href="#">登陆</a></li>
				<li><a href="#">注册</a></li> -->
			</ul> 
			<p class="navbar-text navbar-right">   </p>
			<a href="${pageContext.request.contextPath}/user/login/logout" class="navbar-text navbar-right" style="cursor:pointer;color:#fff;">退出</a>
			<p class="navbar-text navbar-right">${user.nickname},您好！</p>
			
		</div>
		<form id="searchForm" class="navbar-form navbar-right" role="search"
			action="${pageContext.request.contextPath}/pbs/user/findPostByTitle" method="post">
			<div class="input-group">
				<input type="text" class="form-control" name="p_title"
					placeholder="search"> 
					<span onclick="subSearchFrom();" class="input-group-addon" style="cursor:pointer;">
						<span class="glyphicon glyphicon-search"></span> 
					</span>
			</div>
		</form>
	</nav>



	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
				<img class="first-slide" src="${pageContext.request.contextPath}/resources/image/index/1.jpg" alt="First slide"
					style="width: 100%; height: 580px;">
				<div class="container" style="position: relative; top: -50px">
					<div class="carousel-caption">
						<h1>极致体验</h1>
						<p>优雅简洁的外观设计，细心的交互方式，帮助您更快捷地获取内容，更方便地浏览您需要的各种信息。</p>
						<p>
							<a class="btn btn-primary" href="#">立即加入</a>
						</p>
					</div>
				</div>
			</div>

			<div class="item">
				<img class="second-slide" src="${pageContext.request.contextPath}/resources/image/index/2.jpg" alt="Second slide"
					style="width: 100%; height: 580px;">
				<div class="container" style="position: relative; top: -50px">
					<div class="carousel-caption">
						<h1>极致体验</h1>
						<p>优雅简洁的外观设计，细心的交互方式，帮助您更快捷地获取内容，更方便地浏览您需要的各种信息。</p>
						<p>
							<a class="btn btn-primary" href="#">立即加入</a>
						</p>
					</div>
				</div>
			</div>

			<div class="item">
				<img class="second-slide" src="${pageContext.request.contextPath}/resources/image/index/3.jpg" alt="Second slide"
					style="width: 100%; height: 580px;">
				<div class="container" style="position: relative; top: -50px">
					<div class="carousel-caption">
						<h1>极致体验</h1>
						<p>优雅简洁的外观设计，细心的交互方式，帮助您更快捷地获取内容，更方便地浏览您需要的各种信息。</p>
						<p>
							<a class="btn btn-primary" href="#">立即加入</a>
						</p>
					</div>

				</div>
			</div>

			<!-- Controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>


	<div id="container" class="container" style="margin-top: 30px;">
		<div class="row">
			<div class="col-md-12">
				<ul class="list-group">
					<div class="list-group-item active">
						论坛新帖 
						<a href="${pageContext.request.contextPath}/pbs/user/selectMorePost" style="float: right; color: white">
							更多>>
						</a>
					</div>

				</ul>
			</div>
		</div>
		<div id="XINTIE">
			<c:forEach items="${list}" var="list" varStatus="vs">
				<div class="blog-post">
					<h3 class="blog-post-title">
						<a href="${pageContext.request.contextPath}/pbs/user/userFindPost?p_id=${list.p_id}">${list.p_title}</a>
					</h3>
					<p class="blog-post-meta">
						${list.p_date}
						<a href="#">：论坛新帖 </a>
					</p>
					<p class="blog-post-content">
						${list.p_content}
					</p>
				</div>
			</c:forEach>
			<hr>
		</div>
	</div>
	<div
		style="margin-top: 80px; background-color: rgba(0, 0, 0, 0.8); height: 100px; color: darkgray; width: 100%">
		<div
			style="width: 400px; padding-top: 35px; padding-left: 40px; padding-right: 40px; margin: auto;">
			<div>
				友情链接： <a href="#" style="color: darkgray">&nbsp;github&nbsp;|&nbsp;</a>
				<a href="#" style="color: darkgray">csdn&nbsp;|&nbsp;</a>
				<a href="#" style="color: darkgray">开源中国&nbsp;|&nbsp;</a>
				<a href="#" style="color: darkgray">stackflow</a><br>
				Copyright 手机论坛 © 2017
			</div>
		</div>
	</div>
	
<script type="text/javascript">
 function subSearchFrom(){
	 $('#searchForm').submit();
 }
</script>		
</body>
</html>