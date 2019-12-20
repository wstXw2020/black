<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">\<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			
			body {
		    width: 100%;
		    height: 100vh;	/* 重点一 */
		    margin: 0 auto;
		    background-image: url(images/6.jpg);
		    background-repeat: no-repeat;
		    background-size: cover; /* 重点二 */
		    overflow: auto;
		}

		</style>
	<title></title>
		<link href="css/bootstrap.css"  type="text/css" rel="stylesheet"/>
		
	</head>
	<body>
		
		<!--导航条，在顶部固定,反转颜色-->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">

			 	 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				      <span class="sr-only">Toggle navigation</span>
				      <span class="icon-bar"></span>
				      <span class="icon-bar"></span>
				      <span class="icon-bar"></span>
    			</button>
			 </div>
			
			  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			  	<ul class="nav navbar-nav navbar-right">
					<li><a href="tjxbj.jsp"><span class="glyphicon glyphicon-home"style="color: white;">新班级启动</a></span></li>
					<li><a href="mgbxx.jsp"><span class="glyphicon glyphicon-list"style="color: white;">班级阶段信息</a></span></li>
					<li><a href="#"><span class="glyphicon glyphicon-question-sign"style="color: white;">安全退出</a></span></li>
				</ul>
			  </div>
			
		</nav>
		
			
	</body>
</html>
