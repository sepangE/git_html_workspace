package j0628;
import java.io.*;
import java.util.Scanner;
public class C0628_08 {
	// 오류에 대한 부분을 호출한 부분에 책임전가
	public static void main(String[] args) throws Exception{
		
		// try-catch문은 오류부분을 처리를 하겠다는 의미
		
		Scanner scan = new Scanner(System.in);
		String path = "C:/aaa/3.txt";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
			System.out.println("학생이름 5회 입력");
			String name = "";
			for(int i = 1; i <= 5; i++) {
				name += scan.nextLine()+"\n";
			}
			fw.write(name);
				fw.close();
			System.out.println("파일쓰기 완료");
		
		BufferedReader br =  new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
				br.close();
					br.close();
		
		
	}// main
}// class
