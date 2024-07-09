<%@page import="com.java.www.MemberDao"%>
<%@page import="com.java.www.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>do_login.jsp</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberDao mdao = new MemberDao(); 
			Member mem = mdao.selectLogin(id,pw);
			
			if(mem!=null) {
				// db에 정보가 있어서 로그인됨
				session.setAttribute("sessionId", mem.getId());
		%>
		<script>
			alert("로그인되었습니다.");
			location.href="main.jsp";
		</script>
		<% } else{ %>
		<script>
			alert("아이디 또는 비밀번호가 틀렸습니다. 다시 시도해 주세요");
			location.href="login.jsp";
		<% } %>
		</script>
	</body>
</html>