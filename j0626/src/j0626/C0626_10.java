package j0626;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class C0626_10 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//입력
//		map.put("강백호", 30);		map.put("홍길동", 80);
//		map.put("고길동", 90);		map.put("서태웅", 20);
//		map.put("유관순", 100);		map.put("김구", 90);
//		
//		// 출력
//		
//		for(String key : map.keySet()) {
//			System.out.println(key+" : "+map.get(key));
//		}
		
		Map<String, Integer> map = 	stuInput();
		stuPrint(map);
		
	}// main
	static Map<String, Integer> stuInput(){
		Map<String, Integer> list = new HashMap<String, Integer>();
		stuInput(list);		
		return list;
	}
	static void stuInput(Map<String, Integer> map) {
		while(true) {
			String[] str;
			System.out.println("이름/점수를 입력해주세요 구분 / (0.종료)");
			String ns = scan.nextLine();
			
			if(ns.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
			str = ns.split("/");
			map.put(str[0].trim(), Integer.parseInt(str[1].trim()));
		}
	}
	static void stuPrint(Map<String, Integer> map) {
		for(String key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
	}
	
	
	
}// class
