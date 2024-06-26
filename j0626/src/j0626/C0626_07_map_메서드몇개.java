package j0626;
import java.util.*;
public class C0626_07_map_메서드몇개 {
	public static void main(String[] args) {
		/*
		zizMap 만들기
		서울 02
		인천 032
		대전 042
		대구 053
		부산 051
		광주 062
		울산 052
		제주 064
		*/
		
		Map<String, String> zipMap = new HashMap<String, String>();
		zipMap.put("서울", "02");
		zipMap.put("인천", "032");
		zipMap.put("대전", "042");
		zipMap.put("대구", "053");
		zipMap.put("부산", "051");
		zipMap.put("광주", "062");
		zipMap.put("울산", "052");
		zipMap.put("제주", "064");
		
		System.out.println(zipMap);
		//{울산=052, 대전=042, 서울=02, 부산=051, 제주=064, 대구=053, 인천=032, 광주=062}
		
		// entry 갯수
		int size = zipMap.size();
		System.out.println(size); // 8
		
		// 부산의 zip코드 출력
		String busan = zipMap.get("부산");
		System.out.println("부산의 지역번호 : "+busan);
		//key들로 set 만들기
		Set<String> keySet = zipMap.keySet();
		//key를 요소로 가지는 set 생성
		// set은 중복없고, 순서없다
		System.out.println(keySet);
		
		Iterator<String> keyItr = keySet.iterator();
		while(keyItr.hasNext()) {
			String k = keyItr.next();
			String v = zipMap.get(k);
			System.out.println("키 : "+k+", 값 : "+v);
		}
		// 부산 삭제하기
		//zipMap.remove("부산");
		System.out.println(zipMap);
		
		//while true로 지역이름 입력하면 지역번호 알려주는 프로그램 만들기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("지역이름 검색하면 지역번호 알려줌(종료 0)");
			String a = scan.next();
			if(a.equals("0")) break;
			if(zipMap.containsKey(a)) {
				System.out.println(a+"의 지역번호 : "+zipMap.get(a));
			}
			else System.out.println("아 거긴 모름 ㅈㅅ ㅎㅎ;;");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
