<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/bootstrap.min.css">
	</head>
	<body>
		<table class="table table-striped table-bordered table-over">
	<thead>
		<tr>
			<td>班级期数</td>
			<td>班主任</td>
			<td>代课老师</td>
			<td>考试情况 </td>
			<td>周考平均分 </td>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="listc"  status="i">
			<tr>
				<td><s:property value="cname" /></td>
				<td><s:property value="bzr" /></td>
				<td><s:property value="ls" /></td>
				<td><s:property value="type" /></td>
				<td><s:property value="jieduan.week" /></td>
			</tr>
		</s:iterator>	
	</tbody>
</table>
	</body>
</html>
