<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생정보 입력 폼</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
			$(function(){
				$("#fbtn").click(function(){
					alert("저장합니다");
					frm.submit();
				})//fbtn
				
			})// jquery
		
		</script>
	</head>
	<body>
		<form action="j0704_09.jsp" name="frm" method="post">
		<!-- 번호, 이름, 국, 영, 수 점수를 입력받는 폼 만들기 -->
		<label>번호</label>
		<input type="text" id="stuNo" name="stuNo"><br>
		<label>이름</label>
		<input type="text" id="name" name="name"><br>
		<label>국어점수</label>
		<input type="text" id="kor" name="kor"><br>
		<label>영어점수</label>
		<input type="text" id="eng" name="eng"><br>
		<label>수학점수</label>
		<input type="text" id="math" name="math"><br>
		<input type="button" id="fbtn" value="저장">
		
		</form>
	</body>
</html>