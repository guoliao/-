<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<a class="navbar-brand" href="./list.html">手机论坛</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li><a href="#">华为专区</a></li>
				<li><a href="#">苹果专区</a></li>
				<li><a href="#">OPPO专区</a></li>
				<li><a href="#">三星专区</a></li>
				<li><a href="#">vivo专区</a></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 其他 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#">最新帖子</a></li>
						<li><a href="#">最热帖子</a></li>
						<li><a href="#">今日头条</a></li>
						<li><a href="#">热门品牌论坛</a></li>
					</ul></li>
			</ul>

			<ul class="nav navbar-nav navbar-right user">
				<li><a href="#">登陆</a></li>
				<li><a href="#">注册</a></li>
			</ul>
			<p class="navbar-text navbar-right">尊敬的游客您好！</p>
		</div>
		<form class="navbar-form navbar-right" role="search"
			action="<%=request.getContextPath()%>/search.action">
			<div class="input-group">
				<input type="text" class="form-control" name="keywords"
					placeholder="search"> <span class="input-group-addon"><span
					class="glyphicon glyphicon-search"></span> </span>
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
						<a href="" style="float: right; color: white">
							更多>>
						</a>
					</div>

				</ul>
			</div>
		</div>
		<div id="XINTIE">
			
		</div>
		<div class="row">
			<div class="col-md-9">

				<ul class="list-group">
					<div class="list-group-item active">
						精华帖 <a
							href="<%=request.getContextPath() %>/more.action?type=-1&&page=1"
							style="float: right; color: white">更多>></a>
						<!--<p style="float: right"></p>-->
					</div>
				</ul>
				<div id="JINGHUA">
				</div>
				<div class="blog-post">
					<h3 class="blog-post-title">
						<a href="./item.html">iOS 10.3开发者beta5全机型固件及描述文件下载</a>
					</h3>
					<p class="blog-post-meta">
						2015年2月3日 分组：<a href="#">Web开发</a>
					</p>
					<p class="blog-post-content">苹果今天凌晨正式推送iOS10.3
						Beta5开发者预览版固件更新升级，已安装相应描述文件的iPhone、iPad、iPod
						touch用户，可直接在设置中检查获取此次OTA更新。本次更新下载安装包在432.2MB左右，主要是Bug修复和改进提升。</p>
				</div>
				<hr />
				<div class="blog-post">
					<h3 class="blog-post-title">
						<a href="./item.html">iOS 10.3开发者beta5全机型固件及描述文件下载</a>
					</h3>
					<p class="blog-post-meta">
						2015年2月3日 分组：<a href="#">Web开发</a>
					</p>
					<p class="blog-post-content">苹果今天凌晨正式推送iOS10.3
						Beta5开发者预览版固件更新升级，已安装相应描述文件的iPhone、iPad、iPod
						touch用户，可直接在设置中检查获取此次OTA更新。本次更新下载安装包在432.2MB左右，主要是Bug修复和改进提升。</p>
				</div>
				<hr />
				<div class="blog-post">
					<h3 class="blog-post-title">
						<a href="./item.html">iOS 10.3开发者beta5全机型固件及描述文件下载</a>
					</h3>
					<p class="blog-post-meta">
						2015年2月3日 分组：<a href="#">Web开发</a>
					</p>
					<p class="blog-post-content">苹果今天凌晨正式推送iOS10.3
						Beta5开发者预览版固件更新升级，已安装相应描述文件的iPhone、iPad、iPod
						touch用户，可直接在设置中检查获取此次OTA更新。本次更新下载安装包在432.2MB左右，主要是Bug修复和改进提升。</p>
				</div>
				<hr />
				<div class="blog-post">
					<h3 class="blog-post-title">
						<a href="./item.html">iOS 10.3开发者beta5全机型固件及描述文件下载</a>
					</h3>
					<p class="blog-post-meta">
						2015年2月3日 分组：<a href="#">Web开发</a>
					</p>
					<p class="blog-post-content">苹果今天凌晨正式推送iOS10.3
						Beta5开发者预览版固件更新升级，已安装相应描述文件的iPhone、iPad、iPod
						touch用户，可直接在设置中检查获取此次OTA更新。本次更新下载安装包在432.2MB左右，主要是Bug修复和改进提升。</p>
				</div>
				<hr />
			</div>

			<div class="col-md-3">
				<ul class="list-group">
					<div class="list-group-item active">论坛公告</div>
					<div class="blog-post">
						<h3 class="blog-post-title">
							<a href="./item.html">iOS 10.3开发者beta5全机型固件及描述文件下载</a>
						</h3>
						<p class="blog-post-meta">
							2015年2月3日 分组：<a href="#">Web开发</a>
						</p>

					</div>
					<hr>
				</ul>
				<a href="${pageContext.request.contextPath}/pbs/user/to_Publish_post">
					<button type="button" class="btn btn-primary"
						style="width: 200px; height: 50px; margin-left: 30px">我要发帖</button>
				</a>
			</div>
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
 $(document).ready(function(){
	 var base = "${pageContext.request.contextPath}";
	 $.ajax({
		 url: base+"/pbs/user/selectPost",
	 	type:"GET",
	 	data:'',
	 	async: false,//要求同步 不是不需看你的需求
	 	error : function(result) {  
        },
	 	success : function(result) {
	 		var data = eval(result.list);
	 		var str = JSON.stringify(data);
        	alert(str);
        	console.log(str);
        	for(var key in data){
        		$('#XINTIE').append(
       				'<div class="blog-post">'+
       					'<h3 class="blog-post-title">'+
       						'<a href="'+base+'/pbs/user/userFindPost?p_id='+data[key].p_id+'">'+data[key].p_title+'</a>'+
       					'</h3>'+
       					'<p class="blog-post-meta">'
       						+data[key].p_data+
       						'<a href="#">：Web开发</a>'+
       					'</p>'+
       					'<p class="blog-post-content">'
       						+data[key].p_content+
       					'</p>'+
       				'</div>'+
       				'<hr>'	
        		);
        	}
	 	}
	 })
 })
</script>		
</body>
</html>