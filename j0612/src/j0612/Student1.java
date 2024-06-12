package j0612;
//	   class 자식클래스 extends 부모클래스
public class Student1 { // 학생은 컴퓨터를 가지고 있다 HAS - A 관계로 설명가능
	String name;
	String major;
	// student1클래스 안에 coumputer 객체를 포함하고 있음
	Computer com = new Computer();
	Student1(){}// 기본생성자
	Student1(String name, String major, Computer com){
		this.name = name;
		this.major = major;
		this.com = com;
	}
	public void writeCode() {
		if(com.isBroken == true) System.out.println("과제를 할 수 없습니다");
		else System.out.println(com.os+"로 과제를 수행합니다. ");
		
	}
}
