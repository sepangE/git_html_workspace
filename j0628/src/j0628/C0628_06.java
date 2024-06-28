package j0628;
import java.io.*;
public class C0628_06 {
	public static void main(String[] args) {
		String path = "C:/aaa/2.txt";
		File f = new File(path);
		FileWriter fw = null;
		// 파일에 쓰기
		try {
			fw = new FileWriter(f);
			String data ="파일쓰기 시작\n";
			data += "내용추가 가능 \n";
			for(int i = 1; i <=10; i++) {
				data += i+"번째 줄 \n";
			}
			fw.write(data);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("파일쓰기 완료");
		}// try 입력부
		//=================================================
		// 출력
		BufferedReader br = null; // bufferedreader : 한줄씩 읽어옴
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
