/*
 break;는 루프를 즉시 종료하고 외부로 빠져나가게 함
 특정 조건이 충족되었을때 루프를 종료할때 사용
 */

 
 for(let i=1;i<=10;i++){
	 /*
	 i값이 1부터 10까지 증가하는 중에 i가 5보다 클 경우
	 break문이 실행이 되어서 for문 탈출 
	 */
	if(i>5){
		break;
	}
	console.log(i);
 }
 
 /*
 continue;
 현재 반복을 중단하고 다음 반복을 실행함
 continue가 실행이 되면 그 이후 코드는 실행되지 않고
 반복의 시작지점으로 돌아가서 실행됨
 특정 조건일때 한번 건너뛰고자 할때 사용됨
 */
console.log("continue");

for(let i=1;i<=10;i++){
	 /*
	 i값이 1부터 10까지 증가하는 중에 i가 5와 같을 경우
	 continue문이 실행이 되어서 5를 스킵하고 실행
	 */
	if(i==5){
		continue;
	}
	console.log(i);
 }
 /*
 if 문을 사용하지 않고 continue를 사용해서
 1~10까지 짝수만 출력
 */
 
 for(let i=1;i<=10;i++){
	
	if(i==1){
		continue;
	}
	if(i==3){
		continue;
	}
	if(i==5){
		continue;
	}
	if(i==7){
		continue;
	}
	if(i==9){
		continue;
	}
	document.write(i+"<br>");
 }
 document.write("<hr>");
 /*
 continue를 사용해서
 1~100까지 홀수의 합을 구해보세요
 */
var sum=0;
 for(let i=1;i<=100;i++){
	if(i%2==0){
		continue;
	}sum+=i;
 }
 document.write(sum);
 
 document.write("<hr>");
 
 
 
 for(let i=0;i<=3;i++){
	document.write("i : "+i+"<br>");
	for(let j=0;j<=5;j++){
		document.write("j : "+j+" ");
	}
	document.write("<hr>");
 }
 
 /*
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 */
 for(let i=1;i<=4;i++){
	for(let j=1;j<=5;j++){
		document.write(j+" ");
	}document.write("<br>");
 }
 document.write("<hr>");
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 