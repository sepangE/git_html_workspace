<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트 출력하기</h1>
	<c:forEach var="m" items="${list}">
		<h3>${m.getId() }</h3>
		<h3>${m.getName() }</h3>
		<h3>${m.getGender() }</h3>
		<h3>${m.getHobbys() }</h3>
		<hr>
	</c:forEach>
</body>
</html>