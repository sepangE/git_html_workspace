package j0627;
import java.util.*;
public class C0627_02 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String, String> words = inputData();
		quiz(words);
		
	} // main
	
	static Map<String, String> inputData() {
		// 한글/영어로 입력을 받아서 map을 채우세요
//		사과/apple	가방/bag 사진/picture	개/dog	책/book
		Map<String, String> map = new HashMap<String, String>();
		inputData(map);
		return map;
	}
	static void inputData(Map<String, String> m) {
		// 한글/영어로 입력을 받아서 map을 채우세요
//		사과/apple	가방/bag 사진/picture	개/dog	책/book
		while(true) {
			
			System.out.println("한글/영어 입력 (구분 /, 종료. 0)");
			String input = scan.nextLine();
			if(input.equals("0")) break;
			String[] kAv = input.split("/");
			m.put(kAv[0].trim(), kAv[1].trim());
		}
		
	}
	
	
	static void quiz(Map<String, String> m) {
		int cnt = 0;
		int n = m.size();
		List<String> cor = new ArrayList<String>(); // 맞춘 키 저장용
		while(true) {
			Iterator<String> it = m.keySet().iterator();
			
			while(it.hasNext()) {
				String k = it.next();
				System.out.println(k+" 을(를) 영어로 하면?");
				String in = scan.next();
				if(in.equalsIgnoreCase(m.get(k))) {
					System.out.println("정답");
					cor.add(k);
					cnt++;
				}
				else {
					System.out.println("오답");
					System.out.println("힌트 : 단어의 총 길이"+m.get(k).length());
					System.out.println("힌트 : 단어의 시작 알파벳"+m.get(k).charAt(0));
				}
			} // while key
			// === map itr끝 ====
			for(String i : cor) {
				m.remove(i);
			}
			if(cnt == n) {
				System.out.println("모두 정답");
				break;// 정답을 모두 맞췄을때 종료
			}
		}// while true
		
		System.out.println("프로그램 종료 총 정답개수 : " + cnt);
	}
	
} // class
