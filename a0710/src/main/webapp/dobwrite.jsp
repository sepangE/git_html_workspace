<%@page import="com.java.www.Board"%>
<%@page import="com.java.www.BoardDao"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String uploadPath="c:/upload";
			int size= 10*1024*1024;
			MultipartRequest multi = new MultipartRequest(request, uploadPath,
									size,"utf-8",new DefaultFileRenamePolicy());
			String file = multi.getFilesystemName("bfhile");
			String title = multi.getParameter("btitle");
			String content = multi.getParameter("bcontent");
			String id = multi.getParameter("sessionId");
			
			BoardDao bdao = new BoardDao();
			Board b = new Board();
			b.setBfile(file);
			b.setBtitle(title);
			b.setBcontent(content);
			b.setId(id);
			
			int result = bdao.writeOne(b);
		
			if(result == 1){
		%>
		<script>
			alert("게시글 저장 완료");
			location.href="list.jsp";
		</script>
		<% } else { %>
		<script>
			alert("게시글 작성 실패");
			location.href="list.jsp";
		</script>
		<% } %>
	</body>
</html>