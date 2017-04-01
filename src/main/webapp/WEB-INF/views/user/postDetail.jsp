<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<title>手机技术论坛</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/index/zzsc-demo.css">
<link
	href="${pageContext.request.contextPath}/resources/css/index/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/index/titlebar.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/index/index.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/css/index/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/resources/css/index/froala_editor.min.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/resources/js/index/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/index/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/index/xml.js"></script>


<style>
.main {
	width: 800px;
	margin: 20px auto;
}

.tag {
	font-size: 13px;
	margin-left: 370px;
	vertical-align: bottom;
	text-align: center;
	margin-bottom: 0;
}

.text {
	width: 100%;
	height: 180px;
	margin: 0 auto;
	resize: none;
}

.creatediv {
	width: 675px;
	height: 80px;
	border: 1px solid gray;
	position: relative;
	margin-top: 10px;
	padding-left: 75px;
}

.createinput {
	width: 80px;
	height: 30px;
	position: absolute;
	right: 5px;
	bottom: 5px;
}

.createimg {
	width: 50px;
	height: 50px;
	position: absolute;
	top: 15px;
	left: 15px;
}

.createdivs {
	width: 600px;
	height: 50px;
	position: absolute;
	top: 15px;
	left: 85px;
}
*
/
</style>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="./list.html">手机论坛</a>
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
			action="${pageContext.request.contextPath}/pbs/user/findPostByTitle" 
			method="post" target="_blank">
			<div class="input-group">
				<input type="text" class="form-control" name="p_title"
					placeholder="search"> 
					<span onclick="subSearchFrom();" class="input-group-addon" style="cursor:pointer;">
						<span class="glyphicon glyphicon-search"></span> 
					</span>
			</div>
		</form>
	</nav>
	<div class="container"
		style="margin-top: 30px; border: 1px solid #e4e4e4;">
		<div class="page-header" style="border-bottom: 0px;">
			<h2>
				${list[0].p_title}<br> <small>${list[0].p_date}分组：
				<a href="#">${list[0].pt_name}</a></small>
			</h2>
		</div>
	</div>
	<div class="container" style="">
		<div class="row">
			<div class="col-md-3"
				style="padding-top: 140px; padding-bottom: 210px; text-align: center; border: 1px solid #e4e4e4;">
				<img class="media-object img-circle img-thumbnail"
					style="width: 100px; height: 100px; max-width: 100px; margin: 0 auto;"
					src="${pageContext.request.contextPath}/resources/image/index/4.jpg">
				<p>用户名称：${list[0].username}</p>
				<p>等级：${list[0].level}</p>
				<P>昵称：${list[0].nickname}</P>
				<p>手机：${list[0].phone}</p>
			</div>
			<div class="col-md-9" style="border: 1px solid #e4e4e4;">
				<p style="line-height: 28px;">
					&nbsp;&nbsp;${list[0].p_content}
				</p>
				<p>
					<img src="${pageContext.request.contextPath}/resources/upload/user/${list[0].pi_img_name}"
					width="300px" height="300px" />
				</p>
			</div>
		</div>
		<form action="${pageContext.request.contextPath}/pbs/user/addPost" method="post">
		<input type="hidden" name="p_id" value="${list[0].p_id}">
		<div class="row">
			<span
				style="display: inline-block; width: 200px; height: 25px; line-height: 25px; vertical-align: center; text-align: left; margin-bottom: 10px;">你想对楼主说点什么</span>
			<span class="tag"
				style="display: inline-block; width: 200px; height: 25px; line-height: 25px; vertical-align: center; text-align: left; margin-bottom: 10px;">你最多可以输入30个字符</span>
			<textarea id="text" name="c_content" cols="30" rows="10" maxlength="30" class="text"></textarea>
			<br> <input type="submit" value="发 表" id="ipt"
				style="display: inline-block; width: 50px; height: 30px; background: #E2526F; border: 0;margin-top: 10px;float:right;color:#fff;">
			<div id="txt"></div>
		</div>
		</form>
		<c:if test="${not empty list}">
			<c:forEach items="${list}" var="list" varStatus="vs">
				<div class="row">
					<div style="float:left;">
						<img class="media-object img-circle img-thumbnail"
								style="width: 100px; height: 60px; max-width: 60px;display: inline;"
								src="${pageContext.request.contextPath}/resources/image/index/4.jpg">
						<span>${list.nickname}：${list.c_content}</span>&nbsp;&nbsp;&nbsp;&nbsp;
						<a id="modal-935009" onclick="setC_id('${list.p_id}','${list.c_id}')"
							href="#modal-container-935001" role="button" 
							data-toggle="modal" style="cursor: pointer;">回复</a>
					</div>
				</div>
				<div class="row">
					<div style="float:right;">
						<img class="media-object img-circle img-thumbnail"
								style="width: 100px; height: 60px; max-width: 60px;display: inline;"
								src="${pageContext.request.contextPath}/resources/image/index/4.jpg">
						<span >${user.nickname}&nbsp;&nbsp;回复&nbsp;&nbsp;${list.nickname}：${list.r_content}</span>
					</div>
				</div>
			</c:forEach>
		</c:if>
		 	<%-- <c:forEach items="${list}" var="list" varStatus="vs">
				 
			</c:forEach> --%> 
		<footer style="height:10em;width:100px;"></footer>
	</div>
<div class="modal fade" id="modal-container-935001" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">回复评论</h4>
				</div>
				<form action="${pageContext.request.contextPath}/pbs/user/commentReply" method="post">
					<input type="hidden" name="p_id" id="p_id">
					<input type="hidden" name="c_id" id="c_id">
					<div class="modal-body">
						<div class="row">
							<div class="col-md-8 col-md-offset-2">
								<textarea rows="10" cols="50" placeholder="请输入回复内容" name="r_content"
								maxlength="100">
								</textarea>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">
							关闭</button>
						<button type="submit" class="btn btn-primary" onclick="addUser()">
							回复</button>
					</div>
			   </form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	function setC_id(pid,cid){
		document.getElementById('p_id').value = pid;
		document.getElementById('c_id').value = cid;
	}
	
	 function subSearchFrom(){
		 $('#searchForm').submit();
	 }
</script>
</html>