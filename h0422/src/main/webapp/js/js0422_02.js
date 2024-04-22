/*
 1. 방문자의 이름을 입력받아
 00님 방문을 환영합니다.
 를 출력해 보세요
 
 2.
 2-1 숫자를 입력받아 짝수면 짝수 홀수면 홀수를 출력하세요
 2-2 2-1에서 홀수인 경우, 7의 배수일 경우, 
 		7의 배수입니다. 를 출력
 
 3. confirm을 사용해서 
 정말 탈퇴하시겠습니까? 를 물어보고
 확인 : 탈퇴처리되었습니다.
 취소 : 탈퇴취소되었습니다. 를 출력
 */

 
 var name=prompt("이름을 입력해 주세요.");
 
 document.write(name+"님 방문을 환영합니다.");
 document.write("<br>");
 
 var n1=Number(prompt("숫자를 입력해 주세요."));
 
 if(n1%2==0){
	document.write("짝수입니다.");
 }else{
	document.write("홀수입니다.");
	if(n1%7==0){
		document.write("7의 배수입니다.");
	}
 }
 document.write("<br>");
var a= confirm("정말 탈퇴하시겠습니까?");
 if(a==true){
	document.write("탈퇴 처리되었습니다.");
 }else{
	document.write("탈퇴취소되었습니다.");
 }