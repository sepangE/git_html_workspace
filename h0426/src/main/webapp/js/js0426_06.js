


var n = 10;


function FFFF(){
	// 코드가 들어감
		document.write("안녕하세요<br>");
		document.write("hi<br>");
		document.write("hello<br>");
}
n; //변수
//변수와 함수는 괄호 유무차이
FFFF(); // 함수 호출문 : 함수명();
FFFF(); // 재사용하기 쉽다.

function call2(){
	document.write("2를 가지고 있습니다.");
	return 2; // 함수를 호출했을때 반환해주는 값
}

var n= call2();
console.log(n);

/*
function fn(매개변수1, 매개변수2,....){
	함수가 호출됐을때 실행하고자 하는 실행문
	return 함수를 호출했을때 반환하는 값
}
*/

function addNum(x,y){
	var sum= x+y;
	return sum;
}
document.write("<hr>");
var n = addNum(2,3);
document.write(n);
document.write("<hr>");

function mult10(x){
	var result = 10*x;
	return result;
	//return 10*x;
}

//안녕하세요
//반갑습니다를 출력하는 함수를 만드세요
function hi(){
	document.write("안녕하세요<br>");
	document.write("반갑습니다<br>");
}
hi();
//숫자 하나를 전달하면 제곱을 출력하는 함수
function xx(x){
	document.write(x*x+"<br>");
	return x*x;
}
xx(5);
// 숫자 두개를 전달하면 사칙연산을 출력해주는 함수
function sumxy(x,y){
	a=x+y;
	b=x-y;
	c=x*y;
	d=x/y;
	document.write(a+"<br>"+b+"<br>"+c+"<br>"+d+"<br>");
}
sumxy(10,5);
//숫자 세개를 전달하면 숫자 세개의 합을 반환하는 함수
function xyz(x,y,z){
	var sum=x+y+z;
	return sum;
}
xyz(10,20,30);
//숫자 3개를 전달받아서 더 큰 수를반환하는 함수 만들기
function bn(x,y,z){
	if(x<y&&z<y){
		document.write("세 숫자중 가장 큰 숫자는"+y+"입니다.<br>");
		return y;
	}else if(y<x&&z<x){
		document.write("세 숫자중 가장 큰 숫자는"+x+"입니다.<br>");
		return x;
	}else if(y<z&&x<z){
		document.write("세 숫자중 가장 큰 숫자는"+z+"입니다.<br>");
		return z;
	}
}
bn(2,7,10);
// 숫자 두개를 전달받아서 n1부터 n2까지 합계를 반환하는 함수 만들기
function xy(x,y){
	sum=0;
	for(i=x;i<=y;i++){
		sum+=i;
	}
	document.write(sum);
	return sum;
}
xy(1,10);




















