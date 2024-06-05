package j0605;

import java.util.Scanner;

public class C0605_12 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int kor=0,eng=0,math=0,count = 0;
		String name="";
		Stu[] students = new Stu[3];
		// 학생 3명을 담는 배열을 생성
		// 각각 정보를 입력받아 객체 생성
		while(true) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("번호를 선택해주세요 0.종료");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : 
				count = stuInput(count,students,name,kor,eng,math);
				break;
			case 2 :
				stuPrint(count,students);
				break;
			case 0 :
				break;
			}//switch
		}//while
		// printAttr 메서드를 통해 3명의 정보출력
		// 출력은 main에서
		
		// 입력은 stuInput()이라는 메서드 생성해서
	
}//main
	static int stuInput(int count,Stu[] arr,String name,int kor,int eng,int math) {
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println((i+1)+"번째 학생 이름 0.종료");
			name = scan.next();
			if(name.equals("0"))break;
			System.out.println("국어 점수");
			kor = scan.nextInt();
			System.out.println("영어 점수");
			eng = scan.nextInt();
			System.out.println("수학 점수");
			math = scan.nextInt();
			arr[i] = new Stu((i+1),name,kor,eng,math);
			count++;
		}
		return count;
	}//input
	static void stuPrint(int count, Stu[]students) {
		for(int i = 0; i< count; i++) {
			students[i].printAttr();
		}
	}
	
}
