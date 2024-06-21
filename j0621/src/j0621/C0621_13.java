package j0621;
import java.util.*;
public class C0621_13 {
	// 클래스변수 . 전역번수
	static Scanner scan = new Scanner(System.in);
	static HashMap<Integer, Mem> map = new HashMap<Integer, Mem>();
	public static void main(String[] args) {
		// Mem(int no, String name, String subject, int score)
		
		
		map.put(1001, new Mem(1001,"짱구","자바",100));
		map.put(1002, new Mem(1002,"철수","자바",90));
		map.put(1003, new Mem(1003,"맹구","자바",60));
		map.put(1004, new Mem(1004,"훈이","자바",30));
		map.put(1005, new Mem(1005,"유리","자바",10));
		
		
		// 출력해주는 메서드를 만들어서 
		// 번호\t이름\t과목\t성적 을 출력
		printAll();	
		// 학번을 입력받아서 학번에 해당하는 친구정보 출력하기 없으면 없다고 하기
		System.out.println("학번 입력");
		int no = scan.nextInt();
			if(map.get(no)!= null) {
				System.out.println("번호\t이름\t과목\t성적");
				System.out.printf("%d\t%s\t%s\t%d\n",map.get(no).getNo(),map.get(no).getName(),
						map.get(no).getSubject(),map.get(no).getScore());
			}
			else {
				System.out.println("없는 학생임");
			}
		
		
		
	} // main
	static void printAll() {
		System.out.println("번호\t이름\t과목\t성적");
		for(Integer i : map.keySet()) {
			System.out.printf("%d\t%s\t%s\t%d\n",map.get(i).getNo(),map.get(i).getName(),
					map.get(i).getSubject(),map.get(i).getScore());
		}
	}
	
	
	
	
}// class
