<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link href="../css/bootstrap.min.css" rel="stylesheet">
  <link href="../css/titlebar.css" rel="stylesheet">
  <!-- 
  <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
     -->
      <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </head>
  
  <body>
  
  
  <nav class="navbar navbar-inverse" role="navigation">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">BBS技术论坛</a>
            </div>
            
            <div>
      <ul class="nav navbar-nav">
         <li><a href="">首页</a></li>
         <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
               精选板块 <b class="caret"></b>
            </a>    
         </li>
          <li><a href="<%=request.getContextPath() %>/more.action?type=-3&&page=1">论坛热帖</a></li>
          <li><a href="<%=request.getContextPath() %>/more.action?type=-1&&page=1">论坛新帖</a></li>
          <li><a href="<%=request.getContextPath() %>/more.action?type=-2&&page=1">精华帖</a></li>
      </ul>
   </div>                                       
            <ul class="nav navbar-nav navbar-right user">
                <li><a href="<%=request.getContextPath()%>/login.jsp">登陆</a></li>
                <li><a href="<%=request.getContextPath()%>/regist.jsp">注册</a></li>
            </ul>
            <p class="navbar-text navbar-right">尊敬的游客您好！</p>
   
               <ul class="nav navbar-nav navbar-right user">

                    <li class="dropdown">
                        
                        <ul class="dropdown-menu">
                            <li><a href="">设置</a></li>
                            <li><a href="">我的帖子</a></li>
                            <li><a href="">我要发帖</a></li>
                            <li class="divider"></li>
                            <li><a href="">退出登陆</a></li>
                        </ul>
                    </li>
                </ul>
                 
  </body>
</html>
