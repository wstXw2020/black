<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<form action="gs.do" method="post" name="goodsForm">
		<table class="table table-striped table-bordered table-hover" style="margin: 10px auto;width: 70%">
			<thead>
				<tr>
					<th>班级</th>
					<th>姓名</th>
					<th>性别</th>
					<th>身份证号</th>
					<th>入学时间</th>
					<th>手机号</th>
					<th>地址</th>
					<th>学校</th>
				</tr>
			</thead>
			<tbody>
					<s:iterator value="slist"  status="i">
						<tr>
							<td><s:property value="clazz.cname" /></td>
							<td><s:property value="sname" /></td>
							<td><s:property value="sex" /></td>
							<td><s:property value="idcard" /></td>
							<td><s:property value="intime" /></td>
							<td><s:property value="phone" /></td>
							<td><s:property value="address" /></td>
							<td><s:property value="school" /></td>
						</tr>
					</s:iterator>
			</tbody>
		</table>
	</form>
	<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
</body>
</html>