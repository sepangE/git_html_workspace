<%@page import="java.sql.*"%>
<%@page import="javax.naming.*"%>
<%@page import="javax.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp_memWrite_cp.jsp</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String hobby = "";
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String phone = request.getParameter("phone");
			String gender = request.getParameter("gender");
			String[] hobbys = request.getParameterValues("hobby");
			for(int i = 0; i < hobbys.length; i++){
				if(i==0) hobby+=hobbys[i];
				else hobby+=","+hobbys[i];
			}
		//	out.print(name+", "+id+", "+pw+", "+phone+", "+gender+", "+hobby);
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle8");
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = null;
			try{
				conn = ds.getConnection();
				query = "insert into member values(?,?,?,?,?,?,sysdate)";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				pstmt.setString(3, name);
				pstmt.setString(4, phone);
				pstmt.setString(5, gender);
				pstmt.setString(6, hobby);
				int result = pstmt.executeUpdate();
				// 쿼리에서 insert, update, delete 사용시 pstmt.executeUpdate() 사용
				// pstmt.executeUpdate()는 쿼리문을 보내서 성공하면 1, 실패하면 2 리턴해줌
				if(result == 1){
					// 성공. 정보가 잘 저장됨
				%>
				<script>
					alert("회원정보 저장완료");
					location.href="jsp_main.jsp";
				</script>
				<%		} else {	%>
				<script>
					// 저장 실패
					alert("회원정보 저장 실패");
					history.back();
				</script>
				<%	
				}
			} catch(Exception e){e.printStackTrace();}
			finally{
				try{
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (Exception e2){e2.printStackTrace();}
			}
		%>
	</body>
</html>