/*
 월을 입력받아서
 3,4,5,->봄 6,7,8,->여름
 9,10,11->가을 12,1,2->겨울
 */

 var n1=12;//Number(prompt("몇월인지 입력해 주세요."));
 console.log(n1+ typeof(n1));
 
 //if(n1 >=3 && n1 <=5)
 if((n1==3)||(n1==4)||(n1==5)){
	document.write("봄");
 }else if((n1==6)||(n1==7)||(n1==8)){
	document.write("여름");
 }else if((n1==9)||(n1==10)||(n1==11)){
	document.write("가을");
 }else if((n1==12)||(n1==1)||(n1==2)){
	document.write("겨울");
 }else{
	document.write("숫자를 잘못 입력하셨습니다.");
 }
 
 /*
 성별(m M f F), 키를 입력받아서
남자일 경우 (m)  172.5이상이면
[남성입니다]
[평균이상] 이하면 [평균이하]
여자일 경우 (f) 159.6 이상이면
[여성입니다]
[평균이상] 이하면 [평균이하]
그외는 [잘못입력하셨습니다] 라고 출력해보세요
 */
 document.write("<hr>");
 var s=prompt("남성이면 M, 여성이면F를 입력해 주세요");
 var t=Number(prompt("키를 입력해 주세요"));
 console.log(s+ typeof(s));
 console.log(t+ typeof(t));
 
 if(s=="M"){
	document.write("남성입니다.");
	if(t>=172.5){
		document.write("평균이상")
	}else{
		document.write("평균이하")
	}
 }else if(s=="F"){
	document.write("여성입니다.");
 	if(t>=159.6){
		document.write("평균이상");
	}else{
		document.write("평균이하");
	}
 }else{
	document.write("잘못입력하셨습니다.");
 }
 
 
 
 