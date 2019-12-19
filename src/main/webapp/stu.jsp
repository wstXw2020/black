<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
</head>
<body>

	<script src="js/jquery-1.12.3.min.js"  type="text/javascript"  charset="utf-8"></script>
	<script src="js/bootstrap.js"  type="text/javascript"  charset="utf-8"></script>
	
	<table border=1px cellspacing=0 cellpadding=0  align="center" class="table table-striped" width="800">
		<tr>
			<th>sid</th>
			<th>cid</th>
			<th>uid</th>
			<th>sname</th>
			<th>sex</th>
			<th>idcard</th>
			<th>intime</th>
			<th>phone</th>
			<th>address</th>
			<th>school</th>
		</tr>
		<s:iterator value="slist"  status="i">
			<tr>
				<td><s:property value="sid" /></td>
				<td><s:property value="clazz.cid" /></td>
				<td><s:property value="user.uid" /></td>
				<td><s:property value="sname" /></td>
				<td><s:property value="sex" /></td>
				<td><s:property value="idcard" /></td>
				<td><s:property value="intime" /></td>
				<td><s:property value="phone" /></td>
				<td><s:property value="address" /></td>
				<td><s:property value="school" /></td>
			</tr>
		</s:iterator>
	</table>
	
</body>
</html>