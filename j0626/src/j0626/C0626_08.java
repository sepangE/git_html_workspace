package j0626;
import java.util.*;
public class C0626_08 {
	public static void main(String[] args) {
		// 사전 만들기
		Map<String, String> dic = new HashMap<String, String>();
		dic.put("고양이", "cat");		dic.put("강아지", "dog");
		dic.put("집", "house");		dic.put("사과", "apple");
		dic.put("자동차", "car");		dic.put("전화기", "phone");
		dic.put("물", "water");		dic.put("공기", "air");
		dic.put("어린이", "kid");		dic.put("책", "book");
		
		// 고양이를 영어로 입력해주세요 > 정답입니다 오답입니다 출력
		// 총 정답 갯수 출력
		Scanner scan = new Scanner(System.in);
		loop : while(true) {
			int count = 0;
			Set<String> kor = dic.keySet();
			Iterator<String> key = kor.iterator();
			while(key.hasNext()) {
				String k = key.next();
				String v = dic.get(k);
				System.out.println(k+"이(가) 영어로 뭘까요");
				String input = scan.next();
				if(v.equalsIgnoreCase(input)) {
					System.out.println("정답!");
					count++;
				}
				else {
					System.out.println("땡 정답은 "+v+"임ㅋㅋ");
				}
			}// while hasNext
			System.out.println("정답갯수 : "+count);
			break;
		}//while true
		
		
		
		
	}
}
