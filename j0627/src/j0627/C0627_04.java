package j0627;
import java.util.*;
public class C0627_04 {
	public static void main(String[] args) {
		
		Food d1 = new Drink();
		System.out.println(d1);
		Drink d2 = new Drink("콜라",3000);
		System.out.println(d2);
		Drink d3 = new Drink("맥주",4000,true);
		System.out.println(d3);
		Food s1 = new Snack();
		System.out.println(s1);
		Snack s2 = new Snack("새우깡",2500,false);
		System.out.println(s2);
		
		Map<Integer, Food> map = new HashMap<Integer, Food>();
		map.put(1, d1);
		map.put(2, new Drink("우유",2500));
		map.put(3, s1);
		map.put(4, s2);
		map.put(5, d3);
		
		// 다음과 같이 출력해보세요
//				1 :  물
//				2 :  우유
//				3 :  초코파이
		
		for(Integer i : map.keySet()) {
			System.out.println(i+" "+map.get(i).getName());
		}
		
		// map에 들어있는 제품의 총 가격
		int sum = 0;
		for(Integer i : map.keySet()) {
			sum += map.get(i).getPirce();
		}
		System.out.println(sum); // 10500
		Map<String, Food> map2 = new HashMap<String, Food>();
		map2.put("A", d1);
		map2.put("B", new Drink("우유",2500));
		map2.put("C", s1);
		map2.put("D", s2);
		map2.put("E", d3);
		// A : 물  B : 우유
		// 총합
		
		for(String i : map2.keySet()) {
			System.out.println(i+" "+map2.get(i).getName());
		}
		
		// map에 들어있는 제품의 총 가격
		int sum2 = 0;
		for(String i : map2.keySet()) {
			sum2 += map2.get(i).getPirce();
		}
		System.out.println(sum2);
		
		// =======================================================
		
		List<Food> cart1 = new ArrayList<Food>();
		cart1.add(d1); cart1.add(s2); cart1.add(new Food("국밥",8000));
		List<Food> cart2 = new ArrayList<Food>();
		cart2.add(new Drink("콜라",1700,false));	cart2.add(new Snack("밤양갱",1000,true));
		cart2.add(new Food("틈새라면",7500));
		System.out.println(cart1);
		//[이름 : 물, 가격 : 1000 음료수, 이름 : 초코파이, 가격 : 500 단거, 이름 : 국밥, 가격 : 8000]
		System.out.println(cart2);
		//[이름 : 콜라, 가격 : 1700 음료수, 이름 : 밤양갱, 가격 : 1000 단거, 이름 : 틈새라면, 가격 : 7500]
		
		
		// cart1에 들어있는 품목들의 총액을 구해보세요
		int c1 = 0;
		for(Food i : cart1) {
			System.out.println(i.getName()+" "+i.getPirce());
			c1 += i.getPirce();
		}
		System.out.println(c1);
		// cart2에 있는 품목의 총액
		int c2 = 0;
		for(int i = 0; i < cart2.size(); i++) {
			c2 += cart2.get(i).getPirce();
		}
		System.out.println(c2);
		
		Map<String, List<Food>> listMap = new HashMap<String, List<Food>>();
		
		listMap.put("홍길동", cart1);
		listMap.put("강백호", cart2);
		
		// 홍길동의 장바구니속 물건들의 합은?
		List<Food> tmp = listMap.get("홍길동");
		List<Food> tmp2 = listMap.get("강백호");
		int total = 0;
		for(Food f : tmp) {
			total += f.getPirce();
		}
		// listMap안에 있는 사람들의 장바구니의 합을 for문을 사용해서 출력
		// 출력 : 홍길동 00원
		//	     강백호 00원
		
		
		for(String s : listMap.keySet()) {
			List<Food> tm = listMap.get(s);
			int t = 0;
			for(Food f : tm) {
				t += f.getPirce();
			}
			System.out.println(s + " : "+ t);
		}
		
		Map<String, Integer> member = new HashMap<String, Integer>();
		member.put("홍길동", 22);
		member.put("강백호", 20);
		member.put("짱구", 5);
		
		for(String s : member.keySet()) {
			System.out.println(s+" "+member.get(s));
		}
		
		
		
	}
}
