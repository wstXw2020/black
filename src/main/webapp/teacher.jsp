<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1,
maximum-scale=1, user-scalable=no">
<title>教师</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<style type="text/css">
 #top{background-image:url("images/bg.jpg");color: #fff;}
 #footer {
	padding: 20px;
	text-align: center;
	background-color: #eee;
	border-top: 1px solid #ccc;
	color: #4A515B
  }
#main-nav {margin-left: 1px; }  
#main-nav.nav-tabs.nav-stacked > li > a 
{ 
 	padding: 10px 8px;
	font-size: 12px;
	font-weight: 600;
	color: #4A515B;
	background: #E9E9E9;
 	background: -moz-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
 	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#FAFAFA), color-stop(100%,#E9E9E9)); 
 	background: -webkit-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
	background: -o-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
	background: -ms-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
 	background: linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
	border: 1px solid #D5D5D5;
 	border-radius: 4px;             
 } 
#main-nav.nav-tabs.nav-stacked > li > a > span 
{
	color: #4A515B; 
}                  
  #main-nav.nav-tabs.nav-stacked > li.active > a, #main-nav.nav-tabs.nav-stacked > li > a:hover 
  { 
 	color: #FFF; 
	background: #3C4049;
	background: -moz-linear-gradient(top, #4A515B 0%, #3C4049 100%); 
 	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#4A515B), color-stop(100%,#3C4049)); 
	background: -webkit-linear-gradient(top, #4A515B 0%,#3C4049 100%);
 	background: -o-linear-gradient(top, #4A515B 0%,#3C4049 100%);
 	background: -ms-linear-gradient(top, #4A515B 0%,#3C4049 100%); 
	background: linear-gradient(top, #4A515B 0%,#3C4049 100%); 
 	border-color: #2B2E33;
}
#main-nav.nav-tabs.nav-stacked > li.active > a, #main-nav.nav-tabs.nav-stacked > li > a:hover > span 
{
	color: #FFF;
}
#main-nav.nav-tabs.nav-stacked > li 
{
	margin-bottom: 4px;             
}           /*定义二级菜单样式*/
.secondmenu a {
	font-size: 12px;
 	color: #4A515B;
	text-align: left;
}
 .navbar-static-top {
	background-color: #212121;
	margin-bottom: 5px;
 } 
 .navbar-brand {
	padding-left: 50px;
	color: #fff;
	font-weight: bold;
} 
</style>
</head>
<%-- <%

if(session.getAttribute("uname")==null){
	response.sendRedirect("login.jsp");
}
%> --%>
<body>
<!-- 导航条 -->
<div class="navbar  navbar-static-top">
	<div class="navbar-header"> 
		<a class="navbar-brand" href="/index.jsp" id="logo">学院情况查看 
		</a> 
	</div> 
	<ul class="nav navbar-nav navbar-right">
		<li><a href="#" style="color: #fff"><span class="glyphicon glyphicon-home"></span>欢迎<%=session.getAttribute("uname")%>登陆,当前在线人数：<%=application.getAttribute("online")%></a></li>
		<li><a href="exit.do" style="color: #fff"><span class="glyphicon glyphicon-list"></span>安全退出</a></li>
		
	</ul>
</div> 
<!-- 显示区域 -->
<div class="container-fluid"> 
	<div class="row">
		<!-- 左侧折叠菜单 -->
		<div class="col-md-2"> 
			<ul id="main-nav" class="nav nav-tabs nav-stacked" > 
				<li class="active"> 
					<a href="#"> 
						<i class="glyphicon glyphicon-th-large"></i>&nbsp;首页          
					</a> 
				</li> 
				<li> 
					<a href="#systemSetting" class="nav-header collapsed" data-toggle="collapse"> 
						<span class="glyphicon glyphicon-cog"></span> 
							学员管理 
						<span class="pull-right glyphicon glyphicon-chevron-down"></span> 
					</a> 
					<ul id="systemSetting" class="nav nav-list collapse out secondmenu" style="height: 0px;"> 
						<li><a href="Kqjilu_kqList" target="ifs"><i class="glyphicon glyphicon-user"></i>查看考勤</a></li>
						<li><a href="Kaoshi_kaList" target="ifs"><i class="glyphicon glyphicon-th-list"></i>周考成绩</a></li>
						
						<li><a href="#" target="ifs"><i class="glyphicon glyphicon-edit"></i>修改密码</a></li>
					</ul> 
				</li>
				
				
				<li> 
					<a href="#"> 
						<i class="glyphicon glyphicon-fire"></i> 
						关于系统 
					</a> 
				</li> 
			</ul> 
		</div> 
		<!-- 右侧内嵌框架 -->
		<div class="col-md-10" >
			<iframe width="100%" height="300" name="ifs"></iframe>
		</div> 
	</div> 
</div>
<!-- 版权信息 -->
<div id="footer" class="text-muted">
	<p>&copy;版权信息</p>
</div>
<script type="text/javascript"  src="js/jquery-1.12.3.min.js"></script>
<script type="text/javascript"  src="js/bootstrap.min.js"></script>

<iframe src="refresh.jsp" style="display: none"></iframe>
</body>
</html>