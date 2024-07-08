<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
			$(function(){
				$("#fbtn").click(function(){
					alert("이름 : "+$("#memName").val()+"\n"+"아이디 : "+$("#memId").val());
					frm.submit();
				})// fbtn
			})// jquery
		</script>
	</head>
	<body>
		<form name="frm" method="post" action="j0704_05.jsp">
			<label>이름</label>
			<input type="text" id="memName" name="memName"><br>
			<label>아이디</label>
			<input type="text" id="memId" name="memId"><br>
			<input type="button" id="fbtn" value="저장"><br>
		</form>
	</body>
</html>