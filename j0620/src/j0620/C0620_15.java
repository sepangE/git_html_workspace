package j0620;
import java.util.*;
public class C0620_15 {
	public static void main(String[] args) {
		
		/*
		1. 학생이름, 점수   로 이루어진 해시맵 만들기
	       key   ,  value
	    2. 맵의 크기출력하기.
	    3. 이름으로 점수 출력하기. 홍길동의 점수를 출력해주세요
	    4. 객체를 출력해보기
	    5. 객체를 이름 : 점수 로 한개한개 출력해보기
	    6. 홍길동 객체 삭제해보기
	    7. 전체 객체 출력해보기
		 */
		//1. 학생이름, 점수   로 이루어진 해시맵 만들기
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 100);
		map.put("유관순", 90);
		map.put("고길동", 78);
		map.put("도우너", 50);
		map.put("둘리", 20);
		//2. 맵의 크기출력하기.
		System.out.println(map.size()); //5
		//3. 이름으로 점수 출력하기. 홍길동의 점수를 출력해주세요
		System.out.println(map.get("홍길동")); // 100
		//4. 객체를 출력해보기
		System.out.println(map); // {둘리=20, 홍길동=100, 도우너=50, 유관순=90, 고길동=78}
		//5. 객체를 이름 : 점수 로 한개한개 출력해보기
		System.out.println(map.keySet());
		for(String name : map.keySet()) {
			System.out.println(name+" "+map.get(name));
		}
		//6. 홍길동 객체 삭제해보기
		map.remove("홍길동");
		//7. 전체 객체 출력해보기
		System.out.println(map);
		//8. 키 출력하기
		System.out.println(map.keySet());
	
	}
}
