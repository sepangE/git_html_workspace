package j0612;
public class Parent {
	public int x = 100;  // public
	int y1 = 10; // default
	private int y2 = 11; // private;
	protected int y3 = 1;
	// 아무것도 없으면 default - 같은 패키지내에서만 접근가능
	// public - 어디서나 접근 가능
	// private 현재 클래스 내에서만
	// protected 
}