/**
 * 
 */

 for(let i=1;i<=9;i++){
	//document.write(i+" * "+j+" = "+(i*j)+"&nbsp;");
	for(let j=2;j<=9;j++){
	document.write(j+" * "+i+" = "+(i*j)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
	}document.write("<br>");
}	
document.write("<hr>");


/* 테이블을 변수로 지정하지 않고 구구단 테이블 만들기
document.write('<table>');

for(let i=2;i<=9;i++){
	document.write('<tr><td colspan="5">[ ' + i + '단]</td></tr>');
	for(let j=1;j<=9;j++){
	document.write('<tr><td>'+i+'</td><td>'+" * "+'</td><td>'+j+'</td><td>'+" = "+'</td><td>'+(i*j)+'</td></tr>');
	}
}
document.write('</table>');

document.write("<hr>");
*/

// 테이블 변수를 이용한 구구단 테이블
var htmlstr ='<table>';
for (var i = 2 ; i <=9 ; i++){
	// 변수 i는 단으로 사용
	htmlstr += '<tr><td colspan="5">[ ' + i + '단]</td></tr>'
	
	for (var j = 1 ; j <=9 ; j++){
		// 변수 j는 곱해지는 값으로 사용
		htmlstr += '<tr><td>' + i + '</td><td>*</td><td>' + j + '</td><td>=</td><td>' + i*j + '</td></tr>'
	}
}
htmlstr += '</table>';
document.write(htmlstr);


document.write("<hr>");



