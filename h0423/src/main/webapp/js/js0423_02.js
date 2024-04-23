/*
 for(초기식;조건식;증감식){
	조건식이 만족하는 동안 반복될 실행문
 }
 */

for(let i=0;i<5;i++){
	console.log(i);
}

for(let i=0;i<3;i++){
	document.write("javascript<br>");
}
document.write("<hr>");

for(let i=0;i<=9;i++){
	document.write(i);
}
document.write("<hr>");

var sum=0;
for(let i=1;i<=10;i++){
	sum=sum+i;
}
	document.write(sum);

document.write("<hr>");

for(let i=1;i<=100;i++){
	if(i%2==1){
		document.write('<p class="red">'+i+'</p>');
	}else if(i%2==0){
		document.write('<p class="blue">'+i+'</p>');
	}
}
document.write("<hr>");

for(let i=1;i<=100;i++){
	if((i%4==0)&&(i%3!=0)){
		document.write('<p style="color:red;">'+i+'</p>');
	}else if((i%3==0)&&(i%4!=0)){
		document.write('<p style="color:red; background:pink">'+i+'</p>');
	}else if(i%3==0){
		document.write('<p style="color:red; background:skyblue">'+i+'</p>');
	}else{
		document.write(i+"<br>");
	}
}

document.write("<hr>");

for(i=1;i<=100;i++){
	if((i%2==0)&&(i%3!=0)){
		document.write("<p style='color:red; background:skyblue'>"+i+"</p>")
	}
}





















