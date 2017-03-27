
$(function() {
	if($("#include").height() > $("#inp").height()) {
		$("#inp").css("height", $("#include").height())
	} else {
		$("#include").css("height", $("#inp").height())
	}
	
	
	
	$('#btn').on("click",function(){
		alert("123");
		var base = "${pageContext.request.contextPath}";
			$.ajax({
				url : base+"/www.tao2.com/goodslist",
				type : "GET",
				datatype : "text",
				data : "username="+username,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("异常了....");
				},
				success : function(data) {
					var data1=eval(data.result);
					alert(data1);
					var countdown=60;
					    if (countdown == 0) { 
					        data1.removeAttribute("disabled");    
					        data1.value="获取验证码"; 
					        countdown = 60; 
					        return;
					    } else { 
					        data1.setAttribute("disabled", true); 
					        data1.value="重新发送(" + countdown + ")"; 
					        countdown--; 
					 	} 
						setTimeout(function() { 
						    settime(obj) }
						    ,1000) 
				   }
				
			  })
	})
})




