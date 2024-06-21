package j0621;
import java.util.*;
public class C0621_10 {
	public static void main(String[] args) {
		/* set - 중복을 허용하지 않고 저장순서를 유지하지 않는 컬렉션
		   set : 인터페이스
		   hashset : 구현클래스
		   		   : set 특성을 그대로 물려받아 중복된 값을 허용하지 않고
		   		     저장순서를 유지하지 않는다.
		*/
		Set<String> set = new HashSet<String>();
		// set에 추가
		set.add("Java");		set.add("HTML");
		set.add("SQL");			set.add("JavaScript");
		set.add("Python");		set.add("Java");
		System.out.println(set); //[Java, JavaScript, HTML, SQL, Python]
		// 중복을 허용하지 않기때문에 두번째 자바 없음
		System.out.println(set.size()); // size()로 크기 알 수 있음 5
		
		// contains : 있는지 없는지 있으면 true 없으면 false
		System.out.println(set.contains("SQL")); // true
		System.out.println(set.contains("C++")); // false
		// 요소제거 : remove()
		set.remove("SQL");
		System.out.println(set); // [Java, JavaScript, HTML, Python]
		// 인덱스가 없어서 인덱스로는 값을 가져올 수 없음
		// 간단for문 , Iterator() 메서드로는 값 가져올 수 있음
		for(String s : set) {
			System.out.println(s);
		}
		//Iterator 인덱스가 없는 컬렉션들을 반복문 돌릴 수 있게 해주는 클래스
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		set.clear(); // 전체삭제
		System.out.println(set);
		// isEmpty() 컬렉션이 비워져있는지 비워져있으면 true 아니면 false
		System.out.println(set.isEmpty());
		
	}
}
