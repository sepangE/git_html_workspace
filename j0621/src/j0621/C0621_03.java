package j0621;
import java.util.*;
public class C0621_03 {
	public static void main(String[] args) {
//		1. 5명의 아이디를 입력받아 리스트에 저장하고 (아이디 길이 다 다르게)
//		2. 가장 길이가 긴 아이디를 출력하세요
		Scanner scan = new Scanner(System.in);
		List<String> userId = new ArrayList<String>();
		int max = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1)+"번째 아이디 입력");
			String id = scan.next();
			userId.add(id);
			if(max<userId.get(i).length()) {
				max = userId.get(i).length();
			}
		}
		System.out.println(userId);
		
		for(int i = 0; i < userId.size(); i++) {
				if(max == userId.get(i).length()) {
				System.out.println(userId.get(i));
			}
		}		
		
		
	}
}
