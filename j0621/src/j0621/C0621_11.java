package j0621;
import java.util.*;
public class C0621_11 {
	public static void main(String[] args) {
		
		/* Map : 키(Key)와 값(Value)으로 구성된 객체를 저장하는 구조
		   		 키는 중복안됨. 값은 중복허용
		   		 키의 역할이 값을 식별하는것.(리스트의 인덱스의 역할)
		   		 이미 저장된 키와 동일한 키로 저장하면 새로운 값으로 대치됨
		 */
		// Map<key의 자료형, value의 자료형>
		Map<String, String> map = new HashMap<String, String>();
		// 주어진 키로 값을 저장함
		// map은 put으로 값을 넣음
		map.put("사과", "2000원");
		map.put("딸기", "10000원");
		map.put("수박", "25000원");
		map.put("체리", "20000원");
		map.put("망고", "5000원");
		map.put("귤", "5000원");
		map.put("사과", "3000원");
		System.out.println(map);
		//{체리=20000원, 망고=5000원, 귤=5000원, 수박=25000원, 
		// 사과=3000원, 딸기=10000원}
		System.out.println(map.size()); // 객체의 갯수 : 6
		// 주어진 키가 있으면 참, 없으면 거짓
		System.out.println(map.containsKey("사과")); // true
		// 주어진 값이 있으면 참, 없으면 거짓
		System.out.println(map.containsValue("5000원")); // true
		// 모든 키를 출력해줌
		System.out.println(map.keySet());
		//[체리, 망고, 귤, 수박, 사과, 딸기]
		Set keys = map.keySet();
		System.out.println(keys);
		// 키와 값이 쌍으로 이루어진 모든 객체
		System.out.println(map.entrySet());
		//[체리=20000원, 망고=5000원, 귤=5000원, 수박=25000원, 
		// 사과=3000원, 딸기=10000원]
		
		// list -> get(인덱스)로 값을 가져왔다면
		// map -> get(key)로 값을 가져옴
		System.out.println("사과 : "+map.get("사과"));
		// 사과 : 3000원
		System.out.println("================================");
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : "+ map.get(key));
		}
		
		System.out.println("================================");
		for(String k : map.keySet()) {
			System.out.println(k+" : "+map.get(k));
		}
//		체리 : 20000원
//		망고 : 5000원
//		귤 : 5000원
//		수박 : 25000원
//		사과 : 3000원
//		딸기 : 10000원
		
		
		
		map.remove("망고"); // 키를 사용해서 값을 삭제함
		System.out.println(map);
		//{체리=20000원, 귤=5000원, 수박=25000원,
		// 사과=3000원, 딸기=10000원}

		map.clear(); // 전체삭제
		System.out.println(map);
		System.out.println(map.isEmpty());
		
		
		
		
		
		
		
		
	}
}
