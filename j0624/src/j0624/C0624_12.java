package j0624;
import java.util.*;
public class C0624_12 {
	public static void main(String[] args) {
		/* 문자열로 nextLine()으로 입력을 받아서 "1 2 3 4 5"
		   입력받은 숫자들의 리스트는 List<Num>으로 만들어서 한개한개 넣은 후*/
		
		// 방금전에 한것 : List<Integer> n = new ArrayList<Integer>();
		// 지금할것
		Scanner scan = new Scanner(System.in);
		List<Num> list = new ArrayList<Num>();
		System.out.println("1 2 3 4 5 입력");
		String n = scan.nextLine();
		String[] num = n.split(" ");
		for(int i = 0; i < num.length; i++) {
			list.add(new Num(Integer.parseInt(num[i])));
		}
//		for(Num a : list) {
//			System.out.println(a.x);
//		}
		// list에 있는 숫자들의 합을 출력해보세요.
		int sum = 0;
		for(int i = 0; i <list.size(); i++) {
			sum += list.get(i).x;
		}
		System.out.println("총합 : "+sum);
		// 최대값과 최소값도 출력해보세요
		System.out.println("최소값 : "+list.get(0));
		System.out.println("최대값 : "+list.get(list.size()-1));
	    // 평균도 출력해보세요
		System.out.println("평균 : "+(double)sum/list.size());
		
		
		
	}
}
