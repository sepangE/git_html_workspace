package j0626;
import java.util.*;
public class C0626_05_substirng_indexof {
	public static void main(String[] args) {
		String str1 = "https://semiconductor.samsung.com/kr";
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";
		String test = "abcdefghijklmn";
		String lotto = "1조198756";
		
		// subString
		String r1 = lotto.substring(2); // 2번방부터 끝까지
		System.out.println(r1); // 198756
		String r2 = test.substring(3,6); // 3번방부터 6번방 앞까지
		System.out.println(r2); // def
		// indexof
		int r3 = lotto.indexOf("조"); // 조 위치 리턴
		System.out.println(r3);
		int r4 = str1.indexOf("t"); // 가장 먼저 나오는 t의 위치
		System.out.println(r4);
		
		
		// str2에서 dream-jsp까지 출력해보기
		
		int n1 = str2.indexOf("dram");
		int n2 = str2.indexOf("jsp");
		System.out.println(n1);
		System.out.println(n2);
		String r5 = str2.substring(n1,n2+3);
		System.out.println(r5);
		
		// str3에서 foundry/ 출력
		int n3 = str3.indexOf("foundr");
		int n4 = str3.indexOf("/p");
		System.out.println(n3);
		System.out.println(n4);
		String r6 = str3.substring(n3,n4+1);
		System.out.println(r6);
		
		// str1을 사용해서 str2의 /dream/ddr.jsp 가져오기
		int s = str1.length();
		System.out.println(s);
		int s1 = str1.lastIndexOf('r');
		System.out.println(s1);
		String s2 = str2.substring(s);
		String s3 = str2.substring(s1+1);
		System.out.println(s2);
		System.out.println(s3);
		
		// str1 을 사용해서 str3의 
		// foundry/process-technology.jsp 출력 
	
		String s5 = str3.substring(str1.length()+1);
		System.out.println(s5);
		
		String u1 = "https://gsds.kaist.ac.kr/";
		String u2 = "https://gsds.kaist.ac.kr/about";
		String u3 = "https://gsds.kaist.ac.kr/education";
		String u4 = "https://gsds.kaist.ac.kr/admission";
		String u5 = "https://gsds.kaist.ac.kr/people";
		String u6 = "https://gsds.kaist.ac.kr/news";
		// 리스트를 만들어 리스트에 
		//[about,education,admission,people,news] 만들기
		List<String> list = new ArrayList<String>();
		
		int k1 = u1.length();
		
		list.add(u2.substring(k1));
		list.add(u3.substring(k1));
		list.add(u4.substring(k1));
		list.add(u5.substring(k1));
		list.add(u6.substring(k1));
		System.out.println(list);
		
		Iterator us = list.iterator();
		while(us.hasNext()) {
			System.out.println(us.next());
		}
		System.out.println("================================================");
		String names = "홍길동 홍길순 홍길자 이순신 강감찬 유관순 김구 김유신";
		
		// 이름을 입력받아서 학생이름이 있으면 있음 없으면 없음이라고 출력
		Scanner scan = new Scanner(System.in);
//		System.out.println("이름 입력");
//		String iName = scan.next();
//		
//		if(names.contains(iName)) {
//			System.out.println("있음");
//		}else {
//			System.out.println("없음");
//		}
		
		List<String> strs = new ArrayList<String>();
		strs.add(str1);	strs.add(str2);	strs.add(str3);	strs.add(test);
		strs.add(lotto);strs.add(u1);strs.add(u2);strs.add(u3);	
		strs.add(u4);strs.add(u5);	strs.add(u6); strs.add(names);
		
		// url이면 url 아니면 아님을 출력
		
		for(int i = 0; i < strs.size(); i++) {
			if(strs.get(i).contains("https://")) {
				System.out.println("url");
			} else {
				System.out.println("url 아님");
			}
		}
		System.out.println("================================================");
		// list에 jsp로 끝나는게 있다면 그 주소 출력
		for(String aa : strs) {
			if(aa.endsWith(".jsp")) {
				System.out.println(aa);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
