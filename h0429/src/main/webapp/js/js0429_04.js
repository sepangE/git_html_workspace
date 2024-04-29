

//1. 현재 수강중인 과목은 00다 라고 출력해주는 함수 만들어보기
// '자바' ->현재 수강중인 과목은 자바다

function clas(ch){
	document.write("현재 수강중인 과목은 "+ch+" 입니다<br>");
}
clas("자바");
clas("HTML");
clas("CSS");

//2. 문자와 숫자를 전달하면 ex) 'hello',3
//						hello가 3번 출력되는 함수를 만들기
document.write("<hr>");
function bb(str,num){
	
	for(let i=1;i<=num;i++){
		document.write(str+"<br>");
	}
}

bb("문자",5);
bb("str",3);
bb("text",2);

document.write("<hr>");
//3. 숫자를 전달하면 홀수 혹은 짝수를 반환하는 함수를 만들어보세요

function numBer(n){
	
	if(n%2==1){
		return '홀수';
	}else{
		return '짝수';		
	}
	
}
var res1=numBer(4354);
var n=Number(prompt("숫자를 입력해 주세요"));
var res2=numBer(n);
document.write(res1+'<br>');
document.write("입력한 숫자는 "+n+"&nbsp"+res2+'<br>');

document.write("<hr>");

//두 수를 전달받아서 더큰값을 반환하는 함수를 만드세요

function bNum(a,b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}
var res3=bNum(2,7);
var res4=bNum(10,5);

document.write("두 수중 더 큰 수는 "+res3+'<br>');
document.write("두 수중 더 큰 수는 "+res4+'<br>');

document.write("<hr>");

function input(){
	var n1=Number(prompt("첫번째 숫자 : "));
	var n2=Number(prompt("두번째 숫자 : "));
	var r1=add(n1,n2);
	var r2=sub(n1,n2);
	
	document.write(n1+", "+n2+"<br>");
	document.write("더하기 값 : "+r1+"<br>");
	document.write("빼기 값 : "+r2+"<br>");
}

function add(num1,num2){
	return num1+num2;
}
function sub(num1,num2){
	return num1-num2;
}
input(); // 함수호출






















