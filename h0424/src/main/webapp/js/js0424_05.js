/*
배열 = array:(요소들의 집합)
var 배열이름 = [배열요소1,배열요소2,배열요소3...,배열요소n];
var 배열이름 = Array(배열요소1,배열요소2,...,배열요소n);
var 배열이름 = new Array(배열요소1,배열요소2,...,배열요소n);
 */

 
 var arr1 = [1,2,3,4,5];
 var arr2 = ['홍길동','유관순','이순신'];
 var arr3 = [1,'홍길동',90, true];
 
 
 
  var fruits = ['망고','수박','딸기','포도','사과'];
 //				 0     1     2     3     4
 
 //과일
 var f1= '망고';
 var f2= '수박';
 var f3= '딸기';
 var f4= '포도';
 var f5= '사과';
 
 
 console.log(arr1);
 console.log(arr2);
 console.log(arr3);
 
 
 //유관순만 출력
  console.log(arr2[1]);
  
  //document.write(fruits[1]+', '+fruits[4]);
  document.write('<hr>');
 
 console.log(arr1.length);
// console.log(fruits[fruits.length-1]);
 
 console.log(arr3[0]); //1
 console.log(arr3[1]); //홍길동
 console.log(arr3[2]); //90
 console.log(arr3[3]); //true
 
 
 var fruits = ['망고','수박','딸기','포도','사과'];
 //				 0     1     2     3     4
 
 for(let i=0;i<fruits.length;i++){
	document.write(fruits[i]+'<br>');
 }
 
 var a =['HTML']; // 요소가 1개뿐인 배열
 
 var b =a[0];  //b = 'HTML'
  
 a[1] = 'CSS';
 a[2] = 'JAVASCRIPT';
 a[a.length] = "java";
 a[a.length+1] = "script";
 console.log(a);
 
 document.write('<hr>');
 
 var arr= [];
 arr[0] = 'A';
 arr[1] = 'B';
 arr[5] = 'C';
 
 document.write(arr[0]);
 document.write('<br>');
 document.write(arr[2]);
 
 
 arr.push('D');
 document.write('<br>');
 document.write(arr);
 
 document.write('<hr>');
 /*
1. arr.push(추가할 요소);
// push() 메소드를 이용하는 방법
2. arr[arr.length] = 추가할 요소;
// length 프로퍼티를 이용하는 방법
3. arr[특정인덱스] = 추가할 요소;
// 특정 인덱스를 지정하여 추가하는 방법
 */
 
 var student = [1,'홍길동',90];
 
 //90점 뒤에 100을 배열에 넣어보세요
 
 student.push(100);
 student[student.length] = 80;
 student[5] = student[2]+student[3]+student[4];
 document.write(student+'<br>');
 document.write(student[0]+'<br>');
 document.write(student[1]+'<br>');
 document.write(student[2]+'<br>');
 document.write(student[3]+'<br>');
 document.write(student[4]+'<br>');
 document.write(student[5]+'<br>');
 document.write(student.length+'<br>');

 document.write('<hr>');
 
 for(i=0;i<student.length;i++){
	document.write(student[i]+'<br>');
	
 }
  document.write('<hr>');
 var num=[];
 
 for(i=1;i<=10;i++){
	num[num.length]=i;
	
 }
 document.write(num+'<br>');
 
  document.write('<hr>');
 
 var num=[];
 
 for(i=1;i<=10;i++){
	num.push(i);
 }
  document.write(num+'<br>');
 
document.write('<hr>');

num=[];
for(i=0;i<10;i++){
	num[i]=i+1;
	
}document.write(num+'<br>');
 document.write('<hr>');
 
/* var num=[];
 var i=0;
 while(i<10){
	i++
	num[i]=i;
 }document.write(num+'<br>');
 */
 
 /*
 var stu = [2, '유관순', 100, 100, 100 ];
총점이랑 평균을 넣어주세요 .
document.write(stu);  // 2, '유관순', 100, 100, 100 ,300, 100
 */
 var stu =[2, '유관순', 89,91,96];
 
 stu[5] = stu[2]+stu[3]+stu[4];
 stu.push(stu[5]/3);
 document.write(stu);
 
 document.write('<hr>');
 
 var tb='<table>';
 tb += '<tr><td>'+'번호'+'</td><td>'+'이름'+'</td><td>'+'국어'+'</td><td>'+'영어'+'</td><td>'+'수학'+'</td><td>'+'총점'+'</td><td>'+'평균'+'</td></tr>';
 tb += '<tr>';
 for(i=0;i<stu.length;i++){
	tb +='<td>'+stu[i]+'</td>'
 }
 tb += '</tr>';
 tb += '</table>';
 document.write(tb);
 

 /*
 var tb= '<table>'
 
 for(let i=2;i<=9;i++){
	tb += '<tr><td colspan="5"> [ '+i+' 단'+' ]'+'</td></tr>';
	for(let j=1;j<=9;j++){
		tb += '<tr><td>'+i+'</td><td>'+" * "+'</td><td>'+j+'</td><td>'+" = "+'</td><td>'+(i*j)+'</td></tr>';
	}
 } tb+='</table>';
 document.write(tb);
 */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 