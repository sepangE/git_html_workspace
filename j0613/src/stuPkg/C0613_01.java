package stuPkg;
import j0613.Parent;
public class C0613_01 {
	public static void main(String[] args) {
		
		ChildB c = new ChildB(1,2);
		
		c.n1 = 1111;// n1은 퍼블릭이기때문에 어느 클래스에서나 접근 가능
		// C0613_01 클래스는 상속관계가 아니기때문에 접근 불가능
		// c.n2 = 1234; 
		
		c.method(); // childB 클래스 메서드
		c.methodA(); // 부모클래스의 퍼블릭 메서드
		// c.methodB();
		// C0613_01 클래스는 상속관계가 아니기때문에 protected라도 접근불가
		
		Parent p = new Parent();
		p.n1 = 100; // 퍼블릭 필드
		p.methodA();// 퍼블릭 메서드
		// import 했지만 상속받지 않아서 퍼블릭한 필드, 메서드만 사용 가능
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
