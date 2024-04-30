

// 콘솔로 입력한 이름, 국영수 점수를 출력해본다
// 국영수 점수를 사용해서 총점과 평균을 구한다
// document.write로 출력
function vbtn(){
	var uName = document.getElementById("name");
	var uK= document.getElementById("ko");
	var uE= document.getElementById("en");
	var uM= document.getElementById("math");
		
	var uNv = uName.value;
	var uKv = uK.value;
	var uEv = uE.value;
	var uMv = uM.value;
	
	var al = Number(uKv)+Number(uEv)+Number(uMv);
	var av = al/3;
	console.log(uNv);
	/*document.write('이름 : '+uNv+"<br>");
	document.write('국어 : '+uKv+"<br>");
	document.write('영어 : '+uEv+"<br>");
	document.write('수학 : '+uMv+"<br>");
	document.write('총점 : '+al+"<br>");
	document.write('평균 : '+av+"<br>");*/
	
	prnt(uNv,uKv,uEv,uMv,al,av);
} //vbtn()




function prnt(){ //arguments..사용
	let title = ['이름','국어','영어','수학','합계','평균'];
	
	for(let i=0;i<title.length;i++){
		document.write(title[i]+" : "+arguments[i]+"<br>");
		
		}

}
















