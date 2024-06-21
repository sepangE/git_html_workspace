package j0621;
import java.util.*;
public class C0621_12 {
	public static void main(String[] args) {
		
		Map<String, Object> m1 = new HashMap<String, Object>();
		m1.put("name", "홍길동");
		m1.put("age", 22);
		m1.put("isMale", true);
		m1.put("pet", new Dog("삐뽀",3));
		for(String k : m1.keySet()) {
			System.out.println(k+" : "+ m1.get(k));
		}
		Map m2 = new HashMap();
		m2.put("pw", 1234);
		m2.put(1111, 1234);
		m2.put(true, "mmmm");
		
		// key : 아이디 value : 비밀번호 를 담는 
		// 해시맵을 만들어서, 5명의 값을 map에 넣어주세요
		
		
		Map<String, String> idPass = new HashMap<String, String>();
		
		idPass.put("aaa","1111");		idPass.put("bbb","2222");
		idPass.put("ccc","3333");		idPass.put("ddd","4444");
		idPass.put("eee","5555");
//		for(String s : idPass.keySet()) {
//			System.out.println(s + " : " + idPass.get(s));
//		}
//		aaa : 1111	ccc : 3333	bbb : 2222 eee : 5555	ddd : 4444
		Scanner scan = new Scanner(System.in);
		String id;
		String pw;
		loop : while(true) {
			// 아이디와 비밀번호를 입력받아서
			// 아이디가 일치하지 않으면 없는아이디 입니다 > 다시 아이디 입력
			// 아이디가 일치하면,
			// 비밀번호를 검사해서 비밀번호가 일치하면 while문 종료
			// 비밀번호가 일치하지 않으면 비밀번호가 일치하지 않습니다 출력 후
			// 다시 아이디, 비밀번호를 입력받는다
			System.out.println("아이디 입력");
			id = scan.next();
			if(!idPass.containsKey(id)) {
				System.out.println("아이디가 일치하지 않습니다");
				System.out.println("다시 입력해주세요");
			} 
			else {
				System.out.println("비밀번호 입력");
				pw = scan.next();
				if(!idPass.get(id).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다");
					System.out.println("다시 입력해주세요");
				}
				else {
					System.out.println("로그인되었습니다.");
					break loop;
				}
			} // id-else
	
		}// while
		
		
		
		
		
		
		
		
		
		
		
	}
}
