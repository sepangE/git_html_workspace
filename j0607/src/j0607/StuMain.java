package j0607;
import java.util.Scanner;
public class StuMain {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] stu = new Student[10];
		int count = 0;
		loop : while(true) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("0. 종료");
			System.out.println("-----------------------");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 :
			count = StuInput(stu, count);
			System.out.println(count+"명");
				break;
			case 2 :
				PrintStu(stu, count);
				break;
			case 0 :
				break loop;
			}
		}// while true

		// 출력부를 printStu()라는 메서드 만들어서 실행시키기
//		stuInput() 메서드를 만들어서.
//		3명의 학생 객체 배열을 만들어서.
//		Student[] st3 = new Student[3];
//		for(int i = 0; i < st3.length; i++) {
//			st3[i] = new Student();
//		}
////		학생 3명의 정보를 생성해 보세요
//		StuInput(st3);
////		출력은 main에서 해보세요
//		for(int i = 0; i<st3.length; i++) {
//			st3[i].printStu();
//		}

//		Student s1 = new Student();
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.sum();
//		s1.average();
//		s1.printStu();
//		
//		// 매개변수가 있는 생성자로 객체 만드는법
//		Student s2 = new Student("유관순",10,90,100);
//		s2.printStu();

	}//main
	static void PrintStu(Student[] st3, int count) {
		for(int i = 0; i<st3.length; i++) {
		st3[i].printStu();
		}
	}
	
	static int StuInput(Student[] st, int count){
		int kor, eng, math;
		String name;
		for(int i = 0; i < st.length; i++) {
			System.out.println("학생 이름을 입력해주세요 0. 이전화면");
			name = scan.next();
			if(name.equals("0")) break;
			System.out.println("국어 점수 입력");
			kor = scan.nextInt();
			System.out.println("영어 점수 입력");
			eng = scan.nextInt();
			System.out.println("수학 점수 입력");
			math = scan.nextInt();
			st[i] = new Student(name,kor,eng,math);
			count++;
		}
		return count;
	}
	
}//class
