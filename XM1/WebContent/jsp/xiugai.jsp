<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<% String s=request.getParameter("xiugaixuhao");//获得请求页数据
request.setAttribute("xiugaixuhao",s);//装入request
System.out.println(s);%>
<form method="post" action="../xiugaiyonghu">
用户序号:<input type="text" value="${ xiugaixuhao}" name="xuhao" readonly="readonly" ><!-- request里面取 -->
 请输入姓名:<input type="text" name="xingming"/>
 请输入奖惩项目<input type="text" name="jcxm"/>
请选择奖惩类型:奖励<input type="radio"value="奖励" name="jclx"/>
 处罚<input type="radio"value="处罚" name="jclx"/>
 金额<input type="text" id="jiner" name="jiner"/>
请选择状态<select name="zhuangtai">
	<option>YES</option>
	<option>NO</option>
</select>
请选择流程<select name="liucheng">
	<option>T</option>
	<option>F</option>
</select>
请输入备份<texttarea name="beizhu" cols="50" rows="30"></texttarea>
<input type="submit" value="确认">
</form>
</body>
</html>