package j0701;
import java.net.*;
public class UdpServer {
	public static void main(String[] args) throws Exception{
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		while(true) {
			System.out.println("준비");
			// 데이터를 수신하기위한 패킷을 생성한다
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket); // 패킷을 통해 데이터 수신
			String str = new String(inPacket.getData());
			System.out.println("수신된 데이터 : "+str);
			// 수신한 패킷을 통해 클라이언트의 ip와 port를 얻는다
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			System.out.println("클라이언트 ip : " + address+
					"클라이언트 포트 : "+port);
			String msg = "서버로부터 메세지 입니다";
			// 패킷을 생성해서 클라이언트에게 전송한다
			outMsg = msg.getBytes();
			outPacket = new DatagramPacket(outMsg, outMsg.length
					,address, port);
			socket.send(outPacket);
			
			
			
			
		}
		
		
		
	}
}
