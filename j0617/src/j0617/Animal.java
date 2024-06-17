package j0617;
public  class Animal {
	String name;
	int age;
	
//	abstract public void move(); // 선언부만 있는 메서드
	
	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	public void eat() {
		System.out.println("동물이 음식을 먹습니다");
	}
	public String toString() {
		return "이름 : "+name+"나이 : "+age;
	}
	
	
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}
	public void readBook() { // 오버라이딩 - 부모에 있는 메서드와 선언부가 같음
		System.out.println("사람이 책을 읽습니다");
	}
	public void readBook(String title) { // 오버로딩 (매개변수가 달라야함)
		System.out.println("사람이 " +title +"을 읽습니다");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	public void flying() {
		System.out.println("독수리가 날고 있습니다");
	}
}
abstract class Bear extends Animal{
	// 1. 자식클래스를 추상클래스로 만들거나
	// public abstract void move();
	// 선언부만 있는 메서드를 완성시키지 않아도 된다
}
class Rabbit extends Animal {
	// 2. 자손은 무조건 추상메서드를 완성시켜야 한다
	public void move() {
		// 메서드의 몸통부분{}을 만들어줘야함
		System.out.println("토끼가 깡총");
	}
}