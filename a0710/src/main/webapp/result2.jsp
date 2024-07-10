<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>result2.jsp</title>
	</head>
	<body>
		<h2>아이디 : ${param.id }</h2>
		<h2>이름 : ${param.name }</h2>
		<%
			RequestDispatcher dispatcher = 
			request.getRequestDispatcher("result3.jsp?result=1");
			dispatcher.forward(request, response);
			// RequestDispatcher dispatcher 사용하면 원래 가지고 있던 값들을 같이 보내줌
		%>
		<%-- <% response.sendRedirect("result3.jsp?result=1"); %>
				ㄴ 얘는							     ㄴ 이부분만 보내줌		 
		 --%>
		
	</body>
</html>