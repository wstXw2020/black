<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		function print(){   
				var uname = document.getElementById("uname").value;
				if(uname==""){
					alert("用户名不能为空");
					return false;
				}
		  }
</script>
</head>
<body>
	<form action="login.action" method="post">
		账号：<input type="text" name="user.uname" id="uname">
		密码：<input type="password" name="user.upwd">
		身份：<select>
					<option>教师</option>
					<option>学生</option>
				</select>
		<button onclick="return print()">登录</button>
	</form>
</body>
</html>