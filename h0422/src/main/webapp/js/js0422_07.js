/*
 조건문 : if문, switch문
 반복문 : for문, while문
 
 반복문 : 설정한 횟수만큼 반복하여 수행하는 제어문
 
 for문 : for(초기식;조건문;증감식){
	조건문이 참 인동안 반복적으로 실행하고자 하는 실행문
 }
 */

//i++; i를 하나 증가시킨다
 for (let i=1;i<=3;i++){
	document.write("<h1>javascript</h1>");
 }
 
 for(let i=0;i<5;i++){
	console.log(i);
 }
 
 
 
 //console.log("i의 현재값은: d",i);// 위 for문 에서 i가 증가되서 나왔기때문에 i = 5
 var j=0;
 for(;j<3;j++){
	document.write("안녕하세요<br>");
 } 

 for(;j<3;j++){
	document.write("반갑습니다.<br>");
 } 
 
 /*
 j=0;
 for( ; ; ){
	//무한 반복문을 쓸때 사용한다
 }*/
 /*
 i++ : 1 더한다
 i = i+2
 i += 2
 */
 // 증감식을 변환
 for(let i=0; i<10; i+=3){
	console.log(i);
 }
 
 for(let i=1;i<10;i*=2){
	document.write(i);
 }
 
 /*
 for 문을 사용해서
 1.
 1에서부터 15까지 출력해보세요
 
 2.
 10을 4번 반복해서 출력해보세요
 
 3.
 hello world를 6번 반복해서 출력해보세요
 
 4.
 1-100 사이의 3의 배수를 출력해보세요
 */

document.write("<hr>");
 for(let i=1;i<16;i++){
	document.write(i+" ");
 }
 document.write("<hr>");
 for(let i=1;i<=4;i++){
	document.write (10+" ");
 }
 document.write("<hr>");
 for(let i=0;i<6;i++){
	document.write(" hello world <br>");
 }
 document.write("<hr>");
 for(let i=3;i<=100;i+=3){
	document.write(i+" ");
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
