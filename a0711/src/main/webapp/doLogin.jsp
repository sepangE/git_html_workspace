<%@page import="com.java.www.dto.Member"%>
<%@page import="com.java.www.dao.MemberDao"%>
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
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MemberDao mdao = new MemberDao();
			Member m = mdao.selectOne(id,pw);
			
			if(m != null){
				session.setAttribute("sessionId", m.getId());
				session.setAttribute("sessionName", m.getName());
			
		%>
		<script>
			alert("로그인되었습니다.");
			location.href="index.jsp";
		</script>
		<% } else { %>
		<script>
			alert("로그인실패 다시 시도해주세요");
			location.href="login.jsp";
		</script>
		<% } %>
	</body>
</html>