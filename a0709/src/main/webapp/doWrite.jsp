<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.java.www.Board"%>
<%@page import="com.java.www.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doWrite.jsp</title>
	</head>
	<body>
		<%
			String uploadPath="c:/upload";
			int size = 10*1024*1024;
			MultipartRequest multi = new MultipartRequest(request,uploadPath,
					size,"utf-8", new DefaultFileRenamePolicy());
			
			String uBfile = multi.getFilesystemName("bfile");
			String uBtitle = multi.getParameter("btitle");
			String uBcontent = multi.getParameter("bcontent");
			String uId = (String)session.getAttribute("sessionId");
			
			BoardDao bdao = new BoardDao();
			// 넘겨받은 정보로 board 객체 생성
			Board b = new Board();
			b.setBtitle(uBtitle);
			b.setBcontent(uBcontent);
			b.setId(uId);
			b.setBfile(uBfile);
			
			
			int result = bdao.saveOne(b);
			
			if(result == 1){
		%>
		<script>
			alert("저장완료");
			location.href="blist.jsp";
		</script>
		<% } else { %>
		<script>
			alert("저장 실패! 다시 입력해주세요");
			location.href="blist.jsp";
		</script>
		<% } %>
	</body>
</html>