package com.java.www;
// 컨트롤+쉬프트+o = 임포트
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
	MemberDto mdto;
	String query, id, pw, name, phone, gender, hobby;
	Timestamp jdate;
	// 커넥션풀에서 connection 가져오는 메서드
	private Connection getConnection() {
		Connection connection = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle8");
			connection = ds.getConnection();
		} catch (Exception e) {e.printStackTrace();}
		return connection;
	}// getConnection
	
	// 데이터베이스에 일치하는 아이디와 패스워드가 있는지 확인하는 메서드
	public MemberDto loginCheck(String id, String pw) {
		try {
			conn = getConnection();
			query = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				this.id = rs.getString("id");
				this.pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobbys");
				mdto = new MemberDto(this.id, this.pw, name, phone, gender, hobby);
			}
			
		} catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		}// finally
		return mdto;
	} // login check
	
	// member테이블에 멤버객체정보를 insert하는 메서드
	public int insertMember(MemberDto mdto) {
		int result = 0;
		// 쿼리의 결과가 참이면 1 거짓이면 0 리턴됨
		try {
			conn = getConnection();
			query = "insert into member values(?,?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPw());
			pstmt.setString(3, mdto.getName());
			pstmt.setString(4, mdto.getPhone());
			pstmt.setString(5, mdto.getGender());
			pstmt.setString(6, mdto.getHobby());
			result = pstmt.executeUpdate();
		} catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		} // finally
		return result;
	} // insetrMember
	
	public ArrayList<MemberDto> memberAll(){
		ArrayList<MemberDto> list = new ArrayList<>();
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
				hobby = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				list.add(new MemberDto(id,pw,name,phone,gender,hobby,jdate));
			} // while
		} catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {e2.printStackTrace();}
		} // finally 
		System.out.println(list.size());
		return list;
	} // MemberAll
	
	public MemberDto memberOne(String id) {
		MemberDto mdto = null;
		try {
			conn = getConnection();
			query = "select * from member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobbys");
				jdate = rs.getTimestamp("jdate");
				mdto = new MemberDto(id,pw,name,phone,gender,hobby,jdate);
			}// while
		} catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch(Exception e2) {e2.printStackTrace();}
		} // finally
		return mdto;
	} // memberOne

	public int memberUpdate(String mid, String mphone, String mgender, String mhobby) {
		int result = 0;
		try {
			conn = getConnection();
			query = "update member set phone=?, gender=?, hobbys=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mphone);
			pstmt.setString(2, mgender);
			pstmt.setString(3, mhobby);
			pstmt.setString(4, mid);
			result = pstmt.executeUpdate(); // 성공하면 1 실패하면 0
		} catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch(Exception e2) {e2.printStackTrace();}
		}// finally
		return result;
	}// memberUpdate
	
}
