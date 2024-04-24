/*
 *
 */

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