package j0627;
import java.util.*;
public class C0627_07 {
	public static void main(String[] args) {
		// 1. Americano, Latte 객체 하나씩 생성
		Americano am = new Americano();
		Latte la = new Latte();
		
		// 2. Map을 한개 만들어서 강백호 는 아메리카노 서태웅은 라떼 담기
		Map<String, Cafe> map = new HashMap<String, Cafe>();
		map.put("강백호", am);
		map.put("서태웅", la);
		
		// 3. map 출력으로 강백호 : 아메리카노 / 서태웅 : 라떼
		for(String k : map.keySet()) {
			System.out.println(k+" : "+map.get(k).getName());
		}
		
		List<Cafe> m1 = new ArrayList<Cafe>();
		List<Cafe> m2 = new ArrayList<Cafe>();
		// m1 m2 3~4개씩 메뉴 담기
		m1.add(new Americano()); m1.add(new Americano());
		m1.add(new Americano()); m1.add(new Latte());
		
		m2.add(new Latte()); m2.add(new Latte());
		m2.add(new Latte()); m2.add(new Americano());
		System.out.println("===============================");
		// 리스트 메뉴 출력하기
		for(Cafe c : m1) {
			System.out.println(c.getName());
		}
		System.out.println("===============================");
		for(Cafe c : m2) {
			System.out.println(c.getName());
		}
		// 리스트에 들은 커피가격의 합계구하기
		System.out.println("===============================");
		int sum = 0;
		for(Cafe c : m1) {
			sum += c.getPrice();
		}
		System.out.println("m1 : "+sum);
		System.out.println("===============================");
		sum = 0;
		for(Cafe c : m2) {
			sum += c.getPrice();
		}
		System.out.println("m2 : "+sum);
		System.out.println("===============================");
		
		Map<String, List<Cafe>> guest = new HashMap<String, List<Cafe>>();
		// "강백호" > m1 , 서태웅 > m2;
		guest.put("강백호", m1);
		guest.put("서태웅", m2);
		
		// key 출력
		for(String s : guest.keySet()) {
			System.out.println(s);
		}
		// key : value 출력하기 (전체)
		for(String s : guest.keySet()) {
			System.out.println(s+" : "+guest.get(s));
		}
		// 강백호가 내야하는 총금액, 서태웅이 내야하는 총 금액 출력해보기
		for(String s : guest.keySet()) {
			int total = 0;
			for(Cafe c : guest.get(s)) {
				total += c.getPrice();
			}
			System.out.println(s+" : "+total);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
