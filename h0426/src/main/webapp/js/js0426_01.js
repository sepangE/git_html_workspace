/*
 
 */
var number = ['one','two','three','four'];

var t = number[1];

console.log(t);

for(let i=0;i<4;i++){
	console.log(number[i]);
}

// 배열에 값을 넣는 방법
number[4] = 'five';

console.log(number.length);

// 배열에 마지막에 값을 넣는 경우 배열의 길이를 사용 가능
number[number.length] = 'six';

number.push('seven');
number.push('eight','nine','ten');


// 좋아하는 과일 5개를 입력받아 f 배열에 넣어보세요
/*var f=[];
for(let i=0;i<5;i++){
	var a ="귤"//prompt("좋아하는 과일을 입력해 주세요");
	f.push(a)
}document.write(f);
//만약에 f에 딸기가 있으면 [딸기가 있습니다]출력

//f=['수박','사과','딸기','포도','망고'];
var cnt=0;
for(let i=0;i<f.length;i++){
	if(f[i]=="딸기"){
		document.write("<p>딸기가 있습니다.</p>");
		break;
	}else{
		cnt++;
	}
	
}
if(cnt==f.length){
	document.write("<p>딸기가 없습니다.</p>");
}*/

var num=[[1,2],3,4,[5,6,7],8];
//		   0   1 2    3    4
console.log(num[0]); // [1,2]
console.log(num[0][0]); // 1
console.log(num[3][2]); // 7

var tmp=[['A','B'],[1,2,3],['C','D'],[4,5,6]]

//B와 5를 출력해보기
document.write(tmp[0][1]+tmp[3][1]);
console.log(tmp.length); // 4
console.log(tmp[0].length); // 2
console.log(tmp[3].length); // 3
document.write("<hr>");

for(let i=0;i<tmp.length;i++){
	for(let j=0;j<tmp[i].length;j++){
	
	document.write(tmp[i]);
	}
}
document.write("<hr>");
var stu1= ['홍길동',60];
var stu2= ['유관순',80];
var student=[stu1,stu2];
var student1=[['홍길동',60],['유관순',80]]




//출력 딸기15000원 망고 10000원 사과 5000원
var fru = [['딸기',15000],['망고',10000],['사과',5000]];

for(i=0;i<fru.length;i++){
		document.write(fru[i][0]+" : " +fru[i][1]+" 원<br>");
}

document.write("<hr>");

var lang = [ ['미국','영국','일본','중국','스페인'], ['영어','영어','일본어','중국어','스페인어'] ]

// 미국은 영어를 사용합니다.

for(i=0;i<lang[0].length;i++){
	document.write(lang[0][i]+"은 "+lang[1][i]+"를 사용합니다.<br>");
}

document.write("<hr>");

// n에 들어있는 숫자들의 합을 구하세요 > 55
var n = [[1,2,3,4],[5,6],[7,8,9],[10,11]];
sum = 0;
for(i=0;i<4;i++){
	for(j=0;j<n[i].length;j++){
		sum+=n[i][j];
	}
	
}document.write("<p>배열 속 전체 숫자의 합계: "+sum+"</p>");

document.write("<hr>");

//안에 있는 작은 배열속 숫자들의 곱을 구해 
//새로운 배열에 넣으세요

var num = [[1,2,3],[4,5,6],[1,3,5],[2,4,6]];
var mul = []
var s;

for(i=0;i<num.length;i++){
	s=0;
	for(j=0;j<num[i].length;j++){
		s=s+num[i][j];
	}document.write(s+"<br>");
}
document.write("<hr>");
var m;
for(let i=0;i<num.length;i++){
	m=1;
	for(let j=0;j<num[i].length;j++){
		m*=num[i][j];
	}document.write(m+"<br>");
}


