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
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			MemberDAO mdao = new MemberDAO();
			Member m = mdao.updateModi(name,id,pw,phone);
			
			if(m!=null){
				session.setAttribute("sessionId", m.getId());
				session.setAttribute("sessionName", m.getName());
		%>
		<script>
			alert("회원정보 수정 완료");
			location.href="j0705_main.jsp";
		</script>
		<%}else{ %>
		<script>
			alert("정보 수정 실패");
			location.href="j0705_main.jsp";
		</script>
		<% } %>
	</body>
</html>