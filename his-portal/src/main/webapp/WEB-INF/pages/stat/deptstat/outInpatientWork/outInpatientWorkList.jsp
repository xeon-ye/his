<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<%@ include file="/common/metas.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>门诊住院工作同期对比表</title>
</head>
<script type="text/javascript">
					var cames;//院区
					var menuAlias="${menuAlias}";//权限
					$(function(){
								dyTitle();
								var Etime = "${eTime}";
								$.ajax({
									url: "<c:url value='/baseinfo/department/getAuthorArea.action'/>?menuAlias="+menuAlias,
									type:"post",
									async:false,
									success: function(date){
// 										console.info(date);
										cames=date;//请求院区
									}
								});
								var sign=cames.length;
								if(sign==undefined||sign==0){
									$("#list").datagrid();
									$("body").setLoading({
										id:"body",
										isImg:false,
										text:"无数据权限"
									});
								}else{
									$('#district').combobox({
										valueField : 'code',
										textField : 'name',
										multiple : true,
										data:cames
									});
									$('#list').datagrid({
										url:'<%=basePath%>iReport/OutInpatientWork/loadDataByOracle.action',
										queryParams:{
											eTime: Etime,
										},
										method:'post',
										fitColumns:true,
										fit:true,
										singleSelect:true,
										striped:true,
										onLoadSuccess:function(){
											dyTitle();
										
										}
							        });
									$("#district").combobox("setText","全部");
								}
					});	
				  //查询	
				  function searchFrom(){
						var  time=$("#eTime").val();
						var areaCode =$("#district").combobox('getValues');
						var codeText =$("#district").combobox("getText","全部");
						if("全部"==codeText){
							areaCode="";
						}
						$('#list').datagrid('reload',{
							eTime: time,
							areaCode: areaCode,
							onLoadSuccess:function(){
								dyTitle();
							}
						});
					}
					
				 //重置
				 function clears(){
					  var  time=$("#eTime").val("${eTime}");
					  var code =$("#district").combobox("setText","全部");
					  searchFrom();
				  }

					//动态设置表头
				function dyTitle(){
						//对比指定年的指定的一个月
						var endYear=$("#eTime").val();//时间
						var month = endYear.substring(5,7);
						if(month<10){
							month=month.substring(1,2);
						}	
						var numYear= parseInt(endYear.substring(0,4));
						var end=endYear.substring(0,4)+"年"+month+"月";
						var beginYear=(numYear-1)+"年"+month+"月";
						$("#beginYear").html(beginYear);
						$("#endYear").html(end);
					}
				
				/**
				* 打印方法
				*/
				function reportList(){
					var times = $('#eTime').val();
					if(times != ''){
						var rows = $('#list').datagrid('getRows');
						if(rows.length > 0){
							$('#eReportTime').val(times);
							$('#reportJson').val(JSON.stringify(rows));
							//表单提交 target
							var formTarget="reportForm";
							var tmpPath = "<%=basePath%>iReport/OutInpatientWork/reportList.action";
							//设置表单target
							$("#reportForm").attr("target",formTarget);
							//设置表单访问路径
							$("#reportForm").attr("action",tmpPath); 
							//表单提交时打开一个空的窗口
							$("#reportForm").submit(function(e){
								window.open('about:blank',formTarget,'height=900,width=850,top=50,left=500,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no,status=no');
								window.close();
							});
							$("#reportForm").submit();
						}else{
							$.messager.alert("提示","当前统计无数据,无法打印！");
							setTimeout(function(){$(".messager-body").window('close')},1500);
							return;
						}
					}else{
						$.messager.alert("提示","请先选择查询日期！");
						close_alert();
						return;
					}
				}			
					
				/**
				* 导出方法
				*/
				function exportList(){
					var times = $('#eTime').val();
					if(times != ''){
						var rows = $('#list').datagrid('getRows');
						if(rows.length > 0){
							$('#exeReportTime').val(times);
							$('#exportJson').val(JSON.stringify(rows));
							$('#exportForm').form('submit', {
								url :"<%=basePath%>iReport/OutInpatientWork/exportList.action",
								onSubmit : function(param) {
								},
								success : function(data) {
									$.messager.alert("操作提示", "导出成功！", "success");
								},
								error : function(data) {
									$.messager.alert("操作提示", "导出失败！", "error");
								}
							});
						}else{
							$.messager.alert("提示","当前统计无数据，无法打印！");
							setTimeout(function(){$(".messager-body").window('close')},1500);
							return;
						}
					}else{
						$.messager.alert("提示","请先选择查询日期！");
						close_alert();
						return;
					}
				}
				
// 				var flag="true";
// 				$("#district").combobox({
// 					onChange:function(newValue,oldValue){
					
// 					if(flag=="true"){//执行第一次
// 								var str="";
// 								for(var i=0;i<newValue.length;i++){
// 									if(i!=newValue.length-1){
// 										str+=newValue[i]+",";
// 									}else{
// 										str+=newValue[i];
// 									}
// 								}
// 								str=str.replace("0,", "");
// 								var newArray=str.split(",");
// 								for(var i=0;i<newArray.length;i++){
// 											$(this).combobox("select",newValue[i]);
// 											$(this).combobox("unselect","0");
// 								}
// 								flag="false";
// 								return ;
// 					}	
// 					if(flag=="false"){//执行第n次
// 							var str="";
// 							for(var i=0;i<newValue.length;i++){
// 								if(i!=newValue.length-1){
// 									str+=newValue[i]+",";
// 								}else{
// 									str+=newValue[i];
// 								}
// 							}
// 							var newArray=str.split(",");
// 							alert(newArray);
// 							if(-1!=str.indexOf("0")){
// 									for(var i=0;i<newArray.length;i++){
// 										$(this).combobox("unselect","0");
// 										$(this).combobox("select",newValue[i]);
// 									}
// 							}else{
// 									for(var i=0;i<newArray.length;i++){
// 										$(this).combobox("select","0");
// 									}
// 							}
// 							return ;
// 					}	
			
		
// 				}
				
// 			});
					
					
</script>
<body style="margin: 0px; padding: 0px;">
<div id="topShow" class="easyui-layout" style="fit:true">
	  <form action="" style="width: 100%;height:5%;padding: 1px 5px 0px 5px;">
					<table  style="width: 100%;height: 100%;">
						<tr >
					
							<!-- 开始时间 --> 
								<td style="width:40px;" align="left">日期:</td>
								<td style="width:110px;">
									<input id="eTime" class="Wdate" type="text" name="eTime" value="${eTime}" onClick="WdatePicker({dateFmt:'yyyy-MM'})" style="width:110px;border: 1px solid #95b8e7;border-radius: 5px;"/>
								</td>

								<td style="width:53px;padding-right:6px" align="right" >院区:</td>
						  		<td style="width:130px;">
							  			<input id="district" class="easyui-combobox" name="district" style="width:120px;" data-options="required:true,multiple:true" />
						  		</td>  	
								<td>
									<a href="javascript:void(0)" onclick="searchFrom()" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="margin-left:8px">查询</a>
									<a href="javascript:void(0)" onclick="clears()" class="easyui-linkbutton" iconCls="reset">重置</a>
									<a href="javascript:void(0)" onclick="reportList()" class="easyui-linkbutton" data-options="iconCls:'icon-printer'" style="margin-left:8px">打印</a>
									<a href="javascript:void(0)" onclick="exportList()" class="easyui-linkbutton" data-options="iconCls:'icon-down'">导出</a><!-- exportList() -->
							    </td>
						</tr>
					</table>
				</form>
			<div data-options="region:'north'" style="height:7%;width: 100%;padding:0px 5px 0px 5px;">
  				<table style="width:100%;z-index: 0">
		    		<tr>
		    			<td align="center"><span style="font-size:28px !important;">门诊住院工作某月同期对比表</span></td>
		    		</tr>
		    	</table>
			</div>
			<div  data-options="region:'center',border:false" id="tableShow" style="width:100%;margin-top:0px;height:88%"  >
					<table class="easyui-datagrid"  id="list"  data-options="singleSelect:'true',striped:true,fitColumns:true,fit:true ">
					<thead data-options="frozen:true">
							<tr>
								<th data-options="field:'projectName',align:'center',width:'20%'" >项目</th>
								<th data-options="field:'beginNum',align:'center',width:'20%'" ><span id="beginYear"></span></th>
								<th data-options="field:'endNum',align:'center',width:'20%'" ><span id="endYear"></span></th>
								<th data-options="field:'increaseNum',align:'center',width:'20%'">增减数</th>
								<th data-options="field:'increasePercent',align:'center',width:'20%'">增减%</th>
						    </tr>
					</thead>
				</table>
			<form id="reportForm" method="post">
				<input type="hidden" id="eReportTime" name="eReportTime" /> 
				<input type="hidden" id="reportJson" name="reportJson"> 
				<input type="hidden" id="fileName" name="fileName" value="ROIW">
			</form>
			<form id="exportForm" method="post">
				<input type="hidden" id="exeReportTime" name="eReportTime" /> 
				<input type="hidden" id="exportJson" name="exportJson">
			</form>
		</div>
	</div>
</body>
</html>