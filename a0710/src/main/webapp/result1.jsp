<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>result1</title>
	</head>
	<body>
		<h2>원래 값 가져오던 방법</h2>
		<h2>세션 : <%= session.getAttribute("session_id") %> </h2>
		<h2>취미(배열) : <%= Arrays.toString(request.getParameterValues("hobby")) %> </h2>
		<h2>아이디 : <%= request.getParameter("id") %></h2>
		<h2>이름 : <%= request.getParameter("name") %></h2>
		<h2>숫자1 : <%= request.getParameter("num1") %></h2>
		<h2>숫자2 : <%= request.getParameter("num2") %></h2>
		<h2>결과1 : <%= request.getParameter("num1")+request.getParameter("num2")%></h2>
		<h2>결과2 : <%= 	Integer.parseInt(request.getParameter("num1")) 
					+Integer.parseInt(request.getParameter("num2")) %> </h2>
					
		<hr>
		<h1> el+jstl 사용하기</h1>
		<h2>세션1 : ${sessionScope.session_id }</h2>
		<h2>세션2 : ${session_id }</h2>
		<h2>취미(배열) : ${paramValues.hobby} </h2>
		<c:forEach var="hobby" items="${paramValues.hobby }">
			<sapn>${hobby }</sapn>
		</c:forEach>
		<h2>아이디 : ${param.id }</h2>
		<h2>이름 : ${param.name }</h2>
		<h2>결과 : ${param.num1+param.num2 }</h2>
		<hr>
		<hr>
		
		
		<% for(int i = 1; i <= 10; i++){
				out.print("<h5>"+ i +"</h5>");		
			}
		%>
		<hr>
		<!--         i=1         i<=10          i++  -->
		<c:forEach var="i" begin="1" end="10" step="1">
			<h5> ${i} </h5>
		</c:forEach>
		<hr>
		<h1>값 지정 - set</h1>
		<% String user_pw = "1111"; %>
		<c:set var="user_id" value="dcba" />
		<h2>아이디 지정 : ${user_id }</h2>
		<h2>스크립트문이랑 호환 안됨 : ${user_pw }</h2>
		<h1> if 문 사용 </h1>
		<c:if test="${param.id =='aaa'}">
			<h2>aaa님 환영합니다</h2>
		</c:if>
		<c:if test="${param.id !='aaa'}">
			<h2>${param.id }님 환영합니다</h2>
		</c:if>
		<hr>
		<c:choose>
			<c:when test="${param.id =='aaa'}">
				<h2>aaa님 환영합니다</h2>
			</c:when>
			<c:otherwise>
				<h2>${param.id }님 환영합니다.</h2>
			</c:otherwise>
		</c:choose>
		
		
		
		
	</body>
</html>