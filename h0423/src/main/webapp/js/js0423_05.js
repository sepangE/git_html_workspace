/*
 
 */

 
 for(let i=1;i<=4;i++){
	for(let j=1;j<=5;j++){
		document.write(j+" ");
	}document.write("<br>");
 }
 document.write("<hr>");
 
 
 //이중 for문을 사용해서 2단부터 9단까지 출력
 
 
 /* 
 sum=0;
 
 for(let j=2;j<=9;j++){
 	for(let i=1;i<=9;i++){
		sum=j*i;
		document.write(j+" * "+i+" = "+sum+"<br>");
 }
  document.write("<hr>");
 }
 
   sum1=0;
 
 for(let j=2;j<=9;j++){
 	document.write("<h1>"+"["+j+"단"+"]"+"</h1>");
 	for(let i=1;i<=9;i++){
		sum1=j*i;
		document.write(j+" * "+i+" = "+sum1+"<br>");
 }
  document.write("<hr>");
 }
 
 
 
 
 
 */
 // 홀수단만 출력
 document.write("홀수단<br>");
 for(let i=2;i<=9;i++){
	if(i%2==0){
		continue;
	}for(let j=1;j<=9;j++){
		document.write(i+" * "+j+" = "+(i*j)+"<br>");
	}
	
 }
 document.write("<hr>");
 
 // 짝수단만 출력
 document.write("짝수단<br>");
 for(let i=2;i<=9;i++){
	if(i%2==1){
		continue;
	}for(let j=1;j<=9;j++){
		document.write(i+" * "+j+" = "+(i*j)+"<br>");
	}
	
 }
  document.write("<hr>");
  // 곱해지는 수만 홀수
   document.write("곱해지는 수만 홀수<br>");
 for(let i=2;i<=9;i++){
	for(let j=1;j<=9;j++){
		if(j%2==0){
		continue;
		}document.write(i+" * "+j+" = "+(i*j)+"<br>");
	}
	
 }
    document.write("<hr>");
  // 곱해지는 수만 짝수
    document.write("곱해지는 수만 짝수<br>");
 for(let i=2;i<=9;i++){
	for(let j=1;j<=9;j++){
		if(j%2==1){
		continue;
		}document.write(i+" * "+j+" = "+(i*j)+"<br>");
	}
 }
    document.write("<hr>");
 //두 수를 입력받아 n1단부터 n2단까 출력
 
 var n1=Number(prompt("몇단부터인지 입력해 주세요"));
 var n2=Number(prompt("몇단까지 계산할지 입력해 주세요"));
 
 for(let i=n1;i<=n2;i++){
	document.write("["+i+"단"+"]<br>");
	for(let j=1;j<=9;j++){
		document.write(i+" * "+j+" = "+(i*j)+"<br>");
	}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  