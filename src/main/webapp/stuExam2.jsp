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
		<div style="margin:auto;width:70%;text-align: right;margin-top: 20px">
			<a class="btn btn-info btn-sm" href="stuExamAdd.jsp"><span class="glyphicon glyphicon-plus"></span>增加</a>
		</div>
		<table class="table table-striped table-bordered table-hover" style="margin: 10px auto;width: 70%">
			<thead>
				<tr>
					<th>班级</th>
					<th>姓名</th>
					<th>性别</th>
					<th>idcard</th>
					<th>intime</th>
					<th>phone</th>
					<th>address</th>
					<th>school</th>
					<th colspan="2"></th>
				</tr>
			</thead>
			<tbody>
					<s:iterator value="slist"  status="i">
						<tr>
							<td><s:property value="clazz.type" /></td>
							<td><s:property value="sname" /></td>
							<td><s:property value="sex" /></td>
							<td><s:property value="idcard" /></td>
							<td><s:property value="intime" /></td>
							<td><s:property value="phone" /></td>
							<td><s:property value="address" /></td>
							<td><s:property value="school" /></td>
							<td><a href="ssc.do?sid=${s.supplier_id }"  class="btn btn-danger btn-sm">删除</a></td>
							<td><a href="findone.action?sid=<s:property value="sid" />" class="btn btn-success  btn-sm" >修改</a></td>
						</tr>
					</s:iterator>
				<tr>
					<td colspan="7">
						<a href="javascript:goPage(1)">首页</a>
						<a href="javascript:goPage(${requestScope.pb.currentPage-1})">上一页</a>
						<c:forEach begin="1" end="${requestScope.pb.pages}" var="i">
							<c:choose>
								<c:when test="${requestScope.pb.currentPage == i}">
									${i}
								</c:when>
								<c:otherwise>
									<a href="javascript:goPage(${i})">${i}</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<a href="javascript:goPage(${requestScope.pb.currentPage+1})">下一页</a>
						<a href="javascript:goPage(${requestScope.pb.pages})">尾页</a>
						每页显示
						<input type="number" onchange="goPage(1)" name="pageSize" value="${requestScope.pb.pageSize}"/>
						条
						共有${requestScope.pb.totalCount}条/${requestScope.pb.pages}页
						当前为第${requestScope.pb.currentPage}页
					</td>
				</tr>
			</tbody>
		</table>
		<input type="hidden" name="cutPage" value="${requestScope.pb.currentPage}"/>
	</form>
	<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
</body>
</html>