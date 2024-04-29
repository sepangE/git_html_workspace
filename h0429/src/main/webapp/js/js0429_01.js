






var td = new Date();

document.write("오늘은"+td.getFullYear()+"년 "+(td.getMonth()+1)+"월"+
td.getDate()+"일 입니다.<br>");

//월은 0일부터 시작한다. 1월이 0에 해당
//요일

var yo=td.getDay(); //0-일요일, 6-토요일
var days=["일","월","화","수","목","금","토"];

document.write("오늘은"+days[yo]+"요일 입니다.<br>");

document.write("<hr>");
var str = "Javascript";
document.write(str.length);//문자열의 길이
document.write("<br>");
document.write(str.indexOf("c"));
document.write("<br>");
document.write(str.charAt(0));
document.write("<br>");
document.write(str.slice(2,6));
document.write("<br>");
document.write(str.substring(2,6));
document.write("<br>");
document.write(str.substr(2,6));
document.write("<br>");

var str= "HTML CSS Javascript jQuery";
var arr = str.split(" ");//공백을 기준으로 문자열을 나눠 배열에 저장
console.log(arr);

var str="                    html            ";
document.write("<br>");
document.write(str.length);
var str1=str.trim(); //문자열 양쪽 공백제거 함수
document.write("<br>");
document.write(str1.length);
document.write("<hr>");
var fu ="사과 바나나 딸기 귤 수박 자몽 포도"; 
var pr ="3000, 500, 5000, 1000, 30000, 2500, 10000"

var fuarr, prarr;


//사과는 3000원 입니다를 fp를 사용해서 출력해보세요
//바나나는 500원입니다... 포도는 10000원 입니다.를 fp를 사용해서 출력

fuarr=fu.split(" ");
prarr=pr.split(", ");
var fp=[fuarr, prarr];
console.log(fp);

for(i=0;i<fp[0].length;i++){
	
	document.write(fp[0][i]+"은(는) "+fp[1][i]+"원 입니다.<br>");	
	
	
}
//document.write(fp[0][0]+"는 "+fp[1][0]+"원 입니다.");

















