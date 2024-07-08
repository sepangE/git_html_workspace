<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String  name, email,gender, jdate;
	int id, age;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB연결 2</title>
	</head>
	<body>	
		<%
			try{
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String dbId = "scott";
				String dbPw = "tiger";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url,dbId,dbPw);
				stmt = conn.createStatement();
				String query = "select * from mem";
				rs = stmt.executeQuery(query);
				
				while(rs.next()){ // rs에 데이터가 있으면 참
				name = rs.getString("name");
				id = rs.getInt("id");
				email = rs.getString("email");
				gender = rs.getString("gender");
				age = rs.getInt("age");
				jdate = rs.getString("jdate");
					
				
		%>
			<table>
				<tr>
					<td><%= "아이디 : "+id %></td>
					<td><%= "이름 : "+name %></td>
					<td><%= "이메일 : "+email %></td>
					<td><%= "성별 : "+gender %></td>
					<td><%= "나이 : "+age %></td>
					<td><%= "가입일 : "+jdate %></td>
				</tr>
			</table>
		<%
			}//while
			} catch(Exception e){e.printStackTrace();}
			finally{
				try{
					if(rs!=null) rs.close();
					if(stmt!=null) stmt.close();
					if(conn!=null) conn.close();
				}catch (Exception e){e.printStackTrace();}
			}
		%>
	</body>
</html>