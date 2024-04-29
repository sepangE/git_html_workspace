// 전달 받은 매개변수들의 합을 구하는 함수
function addNum(){
	var sum = 0 ; // 합을 저장하는 변수
	for ( var i = 0 ; i < arguments.length ; i++ ){
		sum += arguments[i];
	}
	
	return sum;
	
}
console.log(addNum(1,2,3));
console.log(addNum(1,2));
console.log(addNum(1,2,3,4,5,6,7,8,9,10));
function passNum(a,b){
	document.write(a+" <br>");
	document.write(b+" <br>");
	document.write(arguments[0]+" <br>");
	document.write(arguments[1]+" <br>");
	document.write(arguments[2]+" <br>");
	document.write(" <hr>");
}
passNum(1,2);
function prtNum(a,b,...rest ){
	document.write(a+" <br>");
	document.write(b+" <br>");
	document.write(rest+" <br>");
	document.write(" <hr>");
}
prtNum(1,2,3,4,5);
/*1.
빼기를 해주는 함수를 만드는데 매개변수 없이 만들어보세요
만약
sub(10, 2, 3) -> 10 - 2- 3 = 5
sub(10,1,5,8) -> -4
*/
function subN(){// 매개변수 없는 함수 선언
	
	var firstNumber= arguments[0];
	
	for(let i =0; i< arguments.length-1;i++){
		firstNumber= firstNumber - arguments[i+1];
	}
	return firstNumber;
}

document.write(subN(10,2,3)+"<br>");
document.write(subN(10,1,5,8)+"<br>");

/*
2. 첫번째 인수만 매개변수 firstNum 을 사용하고
나머지는 restAr 에 넣어서 위와 같이 출력해보기
sub1(10, 2, 3) -> 10 - 2- 3 = 5
sub1(10,1,5,8) -> -4
*/
function subn(firstNum,...restAr){
	firstNum=arguments[0];
	for(let i=0;i<arguments.length;i++){
		firstNum= firstNum - restAr[i];
	}return firstNum;
	
}
document.write("<hr>");
subn(10,1,5,8);




// 입력받은 숫자들의 곱하기 값을 반환하기
// 1 매개변수 없이
function mulN(){
	var firstNum=arguments[0];
	for(i=0;i<arguments.length;i++){
		firstNum=firstNum*arguments[i];
	}return firstNum;
	
}
document.write(mulN(1,2,3,4,5));
document.write("<hr>");

// 2 매개변수 1개와 나머지 사용

function mulN2(firstNum,...restAr){
	var firstNum=arguments[0];
	for(i=0;i<lestAr.length;i++){
		firstNum=firstNum*restAr[i];
	}return firstNum;
	
}
document.write(mulN(1,2,3,4,5));

document.write("<hr>");


//미리 정의된 함수들

//eval() - 문자열로 표현된 코드를 실행. 가급적 사용하지 말아야함

var x =10,y = 20;
var r= eval(" x + y ");
document.write(r);

document.write("<hr>");
//isFinite() 유한한 숫자인지 검사해 결과를 반환하는 함수

document.write(  isFinite(123)  +"<br>"); //true
document.write(  isFinite(0)  +"<br>"); // true
document.write(  isFinite(true) +"<br>"); //true
document.write(  isFinite(null)  +"<br>"); //true
document.write(  isFinite("문자")  +"<br>"); // false
document.write(  isFinite(undefined)  +"<br>");//false
document.write(  isFinite(NaN)  +"<br>");	   //false

document.write("<hr>");

// isNaN() 전달된 값이 숫자인지 아닌지

document.write(  isNaN(123)  +"<br>");//false
document.write(  isNaN(0)  +"<br>");//false
document.write(  isNaN(true)  +"<br>");//false
document.write(  isNaN(null)  +"<br>");//false
document.write(  isNaN("문자")  +"<br>");//true
document.write(  isNaN(undefined)  +"<br>");//true
document.write(  isNaN(NaN)  +"<br>");//true

document.write("<hr>");

//parseFloat() - 실수로 반환
document.write( parseFloat("123") +"<br>");
document.write( parseFloat("123.456") +"<br>");
document.write( parseFloat("12.34.56") +"<br>");
document.write( parseFloat("12 바나나") +"<br>");
document.write( parseFloat("바나나 12") +"<br>");

document.write("<hr>");

//parseInt() - 정수로 반환

document.write( parseInt("123") +"<br>");
document.write( parseInt("123.456") +"<br>"); // 소수점 밑은 버림
document.write( parseInt("12.34.56") +"<br>");
document.write( parseInt("12 바나나") +"<br>");
document.write( parseInt("바나나 12") +"<br>");

document.write("<hr>");


Number("123"); // 숫자로 반환함
document.write(  Number("123")     +"<br>");
document.write(  Number("12 45 78")     +"<br>"); //NaN
document.write(  Number("12 바나나")     +"<br>"); // NaN
document.write(  Number(true)     +"<br>");   // 1
document.write(  Number(false)     +"<br>");  // 0
document.write(  Number( new Date() )     +"<br>"); //1714374107887

document.write("<hr>");

// String()
document.write(  String(123)     +"<br>");
document.write(  String( new Date() )     +"<br>");
//Mon Apr 29 2024 16:02:52 GMT+0900 (한국 표준시)
document.write(  String(Boolean(1))     +"<br>");
document.write(  String(false)     +"<br>");





































