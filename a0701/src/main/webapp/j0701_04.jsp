<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
		*{padding : 0; margin : 0;}
		table, td,th{width : 550px; border: 1px solid black; border-collapse : collapse;
				  text-align : center; margin : 30px auto;
		}
		td,th{height : 30px; width : 100px}
		
		
		</style>
</head>
	<body>
		<% // 스크립트문. 자바코드를 넣는다
			int a = 10;
			int b = 20;
			out.print(a+" + "+b+" = "+(a+b));// out.print thml에 출력해줌
		%>
		<br>
		<%	for(int i = 0; i < 5; i++){%>
			<%= i+1 %> <br> <!-- out.print생략가능 -->
	<% 	}%>
	<hr>
		<%! // 선언식 함수, 전역변수를 선언할때 사용
			//메서드, 함수같은경우는 주로 서블릿에서 사용함
			int sum = 0;
			int num1 = 10;
			int num2 = 20;
			int sum(int a, int b){
				return a+b;
			}
		%>
		
		<%	out.print(sum(10,20));	%>
		<hr>
		
		<% out.print("<h2>1에서부터 100까지의 합을 구해서 출력해보세요</h2>");
		   for(int i = 1; i <= 100; i++){
			   sum += i;
		   }
		   out.print(sum);
		%>
		<hr>
		<%	// 배열속에있는 숫자의 합을 구해서 출력
			int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
			sum = 0;
			for(int i = 0; i < arr.length; i++){
				sum += arr[i];
			}
			out.print("배열속의 숫자들 합 :"+sum);
		%>
		<hr>
		<%	// 1~100사이의 랜덤숫자 10개를 저장하는 배열을 만들어서 그 랜덤숫자의 합 출력
			int rnum = 0;
			int rsum = 0;
			int[] arr1 = new int[10];
			for(int i = 0; i < 10; i++){
				rnum = (int)(Math.random()*100)+1;
				arr1[i] = rnum;
			}
			for(int i = 0; i < arr1.length; i++){
				out.print(arr1[i]+" ");
				rsum += arr1[i];
			}
			out.print("<br>");
			out.print(Arrays.toString(arr1));
			out.print("<br>");
			out.print("랜덤숫자 10개 합 : "+rsum);
		%>
		<%-- 선언한 메서드를 표현식으로 출력 --%>
		<br>
		<% out.print(sum(4,5)); %>
		<br>
		<%= sum(1,2) %>
		
		<hr>
		<table>
			<tr>
				<td> <%= num1 %> </td>
				<td> <%= num2 %> </td>
				<td> <%= sum(num1,num2) %> </td>
			</tr>
		</table>
		<%-- n1부터 n2까지의 합을 구하는 sumAll(int a, int b)를 만들어보기 --%>
		<%!int sumAll (int a, int b){
			int sum = 0;
			for(int i = a; i <= b; i++){
				sum +=i;
			}
			return sum;
		} %>
		<%= sumAll(1,10) %>
		
		<table>
			<tr>
				<th>순서</th>
				<th>합계</th>
			</tr>
		<!-- for문시작 -->
		<% sum = 0; %>
		<%for(int i = 1; i <= 10; i++){ %>
			<tr>
				<td><% out.print(i); %></td>
				<td><% out.print(sum+=i); %></td>
				<%--<% sumAll(1,i) %> --%>
			</tr>
		<% } %>
		<!-- for문 끝 -->
		</table>
		
		
		
		
		
		
	</body>
</html>