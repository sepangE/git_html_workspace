var today = new Date();
var year = today.getFullYear();
console.log(year);
var lastday = new Date(year, 11, 31);
// Tue Dec 31 2024 00:00:00 GMT+0900 (한국 표준시)
console.log(lastday);
var time = today.getTime();
console.log(time); // 1714110005197
var result = lastday.getTime() - time;
var result2 = result/ ( 60*1000 * 60 * 24 );
console.log("D-day : " + Math.ceil(result2));
var strKo = '한글';
var strEn = "ABC";
var lnKo = strKo.length;
var lnEn = strEn.length;
console.log(lnKo) ; // 2
console.log(lnEn) ; // 3
console.log("아주 긴 문장을 출력 할 경우에는 \
역슬레시(원화)를 사용하면 줄바꿈을 할 수 있습니다.\
또 다른 한가지 방법은 " + " +를 사용해서 끊어서 줄을"
+" 나눌 수 있습니다. ")
var num = 10;
var numObj = new Number(10);
var str = "문자열";
var strObj = new String("문자열");
console.log(typeof(str));  // string
console.log(typeof(strObj)); // object
console.log(str == strObj); //true
console.log(str === strObj); // false
var str = 'abcDEFabc';
//         012345678
var n1 = str.indexOf('abc');
console.log(n1); // 0
var n2 = str.indexOf('abc',3);
console.log(n2); // 6
// 찾을 수 없을때 -1을 반환함
var n3 = str.indexOf('f');
console.log(n3); // -1
var n4 = str.indexOf('abcd');
console.log(n4); // -1
var n5 = str.indexOf('c',4);
console.log(n5); // 2
var str = 'abcDEFabc';
//         012345678
var a1 = str.charAt(0);
console.log(a1);
var a2 = str.charAt(10);
console.log(a2); // 빈문자열을 반환함.
var a3 = str.charCodeAt(0); // 97
console.log(a3);
var str = 'abcDEFabc';
//         012345678 //             -4-3-2-10
var b1 = str.slice(2,6);
document.write(b1+"<br>")
// 음수로 전달된 인덱스는 문자열의 뒤에서부터
var b2 = str.slice(-4,-2);
document.write(b2+"<br>"); // Fa
// 인덱스부터 끝까지
var b3 = str.slice(2);
document.write(b3+"<br>");
// substring(시작인덱스, 끝인덱스)
var b4 = str.substring(2,6);
document.write(b4+"<br>");
// substr(시작인덱스, 추출갯수)
var b5 = str.substr(2,6);
document.write(b5+"<br>");
var b6 = str.slice(1,0);
document.write(b6+"<br>");
var b7 = str.substring(1,0);
document.write(b7+"<br>");
var str = "자바스크립트";
var str1 = str.concat("는 너무 어려워요<br>");
var str2 = str.concat("는 너무 어려워요. \
그렇지만 재미있어요. <br>");

 
 
 document.write(str+"<br>");
 document.write(str1+"<br>");
 document.write(str2+"<br>");
 
 var str= 'JavaScript';
 document.write(str.toUpperCase()+"<br>");
 document.write(str.toLowerCase()+"<br>");
 
 
 var str=""
 console.log(str);
 console.log(str.trim())
 //앞뒤 공백 제거
 console.log(str.length);
 
 var newstr =str.trim();
 console.log(str.length);
 console.log(newstr.length);
 
 // 이름을 영어로 입력받아서 대문자로 출력
 
 var name="aa";//prompt("please type your name");
 document.write(name.toUpperCase()+"<br>");
 
 
 /*
 전화번호를 입력을 받아서 끝에 4자리는 ****로 출력해주세요
01012345678
0101234****
 */
 var phone ='01012345678';
 var result=phone.substring(0,phone.length-4)+'****';
 document.write(result);
//var ph=prompt("전화번호를 입력해 주세요");
 
 var str = "안녕하세요 반갑습니다! 또 만나요.";
 
 var s1 = str.split(); // 아무 동작을 하지 않습니다.
 var s2 = str.split(""); // 한 문자씩 나눔
 console.log(s2);
 
 var s3 = str.split(" "); // 띄어쓰기 단위로 나눔
 console.log(s3);
 
 var s4 = str.split("!"); // !를 기준으로 나눔
 console.log(s4);
 
 var t =
  "Hello Thank you good luck to you";
// 012345678910


document.write("<hr>");
//1. charat을 사용해서 g출력
console.log(t.indexOf('g'));
var t1=t.indexOf('g');
document.write(t.charAt(t1)+"<hr>");
//2. you의 인덱스를 출력
//var t2=t.slice(12,15);
//document.write(t2+"<hr>");
document.write(t.indexOf('you')+"<hr>");
//3. 두번째 you의 인덱스
var t3=t.slice(-3);
document.write(t3+"<hr>");
//4. substr을 사용해서 luck 출력
var t4=t.substr(21,4);
document.write(t4+"<hr>");
//5. substring을 사용해서 Thank 출력
var t5=t.substring(6,11)
document.write(t5+"<hr>");
//6. 전체 문장을 대문자로 출력
document.write(t.toUpperCase()+"<hr>");
//7. 전체 문장을 소문자로 출력
document.write(t.toLowerCase()+"<hr>");
//8. 문장의 길이는 ?
var t6 = t.length;
document.write(t.length+"<hr>");
//9. split을 사용해서 Hello출력
var t7= t.split(" ");
document.write(t7[0]+"<hr>");
//9. split을 사용해서 luck출력
 document.write(t7[4]+"<hr>");
 
document.write(t.replace("you","me")+"<br>")
document.write(t.search("you","you")+"<br>");
document.write(t.match("luck")+"<br>");


// 이메일 주소를 입력받아서
//@가 없거나
var end = ['.co.kr','.com','.net','.or.kr'];
// 위 배열대로 끝나지 않으면 잘못된 형식입니다 출력
var email=prompt("이메일을 입력해 주세요");
var ck1=false;
var ck2=false;
if(email.indexOf("@")>0){
	//document.write("잘못된 형식입니다.");
	ck1=true;
}

for(i=0;i<end.length;i++){
	if(email.indexOf(end[i])>0){	
	ck2=true;
	}
	
	
}	
if(ck1&&ck2){
	alert("올바른 형식")
}else{
	alert("잘못된 형식")
}





