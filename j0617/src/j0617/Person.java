package j0617;

public class Person {
	// protected : 같은 패키지 내 + 다른패키지 자손까지 접근가능
	protected String name;
	protected int age;
	
	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.printf("이름 : %s, 나이 : %d살\n",name,age);
	}
	
	// object 클래스의 메서드 오버라이딩
	// 메서드 오버라이딩은 부모와 선언부가 정확히 일치해야함
	public String toString() {
		return "이름 : "+name+ ", 나이 : "+age+"살";
	}
	// 메서드 오버라이딩
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			if(this.name == ((Person)obj).name) {
				return true;
			}
		}
		return false;
	}
	
	
}
