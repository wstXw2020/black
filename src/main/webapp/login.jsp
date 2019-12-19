<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
</head>
<body>
	<form action="findAll.action" method="post">
		账号：<input type="text" name="uname">
		密码：<input type="password" name="upwd">
		<button name="dl" onclick="dl()">登录</button>
	</form>
</body>
</html>