package j0621;

public abstract class Animal {
	//변수
	private String name;
	private int age;
	// 생성자
	Animal(){}
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 추상메서드
	public abstract void cry();
	public void eat() {
		System.out.println("밥을 먹습니다");
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age+"살";
	}
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
