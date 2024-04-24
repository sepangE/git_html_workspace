


var num=[11, 2, 33, 4,55,6,77,8,9,10];


//1. 배열의 수를 하나씩 consol.log로 출력해보기 -for 사용

for(let i=0;i<num.length;i++){
	console.log(num[i]);
}





//2. 배열 속에 있는 수의 합 구하기 - for 사용
sum=0;
for(let i=0;i<num.length;i++){
	sum+=num[i];
}document.write(sum);

document.write("<hr>");


//과일을 입력 받아서 fruits 배열을 채우기 (5개 입력 받음)

var fruits=[];

for(let i=0;i<5;i++){
	fruits[i]=prompt("과일을 입력해 주세요 (5번)");
}console.log(fruits);
document.write(fruits);

document.write("<hr>");

// 자바스크립트는 3번째 과목입니다. 출력하기
var lectures = ["html", "css", "javascript", "jQuery"];
var topic = "javascript";


for(let i=0;i<lectures.length;i++){
	if(lectures[i]==topic){
		document.write("자바스크립트는 "+(i+1)+"번째 과목입니다.<br>");
	}/*else if(lectures[i]=="html"){
		document.write(lectures[i]+"는"+(i+1)+"번째 과목입니다.<br>");
	}else if(lectures[i]=="css"){
		document.write(lectures[i]+"는"+(i+1)+"번째 과목입니다.<br>");
	}else if(lectures[i]=="jQuery"){
		document.write(lectures[i]+"는"+(i+1)+"번째 과목입니다.<br>");
	}else if(lectures[i]==lectures.length){
		document.write(lectures[i]+"는"+(i+1)+"번째 과목입니다.<br>");
	}*/
}

document.write("<hr>");

for(let i=0;i<lectures.length;i++){
	
	if(i+1==lectures.length){
		document.write(lectures[i]+"는"+"마지막 과목입니다.<br>")
	}else{
		document.write(lectures[i]+"는"+(i+1)+"번째 과목입니다.<br>");
	}
}

document.write("<hr>");

















