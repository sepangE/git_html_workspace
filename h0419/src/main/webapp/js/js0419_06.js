/*
조건문 -if, swtich

if(표현식){
		표현식이 참일때 실행하고자 하는 코드;
}

if문은 표현식의 결과가 참이면 {}안의 코드를 실행함
거짓일 경우 아무것도 실행하지 않음

*/


var x =10 , y=20;

/*if (x==y){
	document.write("x와 y의 값이 같습니다");
	//document.write("x와 y의 값이 같지 않습니다.");
}


if(x < y){
	
	document.write("x가 y보다 작습니다.");
}
*/

/*
입력받은 숫자가 0일 경우 화면에 이미지를 띄워주세요
*/


var n1=10//Number(prompt("첫번째 숫자를 입력하세요 : "));
var str = '<img src="images/bg.jpg">';
if(n1==0){
	document.write(str);
}

/*
if - else
else{
 표현식이 거짓일때 실행	
	
}
*/

var x =10 , y=20;

if (x==y){
	document.write("x와 y의 값이 같습니다");
}
else {
	document.write("x와 y의 값이 같지 않습니다");
}

// 0이 아닐 경우 잘못입력하셨습니다를 h1로 표현
var n1=10//Number(prompt("첫번째 숫자를 입력하세요 : "));
var str = '<img src="images/bg.jpg">';
if(n1==0){
	document.write(str);
}
else{
	document.write("<h1>잘못입력하셨습니다.</h>"+"<br>");
}

/*
나이를 입력받아서
20살 이상이면 성인입니다.
아니면 미성년자 입니다.
 */
var n2=10//10Number(prompt("나이를 입력해 주세요."));
if(n2 >= 20){
	document.write("성인입니다."+"<br>");
}
else {
	document.write("미성년자 입니다."+"<br>");
}


var n3 =10 //Number(prompt("숫자를 입력해 주세요."));
if(n3 >= 0){
	document.write("양수입니다."+"<br>");
}
else {
	document.write("음수입니다."+"<br>");
}
var n4=10//Number(prompt("숫자를 입력해 주세요."));
if (n4%2==0){
	document.write("짝수입니다."+"<br>");
}
else {
	document.write("홀수입니다."+"<br>");
}



var x=10,y=20;

if(x==y){
	document.write("x와 y의 값이 같습니다"+"<br>");
}
else{
	if(x <y){
		document.write("x가 y보다 작습니다."+"<br>");
	}else{
		document.write("x가 y보다 큽니다."+"<br>")
	}
}


var n =1//Number(prompt("숫자를 입력해 주세요."));
if ( n > 0 ) {
	// 양수들..
	document.write("양수");
	if( n % 5 == 0 ) {
		// 5 배수임
		document.write("5의 배수");
		
	}else{
		// 5의 배수가 아님
		document.write("5의 배수가 아님 ");
	}
	
}else {
	// 음수들..
	document.write("음수");
	
}

/*var x=10,y=20;

if(x==y){
	document.write("x와 y의 값이 같습니다"+"<br>");

}	else if(x <y){
		document.write("x가 y보다 작습니다."+"<br>");
}else{
	document.write("x가 y보다 큽니다."+"<br>")
}*/


// 숫자를 입력 받아서 양수,0,음수 출력

var w1=0//Number(prompt("숫자를 입력해 주세요."));

if (w1>0){
	document.write("양수입니다."+"<br>");
}else if(w1<0){
		document.write("음수입니다."+"<br>");		
}
else {
	document.write("0입니다."+"<br>");
}

var age=Number(prompt("나이를 입력해 주세요."));
var tall=Number(prompt("키를 입력해 주세요."));

if(age > 10){
		if(tall >= 150){
			document.write("탑승가능"+"<br>");
		}else{
			document.write("키가 미달입니다."+"<br>");
		}
}else {
	document.write("나이가 미달입니다."+"<br>");
}

