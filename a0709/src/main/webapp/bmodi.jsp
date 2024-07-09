<%@page import="com.java.www.Board"%>
<%@page import="com.java.www.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>bmodi.jsp</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<style>
		*{margin:0; padding:0;}
		div{width:800px; margin:30px auto; text-align:center;}
		h1{margin-bottom:30px;}
		table{width:800px;}
		table,th,td{border: 1px solid black; border-collapse:collapse;
					font-size:16px;}
		th,td{height:40px;}
		button{width:200px; height:60px; margin-top:30px;}
		textarea{font-size:17px;}
		input[type=text]{width:97%; height:30px; font-size:17px;}		
		</style>
		<script>
		$(function(){
			$("#fbtn").click(function(){
			 alert("저장합니다");
			 bfrm.submit();
			})//fbtn
		})// jquery
		</script>
	</head>
	<body>
	<%
		int bno = Integer.parseInt(request.getParameter("bno"));
		BoardDao bdao = new BoardDao();
		Board b = bdao.selectOne(bno); // bview에서 사용한 메서드
		
	%>
		<div>
			<h1>게시글 수정하기</h1>
			<form action="doModi.jsp" name="bfrm" 
				method="post" enctype="multipart/form-data">
			<table>
				<colgroup>
					<col width="20%">
					<col width="80%">
				</colgroup>
				<tr>
					<th>번호</th>
					<td><%= b.getBno() %>
						<input type="hidden" id="bno" name="bno" value="<%= b.getBno() %>">
					</td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" id="btitle" name= "btitle" value="<%= b.getBtitle() %>"></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><%=(String)session.getAttribute("sessionId") %>
					<input type="hidden" name="id"
						value="<%=(String)session.getAttribute("sessionId") %>">
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="bcontent" rows="30" cols="65"><%= b.getBcontent() %></textarea>
					</td>
				</tr>
				<tr>
					<th>파일첨부</th>
					<td> 
					<%if(b.getBfile()!=null){%>
					<img src="upload/<%= b.getBfile() %>"><br>
					<% } %>
					<input type="file" name="bfile" id="bfile"></td>
				</tr>
			</table>
			<button type="button" id="fbtn">수정</button>
			<button type="button" onclick="javascript:history.back()">취소</button>
			</form>
		</div>
	</body>
</html>