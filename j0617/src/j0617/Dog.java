package j0617;
//		 extends Object
class Pet{
	String name;
	int age;
	// object객체로부터 상속받아 오버라이딩 사용하는 메서드
	public String toString() {
		return "이름 : " + name +", 나이 : " +age;
	}
}
// 상속 + 인터페이스 가능
public class Dog extends Pet implements Dongmul, Hunter{
//public class Dog implements Dongmul, Hunter{
// 인터페이스는 다중상속이 가능함
	public void move() {
		System.out.println("강아지가 걷습니다");
	}
	public void hunting() {
		System.out.println("강아지가 공을 사냥합니다");
	}
	public void eat() {
		System.out.println("강아지가 간식을 먹습니다.");
	}
}
class Cat implements Dongmul, Hunter{
	public void move() {
		System.out.println("고양이가 걷습니다");
	}
	public void hunting() {
		System.out.println("고양이가 쥐를 사냥합니다");
	}
	public void eat() {
		System.out.println("고양이가 우유를 먹습니다.");
	}
}
// abstract : 미완성의
abstract class Bird implements Dongmul, Hunter{
	// 인터페이스의 추상메서드를 완성하지 않을경우에는
	// 클래스를 abstract로 만들어줘야함. 
	public void hunting() {
		System.out.println("새가 지렁이를 사냥합니다");
	
	}
}