
// 한줄주석

/*여러줄 주석*/
document.write("<h2>js에서 작성된 글자입니다.</h2>");
document.write("태그없이 작성한 문구입니다.");

document.write('<br><a href="https://www.google.com" target="_blank">구글</a>');



// 콘솔창에는.
console.log("안녕");
console.log(2);

//
/*
alert("경고창");

confirm("확인창");

prompt("질문창");
*/

//변수 선언 방법

//var, let
/*var 변수명 ;
var 변수명 = 값 ;

let 변수명 ;
let 변수명 = 값;*/

var num ;
num = 100;
var num = 1000;

console.log(num);

let num1 = 10;
//let num1 = 10; //같은 이름으로 선언 못함



num = "한글";//문자열
num = "3.14";//숫자 - 정수나 실수 상관없이

document.write(num+num1); //3.14+10
num1 = 100;
document.write("<br>");
document.write(num+num1);// 문자 + 숫자 -> 숫자를 문자로 바꿔서 문자+문자


var str1="안녕";
var str2="하세요";
document.write("<br>");
document.write(str1+str2);

document.write("<br>");
var sub = "자바스크립트";
document.write("이 수업은 "+ sub +" 수업입니다");

var a1= 100;//선언하고 정수
var a2 = 5.23;//선언하고 실수
var a3="css";//선언하고 string
var a4= "가";
var a5= true;//선언하고 트루
var a6= false;//선언하고 폴스
var a7= null;
var a8 ;


// typeof

console.log(typeof a1);
console.log(typeof (a2));
console.log(typeof (a3));
console.log(typeof (a4));
console.log(typeof (a5));
console.log(typeof (a6));
console.log(typeof (a7));
console.log(typeof (a8));

//테이블 그리기
document.write('<table border="1"">');
document.write('<tr><td>이름</td><td>과목</td><td>점수</td></tr');
document.write('<br><tr><td>홍길동</td><td>국어</td><td>100</td></tr');
document.write('<br><tr><td>유관순</td><td>국어</td><td>90</td></tr');
document.write('<br><tr><td>이순신</td><td>국어</td><td>95</td></tr');
document.write('<br><tr><td>강감찬</td><td>국어</td><td>80</td></tr');

var subj="영어"

document.write('<table border="1"">');
document.write('<br><br><tr><td>이름</td><td>과목</td><td>점수</td></tr');
document.write('<br><tr><td>홍길동</td><td>'+ subj +'</td><td>100</td></tr');
document.write('<br><tr><td>유관순</td><td>'+ subj +'</td><td>90</td></tr');
document.write('<br><tr><td>이순신</td><td>'+ subj +'</td><td>95</td></tr');
document.write('<br><tr><td>강감찬</td><td>'+ subj +'</td><td>80</td></tr');
document.write('</table>');


















