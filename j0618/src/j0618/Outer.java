package j0618;
// 내부클래스(inner class)
public class Outer {
//	Inter i = new Inter(); // 객체생성 불가
	// 다형성. 객체생성 가능
	Inter inn = new InInter(); // 인터페이스의 객체생성
	
	// 인터페이스를 상속한 이너클래스를 생성
	class InInter implements Inter{
		public void methodIn() {
			System.out.println("인스턴스이너클래스");
		}//methodIn
	}// class -  InInter
	
	Inter inA = new Inter() {
		public void methodIn() {
			System.out.println("인스턴스이너클래스-익명");
		}
	};
	
	
	
	
	
	
	// iv
	int outA = 1;
	protected int outB = 2;
	int outC = 3;
	private int outD = 4;
	static int outE = 5;
	// cv > 객체의 공통적으로 사용되는 값, 객체생성없이 사용가능
	// 인스턴스 메서드
	void methodA() {
		System.out.println("외부클래스 메서드");
		inn.methodIn(); // 외부클래스 내 메서드에서 객체사용 가능
	}
	// 클래스메서드  > static 멤버변수만 사용할 수 있음
	static void methodB() {
		System.out.println("외부클래스 static 메서드");
	}
	void localMethod() {
		int localA = 10; // 지역변수
		// 지역이너클래스
		class Local{
			void methodA() {
				System.out.println("local 클래스의 메서드");
				System.out.println(outA);
				System.out.println(localA);
				outA = 100;
		//		localA = 3; // 지역 이너클래스는 자동으로 final임
			} // methodA
		} // local class
		Local lo = new Local();
		lo.methodA();
	}// localMethod
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static class InnerS{
		void methodS() {
			int cv = 10;
			System.out.println(cv);
			// outer크ㄹ래스의 클래스 멤버만(cv, 클래스메서드) 사용할 수 있다.
			//System.out.println(outA);
			System.out.println(outE);
		//  methodA();
			methodB();
		}
	}
	
	
	
	
	
	// 인스턴스 클래스
	class Inner{
		int inA;
		int outA = 500;
		int outB = 700;
		void methodA() {
			System.out.println("내부클래스 메서드");
			System.out.println(outA);
			System.out.println(outB);
			System.out.println(outC);
			System.out.println(outD);
		}
		void methodB() {
			int outA = 1212;
			int outB = 3434;
			System.out.println("내부클래스 메서드 B");
			System.out.println(outA);
			System.out.println(outB);
			System.out.println("==================");
			System.out.println(this.outA);
			System.out.println(this.outB);
			System.out.println("==================");
			System.out.println(Outer.this.outA);
			System.out.println(Outer.this.outB);
		}
	}
}
