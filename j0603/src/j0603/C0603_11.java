package j0603;

import java.util.Scanner;

public class C0603_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person[] p = new Person[5];
		// 1. person의 객체 배열을 만들어서 (5명)
		// 2. 이름과 나이를 각각 입력받아서
		// 3. 출력해보기 (print()함수사용)
		// 4. 어린이, 청소년, 성인 인지 출력해보기
//		p[0].name = "홍길동";
//		p[0].age = 23;
//		int age1= p[0].nextAge();
//		int age10 = p[0].ageNyr(10);
//		String str = p[0].gen();
//		System.out.println("1년 후 나이 : "+age1);
//		System.out.println("10년 후 나이 : "+age10);
//		System.out.println("현재 : "+str);
//		p[0].print();
		
		for(int i = 0; i< p.length; i++) {
			p[i] = new Person();
			System.out.println("이름을 입력해주세요");
			p[i].name = scan.next();
			System.out.println("나이를 입력해주세요");
			p[i].age = scan.nextInt();
		}
		
		for(int i = 0; i< p.length; i++) {
			p[i].print();
		}
		for(int i = 0; i< p.length; i++) {
			System.out.printf("%s 님은 %s\n",p[i].name,p[i].gen());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
