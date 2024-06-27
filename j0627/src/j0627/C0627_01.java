package j0627;
import java.util.*;
public class C0627_01 {
	public static void main(String[] args) {
		Map<String, String> words = new HashMap<String, String>();
		words.put("사과", "apple");
		words.put("가방", "bag");
		words.put("사진", "picture");
		words.put("개", "dog");
		words.put("책", "book");
		
		System.out.println(words.get("개"));
		System.out.println(words.get("사진기")); // null
		
		for(String key : words.keySet()) {
			System.out.print(key+" "); // key값
			System.out.println(words.get(key)); // value
		}
		
		System.out.println(words.containsKey("책")); // true
		System.out.println(words.containsValue("apple")); // true
		
		System.out.println(words.get("사진" ));// picture
		words.replace("사진", "photo");
		System.out.println(words.get("사진"));// photo
		
		// 사진을 영어로 하면?
		// 맞춘건 제외, 다 맞출때까지 무한반복
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int n = words.size();
		List<String> cor = new ArrayList<String>(); // 맞춘 키 저장용
		while(true) {
			Iterator<String> it = words.keySet().iterator();
			
			while(it.hasNext()) {
				String k = it.next();
				System.out.println(k+" 을(를) 영어로 하면?");
				String in = scan.next();
				if(in.equalsIgnoreCase(words.get(k))) {
					System.out.println("정답");
					cor.add(k);
					cnt++;
				}
				else {
					System.out.println("오답");
					System.out.println("힌트 : 단어의 총 길이"+words.get(k).length());
					System.out.println("힌트 : 단어의 시작 알파벳"+words.get(k).charAt(0));
				}
			} // while key
			// === map itr끝 ====
			for(String i : cor) {
				words.remove(i);
			}
			if(cnt == n) {
				System.out.println("모두 정답");
				break;// 정답을 모두 맞췄을때 종료
			}
		}// while true
		
		System.out.println("프로그램 종료 총 정답개수 : " + cnt);
		
		
		
		
		
		
		
		
	}
}
