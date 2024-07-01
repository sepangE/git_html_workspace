package j0701;
import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class TcpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			// 서버 소켓을 생성해 7777번 포트와 결합시킨다
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime()+"서버가 준비되었습니다");
		} catch (Exception e) {e.printStackTrace();}
		
		while(true) {
			try {
				
				System.out.println(getTime()+"연결 요청을 기다리는중");
				// 서버소켓은 클라이언트의 연결 요청이 올때까지 실행을 멈추고 기다림
				// 클라이언트의 연결요청이 오면 클라이언트소켓과 통신할 소켓을 생성함
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+socket.getInetAddress()
				+ "로 부터 연결요청이 왔습니다. ");
				// 소켓의 출력을 얻는다
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				// 데이터를 보냄.
				dos.writeUTF("서버로부터 보내고 있는 메세지");
				System.out.println(getTime()+"데이터를 전송했습니다");
				dos.close();
				socket.close();
			} catch(Exception e) {e.printStackTrace();}
		}
		
	}
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
	
	
	
	
}
