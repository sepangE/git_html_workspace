package j0624;
import java.util.*;
public class C0624_06 {
	public static void main(String[] args) {
		List<Num> list = new ArrayList<Num>();
		Scanner scan = new Scanner(System.in);
		// 객체 리스트에서는
		// 1. 객체 생성 후 그 값을 list에 add메서드 사용해서 넣기
		// Num nobj = new Num(10);
		// list.add(nobj);
		// 2. 객체를 생성함과 동시에 넣거나
		// list.add(new Num(3.14));
		
		// 값을 읽어오기   .get(인덱스)메서드 사용
	//	list.get(0); 	// 객체 그 자체
	//	list.get(0).x;	// x 변수 가져오기
	//  list.get(0).getX() // private라면 getter로 값 가져오기
	//	list.get(0).y; 	// y 변수 가져오기
		
		
		
		
		
		
		// 실수를 입력받으면 0을 저장
		// 정수를 입력받으면 입력받은 숫자를 리스트에 저장
		while (true) {
			System.out.println("숫자입력 (종료 : a)");
			String in = scan.next();
			if(in.equals("a")) break;
			else if(isDouble(in)) {
				list.add(new Num(0));
			} else if (isInteger(in)) {
				list.add(new Num(Integer.parseInt(in)));
			}
		}
		//총합은 어떻게 구할까요
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).x;
		}
		System.out.println("총합 : "+sum);
	/*	System.out.println(isDouble("3.14"));  // true
		System.out.println(isInteger("3.14")); // false
		System.out.println(isDouble("3"));  // false
		System.out.println(isInteger("3")); // true */
		
		
	}
	static boolean isDouble(String num) {
		// 실수는 숫자이며, 1로 나눈 나머지가 0이면 정수 아니면 실수
		try {
			double d = Double.parseDouble(num);
			
			if (d % 1== 0) return false;
			else return true;
		} catch(Exception e) {
			return false;
		}
	}
	static boolean isInteger(String num) {
		try {
			Integer.parseInt(num);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
