<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp_logout.jsp</title>
	</head>
	<body>
		<%
			session.invalidate();
			// session.removeAttribute("session_id"); //session_id 한개 삭제
		%>
		<script>
			alert("로그아웃 되었습니다.");
			location.href="jsp_main.jsp";
		</script>
	</body>
</html>