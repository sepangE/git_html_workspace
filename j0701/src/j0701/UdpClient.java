package j0701;
import java.net.*;
public class UdpClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramsocket = new DatagramSocket();
		InetAddress serverAddr = InetAddress.getByName("127.0.0.1");
		// 데이터가 저장될 공간
		byte[] msg = new byte[100];
		
		// 데이터를 송신하는 응용프로그램에서 사용하는 생성자
		DatagramPacket outPacket = new DatagramPacket(msg, 1,
				serverAddr,7777);
		// 데이터를 수신하는 응용프로그램에서 사용하는 생성자
		DatagramPacket inPack = new DatagramPacket(msg,msg.length);
		
		datagramsocket.send(outPacket); // 전송
		datagramsocket.receive(inPack); // 수신
		
		System.out.println("서버 ip : "+ inPack.getAddress());
		System.out.println("서버 포트 : "+ inPack.getPort());
		System.out.println("수신데이터 : "+ new String(inPack.getData()));
		datagramsocket.close();
		
		
		
		
	}
}
