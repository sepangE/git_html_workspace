<%@page import="com.java.www.Board"%>
<%@page import="com.java.www.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bview.jsp</title>
		<style>
		*{margin:0; padding:0;}
		div{width:800px; margin:30px auto; text-align:center;}
		h1{margin-bottom:30px;}
		table,th,td{border: 1px solid black; border-collapse:collapse;
					font-size:16px;}
		th{width:300px; height:40px;}
		td{width:500px; height:40px;}
		button{width:200px; height:60px; margin-top:30px;}		
		</style>
	</head>
	<body>
		<%
			int bno = Integer.parseInt(request.getParameter("bno"));
			out.print(bno);
			
			BoardDao bdao = new BoardDao();
			Board bor = bdao.selectOne(bno);
			
			
		%>
		<div>
			<h1>게시글 보기</h1>
			<table>
			
				<tr>
					<th>번호</th>
					<td><%= bor.getBno() %></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><%= bor.getBtitle() %></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><%= bor.getBcontent() %></td>
				</tr>
				<tr>
					<th>날짜</th>
					<td><%= bor.getBdate() %></td>
				</tr>
				<tr>
					<th>파일</th>
					<td><img src="upload/<%= bor.getBfile() %>"></td>
				</tr>
			</table>
			<a href="bmodi.jsp?bno=<%= bor.getBno() %>"><button type="button">수정하기</button></a>
			<a href="bdelete.jsp?bno=<%= bor.getBno() %>"><button type="button">삭제하기</button></a>
			<a href="blist.jsp"><button type="button">목록</button></a>
		</div>
	</body>	
</html>