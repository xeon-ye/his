<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<%@ include file="/common/metas.jsp"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<div class="easyui-layout" data-options="fit:true" style="width:100%;height:100%;" id="treeLayOut">
			<div data-options="region:'center',fit:true"  id="content" style="width: 100%">
					<div style="padding: 5px 5px 0px 5px;height: 5%;margin-bottom: 5px;" data-options="fit:true">
						<form id="search" method="post" data-options="fit:true">
							<table
								style="width: 100%; border: 1px solid #95b8e7; padding: 5px;">
								<tr>
									<td style="width: 30%;margin-left: 5px;" nowrap="nowrap">
										关键字： <input class="easyui-textbox" name="queryName" id="queryName"  onkeydown="keyDown()"  style="width:220px" />
									</td>
									<td>
										&nbsp;&nbsp;<a href="javascript:void(0)" onclick="searchFrom()" class="easyui-linkbutton" iconCls="icon-search">查询</a>
									</td>
								</tr>
							</table>
						</form>
					</div>
				<div style="padding: 0px 5px 5px 5px;height: 90%">
					<table id="list" style="width:100%" data-options="fit:true">
						<thead>
							<tr>
			    				<th data-options="field:'name'" style="width:35%">名称</th>
			    				<th data-options="field:'alias'" style="width:20%">别名</th>
			    				<th data-options="field:'description'" style="width:45%">说明</th>
			    				
			    				
							</tr>
						</thead>
					</table>
				</div>
				</div>
			</div>
</div>
</body>
	<script type="text/javascript">
	var textId= "${param.textId}";
	var type= "${param.type}";
	var parId="${param.parId}"
	//加载页面
		$(function(){
			var winH=$("body").height();
			$('#p').height(winH-78-30-27-2);
			$('#treeDiv').height(winH-78-30-27-2);
			$('#list').height(winH-78-30-27-22);
			
			var id="${id}"; //存储数据ID
			//添加操作按钮
			$('#list').datagrid({
				checkOnSelect:true,
				selectOnCheck:false,
				singleSelect:true,
				pagination:true,
				url:'queryMenuTreePopWin.action',
				method:'post',
				rownumbers:true,
				idField: 'id',
				striped:true,
				border:true,
				checkOnSelect:true,
				selectOnCheck:false,
				singleSelect:true,
				fitColumns:false,
				queryParams:{
					type:type,
					parId:parId
					
				},
				pageList:[20,30,50,80,100],pageSize:20,
				onLoadSuccess: function (data) {//默认选中
				var rowData = data.rows;
				$.each(rowData, function (index, value) {
				  if(value.id == id){
				     $("#list").datagrid("checkRow", index);
				  }
			    });
			    },onDblClickRow: function (rowIndex, rowData) {//双击查看
	            	 var tmpId ="#"+textId;
	            	 if(window.opener.$(tmpId).attr("class")&&/combobox/ig.test(window.opener.$(tmpId).attr("class"))){
			    			window.opener.$(tmpId).combobox('select',rowData.code);
		    		}else{
						if('function' === typeof window.opener.popWinMenuCallBackFn){
							window.opener.popWinMenuCallBackFn(rowData);
						}else{
							window.opener.$(tmpId).val(rowData.encode);
							window.opener.$(tmpName).textbox("setValue",rowData.name);
							window.opener.$(tmpId).change();
						}
					}
					window.close();
					}    
			});	
			bindEnterEvent('queryName',searchFrom,'easyui');
		});
		//格式复选框
		function formatCheckBox(val,row){
		  if(val==1){
			return '是';
		  }else{
			return '否';
		  }
		}
		/*查询
		*多个条件组合成一个条件查询 
		*
		*
		*/
		function searchFrom(){ 
	   		var queryName = $('#queryName').val();
	   		$('#list').datagrid({
				url:'<%=basePath%>/popWin/popWinMenuTree/queryMenuTreePopWin.action',
				method:'post',
				checkOnSelect:true,
				selectOnCheck:false,
				singleSelect:true,
				pagination:true,pageList:[20,30,50,80,100],pageSize:20,
				queryParams:{
					queryName:queryName,
					type:type,
					parId:parId
				},
				onLoadSuccess: function (data) {//默认选中
				var rowData = data.rows;
				$.each(rowData, function (index, value) {
				  if(value.id == id){
				     $("#list").datagrid("checkRow", index);
				  }
			    });
			    }
			});	
		}
		//回车键
		function keyDown(){  
			if (event.keyCode == 13){  //目前只支持IE
			    event.returnValue=false;  
			    event.cancel = true;  
			    searchFrom();  
			}  
		} 	
	</script>
</html>
