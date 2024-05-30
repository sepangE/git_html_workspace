package j0527;

import java.util.Scanner;

public class C0527_12 {
	public static void main(String[] args) {
//		학생은 총 10 명입니다.
//		
//		학생번호는 가능하다면 count변수를 사용해서 입력받을때마다 하나씩 증가해서
//		count배열에 넣어서 사용해보세요
//		모두 1번으로 통일해도 상관없음
//		
//		(++ 그리고 입력할때 n번째 학생의 정보를 입력해주세요
//		String[] name = new String[2];
//		name[0] = "A";
//		name[1] = "B"; )
		
		/*
		
		[학생 성적 프로그램 ]
		1. 성적입력 . 이름배열, 국어배열, 수학배열, 영어배열.
		2. 성적출력
		3. 종료
		-----------------------
		원하는 번호를 입력해주세요 :
		
		*/
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10]; // 이름배열
		int[] no = new int[10];// 번호배열
		int[] kor = new int[10];// 국어
		int[] eng = new int[10];// 영어
		int[] math = new int[10];// 수학
		int[] total = new int[10];// 총점
		double[] avg = new double[10];// 평균
		int count=0;
		loop : while(true) {
			System.out.println("[학생 성적 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 입력해주세요 : ");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:// 성적입력
				System.out.println("학생 성적 입력을 선택하셨습니다.");
				System.out.println((count+1)+"번 학생의 정보를 입력해주세요");
				System.out.println("이름을 입력해주세요");
				name[count] = scan.next();
				System.out.println("국어점수를 입력해주세요");
				kor[count] = scan.nextInt();
				System.out.println("영어점수를 입력해주세요");
				eng[count] = scan.nextInt();
				System.out.println("수학점수를 입력해주세요");
				math[count] = scan.nextInt();
				no[count] = (count+1);
				total[count] = kor[count]+eng[count]+math[count];
				avg[count] = total[count]/3.0;
				count++;
				break;
			case 2: // 성적출력
				System.out.println("----------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("----------------------------------------------------");
				for(int i = 0;i<10;i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",no[i], name[i],kor[i],eng[i],math[i],total[i],avg[i] );
				}
				break;
			case 0: System.out.println("프로그램을 종료합니다.");
				break;
			default : System.out.println("잘못입력하셨습니다.");
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
