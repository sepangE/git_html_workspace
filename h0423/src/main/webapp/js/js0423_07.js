/*
 1~100까지 출력하는데
 3의 배수는 건너뛰고 출력
 */
 
 var i=0;
 while(i<100){
	i++;
	if(i%3==0){
		continue;
	}
		document.write(i+" ");
		
 }//while 컨티뉴 쓰고한거
 document.write("<hr>");

var i=0;
while(i<100){
	i++
	if(i%3!=0){
		document.write(i+" ");
	}
}
 document.write("<hr>");
 for(let i=1;i<=100;i++){
	if(i%3!=0){
		document.write(i+" ");
	}
 }//while 컨티뉴 안쓰고한거
 document.write("<hr>");
 
 for(let i=1;i<=100;i++){
	if(i%3==0){
		continue;
	}	document.write(i+" ");
 }
 document.write("<hr>");
 
 var i=0;
 var sum=0;
 while(i<100){
	i++;
	if(i%7==0){
		continue;
	}
	sum+=i;
 }document.write(sum);
 document.write("<hr>");
 var i=0;
 var sum=0;
 while(i<100){
	i++
	if(i%7!=0){
		sum+=i;
		
	}
 }document.write(sum+" ");
 
 document.write("<hr>");
 /*
 1부터 100까지 더하고
 총합이 100이 넘으면 그때 총합과 그 수를 출력해보세요
 */
 
 var i=0;
 var sum=0;
 while(i<100){
	i++;
	sum+=i;
	
	
	if(sum>100){
		break;
	}
 }document.write(i+"<br>"+sum);
 
 

 document.write("<hr>");
var j=0; 
sum=0;
for(j=0;j<=100;j++){
	console.log(j);
	sum+=j;
	if(sum>100){
		break;
	}
}document.write(j+"<br>"+sum);
 
  document.write("<hr>");	
 
 
 
 