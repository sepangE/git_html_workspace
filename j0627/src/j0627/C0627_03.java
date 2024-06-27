package j0627;
import java.util.*;
public class C0627_03 {
	public static void main(String[] args) {
		Map<String, String> user = new HashMap<String, String>();
		user.put("aaa","1111");
		user.put("bbb","2222");
		user.put("ccc","3333");
		user.put("ddd","4444");
		user.put("admin","1234");
		
		/*scan.nextLine으로
		  aaa, 1234 입력을 받아서
		  아이디가 존재하지 않으면 [존재하지 않는 아이디입니다]
		  아이디가 존재하지만 비밀번호가 일치하지 않으면
		  [비밀번호가 일치하지 않습니다]
		  아이디와 비밀번호가 모두 일치하면 [로그인되었습니다] 로 출력해보기 */
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			Set<String> k = user.keySet();
			System.out.println("아이디, 비밀번호 입력 (구분 ,)");
			String iAp = scan.nextLine();
			String[] uLog = iAp.split(",");
			String id = uLog[0].trim();
			String pw = uLog[1].trim();
			
			if(!user.containsKey(id)) {
				System.out.println("[존재하지 않는 아이디입니다]");
				continue;
			}
			if(user.get(id).equals(pw)) {
				System.out.println("[로그인되었습니다]");
				break;
			}else {
				System.out.println("[비밀번호가 일치하지 않습니다]");
			}
		}
		
		
//		if(user.get(k).equals(uLog[0].trim())) { // 입력한 아이디가 일치하면
//			if(user.g)
//		}
		
		
		
	}
}
