<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Context context = null;
	DataSource dataSource = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int stuNo, kor,eng,math,total;
	String name;
	double avg;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>수학점수 90~100사이</title>
		<style>
		table, th, td {border : 1px solid black; border-collapse : collapse;
						text-align:center;}
		th, td{width : 200px; hegiht: 40px;}
		</style>
	</head>
	<body>
		<table>
			<tr>
				<th> 번호 </th>
				<th> 이름 </th>
				<th> 국어점수 </th>
				<th> 영어점수 </th>
				<th> 수학점수 </th>
				<th> 총점 </th>
				<th> 평균 </th>
			</tr>
		<%
			try{
				context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
				conn = dataSource.getConnection();
			//	String query = "select * from student order by kor desc"; 국어성적순
			//	String query = "select * from student order by avg desc"; 평균순
			//	String query = "select * from student where lower(name) like '%a%'"; 이름 a포함
				String query = "select * from student where math between 90 and 100"; // 수학 90~100 사이
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				while(rs.next()){
					stuNo = rs.getInt("stuno");
					name = rs.getString("name");
					kor = rs.getInt("kor");
					eng = rs.getInt("eng");
					math = rs.getInt("math");
					total = rs.getInt("total");
					avg = rs.getDouble("avg");
		%>
			<tr>
				<td> <%= stuNo %> </td>
				<td> <%= name %> </td>
				<td> <%= kor %> </td>
				<td> <%= eng %> </td>
				<td> <%= math %> </td>
				<td> <%= total %> </td>
				<td> <%= avg %> </td>
			</tr>
		<% 		
				}//while
			} catch (Exception e){e.printStackTrace();}
			finally{
				try{
					if(rs!=null) rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		%>
		
		</table>
	</body>
</html>