package j0701;
import java.net.*;
public class C0701_02_url관련메서드들 {
	public static void main(String[] args) throws Exception {
		// url : 인터넷에 존재하는 여러서버들이 제공하는 자원에 접근할 수 있는 주소표현
		// 포로토콜 : //호스트명:포트번호/경로명/파일명?쿼리스트링#참조 의 형태
		// 프로토콜 : 자원에 접근하기위해 서버와 통신하는데 사용되는 통신규약 http
		// 호스트명 : 자원을 제공하는 서버이름 www.naver.com
		// 포트번호 : 통신에 사용되는 서버의 포트번호 (http에서는 기본 80번포트 사용함(80은 생략))
		// 파일명 : 접근하려는 자원의 이름 00.html
		// 쿼리 : url에서 ? 이후의 부분
		// 참조 : url에서 # 이후의 부분
		// https://www.google.com/search?q=jsp&oq=jsp&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIHCAEQABiABDIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIHCAYQABiABDIGCAcQRRg80gEHNTIwajBqN6gCCLACAQ&sourceid=chrome&ie=UTF-8
		
		String address = "https://n.news.naver.com/article/005/0001707288?type=editn&cds=news_edit";
		URL url = new URL(address); // 문자열의 정보로 url객체를 생성
		System.out.println("호스트명 & 포트 : "+url.getAuthority()); // 호스트명 & 포트 : n.news.naver.com
		System.out.println("콘텐츠 객체 반환 : "+url.getContent());
		// 콘텐츠 객체 반환 : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@57a78e3
		System.out.println("기본포트 반환 : "+url.getDefaultPort()); // 기본포트 반환 : 443
		System.out.println("포트 반환 : "+url.getPort()); // 포트 반환 : -1
		System.out.println("파일 명 : "+url.getFile()); // /article/005/0001707288?type=editn&cds=news_edit
		System.out.println("호스트명 : "+url.getHost()); // 호스트명 : n.news.naver.com
		System.out.println("경로명 : "+url.getPath()); // 경로명 : /article/005/0001707288
		System.out.println("프로토콜 : "+url.getProtocol()); // 프로토콜 : https
		System.out.println("쿼리 : "+url.getQuery()); // 쿼리 : type=editn&cds=news_edit
		System.out.println("참조 : "+url.getRef()); // 참조 : null
		System.out.println("사용자 정보 : "+url.getUserInfo()); // 사용자 정보 : null
		System.out.println("문자열로 반환 : "+url.toExternalForm());
		// 문자열로 반환 : https://n.news.naver.com/article/005/0001707288?type=editn&cds=news_edit
		
		
		
	}
}
