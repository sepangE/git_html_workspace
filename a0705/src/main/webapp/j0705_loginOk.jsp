<%@page import="com.java.www.Member"%>
<%@page import="com.java.www.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberDAO mdao = new MemberDAO();
			Member member = mdao.selectLogin(id, pw);
			
			if(member != null){
				session.setAttribute("sessionId", member.getId());
				session.setAttribute("sessionName", member.getName());
		%>
		<script>
			alert("로그인되었습니다");
			location.href="j0705_main.jsp";
		</script>
		<% } else { %>
		<script>
			alert("아이디 또는 비밀번호가 일치하지 않습니다\n 다시 로그인 해주세요");
			location.href="j0705_login.jsp";
		</script>
		<% } %>		
		
	</body>
</html>