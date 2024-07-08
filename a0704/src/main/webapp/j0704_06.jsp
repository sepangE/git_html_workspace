<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="student" class="com.java.www.Student"/>
		<jsp:setProperty property="name" name="student" value="홍길동"/>
		<jsp:setProperty property="kor" name="student" value="100"/>
		<jsp:setProperty property="eng" name="student" value="90"/>
		<jsp:setProperty property="math" name="student" value="95"/>
		<jsp:useBean id="stu1" class="com.java.www.Student"/>
		<%
			stu1.setName("김한국");
			stu1.setKor(100);
			stu1.setEng(75);
			stu1.setMath(88);
		%>
		
		
		<h1>
			번호 : <jsp:getProperty property="stuNo" name="student"/>
		</h1>
		<h1>
			이름 : <jsp:getProperty property="name" name="student"/>
		</h1>
		<h1>
			번호 : <jsp:getProperty property="stuNo" name="stu1"/>
		</h1>
		<h1>
			이름 : <jsp:getProperty property="name" name="stu1"/>
		</h1>
	</body>
</html>