/*
 1-10까지의 곱
 
n번 반복하는 사칙연산기를 만드세요
 1. 반복할 숫자 입력 받기
 2. 계산할 숫자 2개 입력받기
     4칙연산 그냥 출력하기
 document.write(n1 +" + " +n2 +" = " + (n1+n2));
 document.write(n1 +" - " +n2 +" = " + (n1-n2));
 document.write(n1 +" * " +n2 +" = " + (n1*n2));
 document.write(n1 +" / " +n2 +" = " + (n1/n2));

 */

	 var sum=1;
	 for(i=1;i<=10;i++){
		sum*=i;
	 }document.write(sum+"<br>");
	 
 document.write("<hr>");
 
 	
 	
 	var rn=Number(prompt("반복할 숫자를 입력해주세요."));
 	
 	for(let i=1;i<=rn;i++){
		var n1=Number(prompt("계산할 숫자1을 넣어주세요."));
 		var n2=Number(prompt("계산할 숫자2을 넣어주세요."));
	document.write(n1 +" + " +n2 +" = " + (n1+n2)+"<br>");
    document.write(n1 +" - " +n2 +" = " + (n1-n2)+"<br>");
    document.write(n1 +" * " +n2 +" = " + (n1*n2)+"<br>");
    document.write(n1 +" / " +n2 +" = " + (n1/n2)+"<br>");
 }   
 
 document.write("<hr>");
 /*1-100 사이의 숫자를 출력하는데.
5의 배수지만 7의 배수가 아닐때 빨강색
7의 배수지만 5의 배수가 아닐때 파란색
7과 5의 배수를 동시에 만족할때는 보라색 이 출력되게.
*/
 for(let i=1;i<=100;i++){
	if((i%5==0)&&(i%7!=0)){
		document.write('<p class="red">'+i+'</p>');
	}else if((i%5!=0)&&(i%7==0)){
		document.write('<p class="blue">'+i+'</p>');
	}else if(i%5==0 && i%7==0){
		document.write('<p class="purple">'+i+'</p>');
	}
 }
    
 
 
 
 
 
 
 
 
 
 
 
 