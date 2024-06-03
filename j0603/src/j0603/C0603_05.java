package j0603;

import java.util.Scanner;

public class C0603_05 {
	public static void main(String[] args) {
		
		
		// students 객체를 사용.
		// 학생 객체 배열을 만들어서 (5명) 학생의 성적을 입력받아 출력
		Scanner scan = new Scanner(System.in);
		Students[] st = new Students[5];
		for(int i = 0; i < st.length; i++) {
			st[i] = new Students();
			System.out.println((i+1)+"번째 학생의 이름을 입력해주세요");
			st[i].name = scan.next();
			System.out.println((i+1)+"번째 학생의 국어성적을 입력해주세요");
			st[i].kor = scan.nextInt();
			System.out.println((i+1)+"번째 학생의 영어성적을 입력해주세요");
			st[i].eng = scan.nextInt();
			System.out.println((i+1)+"번째 학생의 수학성적을 입력해주세요");
			st[i].math = scan.nextInt();
			st[i].total();
			st[i].avg();
			st[i].stuNo = i+1;
		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i<st.length; i++) {
			st[i].print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
