<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
	*{padding : 0; margin : 0;}
	table, td{width : 550px; border: 1px solid black; border-collapse : collapse;
			  text-align : center; margin : 30px auto;
	}
	td{height : 30px; width : 100px}
	</style>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
	<body>
		<%
			out.print("<table>");
			for(int i = 2; i <= 9; i++){
				for(int j = 1; j<=9; j++){
					out.print("<tr>");
					out.print("<td>"+i+"</td>");
					out.print("<td>*</td>");
					out.print("<td>"+j+"</td>");
					out.print("<td>=</td>");
					out.print("<td>"+i*j+"</td>");
				}
			}
		
		%>
	
	
	</body>
</html>