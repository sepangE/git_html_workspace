/**
 * 
 */
//var ans= confirm("로그인하시겠습니까?");
// 확인 > ans : true
// 취소 > ans : false
//console.log(ans);

var ans=prompt("이름을 입력하세요","홍길동");

console.log(ans);

var ans2=prompt('나이를 입력하세요');
console.log(typeof(ans2));
//입력받은 값이 어떤 타입인지 확인

//prompt를 통해서 받는 입력은 문자열이다.


document.write(ans + "님은" + "내년에" + ( Number(ans2)+1 ) +"살입니다.");
document.write(ans + "님은" + "내년에" + ( Number(ans2)+1 ) +"살입니다.");

/*문자 > 숫자
Number("10"); > 숫자 10으로 사용 가능

숫자 > 문자
String(1000); > "1000"*/
 
// 문자 + 숫자 => 문자 + 문자로 바뀐 숫자

//두 숫자를 입력 받아서 더하기 결과 값을 출력하세요 
 
//출력 형태 : 5 + 3 = 8 

//var n1 = prompt("첫번째 숫자를 입력하세요 : ");
//var n2 = prompt("두번째 숫자를 입력하세요 : ");
//var res = Number(n1) + Number(n2) ;
var n1 = Number(prompt("첫번째 숫자를 입력하세요 : "));
var n2 = Number(prompt("두번째 숫자를 입력하세요 : "));
var res = n1 + n2 ;
// 출력 :
document.write( n1 +" + "+ n2 +" = "+ res);

var q1=Number(prompt("첫번째 숫자를 입력하세요 : "));
var q2=Number(prompt("두번째 숫자를 입력하세요 : "));
var res2 = q1 + q2;
document.write(q1 + " + " + q2 + " = " + res2);

document.write("5"+"+"+"3"+"="+ (Number(q1)+Number(q2)));
 
 
 
 
 
 
 
 
 
 
 
 
 
 