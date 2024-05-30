package j0527;

import java.util.Arrays;
import java.util.Scanner;

public class C0527_10 {
	public static void main(String[] args) {
		
		int[] num; // int 타입의 배열을 선언
		num = new int[5]; // 5칸 배열 생성
		
		System.out.println(num); // 주소값 출력
		System.out.println(num[0]); // 디폴트값 출력
		
		// 1-45 까지 넣는 배열을 생성하고 숫자를 1-45까지 넣어보세요
		
		int[] num45;
		num45 = new int[45];
		for(int i=0;i<num45.length;i++) {
			num45[i] = i+1;
		}
		System.out.println(Arrays.toString(num45));
		
		// 3칸 정수 타입의 배열을 만들어서 
		// 입력한 숫자 3개를 배열에 넣어보세요
		
		Scanner scan = new Scanner(System.in);
		int[] num3 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println(i+"번째 배열에 넣을 숫자를 입력해주세요");
			num3[i] = scan.nextInt();
			
		}
		System.out.println(Arrays.toString(num3));
		
		//5칸 문자열 타입의 배열을 만들어서
		// 이름 5개 입력 받아서 배열에 순차적으로 넣어주기
		
		String[] name = new String[5];
		for(int i = 0; i<5;i++) {
			System.out.println(i+"번째 배열에 넣을 이름을 입력해주세요");
			name[i]= scan.next();
		}
		System.out.println(Arrays.toString(name));
		
		
		//name은 위에서 입력받은 5칸배열 사용하기
		int[] kor = {100,95,90,98,100};
		int[] eng = {80,90,100,70,56};
		int[] math = new int[5];//1~100 사이의 랜덤한 5개 숫자 넣기
		for(int i = 0; i< 5;i++) {
			math[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(math));
		int[]stu_no; // 1~5까지 넣은 배열 만들기
		stu_no = new int[5];
		for(int i = 0;i<5;i++) {
			stu_no[i] = i+1;
		}
		System.out.println(Arrays.toString(stu_no));
		
		// total, avg 배열 5칸짜리 생성해서
		// kor eng math값을 사용해서 배열에 값 채워주기
		
		int[] total = new int[5];
		double[] avg = new double[5];
		for(int i = 0;i<5;i++) {
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		System.out.println(Arrays.toString(total));
		System.out.println(Arrays.toString(avg));
	
		System.out.println("----------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		for(int i = 0;i<5;i++) {
			
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",stu_no[i], name[i],kor[i],eng[i],math[i],total[i],avg[i] );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
