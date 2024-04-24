/*
 while문과 if문을 사용해서,
숫자 두개를 입력 받고,
연산자를 입력 받아서 (+ - * / )
계산 결과를 무한히 출력하는 계산기를 만드는데
첫번째 입력한 숫자가 0이면
프로그램을 종료하는 코드를 만드세요
 */


 /*
 while(true){
	 var n1=Number(prompt("첫번째 숫자를 입력하세요 (종료 : 0)"));
 	 if(n1==0){
	 	 break;
 	 var q=prompt("연산기호를 입력하세요(+,-,*,/)");
 	 var n2=Number(prompt("첫번째 숫자를 입력하세요"));

	 }
	 	 if(q=="+"){
			document.write(n1+"+"+n2+"="+(n1+n2)+"<br>");
		 }else if(q=="-"){
			document.write(n1+"-"+n2+"="+(n1-n2)+"<br>");
		 }else if(q=="*"){
			document.write(n1+"-"+n2+"="+(n1*n2)+"<br>");
		 }else if(q=="/"){
			document.write(n1+"-"+n2+"="+(n1/n2)+"<br>");
		 }
 	 }
*/
 
 

 /*
 for(let i=2;i<=9;i++){
		for(let j=1;j<=9;j++){
		document.write("<table border='1'>"+i+" * "+j+" = "+(i*j)+"</table>"+"&nbsp&nbsp&nbsp&nbsp");
 } 
 
 }
 */

for(let i=2;i<=9;i++){
	document.write("<br>");
	for(let j=1;j<=9;j++)
	document.write(i+" * "+j+" = "+(i*j)+"&nbsp&nbsp&nbsp&nbsp&nbsp");

}	

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 