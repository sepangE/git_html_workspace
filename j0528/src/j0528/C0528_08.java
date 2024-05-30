package j0528;

import java.util.Scanner;

public class C0528_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		// 5명의 학생, 이름, 국어,영어,수학점수를 입력받아
		// 성적입력, 성적출력
		// ++ 학생이름으로 검색을 하고 해당학생의 성적만 출력해주는 5번 i번째
		// 가능하다면 3번도 해보세요
		// 3번 : 수정할 학생이름 입력받기 > 수정하고싶은 과목명 입력받기 i번째
		
		// 변수선언
		String[] name = new String[5]; // 이름
		int[] no = new int[5]; // 숫자
		int[] kor = new int[5]; // 국어
		int[] eng = new int[5]; // 영어
		int[] math = new int[5]; // 수학
		int[] total = new int[5]; // 총합
		double[] avg = new double[5]; //평균
		int count = 0; // 
		String sname;
		String str;
		int sno = 0; // 수정할 학생이 몇번째 있는지 저장할 변수
		while(true) {
			System.out.println(" [ 성적처리 프로그램 ] ");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 성적 수정 ");
			System.out.println(" 4. 등수 처리 ");
			System.out.println(" 5. 학생 성적 검색 ");
			System.out.println(" 0. 프로그램 종료 ");
			System.out.println(" -------------------- ");
			System.out.println(" 원하는 번호를 입력하세요 ");
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					System.out.println("성적입력을 선택하셨습니다.");
					System.out.println("이름을 입력해주세요");
					name[count] = scan.next();
					System.out.println("국어점수를 입력해주세요");
					kor[count] = scan.nextInt();
					System.out.println("영어점수를 입력해주세요");
					eng[count] = scan.nextInt();
					System.out.println("수학점수를 입력해주세요");
					math[count] = scan.nextInt();
					no[count] = count+1;
					total[count] = kor[count]+eng[count]+math[count];
					avg[count] = total[count]/3.0;
					count++;
					break;
				case 2:
					System.out.println("성적 출력을 선택하셨습니다.");
					System.out.println("----------------------------------------------------");
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
					System.out.println("----------------------------------------------------");
					for(int i = 0; i<5;i++) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f",no[i],name[i],kor[i],eng[i],math[i],total[i],avg[i]);
					}
					break;
				case 3 :
					System.out.println("성적 수정을 선택하셨습니다.");
					System.out.println("수정할 학생의 이름을 입력해주세요");
					break;
				case 4 :
					break;
				case 5 : 
					sno=-1;
					System.out.println("성적 검색을 선택하셨습니다.");
					System.out.println("검색할 학생의 이름을 입력해주세요");
					sname = scan.next();
					for(int i = 0; i<name.length;i++) {
						if(name[i].equals(sname)) {
							sno = i;
						break;
						}//if
					}//for
					if(sno == -1) {
					System.out.println("잘못입력하셨습니다.");	//if 없을때
					}else{
						System.out.println("----------------------------------------------------");
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
						System.out.println("----------------------------------------------------");
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",no[sno],name[sno],kor[sno],eng[sno],math[sno],total[sno],avg[sno]);
					
					}
			}//switch

			


		} //while


	} // main

}//class
