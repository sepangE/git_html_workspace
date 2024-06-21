package j0621;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C0621_02 {
	public static void main(String[] args) {
		// N,A를 입력받아
		//1-N 사이의 랜덤정수를
		// A개만큼 중복없이 리스트에 넣는 프로그램을 만들어보세요
		// 만약 N : 45 A : 3으로 입력받으면 [34,1,19] 리스트 만들기
		
		Scanner scan = new Scanner(System.in);
		
		List<Number> rand = new ArrayList<Number>();
		System.out.println("A 입력");
		int A = scan.nextInt();
		System.out.println("N 입력");
		int N = scan.nextInt();
		int cnt = 0;
		while(true) {
			int rNum = (int)(Math.random()*N)+1; // 1-n 랜덤숫자생성
			if(!rand.contains(rNum)) {
				rand.add(rNum);
				cnt++;
			}
			if(cnt==A) break;
		}
		System.out.println(rand);
//		for(int i = 0; i < 100; i++) {
//			int rNum = (int)(Math.random()*N)+1;
//			if(!rand.contains(rNum)) {
//				rand.add(rNum);
//			}
//		}
//		System.out.println(rand);
		System.out.println("");
	}
}
