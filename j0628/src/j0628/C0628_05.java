package j0628;
import java.io.*;
public class C0628_05 {
	public static void main(String[] args) {
		String path = "C:/aaa/1.txt";
		File f = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);		// 1byte씩 읽어옴
			br = new BufferedReader(fr);	// 한줄씩 읽어옴
			int cnt = 1;
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				if(line.contains("a")) { // a가 포함된 줄만 출력
					System.out.println(line);
				}
				if(line.indexOf("1") != -1) { // 1이 포함된 줄만 출력
					System.out.println(line);
				}
//				System.out.println(cnt+" : "+line);
//				cnt++;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); // 안열려있을수도 있어서 얘도 try-catch로 닫아야함
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
