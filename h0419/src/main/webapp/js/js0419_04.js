/*
  var num1=20;
  var num2=7;
  
  +,-,*,/,%,를 화ㅑ면에 출력해보세요
  화면 
  20 + 7 = 결과값
  20 - 7 = 결과값
  20 * 7 = 결과값
  20 / 7 = 결과값
  20 % 7 = 결과값
 */

 var num1=20, num2=7;
 
 var res1 = num1+num2;
 var res2 = num1-num2;
 var res3 = num1*num2;
 var res4 = num1/num2;
 var res5 = num1%num2;
 
 document.write(num1 +  " + " + num2 + " = " + res1 + "<br>");
 document.write(num1 +  " - " + num2 + " = " + res2 + "<br>");
 document.write(num1 +  " * " + num2 + " = " + res3 + "<br>");
 document.write(num1 +  " / " + num2 + " = " + res4 + "<br>");
 document.write(num1 +  " % " + num2 + " = " + res5 + "<br>");


 //두 수를 입력 받아서 더 작은 수를 출력하세요
 document.write("<hr>");
 var q1=Number(prompt("첫번째 숫자를 입력하세요 : "));
 var q2=Number(prompt("두번째 숫자를 입력하세요 : "));
 var res6 = (q1 < q2) ? q1 : q2;
 document.write("더 작은 수는 " + res6 + "입니다." + "<br>");
 
/* 키를 입력받아서
평균체중 = (키 - 100) * 0.9
평균체중을 출력하세요
출력 :
평균체중:*/
document.write("<hr>");
 var n1 = Number(prompt("키를 입력해 주세요"));
 var res7=(n1-100)*0.9;
 

 document.write("평균체중"+":"+res7);
 
 
 
 
 