package j0617;
// 부모클래스가 같은패키지 내에 있으면 import필요없음
// 패키지명.클래스명에서 같은패키지내라면 패키지명은 생략가능
public class Student extends Person{
	/*
	 자손들은 iv는 모두 private
	 학생의 정보가 있는 - Student 클래스
	 해당 클래스에 학년, 반, 학번, 성적을 나타내는 필드
	 grade  , group, stuNum, record
	 해당 클래스에 이름, 나이를 초기화하는 생성자
	 해당 클래스에 이름, 나이 정보를 출력하는 메소드
	 */
	private int grade;
	private int group;
	private int stuNo;
	private int record;
	
	Student (){}
	Student (String name, int age){
		super(name,age);
		//this.name = name;
		//this.age = age;
	} // 생성자
	
	public void printInfo() {
		System.out.printf("%d학년 %d반\n",grade,group);
	}
	
	public String toString() {
		return "이름 : "+name+", 나이 : "+age+"살, "+grade+"학년, "
				+group+"반";
	}
	
	
	// getter setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
