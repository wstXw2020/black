<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>

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
		    background-image: url(images/1001709.jpg);
		    background-repeat: no-repeat;
		    background-size: cover; /* 重点二 */
		    overflow: auto;
		}


		</style>
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
</head>
<body>
<div id="container" style="margin-top: 100px" class="container">
     <form class="form-horizontal" action="savec.action" method="post" > 
     
      <div class="form-group" class="abc" >
			<label class="col-md-5 col-sm-5 control-label" style="color: paleturquoise;">cid：</label>
			<div class="col-md-3 ">
				<input type="text" class="form-control"  required="required" name="clazz.cid">
			</div>
		</div>
     
     	<div class="form-group" class="abc" >
			<label class="col-md-5 col-sm-5 control-label" style="color: paleturquoise;">新班级期数：</label>
			<div class="col-md-3 ">
				<input type="text" class="form-control"  required="required" name="clazz.cname">
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label" style="color: paleturquoise;">代课老师：</label>
			<div class="col-md-3 ">
			<%-- <select class="form-control"><option></option></select>  --%>
			<s:select list="listr"  class="form-control" listValue="rname" name="clazz.ls" listKey="cid" value="rname"></s:select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label" style="color: paleturquoise;">班主任：</label>
			<div class="col-md-3 ">
			<s:select list="listbzr"  class="form-control" listValue="rname" name="clazz.bzr" listKey="cid" value="rname"></s:select>
			</div>
		</div>
            
	<div class="form-group" class="abc" >
			<label class="col-md-5 col-sm-5 control-label" style="color: paleturquoise;">班级成绩：</label>
			<div class="col-md-3 ">
				 <select class="form-control" name="clazz.type">
				 	<option value="优" >优</option>
				 	<option value="良">良</option>
				 	<option value="差">差</option>
				 </select>
			</div>
		</div>
		
            
           
		<div class="form-group">
			<label class="col-md-5 col-sm-5"></label>
			<div class="col-md-3">
				<input type="submit" class="btn btn-info btn-block" value="保存"  >
				
			</div>
			
		</div>
     </form>
	
</div>

<script type="text/javascript"  src="js/jquery-1.12.3.min.js"></script>

<script type="text/javascript"  src="js/bootstrap.min.js"></script>


</body>
</html>