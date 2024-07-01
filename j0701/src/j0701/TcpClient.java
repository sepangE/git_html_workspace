package j0701;
import java.io.*;
import java.net.*;
public class TcpClient {
	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1"; // 자신의 컴퓨터 ip주소
			System.out.println("서버에 연결중... 서버 ip : "+serverIp);
			Socket socket = new Socket(serverIp, 7777);
			
			// 소켓의 입력스트립을 얻는다
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//소켓으로부터 받은 데이터를 출력함
			System.out.println("서버로부터 받은 메세지 : "+dis.readUTF());
			
			System.out.println("연결을 종료합니다.");
			dis.close();
			socket.close();
			
		}catch (Exception e) {e.printStackTrace();}
	}
}
