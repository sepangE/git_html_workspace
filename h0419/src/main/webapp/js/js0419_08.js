/*
이름과 점수를 입력받아서
1. 60점 이상이면 [홍길동님 합격입니다.]
미만이면 [홍길동님 불합격 입니다.]

2.
90점 이상이면 홍길동님 A 학점입니다.
80점 이상이면 홍길동님 B 학점입니다.
70점 이상이면 홍길동님 C 학점입니다.
60점 이상이면 홍길동님 D 학점입니다.
60점 미만이면 홍길동님 F 학점입니다.

3.
97점 이상은 A+, 94~96사이는 A, 90~93사이는 A-
87점 이상은 B+, 84~86사이는 B, 80~83사이는 B-
*/

var name="asdf"//prompt("이름을 입력해 주세요");
var sc=11;//Number(prompt("점수를 입력해 주세요"));

if(sc>=60){
	document.write(name+"님 합격입니다.");
} else{
	document.write(name+"님 불합격입니다.");
}

var name1="qq";//prompt("이름을 입력해 주세요");
var sc1=11;//Number(prompt("점수를 입력해 주세요"));

if(sc1>=90){
	document.write(name1+"님 A 학점입니다.");
	}else if(80<=sc1){
		document.write(name1+"님 B 학점입니다.");
	}else if(70<=sc1){
		document.write(name1+"님 C 학점입니다.");
	}else if(60<=sc1){
		document.write(name1+"님 D 학점입니다.");
}else{
		document.write(name1+"님 F 학점입니다.");
	}


var name2="ww"//prompt("이름을 입력해 주세요");
var sc2=123123//Number(prompt("점수를 입력해 주세요"));

if(sc2>=97){
	document.write(name2+"님 A+ 학점입니다.");
}	else if(94<=sc2){
		document.write(name2+"님 A 학점입니다.");
}	else if(90<=sc2){
		document.write(name2+"님 A- 학점입니다.");
}	else if(87<=sc2){
		document.write(name2+"님 B+ 학점입니다.");
}	else if(84<=sc2){
		document.write(name2+"님 B 학점입니다.");
}	else if(80<=sc2){
		document.write(name2+"님 B- 학점입니다.");
}

var n1=Number(prompt("점수를 입력해 주세요"));
var n2=Number(prompt("점수를 입력해 주세요"));
var s=prompt("연산기호를 입력해 주세요");


var res1=n1+n2;
var res2=n1-n2;
var res3=n1*n2;
var res4=n1/n2;
var res5=n1%n2;

if(s=="+"){
	document.write(n1+"+"+n2+"="+res1);
}else if(s=="-"){
	document.write(n1+"-"+n2+"="+res2);
}else if(s=="*"){
	document.write(n1+"*"+n2+"="+res3);
}else if(s=="/"){
	document.write(n1+"-"+n2+"="+res4);
}else if(s=="%"){
	document.write(n1+"-"+n2+"="+res5);
}else{
	doucment.write("잘못 입력하셨습니다.");
}

