package j0627;
import java.util.*;
public class C0627_05 {
	public static void main(String[] args) {
		
		List<Food> list = new ArrayList<Food>();
		list.add(new Food("얼큰국밥",8000));
		list.add(new Snack("Netflex팝콘",6900,true));
		list.add(new Drink("펩시제로",2300,false));
		list.add(new Drink());
		
		// 리스트에 들어있는 품목의 이름을 출력해주세요
		for(Food f : list) {
			System.out.println(f.getName());
		}
		// 리스트에 들어있는 품목의 가격들을 출력해주세요
		for(Food f : list) {
			System.out.println(f.getPirce());
		}
		// 리스트에들어있는 품목의 가격들의 총합을 구해보세요
		int sum = 0;
		for(Food f : list) {
			sum += f.getPirce();
		}
		System.out.println("총액 : "+sum);
		// 리스트에 들어있는 품목의 가격의 평균을 구해보세요
		System.out.println("평균 : "+sum/list.size());
		
		// map
		Map<String, Food> map = new HashMap<String, Food>();
		map.put("홍길동", new Drink());
		map.put("강백호", new Snack());
		map.put("짱구", new Drink("우유", 1500));
		
		// 편의점을 방문한 손님의 이름을 출력
		for(String s : map.keySet()) {
			System.out.println(s);
		}
		// 홍길동 - 물 강백호 - 초코파이 짱구 - 우유
		for(String s : map.keySet()) {
			System.out.println(s +" - " +map.get(s).getName());
		}
		// 편의점이 판매한 아이템의 총액
		int to = 0;
		for(String s : map.keySet()) {
			to += map.get(s).getPirce();
		}
		System.out.println("총액 : "+to);
		
		System.out.println("=================================");
		
		// 컬렉션 : list, Set, Map
		List<String> lists = new ArrayList<String>();
		Set<String> sets = map.keySet();
		Map<String, Integer> student = new HashMap<String, Integer>();
		student.put("홍길동", 80);
		student.put("김구", 100);
		student.put("유관순", 90);
		student.put("이순신", 70);
		student.put("강백호", 50);
		
		// 학생의 이름 출력
		for(String s : student.keySet()) {
			System.out.println(s);
		}
		// 학생 : 점수로 출력
		for(String s : student.keySet()) {
			System.out.println(s+" : "+student.get(s));
		}
		// 학생들의 평균
		sum = 0;
		for(String s : student.keySet()) {
			sum += student.get(s);
		}
		double avg = (double)sum/student.size();
		System.out.println("평균 : "+avg);
		
		Member m1 = new Member("홍길동", 80);
		Member m2 = new Member("김구", 100);
		Member m3 = new Member("유관순", 90);
		Member m4 = new Member("이순신", 70);
		Member m5 = new Member("강백호", 50);
		
		Map<String, Member> mem = new HashMap<String, Member>();
		
		mem.put("홍길동", m1);
		mem.put("김구", m2);
		mem.put("유관순", m3);
		mem.put("이순신", m4);
		mem.put("강백호", m5);
		
		System.out.println("=================================");
		// key 출력해보기.
		for(String s : mem.keySet()) {
			System.out.println(s);
		}
		System.out.println("=================================");
		// key : point 로 출력해보기
		for(String s : mem.keySet()) {
			System.out.println(s+" : "+mem.get(s).point);
		}
		System.out.println("=================================");
		
		// point의 평균 출력해보기
		sum = 0;
		avg = 0;
		for(String s : mem.keySet()) {
			sum += mem.get(s).point;
		}
		avg = (double)sum/mem.size();
		System.out.println("평균 : "+avg);
		
		
		List<Member> first = new ArrayList<Member>();
		first.add(m1);	first.add(m2);	first.add(m3);
		List<Member> second = new ArrayList<Member>();
		second.add(m4);	second.add(m5);
		
		Map<String, List<Member>> stus = new HashMap<String, List<Member>>();
		stus.put("1학년", first);
		stus.put("2학년", second);
		
		
		// stus - key 출력
		for(String s : stus.keySet()) { // stus 맵의 key값 가져오기
			System.out.println(s); // stus 맵의 key값 출력 1학년, 2학년
		}
		// stus의 key : value
		for(String s : stus.keySet()) { // stus 맵의 key값 가져오기
			System.out.println(s+" : "+stus.get(s)); // key 값의 value 인 List<Member>의 주소값 가져옴
		}
		// stus key : 이름 출력
		for(String s : stus.keySet()) { // stus 맵의 key값 가져오기
			// 주소값 가져오면 그 주소의 i번째 + @ 출력가능
			for(int i = 0; i < stus.get(s).size(); i++) { // 주소의 크기만큼
			System.out.println(s+" : "+stus.get(s).get(i).name); // 주소의 i번째의 필드 가져오기
			}
		}
		// 1학년 친구들의 총점, 2학년 친구들의 총점
		for(String s : stus.keySet()) { // stus 맵의 key값 가져오기
			int t1 = 0;
			double av1 = 0;
			// 주소값 가져오면 그 주소의 i번째 + @ 출력가능
			for(int i = 0; i < stus.get(s).size(); i++) { // 주소의 크기만큼
			t1 += stus.get(s).get(i).point;
			}
			System.out.println(s+"총점 : "+t1);
			av1 = (double)t1/stus.get(s).size();
			System.out.println(s+"평균 : "+av1);
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
	}
}
