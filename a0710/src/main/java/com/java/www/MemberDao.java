package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query = "";
	Member m;
	ArrayList<Member> list = new ArrayList<>();
	
	
	
	private Connection getConnection() {
		Connection connection = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle8");
			connection = ds.getConnection();
		} catch (Exception e) {e.printStackTrace();}
		return connection;
	}// getConnection
	
	public Member selectOne(String uid, String upw) {
		try {
				conn = getConnection();
				query = "select * from member where id=? and pw=?";
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, uid);
				pstmt.setString(2, upw);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String id = rs.getString("id");
					String pw = rs.getString("pw");
					String name = rs.getString("name");
					String phone = rs.getString("phone");
					String gender = rs.getString("gender");
					String hobbys = rs.getString("hobbys");
					Timestamp jdate = rs.getTimestamp("jdate");
					m = new Member(id,pw,name,phone,gender,hobbys,jdate);
				}
				
			}catch(Exception e) { e.printStackTrace();}
			finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				}catch(Exception e2) {e2.printStackTrace();}
			}
		return m;
	} // selectOne
	
	public ArrayList<Member> selectAll(){
		
		try {
			conn = getConnection();
			query = "select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String gender = rs.getString("gender");
				String hobbys = rs.getString("hobbys");
				Timestamp jdate = rs.getTimestamp("jdate");
				System.out.println(id);
				m = new Member(id,pw,name,phone,gender,hobbys,jdate);
				list.add(m);
			}
			}catch(Exception e) { e.printStackTrace();}
			finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				}catch(Exception e2) {e2.printStackTrace();}
			}
		return list;
	} // selectAll
	
	public int insertOne(Member mem) {
		int result = 0;
		try {
			
			System.out.println(mem.getId()+mem.getPw()+mem.getName()+mem.getPhone()+mem.getGender()+mem.getHobbys());
			conn = getConnection();
			query = "insert into member values(?,?,?,?,?,?,sysdate)" ;
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPw());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getPhone());
			pstmt.setString(5, mem.getGender());
			pstmt.setString(6, mem.getHobbys());
			result = pstmt.executeUpdate();
			}catch(Exception e) { e.printStackTrace();}
			finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				}catch(Exception e2) {e2.printStackTrace();}
			}
		return result;
	}
	
	
	
	
	
	
} // class
