<%@page import="com.java.www.MemberDao"%>
<%@page import="com.java.www.Member"%>
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
			String id = request.getParameter("uid");
			String pw = request.getParameter("upw");
			String name = request.getParameter("uname");
			String phone = request.getParameter("phone");
			String gender = request.getParameter("gender");
			String hobby = "";
			String[] hobbys = request.getParameterValues("hobby");
			for(int i = 0; i < hobbys.length; i++){
				if(hobby == null) hobby+=hobbys[i];
				else hobby+= ","+ hobbys[i];
			}
			Member mem = new Member(id,pw,name,phone,gender,hobby);
			MemberDao mdao = new MemberDao();
			int result = mdao.insertOne(mem);
			
			if(result == 1){
		%>		
			<script>
				alert("회원가입 완료");
				location.href="index.jsp";
			</script>
		<% } else { %>
			<script>
				alert("회원가입에 실패했습니다. 다시 시도해주세요");
				location.href="mwrite.jsp";
			</script>
		<% } %>
	</body>
</html>