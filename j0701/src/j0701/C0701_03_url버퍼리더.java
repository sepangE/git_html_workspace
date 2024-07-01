package j0701;
import java.io.*;
import java.net.*;
public class C0701_03_url버퍼리더 {
	public static void main(String[] args) throws Exception {
		// url에 연결해서 안에 있는 내용을 읽어줌. 읽어올 데이터가 문자열이기때문에 버퍼리더사용
		URL url = null;
		BufferedReader input = null;
		String address = "https://n.news.naver.com/article/005/0001707288?type=editn&cds=news_edit";
		String line = "";
		url = new URL(address);
		input = new BufferedReader(new InputStreamReader(url.openStream()));
		while((line = input.readLine()) != null) {
			System.out.println(line);
		}
		input.close();
		
		
		
		
	}
}
