<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登陆********</h1>
	<form action="../longin" method="post">
	 <input name="username"/><!-- name属性值一定要写与实体类相同的 -->
	 <input name="psw"/><!-- name属性值一定要写与实体类相同的,这样在处理器中才能进行封装 -->
	 <input type="submit" value="登陆">
	</form>
</body>
</html>