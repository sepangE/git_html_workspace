package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	
	private int bno, bhit, bgroup, bstep, bindent;
	private String id, btitle, bcontent, bfile;
	private Timestamp bdate;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String query = "";
	Board b;
	ArrayList<Board> list = new ArrayList<>();
	
	private Connection getConnection() {
		Connection connection = null;
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle8");
			connection = ds.getConnection();
		} catch (Exception e) {e.printStackTrace();}
		return connection;
	}// getConnection
	
	public ArrayList<Board> selectAll(){
		try {
			conn = getConnection();
			query = "select * from board order by bno asc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bno = rs.getInt("bno");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bfile = rs.getString("bfile");
				bdate = rs.getTimestamp("bdate");
				b = new Board(bno,bhit,bgroup,bstep,bindent,id,btitle,bcontent,bfile,bdate);
				list.add(b);
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
	} // selectAll()
	
	public Board viewBoard(int no) {
		try {
			conn = getConnection();
			query = "select * from board where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				bno = rs.getInt("bno");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bfile = rs.getString("bfile");
				bdate = rs.getTimestamp("bdate");
				b = new Board(bno,bhit,bgroup,bstep,bindent,id,btitle,bcontent,bfile,bdate);
			}
			}catch(Exception e) { e.printStackTrace();}
			finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				}catch(Exception e2) {e2.printStackTrace();}
			}
		return b;
	}// viewBoard
	
	public int writeOne(Board bo) {
		int result = 0;
		try {
			conn = getConnection();
			query = "insert into board values(board_seq.nextval,?,?,?,sysdate,0,"+
						"board_seq.currval,"+
						"0,0,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bo.getId());
			pstmt.setString(2, bo.getBtitle());
			pstmt.setString(3, bo.getBcontent());
			pstmt.setString(4, bo.getBfile());
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
