<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8");%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<%
		// id가 이미 존재한다면 -> 다시 원래화면 보여줘야되고
		// id가 없으면 가입 완료되게 해야함
			String id = request.getParameter("id");
			String name = request.getParameter("name");
		//	String[] interest = request.getParameterValues("interest");
		
			
			if(id.equals("aaa") || id.equals("bbb")){
		%>	
			<script>
				alert("이미 존재하는 아이디 다시 입력해주세요");
				location.href = "join02_info_input.jsp";
			</script>
		<%
			}else{
				// 아이디가 데이터베이스에 없으면
				// 가입완료 페이지로 넘기기
				// redirect 주소에 한글을 보낼때 오류없이 보내기 위해서는
				// url 인코더를 사용해야함
				String n = URLEncoder.encode(name);
				// 위에 import 안할거면 
				// String n = java.net.URLEncoder.encode(name);
				response.sendRedirect(
						"join03_success.jsp?id="+id+"&name="+n);
			}
		%>
	</body>
</html>