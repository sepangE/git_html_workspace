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
			session.invalidate();
		// response.sendRedirect("index.jsp");
		// ㄴ 아래 스크립트에 alert창 안띄우고 바로 보내기
		%>
		<script>
			alert("로그아웃되었습니다.");
			location.href="index.jsp";
		</script>
	</body>
</html>