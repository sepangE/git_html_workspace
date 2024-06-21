package j0621;

public class Cat extends Animal{
	// 변수
	private String color;
	// 생성자
	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);
	}
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	public void cry() {
		System.out.println("야옹");
	}

	@Override
	public String toString() {
		return super.toString()+" 색 : "+color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
}
