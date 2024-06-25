package j0625;

public class Student extends Person{
	// 필드
	private String school;
	// 생성자
	Student(){super();}
	Student(String school) {
		super();
		this.school = school;
	}
	 Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	@Override
	public String toString() {
		return super.toString()+", 학교 : "+school;
	}
	
	// getter setter
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	 
	 
	 
}
