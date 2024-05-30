package j0522;

import java.util.Scanner;

public class C0522_01 {

	public static void main(String[] args) {
		
		//입력과 출력
		System.out.println("줄바꿈이 있는 출력"+"문자열을 이어줄 수 있음");
		System.out.print("줄바꿈이 없는 출력"+"줄바꿈을 하고싶으면 \n");
		System.out.printf("문자열 : %s, 정수 : %d, 실수 : %.2f \n", "abcd", 5, 3.1234);
		// 변수를 넣어서 출력 가능
		int age = 22;
		String name = "홍길동";
		// println은 문장과 문장 사이에 +
		System.out.println("제 이름은 "+name+"이고, 나이는 "+ age +"살 입니다.");
		// printf 는 문장 안에 대입
		System.out.printf("제 이름은 %s이고 나이는 %d살 입니다\n",name,age);
		
		//입력
		Scanner scan = new Scanner(System.in);
		// import.java.util.Scanner; 없이는 사용 불가능
		
		// next(), nextLine() 문자열
		// next() - 공백이 입력되기 전 글자를 입력받는다
		// nextLine() - 엔터를 입력하기 전까지 글자 전체를 입력받는다.
		// nextInt() : 정수
		// nextDouble() : 실수
		
//		String str1, str2 ;
//		System.out.println("글자를 입력해주세요 (안녕 하세요)");
//		str1 = scan.nextLine();
//		System.out.println("글자를 입력해주세요 (안녕 하세요)");
//		str2 = scan.next();
//		System.out.printf("nextLine으로 입력받은 문장 : %s \n",str1);
//		System.out.printf("next로 입력받은 문장 : %s \n",str2);
		
		int n;
		System.out.println("숫자를 입력해주세요 (정수)");
		n = scan.nextInt();
		System.out.println("입력하신 정수는 : " + n);
		double n2;
		System.out.println("숫자를 입력해 주세요 (실수)");
		n2 = scan.nextDouble();
		System.out.println("입력하신 실수는 : "+n2);
		
		// 주의할점
		int n3;
		String str3;
		System.out.println("숫자를 입력해주세요 ");
		n3 = scan.nextInt();
		scan.nextLine();
		System.out.println("문장을 입력해주세요 ");
		str3 = scan.nextLine();
		
		System.out.printf("숫자 : %d, 문장 : %s \n",n3,str3);
		/*
		nextLine(); 은 한줄단위로 입력을 받기 때문에 enter key 누른거까지 입력을 받음
		n3를 입력을 하고 enter를 누르면 버퍼에 숫자와 \n 까지 저장이 되었다가	
		nextInt가 숫자만 가져와서 버퍼에는 \n만 남아있는데
		nextline이 \n도 글자로 읽어와서 str3에 \n이 저장이 되면서 프로그램이 종료
		
		해결하기 위해서는 nextLine 대신 next를 쓰거나
		nextline을 (nextint와 nextline 사이에)한번 더 사용
		 */
		
		
		
		
		
		
		
	
	}	
}
