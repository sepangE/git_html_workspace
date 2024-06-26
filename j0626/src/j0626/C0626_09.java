package j0626;
import java.util.*;
public class C0626_09 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("강백호", 30);		map.put("홍길동", 80);
		map.put("고길동", 90);		map.put("서태웅", 20);
		map.put("유관순", 100);		map.put("김구", 90);
		
		// 1. 맵의 크기
		System.out.println(map.size());
		// 2. 맵 그냥
		System.out.println(map);
		// 3. 홍길동 점수
		System.out.println(map.get("홍길동"));
		// 5. 참가자 명단 출력해보기 < 단순해도 상관x [] 있어도 ㄱㅊ
		Set<String> name = map.keySet();
		System.out.println(name);
		// 4. iterator를 사용해서 강백호 : 30 ~ 김구 : 90 출력해보기
		Iterator<String> names = name.iterator();
		while(names.hasNext()) {
			String k = names.next();
			int v = map.get(k);
			System.out.println(k+" : "+map.get(k));
		}
		System.out.println("==========================================");
		// 번외 간단for문
		for(String k : name) {
			System.out.println(k+" : "+map.get(k));
		}
		System.out.println("==========================================");
		// 6. 전체 참가자의 총점, 평균 출력하기
		int total = 0;
		double avg = 0;
		for(String k : name) {
			total+=map.get(k);
		}
		avg = total/(double)map.size();
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n",avg);
		
		// names iterator는 위에서 끝까지 써서
		// 다시 쓰려면 초기화 해줘야함
		names = name.iterator(); 
		int total2 = 0;
		double avg2 = 0;
		while(names.hasNext()) {
			String k = names.next();
			total2 += map.get(k);
		}
		avg2 = total2/(double)map.size();
		System.out.printf("총점 : %d, 평균 : %.2f\n",total2,avg2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
