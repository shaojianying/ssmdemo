<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>经理审批</title>
</head>
<body>
	<form action="/XM1/xiugaijinglipishibxd" method="post">
	报销单id<input value="${czbxd.bxid}" readonly="readonly" name="bxid">
	报销人<input value="${czbxd.bxname}" readonly="readonly">
	报销金额<input value="${czbxd.bxjine}"readonly="readonly">
	报销事由<input value="${czbxd.bxshiyou}"readonly="readonly">
	经理意见<select name="bxzhuangtai">
	     <option value="2">同意</option>
	     <option value="3">不同意</option> 
		</select>
	<input type="submit" value="确定">
	</form>
</body>
</html>