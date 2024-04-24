/*
 
 */


var fruits = ["딸기","수박","귤","망고","배","체리"];

document.write("<h1>배열 값 가져오기 1</h1>");



for(var i=0;i<fruits.length;i++){
	document.write(fruits[i]+"<br>");
}

document.write("<h1>배열 값 가져오기 2</h1>");

for(f in fruits){
	document.write(fruits[f]+'<br>');
}

document.write("<h1>배열 값 가져오기 3</h1>");
for(f of fruits){
	if(f=="귤"){
	document.write(f+"<br>");
	}else{
	document.write(f+"<br>");
	}
}

document.write("<hr>");

//배열에 귤이 있으면 귤이 있습니다. 없으면 귤이 없습니다.

var fruits = ["딸기","수박","오렌지","망고","배","체리"];
var c = false;
for(let i=0;i<fruits.length;i++){
	if(fruits[i]=="귤"){
		
		document.write("귤이 있습니다.");
		c = true;
	}
}	
if(c==false){
		document.write("귤이 없습니다.");
		
}

document.write("<hr>");

//80 점 이상이면 합격을 출력 -> 합격이 5개
var aa = [100, 90, 86, 79, 72, 52, 98, 94];
for(let i=0;i<aa.length;i++){
	if(aa[i]>=80){
		document.write(aa[i]+"점 합격  ");
	}
}
document.write("<hr>");
//홀수면 홀수 짝수면 짝수 출력
var num = [1,2,5,7,9,10,23,43];
for(i=0;i<num.length;i++){
	if(num[i]%2==1){
		document.write(num[i]+"홀수  ");
	}else{
		document.write(num[i]+"짝수  ");
	}
}
document.write("<hr>");
//양수면 양수 음수면 음수 출력
var n = [1,-1,2,3,-4,5,6,-8,9,-10]
for(i=0;i<n.length;i++){
	if(n[i]>=0){
		document.write(n[i]+"양수  ");
	}else{
		document.write(n[i]+"음수  ");
	}
}
document.write("<hr>");



























