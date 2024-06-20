package j0620;
import java.util.*;
public class C0620_12 {
	public static void main(String[] args) {
		/* 1. 문자열을 담을 수 있는 해시셋 만들기
		   2. 과일이름 5개를 넣는다
		   3. 해시셋의 크기를 출력해본다
		   4. 같은과일이름을 한번 더 추가해본다
		   5. 해시셋의 크기를 출력해본다
		   6. 이터널레이터를 사용해서 객체 출력
		   7. 과일 한개를 삭제해본다
		   8. 없는 과일명으로 한개 삭제해본다
		   9. [] 있게 출력
		 */
		//1. 문자열을 담을 수 있는 해시셋 만들기
		HashSet<String> str = new HashSet<String>();
		//2. 과일이름 5개를 넣는다
		str.add("사과");
		str.add("포도");
		str.add("딸기");
		str.add("바나나");
		str.add("수박");
		System.out.println(str);
		// 3. 해시셋의 크기를 출력해본다
		System.out.println(str.size());
		//4. 같은과일이름을 한번 더 추가해본다
		str.add("사과");
		System.out.println(str);
		//5. 해시셋의 크기를 출력해본다
		System.out.println(str.size());
		//6. 이터널레이터를 사용해서 객체 출력
		
		Iterator<String> iter = str.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		//7. 과일 한개를 삭제해본다
		str.remove("사과");
		System.out.println(str);
		//8. 없는 과일명으로 한개 삭제해본다
		str.remove("망고");
		//9. [] 있게 출력
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
