<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<!-- 周考成绩界面 -->
	<form action="gs.do" method="post" name="goodsForm">
		<div style="margin:auto;width:70%;text-align: right;margin-top: 20px">
			<!--学生姓名：<input type="text" name="goods_code" value="${requestScope.gsb.goods_code}">
			商品名称：<input type="text" name="goods_name" value="${requestScope.gsb.goods_name}">
			<input type="submit" value="查询">   -->
			
			 <a class="btn btn-info btn-sm" href="stuExamAdd.jsp" type=""><span class="glyphicon glyphicon-plus"></span>导入Excel</a> 
		</div>
		<table class="table table-striped table-bordered table-hover" style="margin: 10px auto;width: 70%">
			<thead>
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>周考成绩</th>
					<th>编辑</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="kas"  status="i">
					<tr>
						<td><s:property value="student.idcard" /></td>
						<td><s:property value="student.sname" /></td>
						<td><s:property value="score" /></td>
						<td>
							<a class="btn btn-info btn-xs" href="KSUpdUI.action?ka.scid=<s:property value="scid" />">修改</a>
							<a class="btn btn-info btn-xs" href="KSAddUI.action?ka.scid=<s:property value="scid" />">添加成绩</a>
						</td>
						
					</tr>
				</s:iterator>
				
			</tbody>
		</table>
		
	</form>
	<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
</body>
</html>