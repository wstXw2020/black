<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
</head>
<body>
<!-- 周考成绩添加界面 -->
<div id="container" style="margin-top: 30px" class="container">
<form action="KSAdd.action" method="post" class="form-horizontal" enctype="multipart/form-data">
	<!-- <div class="form-group">
		<label class="col-md-3 col-sm-3 control-label">姓名：</label>
		<div class="col-md-7 col-sm-7 control-label">
			<input type="text" class="form-control" id="goods_code" required="required" name="goods_code">
		</div>
	</div> -->
	
	<div class="form-group">
		<label class="col-md-3 col-sm-3 control-label">成绩：</label>
		<div class="col-md-7 col-sm-7 control-label">
			<s:iterator value="ka"  status="i">
			
			
			<input type="text" class="form-control" id="ka.score" required="required" name="ka.score">
		
		 <input type="hidden"  name="ka.scid" value=<s:property value="scid"/>>
		    <input type="hidden" id ="ka.jieduan.lid" name="ka.jieduan.lid" value=<s:property value="jieduan.lid"/>>
		    <input type="hidden" id="ka.student.sid" name="ka.student.sid" value=<s:property value="student.sid"/>>
		 
		    <input type="hidden" id= "ka.date" required="required" name="ka.date" value=<s:property value="date"/>>
		</s:iterator>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-3 col-sm-3 control-label"></label>
		<div class="col-md-7 col-sm-7 control-label">
			<input type="submit" class="btn btn-info btn-block" value="保存">
		</div>
	</div>
</form>
</div>
<script type="text/javascript"  src="things/js/jquery-1.12.3.min.js"></script>
<script type="text/javascript"  src="things/js/bootstrap.min.js"></script>
</body>
</html>