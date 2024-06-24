package j0624;
import java.util.*;
public class C0624_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 정수를 -1(a)을 입력받을때까지 입력 받아서
		// 입력받은 숫자들의 합을 출력해보세요
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int count = 1;
		// 입력부
		loop : while(true) {
			System.out.println(count+"번째 숫자입력 -1 입력받을때까지의 총합");
			int input = scan.nextInt();
			if(input == -1) break loop;
			list.add(input);
			count++;
		}
		// 출력부
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		
		
	}
}
