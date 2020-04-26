<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/bill-web/css/billInfo/billInfo.css">
<meta charset="utf-8">
<script src="/bill-web/thrid/jquery-3.4.1.js"></script>
<script>
	$(document).ready(function() {
		$("#login").click(function() {
			alert("已点击");
			$.ajax({
				url : "/bill-web/login/login",
				type : "POST",
				//timeout:
				dataType : "text JSON",
				data : {
					"data" : "login"
				},
				success : function(data) {
					alert("已成功");
					alert(data.result);
				},
				error : function(e) {
					alert("失败");
					alert(e);
				}

			});
		});
		$(".uploadFile").click(function() {
			$("#uploaddiv").show();
		});
	});
</script>
</head>
<body>
	<div id="headdiv">
		<div id="homepage">首页</div>
		<div id="massegediv">消息</div>
		<div id="userdiv">用户</div>
		<div id="helpdiv">帮助</div>

	</div>
	<div id="tankuang">
		<ul>
			<li>数据中心</li>
			<li>帮助</li>
		</ul>
	</div>

	<div id="tableid">
		<div id="upload">
			<form action="/bill-web/file/upload" enctype="multipart/form-data"
				method="post">
				<input type="file" name="multipartResolver"> <input
					type="submit" value="提交">
			</form>
		</div>
		<a href="/bill-web/file/download">下载</a>
		<table BORDER="2">
			<tr>
				<td>编号</td>
				<td>数据类型</td>
				<td>数据值</td>
				<td>详情页</td>
				<td>操作</td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a></td>
			</tr>
			<tr>
				<td>1</td>
				<td>报表数据1</td>
				<td>100</td>
				<td><a href="xxxx">详情页</a></td>
				<td><a href="xxxx">删除</a><a href="xxxx">修改</a></td>
			</tr>
		</table>
		<div id="nextpage">
			<div>
				<button>上一页</button>
				<input type="text" />
				<button>下一页</button>
			</div>
		</div>
	</div>

</body>
</html>
