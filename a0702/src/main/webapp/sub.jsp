<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>서브페이지입니다</h1>
		<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		out.print("<h3>"+id+"</h3><br>");
		out.print("<h3>"+pw+"</h3><br>");
		%>
	</body>
</html>