<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp_loginD.jsp</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			//out.print(id+pw);
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = null;
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String dbId = "scott";
				String dbPw = "tiger";
				conn = DriverManager.getConnection(url,dbId,dbPw);
				// 쿼리
				query = "select * from member where id=? and pw=?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				rs = pstmt.executeQuery();
				if(rs.next()){
					session.setAttribute("session_id",id);
		%>
			<script>
				alert("로그인되었습니다.");
				location.href="jsp_main.jsp";
			</script>
		<%	} else { %>
			<script>
				alert("아이디 또는 비밀번호가 일치하지 않음");
				location.href="jsp_login.jsp";
			</script>
		<%
				}
				
			} catch(Exception e){e.printStackTrace();}
			finally{
				try{
					if(conn!=null) conn.close();
					if(pstmt!=null) pstmt.close();
					if(rs!=null) rs.close();
				}catch(Exception e2){e2.printStackTrace();}
			}
		
		%>
	</body>
</html>