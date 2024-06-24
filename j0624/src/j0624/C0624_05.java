package j0624;
import java.util.*;
public class C0624_05 {
	public static void main(String[] args) {
		
		// 객체 선언 및 생성
		Num n1 = new Num(1);
		System.out.println(n1.x);
		// collection 타입은 객체를 담을 수 있다.
		List<Num> list = new ArrayList<Num>();
		// 객체를 리스트에 추가하기
		list.add(n1);
		list.add(new Num(10));
		list.add(new Num(100));
		list.add(new Num(1000));
		int obsum = 0;
		for(int i = 0; i < list.size(); i++) {
			obsum += list.get(i).x;
		}
		System.out.println(obsum);
		
		System.out.println("================================");
		list.clear();	//System.out.println(list);
		
		// List<Num> list = new ArrayList<Num>();
		// 정수입력
		list.add(new Num(10));
		// 0번째 리스트 출력하기
		System.out.println(list.get(0).x); // 10
		System.out.println(list.get(0).y); // 0.0
		
		list.add(new Num(3.14));
		System.out.println(list.get(1).x); // 0
		System.out.println(list.get(1).y); // 3.14
		
		list.clear();
		// list 사용해서
		// 실수만 입력을 받아 -1 입력받으면 입력받기 중지.
		// 입력된 실수들의 합을 구해보세요
		Scanner scan = new Scanner(System.in);
		int count = 1;
		double dsum = 0;
		
		while(true) {
			System.out.println(count+"번째 실수만 입력 -1 받으면 종료");
			double input = scan.nextDouble();
			if(input == -1) break;
			list.add(new Num(input));
			count++;
		}
		for(int i = 0; i < list.size(); i++) {
			dsum += list.get(i).y;
		}
		System.out.println("실수의 총합 : "+dsum);
		
		
		
		
		
		
		
		
		
		
		
//		// 정수를 -1(a)을 입력받을때까지 입력 받아서 (리스트에 저장)
//		// 입력받은 숫자들의 합을 출력해보세요
//		Scanner scan = new Scanner(System.in);
//		int count = 1;
//		int sum = 0;
//		
//		loop : while(true) {
//			System.out.println(count+"번째 숫자입력 -1 입력시까지의 합계");
//			int ip = scan.nextInt();
//			if(ip == -1) break loop;
//			list.add(new Num(ip));
//			count++;
//		}
//		
//		for(int i = 0; i < list.size(); i++) {
//			sum += list.get(i).x;
//		}
//		System.out.println("총 합 : "+sum);
		
		
		
		
		
		
		
		
		
	}
}
