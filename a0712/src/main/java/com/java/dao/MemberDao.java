package com.java.dao;

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
	private int mno;
	private String name,id,pw,email,addr,phone,gender;
	private Timestamp bdate;
	
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

	public Member selectOne(String id2, String pw2) {
		
		try {
			conn = getConnection();
			query = "select * from mem where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			pstmt.setString(2, pw2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				mno = rs.getInt("mno");
				name = rs.getString("name");
				id = rs.getString("id");
				pw = rs.getString("pw");
				email = rs.getString("email");
				addr = rs.getString("addr");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				bdate = rs.getTimestamp("bdate");
				m = new Member(mno,name,id,pw,email,addr,phone,gender,bdate);
				System.out.println(id);
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

	public int insertOne(Member m2) {
		int result= 0;
		try {
			conn = getConnection();
			query = "insert into mem values(mem_seq.nextval,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m2.getName());
			pstmt.setString(2, m2.getId());
			pstmt.setString(3, m2.getPw());
			pstmt.setString(4, m2.getEmail());
			pstmt.setString(5, m2.getAddr());
			pstmt.setString(6, m2.getPhone());
			pstmt.setString(7, m2.getGender());
			pstmt.setTimestamp(8, m2.getBdate());
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

	public Member showOne(String id2) {
		try {
			conn = getConnection();
			query = "select * from mem where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				name = rs.getString("name");
				id = rs.getString("id");
				pw = rs.getString("pw");
				email = rs.getString("email");
				addr = rs.getString("addr");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				bdate = rs.getTimestamp("bdate");
				m = new Member(name,id,pw,email,addr,phone,gender,bdate);
				System.out.println(id);
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
	}
}
