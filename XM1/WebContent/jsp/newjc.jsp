<%@ page language="java" contentType="text/html; charset=utf-8"
   pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/js/bootstrap.min.js"></script>
<title>奖惩管理</title>
<style>
	ul{
		list-style-type:none;
		margin:0;
		padding:0;
	}
	li{
		display:inline;
	}
	input[type=text], select {
  	width: 200px;
	}
	h2{text-align:center}
	table {
    border-collapse: collapse;
	}

	table, td, th {
    border: 1px solid black;
	}
</style>

</head>
<body>
	<ul>
		<li><div class="container">
  <!-- 按钮：用于打开模态框 -->
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">
   新增
  </button>   
  <!-- 模态框 -->
  <div class="modal fade" id="myModal2">
    <div class="modal-dialog">
      <div class="modal-content">   
        <!-- 模态框头部 -->
        <div class="modal-header">
          <h4 class="modal-title">新增用户</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
   
        <!-- 模态框主体 -->
        
        <div class="modal-body" >
        <!-- 提交的输入序号 -->
       <form method="post" action="../tianjiayonghu" > 
       <table>
       	<tr>
		<td>姓名:<input type="text" name="xingming"/></td>
 		<td>奖惩项目<input type="text" name="jcxm"/></td>
 		</tr>
 		<tr>
		<td>奖惩类型:奖励<input type="radio"value="奖励" name="jclx"/>
		 处罚<input type="radio"value="处罚" name="jclx"/></td>
		</tr>
		<tr>
 		<td>金额<input type="text" name="jiner"/></td>
		<td>状态<select name="zhuangtai">
				<option>YES</option>
				<option>NO</option>
		  </select></td></tr>
		<tr><td>流程<select name="liucheng">
			<option>T</option>
			<option>F</option>
	      </select></td>
	       <td>  备份<textarea name="beizhu" cols="5" rows="3"></textarea></td></tr></table>
		<input type="submit" value="确认">
</form>
        </div>
   		
        <!-- 模 态框底部 -->
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        </div> 
   
      </div>
    </div>
  </div>
  
</div></li>
		<li><div class="container">
  <!-- 按钮：用于打开模态框 -->
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
   修改
  </button>   
  <!-- 模态框 -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">   
        <!-- 模态框头部 -->
        <div class="modal-header">
          <h4 class="modal-title">请输入要修改的用户序号</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
   
        <!-- 模态框主体 -->
        <div class="modal-body" >
        <!-- 提交的输入序号 -->
        <form method="post" action="jsp/xiugai.jsp">
        <input type="text" name="xiugaixuhao"/>
       	<input type="submit" value="确认">
       	</form>44
        </div>
   		
        <!-- 模态框底部 -->
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        </div> 
   
      </div>
    </div>
  </div>
  
</div></li>
		<li><div class="container">
  <!-- 按钮：用于打开模态框 -->
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal1">
   删除
  </button>   
  <!-- 模态框 -->
  <div class="modal fade" id="myModal1">
    <div class="modal-dialog">
      <div class="modal-content">   
        <!-- 模态框头部 -->
        <div class="modal-header">
          <h4 class="modal-title">请输入要删除的用户序号</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
   
        <!-- 模态框主体 -->
        
        <div class="modal-body" >
        <!-- 提交的输入序号 -->
        <form method="post" action="shanchuyonghu">
        <input type="text" name="xuhao"/>
       	<input type="submit" value="确认">
       	</form>
        </div>
   		
        <!-- 模态框底部 -->
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        </div> 
   
      </div>
    </div>
  </div>
  
</div></li>
		<li><a href="#filtration">过滤</a></li>
		<li><a href="#reduction">还原</a></li>
		<li><a href="#print">打印</a></li>
		<li><a href="#import">导入</a></li>
		<li><a href="#output">输出</a></li>
	</ul>
	<hr></hr>
	<div>
		<label for="shengpi">审批状态</label>
		
		<select id="shengpi" name="shengpiS">
      	<option value="all">全部</option>
      	<option value="zidingyi">自定义</option>
      	<option value="allno">全否</option>
   		</select>
   		
   		<label for="fname">名字</label>
   		<input type="text" id="fname" name="firstname" placeholder="请输入...">
		
		<label for="xiangmu">项目</label>
		<select id="xiangmu" name="xiangmuX">
      	<option value="all">全部</option>
      	<option value="zidingyi">自定义</option>
      	<option value="allno">全否</option>
   		</select>
   		
   		<label for="leixing">类型</label>
		<select id="leixing" name="leixingL">
      	<option value="all">全部</option>
      	<option value="zidingyi">自定义</option>
      	<option value="allno">全否</option>
   		</select>
   		
   		<label for="zhuangtai">状态</label>
		<select id="zhuangtai" name="zhuangtaiZ">
      	<option value="all">全部</option>
      	<option value="zidingyi">自定义</option>
      	<option value="allno">全否</option>
   		</select>   		
   		 <input type="submit" value="查询">
	</div>
	<h2>奖惩管理</h2>
	
	<table width="100%" border="0" cellspacing="0" cellpadding="0" align="center">
		<tr>
		<th>序号</th>
		<th>姓名</th>
		<th>奖惩项目</th>
		<th>惩罚类型</th>
		<th>金额</th>
		<th>状态</th>
		<th>流程状态</th>
		<th>备注</th>
		</tr>
		<c:forEach items="${yh}" var="yy">
		<tr>
		<td>${yy.xuhao}</td>
		<td>${yy.xingming}</td>
		<td>${yy.jcxm}</td>
		<td>${yy.jclx}</td>
		<td>${yy.jiner}</td>
	    <td>${yy.zhuangtai}</td>
		<td>${yy.liucheng}</td>
		<td>${yy.beizhu}</td> 
		</tr>
		</c:forEach>
</table>
</body>
</html>