package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Member;

public class MemberDao {
	
	private String id, pw, name, phone, gender, hobbys;
	private Timestamp jdate;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query;
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
			if(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobbys = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
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


	public ArrayList<Member> selectAll() {
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
				gender = rs.getString("gender");
				hobbys = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
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
	}// selectAll


	public int dojoin(Member m2) {
		int result =0;
		try {
			conn = getConnection();
			query = "insert into member values(?,?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m2.getId());
			pstmt.setString(2, m2.getPw());
			pstmt.setString(3, m2.getName());
			pstmt.setString(4, m2.getPhone());
			pstmt.setString(5, m2.getGender());
			pstmt.setString(6, m2.getHobbys());
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
	
	
	
	
	
	
	
}
