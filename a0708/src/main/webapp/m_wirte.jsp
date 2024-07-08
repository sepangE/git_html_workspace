<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_wirte.jsp</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
			*{margin : 0; padding: 0;}
			div{width : 400px; margin:30px auto; text-align:center;}
			h1{margin-bottom : 30px;}
			table, th, td{border : 1px solid black; border-collapse: collapse;
							font-size: 16px;}
			th{width: 200px; height:40px;}
			td{width: 400px; height:40px;}
			button{width:150px; height:40px; margin-top : 30px;}	
	</style>
	<script>
		$(function(){
			$("#wbtn").click(function(){
				alert("저장완료");
				wfrm.submit();
			})//wbtn
		})// jquery
	</script>
	</head>
	<body>
		<div>
			<h1> 회원가입 </h1>
			<form action="M_wirte" name="wfrm" method="post">
				<table>
					<tr>
						<th>이름</th>
						<td><input type="text" name="mname" id="mname"></td>
					</tr>
					<tr>
						<th>아이디</th>
						<td><input type="text" name="mid" id="mid"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="mpw" id="mpw"></td>
					</tr>
					<tr>
						<th>전화번호</th>
						<td><input type="text" name="mphone" id="mphone"></td>
					</tr>
					<tr>
						<th>성별</th>
						<td>
							<input type="radio" name="mgender" id="male" value="male">
							<label for="male">남성</label>
							<input type="radio" name="mgender" id="female" value="female">
							<label for="female">여성</label>
						</td>
					</tr>
					<tr>
						<th>취미</th>
						<td>
							<input type="checkbox" name="hobby" id="game" value="game">
							<label for="game">게임</label>
							<input type="checkbox" name="hobby" id="golf" value="golf">
							<label for="golf">골프</label>
							<input type="checkbox" name="hobby" id="swim" value="swim">
							<label for="swim">수영</label>
							<input type="checkbox" name="hobby" id="book" value="book">
							<label for="book">독서</label>
							<input type="checkbox" name="hobby" id="shopping" value="shopping">
							<label for="shopping">쇼핑</label>
						</td>
					</tr>
				</table>
				<button type="button" id="wbtn">저장하기</button>
				<button type="button" onclick="javascript:history.back()">취소하기</button>
			</form>
		</div>
	</body>
</html>