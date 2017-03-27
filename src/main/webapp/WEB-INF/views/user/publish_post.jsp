<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.tb {
	margin: 0 auto;
}

.tb tr th, .tb tr td {
	BORDER-left: #c2daf2 1px solid;
	BORDER-top: #c2daf2 1px solid;
	font-weight: normal;
	color: #000;
	background-repeat: repeat-x;
	FONT-SIZE: 9pt;
	FONT-FAMILY: Arial, "宋体";
	padding: 10px;
}

.tb tr th {
	width: 180px;
	background-color: #eff5fb;
}

.tb tr td {
	width: 800px;
	background-color: #f5f5f5;
}

.tb tr input {
	width: 500px;
}

.tb tr span {
	color: red;
}

.tab {
	width: 80px;
	border: 1px solid #ddddde;
	height: 27px;
	background: -webkit-linear-gradient(#e3e3e3, #fff);
	/* Safari 5.1 - 6.0 */
	background: -o-linear-gradient(#e3e3e3, #fff); /* Opera 11.1 - 12.0 */
	background: -moz-linear-gradient(#e3e3e3, #fff); /* Firefox 3.6 - 15 */
	background: linear-gradient(#e3e3e3, #fff); /* 标准的语法 */
	text-align: center;
	line-height: 27px;
}

.tab:hover, .omg {
	background: #f5f5f5;
	border-bottom: 1px solid #fff;
}

#small_btn_select {
	width: 120px;
}

#big_btn_select {
	width: 270px;
}

.btn-select {
	position: relative;
	display: inline-block;
	height: 35px;
	font: 14px/20px "Microsoft YaHei";
	color: #fff;
}

.btn-select .cur-select {
	position: absolute;
	display: block;
	width: 100%;
	height: 30px;
	text-align: center;
}

.btn-select select {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 30px;
	opacity: 0;
	filter: alpha(opacity : 0; );
	font: 14px/20px "Microsoft YaHei";
	color: #000;
}

.btn-select select option {
	text-indent: 10px;
}

.btn-select select option:hover {
	background-color: #f80;
	color: #fff;
}
</style>

</head>
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/index/ckeditor.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/index/publish-post.js"></script>
<script type="text/javascript">
    $(function(){
    	var base="${pageContext.request.contextPath}";
    	$.ajax({
    		url: base+"/admin/user/findAllType",
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
            		$('#postType')
            		.append(
           				'<option value="'+data[key].pt_id+'">'+data[key].pt_name+'</option>'
            		);
            	}
    	 	}
    	})
    })   
      
</script>
<body>
	<form  action="${pageContext.request.contextPath}/pbs/user/userPost" method="post" enctype="multipart/form-data">
		<table class="tb">
			<tr>
				<th>文章标题</th>
				<td>
					<input  type="text" id="textfile" name="p_title" maxlength="30" style="height:2em;"/>
					 <span>最多输入30个字符</span>
				</td>
			</tr>
			<tr>
				<th>文章内容</th>
				<td><textarea rows="10"  class="" name="p_content" id="ckeditor" style="width:498px;" maxlength="3000">
				</textarea>
					<span style="color:red;">最多输入30000个字符</span></td>
			</tr>
			<tr>
				<th>添加图片</th>
				<td>
					<input type="file" name="permitsfile">
					<span style="color:red;">文件不能超过40K</span>
				</td>
			</tr>
			<tr>
				<th>选择版块</th>
				<td>
					<div id="change" style="float: left;">
						<select style="width: 100px;height:2em;" name="pt_id" id="postType">
							
						</select> &nbsp;&nbsp;&nbsp;&nbsp;
						<span style="float: right; line-height: 35px;">
							请选择所要发帖的版块
						</span>
					</div>
				</td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>