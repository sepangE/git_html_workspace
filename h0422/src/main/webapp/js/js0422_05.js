/*
	스위치문을 사용해서 alert창을
	띄워 어디에 이동한지 알려 준 뒤
	화면 이동시키기. (location.href="웹주소";)
	원하는 번호를 클릭하세요.
	1.네이버 2.다음 3.구글
	-----
	숫자 2개와 수식을 입력 받은 후
	+, - , *, /, % 값 수식 전체 출력하기
	ex) 입력 10, 3, %
	     10 % 3 = 1
--------
 */

var w=Number(prompt("원하는 번호를 입력하세요(1.네이버2.구글3.다음)"));
var c=confirm;
switch(w){
	case 1:
		//alert("네이버로 이동합니다.");
		confirm("네이버로 이동하시겠습니까?");
		if(c==true){
			window.open("https://www.naver.com");
		}else{
			alert("현재 페이지에 머무릅니다.");
		}
		
		break;
	case 2:
		//alert("구글로 이동합니다.");
		confirm("구글로 이동하시겠습니까?");
		if(c==true){
			window.open("https://www.google.com");
		}else{
			alert("현재 페이지에 머무릅니다.");
		}
		break;
	case 3:
		//alert("다음으로 이동합니다.");
		confirm("네이버로 이동하시겠습니까?");
		if(c==true){
			window.open("https://www.daum.net");
		}else{
			alert("현재 페이지에 머무릅니다.");
		break;
		}
	default:
		alert("보기에 없는 번호를 입력하셨습니다.");
		
		break;
}
document.write("<hr>");

var n1=Number(prompt("첫번째 숫자를 입력해 주세요."));
var q=prompt("연산기호를 입력해 주세요.");
var n2=Number(prompt("두번째 숫자를 입력해 주세요.(+,-,*,/,%)"));

var t1=n1+n2;
var t2=n1-n2;
var t3=n1*n2;
var t4=n1/n2;
var t5=n1%n2;

 switch(q){
	case "+":
		document.write(n1+"+"+n2+"="+t1+"<br>");
		break;
	case "-":
		document.write(n1+"-"+n2+"="+t2+"<br>");
		break;
	case "*":
		document.write(n1+"*"+n2+"="+t3+"<br>");
		break;
	case "/":
		document.write(n1+"/"+n2+"="+t4+"<br>");
		break;
	case "%":
		document.write(n1+"%"+n2+"="+t5+"<br>");
		break;
	default:
		document.write("잘못 입력하셨습니다.");
		break;
 }
document.write("<hr>");
 
 
 
 
 
 