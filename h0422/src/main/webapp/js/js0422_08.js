/*
 1.
1-100 사이의 5의 배수를 출력해보세요 (5,10,15,...)
2.
1-100 사이의 홀수를 출력해보세요
3.
for 문과 if 문을 사용해서
1-100 사이의 홀수를 출력해보세요
4. 50 에서 1 사이의 6의 배수를 역순으로 출력해보세요
 */


for(let i=5;i<=100;i+=5){
	document.write(i+" ");
}
document.write("<hr>");

for(let i=1;i<=100;i+=2){
	document.write(i+" ");
}
document.write("<hr>");

for(let i=1;i<=100;i++){
	if(i%2==1){
		document.write(i+" ");
	}
}
document.write("<hr>");

for(let i=48;i>=1;i-=6){
	document.write(i+" ");
}


// for문을 사용해서 1-10까지의 합을 구하세요
document.write("<hr>");
	var sum=0;
	for(let i=1;i<=5;i++){
		sum = sum+i;
		document.write(i+"일때 합계 : "+sum+"<br>");
	}
document.write("<hr>");
	var sum=0;
	for(let i=1;i<=10;i++){
		sum = sum+i;
		
	}
	document.write("1~10일때 합계 :"+sum+"<br>");

document.write("<hr>");
	var sum=0;
	for(let i=1;i<=100;i++){
		sum = sum+i;
		
	}
	document.write("1~100일때 합계 :"+sum+"<br>");

document.write("<hr>");

	var sum=0;
	for(let i=1;i<=100;i++){
		if(i%2==1){
		sum=sum+i;	
		}
	}
	document.write(sum+"<br>");

document.write("<hr>");
	var sum=0;
	for(let i=1;i<=100;i++){
		if(i%2==0){
		sum=sum+i;	
		}
	}
	document.write(sum+"<br>");

document.write("<hr>");

	var n1=Number(prompt("숫자를 입력해 주세요."));
	var sum=0;
	for(let i=1;i<=n1;i++){
		sum=sum+i;
	}
	document.write("1~"+n1+"까지 합계"+sum+"<br>");

document.write("<hr>");

var n2=Number(prompt("첫번째 숫자를 입력해 주세요."));
var n3=Number(prompt("두번째 숫자를 입력해 주세요."));
sum=0;
for(let i=n2;i<=n3;i++){
	sum=sum+i;
}
document.write(n2+"~"+n3+"의 합은 " + sum+ "입니다.");



