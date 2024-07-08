<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생정보 출력</title>
		<style>
		table,td{border: 1px solid black; border-collapse:collapse;
				 font-size:16px; text-align:center;}
		td{width:150px; height:40px;}
		</style>
	</head>
	<body>
	<%  request.setCharacterEncoding("utf-8");%>
	<jsp:useBean id="stu" class="com.java.www.Student" />
	<jsp:setProperty property="*" name="stu"/>
	<% stu.setTotal(stu.getKor()+stu.getEng()+stu.getMath()); 
	   stu.setAvg(stu.getTotal()/3.0);%>
		<h1>학생 성적 프로그램</h1>
		<table>
			<tr>
				<td>학번</td>
				<td><%= stu.getStuNo()%></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%= stu.getName() %></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><%= stu.getKor() %></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><%= stu.getEng() %></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><%= stu.getMath() %></td>
			</tr>
			<tr>
				<td>총점</td>
				<td><%= stu.getTotal() %></td>
			</tr>
			<tr>
				<td>평균</td>
				<td><%= stu.getAvg() %></td>
			</tr>
		</table>
	</body>
</html>