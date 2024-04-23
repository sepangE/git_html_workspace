/*
 1~100까지에서
 3의배수 5의배수를 더한 값을 구해
 */

var sum=0;
 for(let i=1;i<=100;i++){
	if((i%3==0)||(i%5==0)){
		sum=sum+i;
		console.log(i);
	}
 } console.log(sum);
 
 /*
 for(i=1;i<=5;i++){
	var name=prompt("이름을 입력해 주세요.");
 	var n=Number(prompt("점수를 입력해 주세요."));
 
	if(n>=60){
		document.write(name+"님 "+n+"점 "+"합격입니다.<br>");
	}else{
		document.write(name+"님 "+n+"점 "+"불합격입니다.<br>");
	}
 }
 */
 
 /*
 숫자 두개 입력받기
 n1~n2까지 합 구하기
 */
 
/* var n1=Number(prompt("첫번째 숫자를 입력하세요"));
 var n2=Number(prompt("두번째 숫자를 입력하세요"));
 
 var sum1=0;
 for(i=n1;i<=n2;i++){
	sum1=sum1+i;
 }
 document.write(sum1);
 
 document.write("<hr>");
 
 var n3=Number(prompt("첫번째 숫자를 입력하세요"));
 var n4=Number(prompt("두번째 숫자를 입력하세요"));
 
 var sum2=0;
 var temp = 0;
 
 if(n4<n3){
		temp=n3;
		n3=n4;
		n4=temp;
	}
 
 for(i=n3;i<=n4;i++){
	sum2=sum2+i;
 }
 document.write(sum2);
 */
 document.write("<hr>");
 //구구단 2단 출력해보기 for 문 써서
 sum3=0;
 for(i=1;i<=9;i++){
	sum3=2*i;
	document.write(2+"*"+i+"= "+sum3+"<br>");
 }
  document.write("<hr>");
  
 var n5=Number(prompt("구구단 몇단인지 입력해 주세요"));
 sum4=0;
 
 for(i=1;i<=9;i++){
	sum4=n5*i;
	document.write(n5+" * "+i+" = "+sum4+"<br>");
 }
 
   document.write("<hr>");
  
 // 원하는 단을 입력받는걸 3번 반복해서 출력
 sum5=0;
 for(let j=1;j<=3;j++){
	var n6=Number(prompt("구구단 몇단인지 입력해 주세요"));
 
 for(let i=1;i<=9;i++){
	
	sum5=n6*i;
	document.write(n6+" * "+i+" = "+sum5+"<br>");
 }
 }
 
 