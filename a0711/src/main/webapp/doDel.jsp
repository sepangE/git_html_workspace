<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doDel.jsp</title>
	</head>
	<body>
		<c:if test="${result==1 }">
			<script>
				alert("게시글이 삭제되었습니다");
				location.href="board.do";
			</script>
		
		</c:if>
	</body>
</html>