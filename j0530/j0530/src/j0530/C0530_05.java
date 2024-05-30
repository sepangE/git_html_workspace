package j0530;

public class C0530_05 {
	public static void main(String[] args) {
		
		// indxeof, lastindexof, substring을 꼭 사용해서
		// name 에는 홍길동, age 에는 15를 넣어보세요
		// integer.parseint()
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
		String name = "";
		int age = 0;
		
		System.out.println(str.indexOf("홍")); //7
		
		
		System.out.println(str.indexOf("1")); //21
		
		name = str.substring(7,10);
		age = Integer.parseInt(str.substring(21,23));
		
		
		System.out.println(name);
		System.out.println(age);
		
		
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };
		
		String r = "";
		for(int i = 0; i< source.length(); i++) {
			r += morse[source.charAt(i) - 'A'];
			
		}
		System.out.println(source + "는 모스부호로 : ");
		System.out.println(r);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
