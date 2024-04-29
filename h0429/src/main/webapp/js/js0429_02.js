
/*
함수 선언
function 함수이름(매개변수1, 매개변수2,...){
	함수가 호출됐을때 실행하고자 하는실행문
}

함수 호출
함수이름(매개변수);
*/

function addNum(x,y){// 매개변수를 더한 값을 출력해라
	document.write(x+y+"<br>");
}

addNum(10,50);//10과 50을 전달해서 함수호출
addNum(10,'장생');//10과 "장생"을 전달해서 함수호출

document.write("<hr>");
function sumNum(x,y){
	var result = x+y;
	return result; // 결과값을 반환함 변수,객체,배열...
}



function sumNum1(x,y){
	return x+y;
}

var sum= sumNum(3,5);
// sumNum을 호출하면서 3,5를 전달하고 호출이 끝난 후 그 반환값을 sum에 대입
document.write(sum);

document.write("<hr>");

/*function 함수이름(){ <- 함수 선언식
	//코드
}

const,var,let 함수이름 = function(){ <-함수 표현식
	
}
언더바를 사용하거나 ex) my_code
함수 이름은 소문자로 시작합니다. 카멜표기법의 사용을 권장.
카멜표기법 = 낙타의 등처럼 소문자와 대문자로 표현 ex sumNum,mulipleNumber
동사를 많이 사용 . 함수의 기능을 표현할 수 있는 이름을 사용하도록 하자
*/


function myFunc1(){// 선언식은 호출하고 선언해도 찾아줌
	document.write("함수 선언식입니다.<br>");
}
const myFunc2= function(){ // 표현식은 호출하고 선언하면 안찾아줌
	document.write("함수 표현식입니다.<br>");
}


myFunc1(); // 선언식의 경우 선언보다 위에 있어도 호출할 수 있다.
myFunc2(); // 표현식의 경우 선언보다 위에 있을때 호출할 수 없다.
























































































