<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>数据管理</title>
	
<style type="text/css">

   .btn-sm{
		background-color: #428bca !important;
		border-color: #428bca;
		height:20px;
		line-height: 5px;
	}
</style>
<script type="text/javascript">
$(function(){
	$('#subb').on('click',function(){
		 var date1 = document.getElementById("datepicker").value.replace(/-/g, "/");   
		    var date2 = document.getElementById("datepicker1").value.replace(/-/g, "/");      
		    var d1 = new Date(date1);   
		    var d2 = new Date(date2);   
		    if(Date.parse(d1) - Date.parse(d2)==0){   
			     alert("起始时间必须小于终止时间！")   
			     return false;
		    }   
		    else if(Date.parse(d1) - Date.parse(d2)>0){   
			     alert("起始时间必须小于终止时间！")   
			     return false;
		    }else{
		    	 $('#testDataform').submit();
		    }
	})
})
</script>
</head>
<body>
<div class="main-container" id="main-container">
<div class="main-container-inner">
<div class="breadcrumbs" id="breadcrumbs">
	<ul class="breadcrumb">
		<li>
			上传PDF
		</li>
		<li class="active">上传PDF</li>
	</ul>
</div>
<div class="page-content" style="padding: 0;">
	<div class="row">
		<div class="col-xs-12">					
			<!-- 用户列表 -->						
				<div class="col-sm-12" style="padding: 0;">
                  <div class="tabbable">
					<ul class="nav nav-tabs padding-12 tab-color-blue background-blue" id="myTab4">
						<li>
							<a  href="${pageContext.request.contextPath}/admin/user/selectAllUser">查看所有管理员</a>
						</li>

						<li>
							<a  href="${pageContext.request.contextPath}/admin/user/to_AllHospital">查看医疗诊所单位</a>
						</li>

						<li>
							<a  href="${pageContext.request.contextPath}/admin/user/selectAllEmployers">设置卫监单位</a>
						</li>
						<li class="active" >
							<a  href="${pageContext.request.contextPath}/admin/user/to_testData?test_type=mj_">原始数据管理</a>
						</li>
						<li class="active" >
							<a  href="${pageContext.request.contextPath}/admin/user/to_testData?test_type=mj_">上传PDF/数据包</a>
						</li>
					</ul>
					<div class="tab-content">
						<div id="home4" class="tab-pane in active">
							<h3><font color="green" >${result}</font></h3>
							<hr>
							<!-- 搜索 -->
							<div class="row timebox" id="formDiv">
								<div class="row">
								   <form id="testDataform" action="${pageContext.request.contextPath}/admin/user/selectRawData" method="post">
									<div class="col-md-6">
										<div class="col-sm-12" style="margin-bottom:10px;">
											<div class="form-group has-info">
												<label class="col-sm-2 control-label no-padding-right" >单位名称:</label>
												<div class="col-sm-7">
													<input type="text" name="name" placeholder="请输入名称" class="form-control hasDatepicker">
												</div>
											</div>
										</div>
									</div>
								</form>
								<form id="testDataform" action="${pageContext.request.contextPath}/admin/user/selectRawData" method="post">
									<div class="col-md-6">
										<div class="col-sm-12" style="margin-bottom:10px;">
											<div class="form-group has-info">
												<label class="col-sm-2 control-label no-padding-right" >单位名称:</label>
												<div class="col-sm-7">
													<input type="text" name="name" placeholder="请输入名称" class="form-control hasDatepicker">
												</div>
											</div>
										</div>
									</div>
								</form>
								</div>
							</div>
						
					</div>
					<div class="table-header">
						数据信息<span style="margin-left:3em; "><button id="user_btn"  class="btn btn-danger btn-minier">批量删除</button></span>
					</div>
					<div class="table-responsive">
						<table id="sample-table-2" class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th class="center" width="10%">选择</th>
									<!-- <th class="center" width="10%">序号</th> -->
									<th class="center">测试时间</th>
									<th class="center">单位名称</th>
									<th class="center">设备编号</th>
									<th class="center">设备品牌</th>
									<th class="center">设备型号</th>
									<th class="center">设备容量</th>
									<th class="center">使用科室</th>
									<th class="center">操作者</th>
									<th class="center">判定</th>
									<th class="center">操作</th>
								</tr>
							</thead>
						<tbody>
							<c:forEach items="${list}" var="list" varStatus="vs">
								<tr>
									<td class="center">
										<input type="checkbox" class="user_id"  value="${list.s_id}"/>
									</td>
									<%-- <td class="center">${vs.index+1 }</td> --%>
									<td class="center">${list.test_time}</td>
									<td class="center">${list.corporate_name}</td>
									<td class="center">${list.device_number}</td>
									<td class="center">${list.device_brand}</td>
									<td class="center">${list.device_kinds}</td>
									<td class="center">${list.device_capacity}</td>
									<td class="center">${list.use_department}</td>
									<td class="center">${list.use_persion}</td>
									<td class="center">${list.judged}</td>
									<td class="center">
										<button class="btn btn-success btn-minier"  href="#xiugai" role="button"
										data-toggle="modal" onclick="update('${Sterilization.s_id}');">修改</button>
										
										<button class="btn btn-danger btn-minier"  href="#shanchu" role="button"
										data-toggle="modal" onclick="shanchu('${Sterilization.s_id}');">删除</button>
									</td>
								</tr>
							  </c:forEach>
						    </tbody>
					      </table>	                								                             
                        </div>
                      </div>
                     </div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
	<i class="icon-double-angle-up icon-only bigger-110"></i>
</a>
</div>




<script type="text/javascript">
	jQuery(function($) {
		
			$( "#datepicker" ).datepicker({
				showOtherMonths: true,
				selectOtherMonths: false,
			
			});
			$( "#datepicker1" ).datepicker({
				showOtherMonths: true,
				selectOtherMonths: false,
			
			});
		});
	
	</script>


<script type="text/javascript">
		/* 行和列要对上 */
		jQuery(function($) {
			var oTable1 = $('#sample-table-2').dataTable( {
			"aoColumns": [
		      { "bSortable": false },
		      null,null,null,null,null,null,null,null,null,
			  { "bSortable": false }
			] } );
			
			/* 全选 */
			$('table th input:checkbox').on('click' , function(){
				var that = this;
				$(this).closest('table').find('tr > td:first-child input:checkbox')
				.each(function(){
					this.checked = that.checked;
					$(this).closest('tr').toggleClass('selected');
				});
					
			});
			/* 搜索 */
			$('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();
				var off2 = $source.offset();
				var w2 = $source.width();
				if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
				return 'left';
			}
		})
	</script>
	
	
	

</body>
</html>