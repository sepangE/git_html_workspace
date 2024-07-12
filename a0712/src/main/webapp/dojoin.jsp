<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>dojoin.jsp</title>
	</head>
	<body>
		<c:if test="${result==1 }">
			<script type="text/javascript">
			alert("회원가입 완료.");
			location.href="main.do";
			</script>
		</c:if>
	</body>
</html>