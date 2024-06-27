package j0627;
import java.io.*;
public class C0627_11 {
	//									  오류에대한 책임을 전가
	public static void main(String[] args) throws Exception{
		InputStream in = System.in; // 콘솔창에서 입력을 받는다
		// system.in 은 inputstream의 객체임
//		int a = 0;
//		//read 메서드는 1바이트를 입력받아 int 형으로 리턴함
//		a = in.read();
//		System.out.println(a);
//		// abcd를 입력해도 a만 저장됨
//		System.out.println(a);

//		byte[] a = new byte[3];
//		in.read(a);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		
		// 문자값 그대로 출력하고자한다면 InputstreamReader 사용
		InputStreamReader reader = new InputStreamReader(in);
//		char[] c = new char[3];
//		reader.read(c);
//		System.out.println(c);
		
		// 엔터 전까지 전부 다 입력받고싶다 BufferReader 사용
		BufferedReader br= new BufferedReader(reader);
//		String str = br.readLine();
//		System.out.println(str);
		in.close();
		
		OutputStream os = System.out;
		for(byte i = 97; i <123 ; i++) {
			os.write(i);
		}
		os.write(10); // \n에 해당함
		
		String str = "가나다라마바사아자차카타파하";
		byte[] b = str.getBytes();
		os.write(b);
 		
		os.flush(); // 버퍼에 잔류하는 모든 문자열 출력
		os.close(); // 사용한 전체 시스뎀 자원 반납하고 출력스트림 닫음
		
		
		
	}
}
