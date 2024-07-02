<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>복습</title>
		<style>
			*{padding : 0; margin : 0;}
			table, td {width : 550px; border : 1px solid black; border-collapse:collapse;
				text-align:center; margin 30px auto;}
			td{height : 30px; width : 100px;}
			.bg{background : yellow;}
		</style>
	</head>
	<body>
		<table>
			<tr>
				<td class="bg">2</td><td>*</td><td>1</td><td>=</td><td>2</td>
			</tr>
			<tr>
				<td>2</td><td>*</td><td>2</td><td>=</td><td>4</td>
			</tr>
		</table>
		<%//2단만 출력
			out.print("<table>");
			for(int i = 1; i <=9; i++ ){
				out.print("<tr>");
				out.print("<td>2</td>");
				out.print("<td>*</td>");
				out.print("<td>"+i+"</td>");
				out.print("<td>"+(2*i)+"</td>");
				out.print("</tr>");
			}
	
			out.print("</table>");
		%>
		<hr>
		<%-- html 코드 안에 스크립트문 사용하기 --%>
		<table>
			<%for(int i = 1; i < 10; i++){ %>
			<tr>
				<td>2</td>
				<td>*</td>
				<td><%= i %></td>
				<td>=</td>
				<td><%= i*2 %></td>
			</tr>
			<%} %>
		</table>
		<%-- 구구단 출력하는데 * 홀수 부분만 배경색 넣기 --%>
		<table>
			<h1>구구단 출력하기</h1>
			<%for(int i = 2; i <10; i++) {
				for(int j = 1; j<=9; j++) {	%>
			<tr>
				<td><%= i %></td>
				<td>*</td>
				<%if(j%2!=0) out.print("<td class='bg'>"+j+"</td>"); 
				  else out.print("<td>"+j+"</td>");%>
				<td>=</td>
				<td><%= j*2 %></td>
			</tr>
			<%}// for-j
			} // for-i %>
		</table>
		
	</body>
</html>