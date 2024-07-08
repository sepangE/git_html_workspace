package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO{
	// iv
	Context context;
	DataSource dataSource;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String id, pw, name, phone;
	String query;
	
	int result=0;
	
	// 메서드
	public Member updateModi(String uname, String uid, String upw, String uphone) {
		Member m = null;
		try {
			conn = getConnection();
			query = "update member set name=?, pw=?, phone=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, uname);
			pstmt.setString(2, upw);
			pstmt.setString(3, uphone);
			pstmt.setString(4, uid);
			rs = pstmt.executeQuery();
			m = new Member(uname,uid,upw,uphone);
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return m;
	}
	
	
	
	public Member selectOneMem (String sid) {
		Member m = null;
		try {
			conn = getConnection();
			query = "select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, sid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				phone=rs.getString("phone");
				m = new Member(name,id,pw,phone);
				break;
			}//while
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return m;
	}
	
	
	
	
	public Member selectLogin(String uid, String upw) {
		Member m = null;
		try {
			conn = getConnection();
			query = "select * from member where id =? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, uid);
			pstmt.setString(2, upw);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				m = new Member(name,id,pw,phone);
			}//while
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return m;
	}
	
	
	
	public ArrayList<Member> selectMember(){
		ArrayList<Member> list = new ArrayList<>();
		try {
			conn = getConnection();
			query = "select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				list.add(new Member(name,id,pw,phone));
			}//while
			
		} catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}
		return list;
	}
	
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
			connection = dataSource.getConnection();
		} catch(Exception e) {e.printStackTrace();}
	
		return connection;
	}
	
	
	public int insertMember(Member member) {
		try{
			context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle8");
			conn = dataSource.getConnection();
			query = "insert into member (id,pw,name,phone) values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getPhone());
			// 성공하면 1 실패하면 0
			result = pstmt.executeUpdate(); // insert, update, delete는 얘 사용				
		}catch(Exception e ){e.printStackTrace();}
		finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2){e2.printStackTrace();}
		}
		
		return result;
		
	}
}
