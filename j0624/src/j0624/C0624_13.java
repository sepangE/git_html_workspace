package j0624;
import java.util.*;
public class C0624_13 {
	public static void main(String[] args) {
		// String 클래스는 객체를 생성하면 읽기만 할 뿐 변경할 수 없다
		// 즉, 매번 새롭게 생성함
		String str1 = "abc";
		str1 += "def";
		// str1에 추가적으로 def가 더해졌다고 생각되겠지만
		// abcdef를 새롭게 생성하고 그 주소를 다시 str1에 할당해주는것
		
		// String과 다르게 StringBuffer는 그 값을 변경할 수 있다
		// StringBuffer는 내부에 buffer의 독립적인 공간을 가짐
		StringBuffer str2 = new StringBuffer("java");
		System.out.println(str2);
		str2.append(" 수업");
		System.out.println(str2);
		
		// capacity()는 현재 버퍼의 크기를 반환함
		// 기본적으로 여유버퍼크기 16을 할당해줌
		StringBuffer str3 = new StringBuffer();
		StringBuffer str4 = new StringBuffer("java");
		System.out.println(str3.capacity());  // 16
		System.out.println(str4.capacity());  // 20
		System.out.println(str3.length());	  // 0
		System.out.println(str4.length());    // 4 
		
		StringBuffer str5 = new StringBuffer("java oracle");
		System.out.println(str5);
		System.out.println(str5.delete(4, 8)); // 4번째부터 8번전까지
		// javacle
		System.out.println(str5.deleteCharAt(1)); // jvacle
		
		
		StringBuffer str6 = new StringBuffer("java 수업!!");
		System.out.println(str6);
		System.out.println(str6.insert(4, "Script"));
		// javaScript 수업!!    4번인덱스에 글자를 넣어라
		System.out.println("==============================================================");
		
		int no = 0;
		for(int i = 0; i < 10; i++) {
			no += i;
		}
		System.out.println(no); // 45
		// 2. String 객체 반복 - 반복 횟수만큼 메모리를 사용한다
		String s = "aaa";
		
		for(int i = 0; i < 10; i++) {
			s += i;
		}
		System.out.println(s); // aaa0123456789
		
		// 3. StringBuffer 객체 반복 - 1개 메모리공간 사용
		StringBuffer sb = new StringBuffer("aaa");
		for(int i = 0; i < 10; i++) {
			sb.append(i);
		}
		System.out.println(sb); // aaa0123456789
		
		// 4. StringBuffer 비교 - equals() 정의되어있지않음
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1.equals(s2))System.out.println("같음");
		else System.out.println("다름");
		
		
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb1.equals(sb2))System.out.println("같음");
		else System.out.println("다름");
		// 같은지 비교하려면 String으로 바꿔서 equals로 비교
		
		StringBuffer sbstr = new StringBuffer();
		// Java 를 sbstr에 넣어주세요
		// Program Study 를 넣어주세요  
		// Java Program Study
		System.out.println(sbstr);   
		sbstr.append("Java");
		sbstr.append(" Program Study");
		System.out.println(sbstr);
		sbstr.insert(4, "2");
		System.out.println(sbstr);
		// 5~13
		sbstr.delete(5, 13);
		System.out.println(sbstr);
		sbstr.insert(5, " Book");
		System.out.println(sbstr);
		String sbstrs = sbstr.toString();
		System.out.println(sbstrs.length());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
