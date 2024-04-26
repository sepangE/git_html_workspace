



var str1= "Hello world<br>";
var str2= 'Hello world<br>';
var str3= `백틱을 사용해서 문자열 만들기<br>`;

document.write(str1);
document.write(str2);
document.write(str3);

var kor=90;
document.write("홍길동의 국어점수는 "+kor+"점 입니다.<br>");

document.write(`홍길동의 국어점수는 ${kor}점 입니다.<br>`);


var a = 10;
var b = 5;

document.write(`${a+b} 이렇게도 사용 가능합니다.<br>`);

var sent=`백틱은 console.log로 출력할때
줄바꿈을 표현해 줍니다.`
console.log(sent);
var snet1="그냥스트링은\n으로 줄바꿈표현함"
console.log(sent1);
var n1=10,n2=20;

document.write(`10 + 20 = ${n1+n2}<br>`);
document.write(`10 - 20 = ${n1-n2}<br>`);
document.write(`10 * 20 = ${n1*n2}<br>`);
document.write(`10 / 20 = ${n1/n2}<br>`);

var num= 5;
var fruit = '사과';
// 엄마가 사과 5개 사오셨음 > 백틱 사용해서 출력

document.write("엄마가 "+fruit+"를 "+num+"개 사오셨음<br>");
document.write(`엄마가 ${fruit}를 ${num}개 사오셨음<br>`);

var n =Number(prompt("엄마가 사과 몇개사왔어?(숫자만)"));
document.write(`엄마가 ${fruit}를 ${n}개 사오셨음<br>`);









