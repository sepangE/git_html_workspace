package j0701;
import java.net.*; // 데이터 통신부분
import java.util.Arrays;
public class C0701_01_네트워크기본설명 {
	public static void main(String[] args) {
// java 네트워크 :  
		// 서버 : 서비스를 제공하는 컴퓨터
		// 파일서버, 메일서버, 어플리케이션서버 등
		// 클라이언트 : 서비스를 사용하는 컴퓨터
		// ip 주소 : 컴퓨터를 구별하는데 상용되는 고유의 값. 인터넷에 연결된
		//			모든 컴퓨터는 ip주소를 가진다.
		// cmd 창에서 ipconfig로 컴퓨터의 ip주소 확인 가능
		// 자바에서 ip주소를 다루기 위한 클래스로 InetAddress를 제공함
		
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		try {
			ip = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : "+ ip.getHostName()); 
			// ㄴ 호스트명 : www.naver.com
			System.out.println("호스트주소 : "+ ip.getHostAddress()); 
			// ㄴ  호스트주소 : 223.130.192.248
			System.out.println(ip.toString());
			// ㄴ www.naver.com/223.130.192.248
			
			// ip 주소를 byte 배열로 반환
			byte[] ipAddr = ip.getAddress(); 
			System.out.println(Arrays.toString(ipAddr));
			// ㄴ [-33, -126, -56, -37]
			String result = "";
			for(int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[0]<0 ? ipAddr[i]+256 : ipAddr[i])+".";
			}
			System.out.println("주소 : "+result);
			// 호스트주소 : 223.130.200.236
			// 주소 : 223.130.200.236.
			
			
			
		} catch(UnknownHostException e) {e.printStackTrace();}
		
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("호스트명 : "+ip.getHostName());
			//호스트명 : DESKTOP-2QF2PQU
			System.out.println("호스트주소 : "+ip.getHostAddress());
			//호스트주소 : 192.168.0.224
		} catch(UnknownHostException e) {e.printStackTrace();}
		
		
		
		
		
		
		
		
		
	}
}
