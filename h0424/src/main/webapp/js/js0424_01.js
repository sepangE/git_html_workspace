var i, j;

for(i=1;i<=10;i++){
	console.log("for :" + i);
}

i=1;
while(i<=10){
	
	
	console.log("while :"+i);
	if(i==5){
		break;
	}
	i++;
	
}
document.write("<hr>");

for(i=1;i<=10;i++){
	
	if(i==5){
		continue;
	}document.write(i+" ");
}

document.write("<hr>");
i=0;
while(i<10){
	i++
	if(i==5){
		continue;
	}document.write(i+" ");
}


document.write("<hr>");

/*
var i,j;

for(i=1;i<=5;i++){
	
	document.write("for-i : "+i+'<br>');
	for(j=1;j<=5;j++){
		document.write("for - j : "+j+"<br>");
	}
	document.write("<hr>");
}
i=0;
while(i<5){
	i++;
	document.write("while-i : "+i+'<br>');
	j=0;
	while(j<5){
		j++;
		document.write("while-j : "+j+'<br>');
	}
	document.write("<hr>");
}
*/

/*
반복문을 사용해서
10부터 50까지 출력
10의 배수는 빨간글씨


for(i=10;i<=50;i++){
	if(i%10==0){
		document.write("<p style='color:red;'>"+i+"</p>");
	}else{
		document.write("<p>"+i+"</p>");
	}
}

document.write("<hr>");

var i=10;
while(i<=50){
	if(i%10==0){
		document.write("<p style='color:blue;'>"+i+"</p>");
	}else{
		document.write("<p>"+i+"</p>");
	}
	i++
}
*/


/*
 2의 배수와 5의 배수를 제외한 수의
 합을 출력하세요 (1~100 사이)
 20 부터 10까지 역순으로 출력하는데,
짝수는 파랑글씨, 홀수는 빨강글씨로 출력해보기
(while로 할 수 있으면 while로 해보세요..)
(for로 하셔도됩니다..)
*/


var i=0;
var sum=0;
while(i<100){
	i++
	if(i%2!=0){	
	}else if(i%5!=0){
		sum+=i
	}
	
}document.write(sum+'<br>');
	





var i=0;
var sum=0;
while(i<100){
	i++
	if(i%2==0){
		continue;
	}else if(i%5==0){
		continue;
	}
	sum+=i;
}document.write(sum+'<br>');

document.write("<hr>");

var i=20;
while(i>=10){
	if(i%2==0){
		document.write("<p style='color:blue;'>"+i+"</p>");
	}else{
		document.write("<p style='color:red;'>"+i+"</p>");
	}i--;
}









































