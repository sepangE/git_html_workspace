package j0621;
import java.util.*;
public class C0621_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		String id;
		int age;
		String email;
		List<Member> mem = new ArrayList<Member>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("이름 입력");
			name = scan.next();
			System.out.println("아이디 입력");
			id = scan.next();
			System.out.println("나이 입력");
			age = scan.nextInt();
			System.out.println("이메일 입력");
			email = scan.next();
			
			mem.add(new Member(name,id,age,email));
		}
		System.out.println(mem);
//		[이름 : 짱구 아이디 : aa 나이 : 5 이메일 : aa@naver.com, 
//		 이름 : 철수 아이디 : bb 나이 : 20 이메일 : bb@naver.com, 
//		 이름 : 훈이 아이디 : cc 나이 : 17 이메일 : cc@naver.com, 
//		 이름 : 맹구 아이디 : dd 나이 : 22 이메일 : dd@naver.com, 
//		 이름 : 유리 아이디 : ee 나이 : 11 이메일 : ee@naver.com]

		for(Member m : mem) {
			System.out.println(m);
		}
//		 Member [이름 : 짱구 아이디 : aa 나이 : 5 이메일 : aa@naver.com] 
//		 Member [이름 : 철수 아이디 : bb 나이 : 20 이메일 : bb@naver.com] 
//		 Member [이름 : 훈이 아이디 : cc 나이 : 17 이메일 : cc@naver.com] 
//		 Member [이름 : 맹구 아이디 : dd 나이 : 22 이메일 : dd@naver.com] 
//		 Member [이름 : 유리 아이디 : ee 나이 : 11 이메일 : ee@naver.com]
		
		
		
		
	}
}
