
/*
몸무게가 minW 보다 작으면
체중미달입니다 - 오렌지색
몸무게가 maxW 보다 크면
비만입니다.      - 빨간색
사이면 정상체중입니다 - 
를  id가 txt인 곳에 출력
minW = ( 키 - 100 ) * 0.9 -  5
maxW = ( 키 - 100 ) * 0.9 + 5
*/



function wBtn(){
	var uN = document.getElementById("name").value;
	var uH = document.getElementById("h").value;
	var uW = document.getElementById("w").value;
	
	var result=ckW(uW,uH);
	
	switch(result){
		case 1: document.getElementById("txt").innerHTML=uN+"님 체중미달입니다.";
				document.getElementById("txt").style.color= "orange";
		break;
		case 2: document.getElementById("txt").innerHTML=uN+'님 과체중입니다.';
				document.getElementById("txt").style.color= "red";
		break;
		case 3: document.getElementById("txt").innerHTML=uN+"님 정상체중입니다.";
		break;
	}
	/*if(uW<=r){
		document.getElementById("txt").innerHTML="<p style = 'color:orange;'>체중미달입니다.</p>";
	}else if(uW>=maxW){
		document.getElementById("txt").innerHTML=("<p style = 'color:red;'>과체중입니다.</p>");
	}else{
		document.getElementById("txt").innerHTML=("<p>정상체중입니다.</p>");
	}*/
}//wBtn()

function ckW(w,h){
	var minW=(h-100)*0.9-5;
	var maxW=(h-100)*0.9+5;
	if(w<=minW){
		return 1;
	}else if(w>=maxW){
		return 2;
	}else{
		return 3;
	}
}
















