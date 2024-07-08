<%@page import="com.java.www.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.*"%>
<%@page import="java.sql.*"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>가입확인</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8"); // post 한글깨짐방지
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			
			// 객체 선언
			MemberDAO mdao = new MemberDAO(); 
			int result = mdao.insertMember(new Member(name,id,pw,phone));
			// 성공하면 1 실패하면 0 리턴
		%>
		<script>
			if( <%= result %>==1){
				alert("저장완료");
				location.href = "j0705_main.jsp";
			} else{
				alert("데이터가 올바르지 않습니다 다시 입력해주세요");
				history.back();// 뒤로가기 해주는 메서드
			}
		</script>
	</body>
</html>