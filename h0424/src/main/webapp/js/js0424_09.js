/*

var tb='<table>';
tb += '<tr>';
 for(i=0;i<stu.length;i++){
	tb +='<td>'+stu[i]+'</td>'
 }
 tb += '</tr>';
 tb += '</table>';
 document.write(tb);
 */
 
 title= ["게시판이 오픈되었습니다.","홈페이지 공지",
"새로운 이벤트 시작합니다.","이벤트 다시 시작합니다.",
"업데이트 공지","신입사원모집","신제품 런칭이벤트",
"주식 상장 안내","이벤트 재공지","당첨자 발표"];
names =["홍길동","유관순","이순신","강감찬","김구",
"윤봉길","안창호","장보고", "이이","곽재우" ]
hits = [3,7,1,10, 2,5,11,8,3,1]

 var tb= '';
 	tb+='<table><colgroup><col width="10%"><col width="50%"><col width="15%"><col width="10%"><col width="15%">';
	tb+= '<th>'+'번호'+'</th>'+'<th>'+'제목'+'</th>'+'<th>'+'작성자'+'</th>'+'<th>'+'조회수'+'</th>'+'<th>'+'날짜'+'</th>';
 document.write('<h2>자유게시판</h2>');
 
 for(i=0;i<title.length;i++){
	tb+= '<tr><td>'+(i+1)+'</td><td>'+title[i]+'</td><td>'+names[i]+'</td><td>'+hits[i]+'</td><td>'+'2024-04-24'+'</td>';
 }
 tb+='</table>';
 document.write(tb);
 
 document.write('<h2>너무 어려워요</h2>');
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 