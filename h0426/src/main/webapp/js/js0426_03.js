/*
 1. 연도(year) : 1900년(00) ~ 1999년(99)
*** 2. 월(month) : 1월(0) ~ 12월(11) ***
3. 일(day) : 1일(1) ~ 31일(31)
4. 시(hours) : 0시(0) ~ 23시(23)
5. 분(minutes) : 0분(0) ~ 59분(59)
6. 초(seconds) : 0초(0) ~ 59초(59)
 */

 var d = new Date(); //date 객체 생성
 
 document.write(d+"<br>");
 
 var d1= new Date("May 5 2024 12:00:00");
 document.write(d1+"<br>");
 
 var d2= new Date(0);
 document.write(d2+"<br>");
 // 1970.1.1을 기준으로 숫자 밀리초만큼 지난 날짜
 var d2= new Date(86400000);
 // 86400000ms 는 1일
 document.write(d2+"<br>");
 
 var d3=new Date(90,5,25); // 90년 6월 25일
 document.write(d3+"<br>");

var d4=new Date(2000,5,25,15,40,0); // 2000년 6월 25일 15시 40분 0초
 document.write(d4+"<br>");
 
 //ISO 날짜양식 - 국제표준
 
 var y1= new Date("1999-12-12t13:30:30");
 var y2= new Date("1999-12-12t");
 var y3= new Date("1999-12");
 var y4= new Date("1999");
 
 document.write(y1+"<br>");
 document.write(y2+"<br>");
 document.write(y3+"<br>");
 document.write(y4+"<br>");
 
 // long			MMM	DD	YYYY
 var y1 = new Date("Feb 10 2000");
 var y2 = new Date("10 Feb 2000");
 var y3 = new Date("February 10 2000");
 var y4 = new Date("FEBRUARY 10 2000");
 
 //short  mm dd yyyy
 var u1=new Date("04/26/2025");//mm/dd/yyyy
 var u2=new Date("2025/05/10");//yyyy/mm/dd
 
 document.write(u1+"<br>");
 document.write(u2+"<br>");
 
 document.write("<hr>");
 
 var milisec = Date.now();
 document.write (milisec+"<br>");
 // 1970.1.1일부터 오늘까지의 시간을 ms로 반환
 
 var n1= new Date(milisec);
 var n2= new Date();
 document.write(n1+"<br>");
 document.write(n2+"<br>");
 
  document.write("<hr>");
  
  var date = new Date(); // 지금. 이순간
  
  var year = date.getFullYear();
 //현재 연도를 4자리숫자로 반환
  var month= date.getMonth();
  
  var day= date.getDate();
  var d = date.getDay(); //요일
  // 0 일요일 1월 2화 3수 4목 5금 6토
  
  document.write(year,month,day,d);
  document.write("<hr>");
 
 // 오늘 날짜를
 // 오늘은 2024년 4월 26일 금요일 입니다. 출력
 // switch문이나 if-else문을 사용해서 월화수목금토일을 표현
 
 var y= date.getDay();
 console.log(month);
 switch(y){
	case 0:
		y="일요일"
		break;
	case 1:
		y="월요일"
		break;
	case 2:
		y="화요일"
		break;
	case 3:
		y="수요일"
		break;
	case 4:
		y="목요일"
		break;
	case 5:
		y="금요일"
		break;
	case 6:
		y="토요일"
		break;
 }

document.write("오늘은 " + year +"년 "+(month+1)+"월 "+day+"일 "+y+" 입니다.");
 
 document.write("<hr>");
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 