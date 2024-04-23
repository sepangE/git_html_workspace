/**
 점수를 입력을 받아서
100-80사이는 >  00점은 상입니다.
80-60사이는 >  00점은 중입니다.
60-40사이는 >  00점은 하입니다.
0-40사이는 >   00점은 탈락입니다.
그외의 숫자가 들어오면 -> 0-100사이의 값을 입력해주세요
if 문을 사용해서  만들어주세요
 */

 var score=Number(prompt("점수를 입력해주세요."));
 
if((80<=score)&&(score<=100)){
	document.write(score+"점은 상입니다.");
}else if((60<=score)&&(score<80)){
	document.write(score+"점은 중입니다.");
}else if ((40<= score)&&(score<60)){
	document.write(score+"점은 하입니다.");
}else if ((0<= score)&&(score<40)){
	document.write(score+"점은 탈락입니다.");
}


var brower = prompt('사용하는 브라우저를 입력해주세요>>');
 switch(brower){
	case 'Edge':
		 alert('edge를 사용하고계시네요');
		 break;
	case 'Chrome':
    case 'Firefox':
	case 'Safari':
		alert('서비스가 지원되는 브라우저입니다.');
		break;
	default:
		alert('서비스가 지원되지 않습니다..');
		break; 		
 }
 
 
 
 
 if(brower=='Edge'){
	alert("엣지를 사용하고 계시네요");
 }else if(brower=='chrome' || brower=='Firefox' || brower=='Safari'){
	alert('서비스가 지원되는 브라우저입니다.');
 }else{
	alert('서비스가 지원되지 않습니다..');
 }
 
 
 
 /*오렌지 -> 개당 1000원입니다.
사과 -> 개당 2000원입니다
바나나 -> 개당 500원입니다
체리 -> 개당 1500원입니다
망고, 멜론 -> 개당 3000원입니다
그외 > 죄송합니다 00은 다 팔렸습니다
*/
 var fruit = prompt("원하는 과일을 입력해 주세요");
 
 switch(fruit){
	case '오렌지':
		alert("개당 1000원 입니다.");
		break;
	case '사과':
		alert("개당 2000원 입니다.");
		break;
	case '바나나':
		alert("개당 500원 입니다.");
		break;
	case '체리':
		alert("개당 1500원 입니다.");
		break;
	case '망고': case '멜론':
		alert("개당 3000원 입니다.");
		break;
	default:
		alert("죄송합니다 "+fruit+"은(는) 다 팔렸습니다.");
		break;
 }
 
 
 
 
 
 