package stuPkg;
// import 패키지명.클래스명 > 패키지명 생략하고 클래스 사용가능
// import 안쓰고도 가능 클래스에 extends j0613.Parent 하면 됨
// import안쓰면 Parent에 있는 변수, 메서드 슬대마다 j0613붙여야함
import j0613.Parent; // j0613 패키지 내 Parent클래스
import j0613.*; // j0613패키지 내 모든클래스
public class ChildB extends Parent{
	// parent를 상속받으려면 어떻게 해야할까
	
	ChildB(){super();} // public Parent(){}
	ChildB(int n1, int n2){
		// super(n1, n2);
		// (default) Parent(int n1, int n2)
		// default - 같은 패키지 내에서만 사용가능
		super(n1,n2,1,1);
		// protected Parent(int n1, int n2, int n3, int n4)
		// 같은패키지 or 다른 패키지지만 상속을 받는다면 사용가능
	}
	
	void method() {
		super.n1 = 100; // n1은 public 이기때문에 접근가능
		super.n2 = 200; // n2는 protected 이기때문에 접근가능
		super.methodA(); // method는 pubilc이기때문에 접근가능
		super.methodB(); // method는 protected이기때문에 접근가능
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
