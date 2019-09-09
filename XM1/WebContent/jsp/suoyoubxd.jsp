<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>所有报销单</title>
</head>
<body>
	<table border="1" >
	<tr><td>报销id</td><td>报销人</td><td>事由</td><td>金额</td><td>时间</td><td>状态</td><td>经理意见</td><td>总经理意见</td><td>财务意见</td></tr>
	<c:forEach items="${bxds}" var="bxd">
	<tr><td>${bxd.bxid}</td>
	<td>${bxd.bxname}</td>
	<td>${bxd.bxshiyou}</td>
	<td>${bxd.bxjine}</td>
	<td>${bxd.bxshijian}</td>
	<td>${bxd.bxzhuangtai}</td>
	<td>${bxd.jingliyijian}</td>
	<td>${bxd.zongjingliyijian}</td>
	<td>${bxd.caiwuyijian}</td>
	</tr>	
	</c:forEach>
	</table>
</body>
</html>