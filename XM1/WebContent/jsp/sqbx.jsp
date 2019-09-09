<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>新增报销申请页面</title>
</head>
<body>
<form action="../tianjiabx" method="post">
	报销单id:<input type="text" name="bxid">
	报销人:<input type="text" name="bxname"/>
	报销事由:<input type="text" name="bxshiyou"/>
	报销金额:<input type="text" name="bxjine"/>
	报销时间:<input type="text" name="bxshijian">
	报销状态:<input type="text" name="bxzhuangtai">
	经理意见:<input type="text" name="jingliyijian">
	总经理意见:<input type="text" name="zongjingliyijian">
	财务意见:<input type="text" name="caiwuyijian">
	<input type="submit" value="提交">
</form>
</body>
</html>