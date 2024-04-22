/*
 조건문 : if-else문,switch문
 
 switch(조건값){
	case 값1:
		조건값이 값1일때 실행되는 실행문;
		break;
	case 값2:
		조건값이 값2일때 실행되는 실행문;
		break;
	case 값n:
		조건값이 값n일때 실행되는 실행문;
		break;
	default:
		조건값이 case절 아무것에도 해당되지 않을때 실행하는 실행문;
		break;
 }
 */

 var x = 100;
 switch(typeof(x)){
	case "number" : //if(typeof(x)=="number")
		document.write("숫자타입입니다.");
		break;
	case "string" : //if(typeof(x)=="string")
		document.write("문자타입 입니다.");
		break;
	case "boolean" :	//if(typeof(x)=="boolean")
		document.write("불리언타입 입니다.");
		break;
	default:	//else
		document.write("타입을 잘 모르겠습니다.");
		break;
 }
 
 
 
 document.write("<hr>");
 var day= 6;//new Date().getDay();
 
 // 오늘의 요일을 반환함.(일요일 0 - 토요일은 6)
 
 switch(day){
/*	case 1://월요일
	case 2://화요일
	case 3://수요일
	case 4://목요일
	case 5://금요일
	*/
	case 1: case 2: case 3: case 4: case 5:
		document.write("평일입니다. 힘내세요!");
		break;
	case 6://토요일
	case 0://일요일
		document.write("즐거운 주말입니다!");
		break;
 }
 
 
 
 /*
 switch를 사용해서 월을 입력받아서
 3~5:봄 6~8:여름 9~11:가을 12~2:겨울
 을 출력
 */
 document.write("<hr>");
 var m=Number(prompt("몇월인지 입력해 주세요."));
 
 switch(m){
	case 3: case 4: case 5:
		document.write("봄입니다.");
		break;
	case 6: case 7: case 8:
		document.write("여름입니다.");
		break;
	case 9: case 10: case 11:
		document.write("가을입니다.");
		break;
	case 12: case 1: case 2:
		document.write("겨울입니다.");
		break;
	default :
		document.write("잘못 입력하셨습니다.");
		break;
 }
 	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 