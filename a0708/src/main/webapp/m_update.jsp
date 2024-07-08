<%@page import="com.java.www.MemberDto"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_update.jsp</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
			*{margin : 0; padding: 0;}
			a{text-decoration:none;}
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
			$("#mbtn").click(function(){
				alert("회원정보를 수정합니다.");
				mfrm.submit();
			})//mbtn
		})//jquery
		</script>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String id = request.getParameter("id");
			MemberDao mdao = new MemberDao();
			MemberDto m = mdao.memberOne(id);
		%>
		<div>
			<h1>회원 정보 수정_관리자 접속</h1>
			<form action="M_update" name="mfrm" method="post">
				<table>
					<tr>
						<th>이름</th>
						<td><input type="text" id="mname" name="mname" value="<%= m.getName()%>" readonly></td>
					</tr>
					<tr>
						<th>아이디</th>
						<td><%= m.getId()%>
							<input type="hidden" id="mid" name="mid" value="<%= m.getId()%>">
						</td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" id="mpw" name="mpw"></td>
					</tr>
					<tr>
						<th>전화번호(-포함)</th>
						<td><input type="text" id="mphone" name="mphone" value="<%= m.getPhone()%>"></td>
					</tr>
					<tr>
						<th>성별</th>
						<td>
							<input type="radio" name="mgender" id="male" value="male" 
							<% if(m.getGender().equals("male")) out.print("checked"); %>>
							<label for="male">남성</label>
							<input type="radio" name="mgender" id="female" value="female"
							<% if(m.getGender().equals("female")) out.print("checked"); %>>
							<label for="female">여성</label>
						</td>
					</tr>
					<tr>
						<th>취미</th>
						<td>
							<input type="checkbox" name="mhobby" id="game" value="game"
							<% if(m.getHobby().contains("game")) out.print("checked"); %>>
							<label for="game">게임</label>
							<input type="checkbox" name="mhobby" id="golf" value="golf"
							<% if(m.getHobby().contains("golf")) out.print("checked"); %>>
							<label for="golf">골프</label>
							<input type="checkbox" name="mhobby" id="swim" value="swim"
							<% if(m.getHobby().contains("swim")) out.print("checked"); %>>
							<label for="swim">수영</label>
							<input type="checkbox" name="mhobby" id="book" value="book"
							<% if(m.getHobby().contains("book")) out.print("checked"); %>>
							<label for="book">독서</label>
							<input type="checkbox" name="mhobby" id="shopping" value="shopping"
							<% if(m.getHobby().contains("shopping")) out.print("checked"); %>>
							<label for="shopping">쇼핑</label>
						</td>
					</tr>
				</table>
				
				<button type="button" id="mbtn">수정하기</button>	
				<button type="button" onclick="javascript:history.back()">취소하기</button>	
			
			</form>
		</div>
		
		
		
		
		
		
		
		
		
		
		
		
		
	</body>
</html>