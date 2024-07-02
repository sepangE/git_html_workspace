<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>확인페이지</title>
	</head>
	<body>
		<h1>전송으로 넘어온 페이지입니다</h1>
		<%
			String name = request.getParameter("name");
			String jumin = request.getParameter("jumin");			
			// 주민등록번호를 사용해서 00님 성인입니다. 성인이 아닙니다로 출력해보기
			int jnum = Integer.parseInt(jumin.substring(7, 8));
			int ynum = Integer.parseInt(jumin.substring(0, 2));
			String age ="";
			if (jnum == 1 || jnum == 2){
				age = "19"+ynum;
			} else {
				age = "20"+ynum;
			}
			int a = 2024 - Integer.parseInt(age);
			out.print("나이 : "+ a);
			out.print("<br>");
			if(a>=20){
				out.print("성인입니다.");
				response.sendRedirect("success.jsp?age="+a+"&name="+name); 
			
			} else {
				out.print("성인이 아닙니다.");
				response.sendRedirect("reject.jsp?age="+a+"&name="+name); 
			}
			%>
<!-- 				<script >
				alert("판매가능");
				location.href = "https://wonsoju.com/";
				</script> -->
			
	</body>
</html>