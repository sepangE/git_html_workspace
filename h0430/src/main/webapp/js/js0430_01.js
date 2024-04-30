


/*요소 선택
1. tag 이름으로
2. id로
3. class 이름으로
4. name이라는 속성을 사용해서
5. css 선택자 query.#..
*/
//태그이름으로 요소 선택하기
var h2s=document.getElementsByTagName("h2");
console.log(h2s);
h2s.item(0).style.color = "red"
//button 가져오기
var btns=document.getElementsByTagName('button');
console.log(btns);
btns.item(0).style.background ="yellow"

//td 태그를 가진 아이템들의 글자색을 violet으로 바꿔보기

var tds=document.getElementsByTagName('td');
console.log(tds);
for(let i=0;i<tds.length;i++){
	tds.item(i).style.color="violet";
}
//id를 사용해서 요소선택

var tdid=document.getElementById('id1');
console.log (tdid);
tdid.style.color="green";

//id가 sal인 요소의 글자색을 빨간색으로

var tdid1=document.getElementById('sal');
console.log(tdid1);
tdid1.style.color="red";

// name 속성을 사용해서 요소선택하기
// 글자색 오렌지
var names=document.getElementsByName("name1");
console.log(names);
for(i=0;i<names.length;i++){
	names.item(i).style.color="orange";
}



//class 이름을 사용해서 요소 선택하기

var cls=document.getElementsByClassName('c1');
for(let i=0;i<cls.length;i++){
	cls.item(i).style.color="blue";
}

//css query 를 이용한 선택
var h2css=document.querySelectorAll("h2");
console.log(h2css);

var tdid2 = document.querySelectorAll('#id1');
console.log(tdid2);

var clsAll= document.querySelectorAll('.c1');
console.log(clsAll); // h2 1개 +td 4개

var clsTds = document.querySelectorAll("td.c1");
console.log(clsTds);// td 4개만 가져옴



// id로 btn1 가져오기

var btnId = document.getElementById('btn1').onclick=function (){
 // id가 btn1인 요소를 클릭했을때 실행되는 함수
alert("버튼을 클릭하셨습니다.")


}



console.log(h2s.item(0).innerText);

/*
document.write("")
document.write("<h2>안녕하세요</h2>");
id = 'btn2'를 가지는 버튼을 추가하고.
그 버튼을 눌럿을때.
숫자두개를  prompt창으로 입력받아
두개의 합을 alert창으로 출력해주세요
*/
document.write("<button id='btn2'>버튼2입니다.</button>");

var btnId2 = document.getElementById('btn2').onclick=function (){
	var n1=Number(prompt("첫번째 숫자 입력"));
	var n2=Number(prompt("두번째 숫자 입력"));
	alert(n1+n2);
}



/*
id = 'btn3'를 가지는 버튼을 추가하고.
그 버튼을 눌럿을때.
아이디랑 비밀번호를 입력받아서
아이디가 admin
비밀번호가 1111일때 환영합니다를 alert창
둘중에 하나라도 틀렸을때 잘못입력하셧습니다.
alert창으로 출력하기
*/
document.write("<button id='btn3'>버튼3입니다.</button>");
var btnId3 = document.getElementById('btn3').onclick=function (){
	var id=(prompt("id 를 입력해주세요"));
	var pwd=Number(prompt("비밀번호를 입력해주세요"));
	if(id=='admin'&&pwd==1111){
		alert("환영합니다.");
	}else{
		alert("잘못입력하셨습니다.");
	}
}


/*
id = 'btn4'를 가지는 버튼을 추가하고.
그 버튼을 눌럿을때.
문자열인 숫자들을 입력받아 prompt 1개 사용
ex) 1 2 3 4 5 6 7 을 입력하면
1+2+3+4+5+6+7 결과 값을 출력(alert)
ex) 10 20 30 을 입력하면
10+20+30의 결과 값을 출력 (alert)

*/
document.write("<button id='btn4'>버튼4입니다.</button>");
var btnId4 = document.getElementById('btn4').onclick=function(){
	var n1=prompt("숫자들을 입력해주세요 ex)1 2 11 57... ");
	var arr = n1.split(" ");
	sum=0;
	for(let i=0;i<arr.length;i++){
		sum+=Number(arr[i]);
	}
	alert(sum);
}


document.write("<button id='btn5'>버튼5입니다.</button>");
var btnId5 = document.getElementById('btn5').onclick=function(){
	var idsal = document.getElementById('sal');
	idsal.style.background="skyblue";
	
}


//document.write("<hr>");



























