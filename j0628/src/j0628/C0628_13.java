package j0628;
import java.util.*;
import java.io.*;
public class C0628_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuControl sc = new StuControl();
		List<Student> list = new ArrayList<Student>();
		Map<String, Object> map = new HashMap<String, Object>();
		int count = 0;
		loop : while(true) {
			System.out.println("[학생 성적 프로그램]");
			System.out.println("1. 학생 입력");
			System.out.println("2. 학생 출력");
			System.out.println("8. 학생정보 파일에서 가져오기");
			System.out.println("9. 학생정보 파일에 저장하기");
			System.out.println("0. 종료");
			System.out.println("============================");
			System.out.println("번호를 선택해주세요");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 :
				map = sc.stuInput(list,count);
				count = (int)map.get("cnt");
				list = (List<Student>)map.get("stu");
				break;
			case 2 :
				sc.stuPrint(list);
				break;
			case 8 :
				list = sc.readFile();
				break;
			case 9 :
				sc.saveFile(list);
				break;
			case 0 : 
				System.out.println("프로그램 종료");
				break loop;
			}
		}// while
		
	} // main
	
} // class
