<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>操作列表界面</title>
</head>
<body>
	<c:forEach items="${actions}" var="action">
		<a href="${action.aurl}">${action.aname}</a><br/>
	</c:forEach>
</body>
</html>