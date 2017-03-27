var password = function(e){
	var baseUrl = e.base;
$(function() {
	if($("#include").height() > $("#inp").height()) {
		$("#inp").css("height", $("#include").height())
	} else {
		$("#include").css("height", $("#inp").height())
	}
	
	$('#sub').on('click',function(){
		var username = $('#username').val();
		var checkCode = $('#checkCode').val();
		if(username.length == 0){
			alert("账号不能为空");
			return false;
		}
		if(!(/^1[34578]\d{9}$/.test(username))){ 
	        alert("手机号码有误，请重填");  
	        return false; 
		} 
		if(checkCode.length == 0){
			alert("验证码不能为空");
			return false;
		}else{
			$('#formLogin').submit();
		}
	})
	
	$('#btn').on("click",function(){
		//alert("123");
		var username = $('#username').val();
		if(username.length == 0){
			alert("账号不能为空");
			return false;
		}
		if(!(/^1[34578]\d{9}$/.test(username))){ 
	        alert("手机号码有误，请重填");  
	        return false; 
		}else{
			$.ajax({
				url : baseUrl+"/help/SendCheckNum",
				type : "GET",
				datatype : "text",
				data : "username="+username,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("异常了....");
				},
				success : function(data) {
					if(data.success == "发送成功"){
						alert("验证码发送成功！");
					}else{
						alert("验证码发送失败！");
					}
				}
			})
		}
	})
})
}



