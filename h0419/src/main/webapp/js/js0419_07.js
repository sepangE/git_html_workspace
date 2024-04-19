/*
 키와 몸무게를 입력받아 평균체중보다 작습니다.
 평균체중입니다. 평균체중보다 높습니다.
 를 출력해보세요
 평균체중 = (키-100)*0.9
 */

var h=1;//Number(prompt("체중을 입력해 주세요."));
var t=1;//Number(prompt("키를 입력해 주세요."));
var res=(t-100)*0.9;
document.write("평균체중은 "+":"+res+"입니다."+"<br>");

if(res < h){
	document.write('<h1 style="color:red">평균체중보다 높습니다.</h1>'+'<br>');
}else if(res >h){
	document.write('<h1 style="color:yellow">평균체중보다 적습니다.</h1>'+'<br>');
}else{
	document.write('<h1 style="color:blue">평균체중입니다.</h1>'+'<br>');
}
 
 /*
 ㅇㅏ이디와 비밀번호를 입력받아서
 둘다 같으면 [로그인되었습니다.]
 아이디는 일치하나 비밀번호가 일치하지 않으면
 [비밀번호가 일치하지 않습니다.]
 입력한 아이디가 다르면 [아이디가 일치하지 않습니다]
 var id='damin'
 var pwd='1111'
 */
var id='admin';
var i=(prompt("아이디를 입력해 주세요."));
var pwd='1111'
var p=Number(prompt("비밀번호를 입력해 주세요."));

if(id == i){
	 if(pwd==p){
		alert("로그인되었습니다.");
		location.href="https://www.google.com/";
	}else {
		alert("비밀번호가 일치하지 않습니다.");
		//location.reload();//페이지 새로고침
	}
}else{
	alert("아이디가 일치하지 않습니다.");
	//location.reload();//페이지 새로고침
}

 