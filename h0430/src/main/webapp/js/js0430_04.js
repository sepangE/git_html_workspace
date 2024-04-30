//로그인 버튼을 누르면 아이디를 입력받는 prompt창
//비밀번호를 입력받는 prompt창을 만들고
//로그인 함수를 호출해서



// 두개 다 일치하면 로그인 성공(alert)
// 둘 중 하나라도 다르면 다르다는 alert






function loginBtn(){
	var uid = prompt("아이디를 입력해주세요");
	var upw = prompt("비밀번호 입력");
	login (uid,upw);
}

function login(uid,upw){
	let adminId='admin';
    let adminPw='1234';
    if(uid==adminId&&upw==adminPw){
		alert("로그인 성공");
	}else if(uid!=adminId){
		alert("유효하지 않은 아이디 입니다.");
	}else if(upw!=adminPw){
		alert("유효하지 않은 비밀번호 입니다.");
	}
}

document.write("<hr>");

//버튼을 눌렀을때 글자는 로그인 글자색은 빨간색으로 변경
function newBtn(){
	var nB = document.getElementsByTagName("h1");
	console.log(nB);
	nB.item(0).style.color="red";
	nB.item(0).innerHTML="로그인";
	
	var uid, upw;
	uid = document.getElementById("uid");
	upw = document.getElementById("upw");
	var iv = uid.value;
	var pv = upw.value;
	console.log(iv);
	console.log(pv);
	login(iv,pv);
	
}//newBtn()

















































