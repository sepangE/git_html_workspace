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
			out.print(10);
			out.print("<br>");
			out.print(10+12);
		
		%>
		<hr>
		<%= 11+12 %>
		<hr>
		${10}<br>
		${11+12}<br>
		${11*20}<br>
		<%= request.getParameter("id") %><br>
		${param.id }<br>
		<hr>
		<%= session.getAttribute("sessionId") %>
		${sessionScope.sessionId }<br>
		${sessionId }
		<hr>
		el 태그는 다른페이지로부터 넘겨받을때만 사용이 가능함
		스크립트 문 안에서 호환은 되지 않는다.
	<%--  <% if( ${sesseionId})%> --%>
	</body>
</html>