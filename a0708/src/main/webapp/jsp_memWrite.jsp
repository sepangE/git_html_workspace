<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp_memWrite.jsp</title>
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
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
		$(function(){
			$("#fbtn").click(function(){
				alert("회원정보 저장");
				mfrm.submit();
			})// fbtn
		}); // jquery
		</script>
	</head>
	<body>
		<div>
			<h1>회원가입</h1>
			<form action="jsp_memWrite_cp.jsp" name = "mfrm" method="post">
				<table>
					<tr>
						<th><label>이름</label></th>
						<td><input type="text" name="name" id="name"></td>
					</tr>
					<tr>
						<th><label>아이디</label></th>
						<td><input type="text" name="id" id="id"></td>
					</tr>
					<tr>
						<th><label>비밀번호</label></th>
						<td><input type="text" name="pw" id="pw"></td>
					</tr>
					<tr>
						<th><label>전화번호(-포함)</label></th>
						<td><input type="text" name="phone" id="phone"></td>
					</tr>
					<tr>
						<th><label>성별</label></th>
						<td><input type="radio" name="gender" id="male" value="male">
						<label for="male">남성</label>
						<input type="radio" name="gender" id="female" value="female">
						<label for="female">여성</label>
						</td>
					</tr>
					<tr>
						<th><label>취미</label></th>
						<td>
							<input type="checkbox" name="hobby" id="game" value="game">
							<label for="game">게임</label>
							<input type="checkbox" name="hobby" id="book" value="book">
							<label for="book">독서</label>
							<input type="checkbox" name="hobby" id="swim" value="swim">
							<label for="swim">수영</label>
							<input type="checkbox" name="hobby" id="hike" value="hike">
							<label for="hike">등산</label>
							<input type="checkbox" name="hobby" id="golf" value="golf">
							<label for="golf">골프</label>
						</td>
					</tr>
				</table>
				<button type="button" id="fbtn">저장하기</button>
				<button type="button" onclick="javascript:history.back()">취소하기</button>
			</form>
		</div>
	</body>
</html>