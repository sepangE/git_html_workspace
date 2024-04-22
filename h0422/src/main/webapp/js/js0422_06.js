/*
성별을 입력 받아 남자면 남자
여자면 여자라고 출력
남, 남자, m, M, male, Male
여, 여자, f, F, female, Female
-----------------------------------
월을 입력해서 30일까지만 있으면
30일까지 있습니다.
31일까지 잇습니다. 등등
 */

 
 var g=prompt("성별을 입력해 주세요.(남, 남자, m, M, male, Male,여, 여자, f, F, female, Female)")
 
 switch(g){
	case "남": case "남자": case "m": case "M": 
	case "male": case "Male":
		document.write("남자");
		break;
	case "여": case "여자": case "f": case "F":
	 case "female": case "Female":
		document.write("여자");
		break;
	default:
		document.write("잘못 입력하셨습니다.");
		break;
 }
 document.write("<hr>");
 var m=Number(prompt("몇월인지 입력해 주세요."));
 
 switch(m){
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		document.write(m+"월은"+"31일까지 있습니다.");
		break;
	case 4: case 6: case 9: case 11: 
		document.write(m+"월은"+"30일까지 있습니다.");
		break;
	case 2:
		document.write(m+"월은"+"28일까지 있습니다.");
		break;
	default:
		document.write("잘못 입력하셨습니다.");
		break;

 }
 
 
 
 let a= prompt("a ?");
 a=Number(a);
 if(a==0){
	alert(0);
 }else if (a==1){
	alert(1);
 }else{
	alert(5);
 }
 
 switch(a){
	case 0:
		alert(0);
		break;
	case 1:
		alert(1);
		break;
	case 2: case 3:
		alert("2 or 3");
		break;
	default:
		alert(5);
		break;
 }
 
 /*if(a==2||a==3){
	alert('2 or 3');
 }*/
 

 
 
 
 
 
 
 
 
 
 
 