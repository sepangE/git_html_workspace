<%@page import="com.java.www.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보 수정</title>
	</head>
	<body>
		<%
			
			String sessionId = (String)session.getAttribute("sessionId");
			MemberDAO mdao = new MemberDAO();
			Member m = mdao.selectOneMem(sessionId);
		
		
		%>
		
		<form name="modifrm" action="j0705_modiOk.jsp" method="get" >
			<label>이름</label>
			<input type="text" id="name" name="name" value="<%=m.getName() %>"> <br>
			<label>아이디</label>
			<input type="text" id="id" name="id" value="<%=m.getId() %>" readonly><br>
			<label>비밀번호</label>
			<input type="text" id="pw" name="pw" value="<%=m.getPw() %>"><br>
			<label>전화번호</label>
			<input type="text" id="phone" name="phone" value="<%=m.getPhone() %>"><br>
			<br>
			<input type="submit" value="수정하기">
		</form>
	</body>
</html>