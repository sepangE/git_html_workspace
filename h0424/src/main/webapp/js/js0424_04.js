


// 문자열은 따옴, 작은따옴표 안에 있다.
// 문자열은 그대로 출력됨

var a="안녕하세요 "
var str1 = a+ "반갑습니다 "+"감사합니다."
document.write(str1);

var str2 = "<h1>제목입니다</h1>"
document.write(str2);
var str3 = "<p style='color:red;'>빨간색 숫자 :"+4+"</p>"

document.write(str3);
document.write("<hr>");


var str4='<table>';

str4 += '<tr><td>'+10+'</td></tr>';
str4 += '<tr><td>'+20+'</td></tr>';
str4 += '<tr><td>'+30+'</td></tr>';
str4 += '</table>';


document.write(str4);
