package j0626;
import java.util.*;
public class C0626_06_map설명 {
	public static void main(String[] args) {
		// map : 인터페이스	HashMap : 구현클래스
		//   key	  value
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		// key : Integer, value : Integer
		HashMap<String, Integer> map2 = new HashMap<>();
		// key : String, value : Integer	new 에서 파라미터 생략가능
		HashMap<String, Integer> map3 = new HashMap<>(5);
		//										초기용량 지정가능
		HashMap<String, Object> map4 = new HashMap<String, Object>();
		// key : String, value는 아무거나
		// key : 중복 허용안함 유일해야함(유니크)
		// value : 중복이 있어도 상관x
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		// 값을 추가하는 방법 : put(key, value);
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(1, "OneOne"); // key값 같게 넣음 -> key가 같으면 나중에 넣은 값으로 변경
		map.put(4, "Three"); // value값 같게 넣음 -> 값은 상관없이 추가됨
		System.out.println(map);//{1=OneOne, 2=Two, 3=Three, 4=Three}
		
		// key값은 유일하기때문에 자료를 key값으로 가져옴
		System.out.println(map.get(4)); // Three
		// 삭제를 할때도 key 값으로 삭제함
		map.remove(1);
		System.out.println(map);	//{2=Two, 3=Three, 4=Three}
		
		Iterator it = map.keySet().iterator();
	//	Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Object i = it.next();
			System.out.println("key : "+i); // key값을 가져옴
			System.out.println("value : "+map.get(i)); // value를 출력 
		}
		// key를 set으로 만든 것
		System.out.println(map.keySet()); //[2, 3, 4]
		// entrySet : key=value 묶은 set
		System.out.println(map.entrySet()); // [2=Two, 3=Three, 4=Three]
		
		
		
		
		
		
		
	}
}
