package j0627;
import java.util.*;
public class C0627_06 {
	public static void main(String[] args) {
		List<Food> list = new ArrayList<Food>();
		list.add(new Drink());
		list.add(new Snack());
		list.add(new Drink("콜라", 2500));
		list.add(new Snack("하리보", 2500, true));
		List<Food> list2 = new ArrayList<Food>();
		list2.add( new Drink("콜라", 3000) );
		list2.add(  new Drink("맥주", 4000, true));
		list2.add( new Snack("새우깡",2500,false));
		List<Food> list3 = new ArrayList<Food>();
		list3.add(new Food("얼큰국밥",9500));
		list3.add(new Drink("펩시제로",2300,false));
		list3.add(new Snack("초코송이",1500,true));
		
		Map<String, List<Food>> map = new HashMap<String, List<Food>>();
		map.put("짱구", list);
		map.put("철수", list2);
		map.put("맹구", list3);
		
		// 1. key : 이름 출력하기
		for(String k : map.keySet()) {
			System.out.println(k);
		}
		System.out.println();
		// 2. key : value 출력하기
		for(String k : map.keySet()) {
			System.out.println(k+" : "+map.get(k));
		}
		System.out.println();
		// 3. 짱구 구매목록 이름만 출력하기
		List<Food> listJ = map.get("짱구");
		for(int i = 0; i < listJ.size(); i++) {
			System.out.println(listJ.get(i).getName());
		}
		for(Food f : listJ) {
			System.out.println(f.getName());
		}
		System.out.println();
		// 4. 전체 사람의 구매목록 이름만 출력하기
		for(String k : map.keySet()) {
			System.out.print(k+" : ");
			for(Food f : map.get(k)) {
				System.out.print(f.getName()+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
