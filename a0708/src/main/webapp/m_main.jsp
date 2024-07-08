<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>m_main.jsp</title>
		<style>
		a{text-decoration:none;}
		</style>
	</head>
	<body>
	<% if(session.getAttribute("session_id") == null) {%>
		<h1>로그인 해주세요</h1>
		<ul>
			<li><a href="m_login.jsp">로그인</a></li>
			<li><a href="m_wirte.jsp">회원가입</a></li>
		</ul>
	<% } else { %>
		<h1><%= (String)session.getAttribute("session_id") %>님 환영합니다</h1>
		<ul>
			<li><a href="m_logout.jsp">로그아웃</a></li>
			<li><a href="m_mlist.jsp">회원 전체정보</a></li>
			<li><a href="m_modtify.jsp">회원정보수정</a></li>
		</ul>
	<% } %>
	</body>
</html>