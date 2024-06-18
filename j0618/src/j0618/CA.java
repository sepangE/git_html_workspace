package j0618;
// A인터페이스를 구현하는 클래스
public class CA implements A{
	public void methodA() {
		System.out.println("A구현");
	}
}
// 인터페이스 B를 구현하는 클래스CB
abstract class CB implements B {
	// 인터페이스 B에 있는 메서드를 구현하지 않는다면
	// 추상클래스로 만들어줘야함
	// 추상클래스는 객체생성 불가
}

// 인터페이스 C를 구현하는 클래스CC
class CC implements C {
	// A, B를 상속받은 C
	// C인터페이스 메서드만 구현하면 안됨.
	// 완성하려면 A, B 인터페이스도 구현해야함
	public void methodA() {
		System.out.println("A구현");
	}
	public void methodB() {
		System.out.println("B구현");
	}
	public void methodC() {
		System.out.println("C구현");
	}
}