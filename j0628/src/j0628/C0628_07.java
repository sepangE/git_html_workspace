package j0628;
import java.io.*;
import java.util.Scanner;
public class C0628_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String path = "C:/aaa/3.txt";
		File f = new File(path);
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			System.out.println("학생이름 5회 입력");
			String name = "";
			for(int i = 1; i <= 5; i++) {
				name += scan.nextLine()+"\n";
			}
			fw.write(name);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("파일쓰기 완료");
		}
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
