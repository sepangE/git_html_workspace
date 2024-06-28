package j0628;
import java.util.*;
public class MemControl {
	Scanner scan = new Scanner(System.in);

	public Map<String, Object> memInput(List<Member> list, int count) {
		Map<String, Object> map = new HashMap<String, Object>();
		while(true) {
			System.out.println("[회원정보 입력]");
			System.out.println((count+1)+"번 회원 이름을 입력 (종료 : 0)");
			String name = scan.next();
			if(name.equals("0")) break;
			System.out.println("아이디를 입력해주세요");
			String id = scan.next();
			System.out.println("비밀번호를 입력해주세요");
			String pw = scan.next();
			list.add(new Member(name,id,pw));
			count++;
		}
			map.put("cnt", count); // int 타입 
			map.put("list", list); // List 타입
			map.put("currentPageNo", 10);
			map.put("adminInfo", "hiddenmessage");
			return map;
	}// mimInput

	public void memPrint(List<Member> list) {
		System.out.println("[회원 정보]");
		System.out.println("이름\t아이디\t비밀번호\t");
		for(Member m : list) {
			System.out.printf("%s\t%s\t%s\n",m.getName(),m.getId(),m.getPw());
		}
	}

}
