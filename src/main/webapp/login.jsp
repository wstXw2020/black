<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">

<!-- <script type="text/javascript">
		function print(){   
				var uname = document.getElementById("uname").value;
				if(uname==""){
					alert("用户名不能为空");
					return false;
				}
		  }
</script> -->

</head>
<body>

	<script src="js/jquery-1.12.3.min.js"  type="text/javascript"  charset="utf-8"></script>
	<script src="js/bootstrap.js"  type="text/javascript"  charset="utf-8"></script>
	
	<div id="" style="height: 150px;width: 100%;background-color: #000000;text-align: center;padding-top: 70px;">
			<font size="" color="white">管理系统 </font>
		</div>

		<div id="" style="width: 100%;background-color: #00CED1;height: 770px;">
			<form class="form-horizontal" action=""  method=post>
							<div id="" class="form-group"   style="padding-top: 150px;">
								<label class="col-sm-5 control-label"> <span class="glyphicon glyphicon-user"></span> 账号：</label>
								<div id="" class="col-sm-3">
									<input type="text" class="form-control" name="user.uname" id="uname"  />
								</div>
							</div>
							<div id="" class="form-group">
								<label class="col-sm-5 control-label"><span class="glyphicon glyphicon-lock"></span> 密码：</label>
								<div id="" class="col-sm-3">
									<input type="password" class="form-control"  name="user.upwd" />
								</div>
							</div>
							<div id="" class="form-group" style="margin: 0 auto;float: left;padding-left: 950px;">
								<div id="" class="col-sm-12 ">
									<input type="submit" class="btn btn-default" value="登录"  style="background-color:white" formaction="login.action"/>
								</div>
							</div>
							<div id="" class="form-group" style="margin: 0 auto;float: left;">
								<div id="" class="col-sm-12 ">
									<input type="submit"  class="btn btn-default" value="注册"  style="background-color:white" formaction="zhuce.jsp"/>
								</div>
							</div>
						</form>
		</div>
	
</body>
</html>