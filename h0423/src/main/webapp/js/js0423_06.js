/*
조건문 : if, switch
반복문 : for, while 
		for(초기식;조건식;증감식){
			
		} 
		while(조건식){
			조건식이 참인동안 반복적으로 실행하고자하는 실행문
		}
		do{
			조건식이 참일때 반복적으로 실행되는 실행문
		}while(조건식) //한번은 실행이 된다
 */

 
 
 var i =1;
 
 while(i<=3){
	document.write("while<br>");
	i++;
 }
  document.write("<hr>");
 for(let i=1;i<=3;i++){
	document.write("for<br>");
 }
  document.write("<hr>");
 i=1;
 while(i<10){
	document.write(i+"<br>");
	i++;
 }
 document.write("<hr>");
/* 
 while(true){
	var n= prompt(".을 입력하면 프로그램 종료");
	if(n=='.'){
		break; //무한루프를 쓸거면 특정조건 써서 뻐져나올 수 있게 만들어야함
	}
 }*/
 
 var sum=0;
 i=1;
 while(i<=5){
	sum+= i;
	i++
 }
 // i = 1일때, sum = 0 + 1 = 1
 // i = 2일때, sum = 1 + 2 = 3
 // i = 3일때, sum = 3 + 3 = 6
 // i = 4일때, sum = 6 + 4 = 10
 // i = 5일때, sum = 10 + 5 = 15
 	document.write(sum);
 document.write("<hr>");
 
 var i=0;
 do{
	i+=1;
	console.log(i);
 } while(i<5); // i가 5보다 작지 않을때까지 반복
  document.write("<hr>");
 
 var i=1, j=1;
 
 while(i>3){
	document.write("i : "+i);
	i++
 }//조건식이 맞지않아 실행안됨
 
 do {
	document.write("j : "+j);
	j++;
	
 }while(j>3)
 
 /*
 for문으로 1~10출력
 while문으로 1~10출력
 */
  document.write("<hr>");
 
 for(let i=1;i<=10;i++){
	document.write(i+"<br>");
 }
  document.write("<hr>");
 var i=0;
 while(i<10){
	i++
	document.write(i+"<br>");
	
 }
 document.write("<hr>");
 
 var i=1;
 while(i<=10){
	i++
	if(i%3==0){
		document.write(i+"<br>");
	}
 }
 document.write("<hr>");
 
 /*
 while문으로 1~100까지 합
 while문으로 1~100까지 홀수
 */
 
 var i=1;
 var sum=0;
 while(i<=100){
	
	sum+=i;
	i++;
	
 }
 document.write(sum)
 document.write("<hr>");
 
 var i=1;
 while(i<99){
	
	if(i%2==1){
		document.write(i+"<br>");
	}i++;
 }
 
 document.write("<hr>");
 var i=1;
 var sum=0;
 while(i<=100){
	i++;
	if(i%2==0){
	sum+=i;
	}	
 }document.write(sum+"<br>");
 document.write("<hr>");
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 