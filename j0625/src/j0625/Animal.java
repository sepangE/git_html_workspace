package j0625;

public abstract class Animal {
	// 필드
	private String name;
	private int age;
	// 생성자
	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 메서드
	public abstract void cry();
	
	// toString
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

} // Animal

class Dog extends Animal{
	// 필드
	private String species;
	// 생성자
	Dog() {super();}
	Dog(String name, int age, String species) {
		super(name, age);
		this.species = species;
	}
	// 메서드
	public void cry() {
		System.out.println("멍멍");
	}
	// toString
	@Override
	public String toString() {
		return super.toString()+", 견종 : " + species;
	}
	// getter setter
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}// Dog

class Cat extends Animal{
	// 필드
	private String color;
	// 생성자
	Cat() {super();}
	Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	//메서드
	public void cry() {
		System.out.println("야옹");
	}
	// toString
	@Override
	public String toString() {
		return super.toString()+", 색 : " + color;
	}
	// getter setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}// Cat
