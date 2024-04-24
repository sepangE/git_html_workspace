




var num= [1,2,3,4,5];

// 1. .push() 는 하나 이상의 요소를 배열의 가장 마지막에 추가합니다
// 추가한 만큼 배열의 길이가 늘어남

num.push(6,7,8);
document.write(num.length+"<br>");


//pop() 배열의 가장 마지막 요소를 제거
// 배열의 길이가 하나씩 줄어듬
document.write(num+"<br>");
num.pop();
document.write(num+"<br>");
document.write(num.length+"<br>");

//.sort()배열의 요소를 문자열로 보고 알파벳 순서대로 정렬
// 한글일 경우 가나다순으로 정렬 숫자일 경우 원하는대로 정렬 안될수있음
var n1=[10, 21, 2, 5, 1];
var con = ["로마","나라","가나","미국"];
document.write(n1+"<br>");
n1.sort()
document.write(n1+"<br>");

document.write(con+"<br>");
con.sort() 
document.write(con+"<br>");


//.join() 요소를 하나의 문자열로 반환
var a =[1, true,'hello'];

var str1= a.join(); // str1= '1,true,hello'
document.write(str1+"<br>");
var str2= a.join('+'); //str2= '1+true+hello'
document.write(str2+"<br>");
var str3= a.join(' '); //str3= '1 true hello'
document.write(str3+"<br>");
a.join('+');





