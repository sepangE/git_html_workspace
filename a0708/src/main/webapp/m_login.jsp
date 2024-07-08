<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>m_login.jsp</title>
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<style>
			*{margin : 0; padding: 0;}
			div{width : 400px; margin:30px auto; text-align:center;}
			h1{margin-bottom : 30px;}
			table, th, td{border : 1px solid black; border-collapse: collapse;
							font-size: 16px;}
			th,td{width: 200px; height:40px;}
			#lbtn{width:200px; height:60px; margin-top : 30px;}	
	</style>
	<script>
		$(function(){
			$("#lbtn").click(function(){
				alert("로그인");
				lfrm.submit();
			})// lbtn
		})// jquery
	</script>
	</head>
	<body>
		<div>
			<h1>로그인</h1>
			<form action="M_login" name="lfrm" method="post">
				<table>
					<tr>
						<th>아이디</th>
						<td><input type="text" name="id" id="id"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="pw" id="pw"></td>
					</tr>
				</table>
			</form>
			<input type="button" value="로그인" id="lbtn">
		</div>
	</body>
</html>