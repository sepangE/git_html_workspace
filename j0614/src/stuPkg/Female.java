package stuPkg;
// 다른 패키지 클래스를 사용할때 import사용
// import 패키지명.클래스명; (전부 받으려면 패키지명.*)
import j0614.Person; 
// 다른패키지위치에 상속받는 Femal클래스
//얘는 다른 패키지라 Person 클래스의 public이나 protected만 접근가능
public class Female extends Person{
	public void info() {
		String str = "";
		System.out.println("여자입니다.");
		//str = this.name+", "+this.height+", "+this.weight+", "+this.age;
		// 상속을 받았기때문에 부모의 변수를 가질 수 있으나 
		// 패키지의 위치가 다르기때문에 private, default 관련은 접근 불가
	//	str = this.name+", "+this.height;
		// 하지만 다른 패키지 이지만 상속관계에 있기때문에 protected는 접근가능
		this.name = "수지";
		this.height = 170;
		
		
		
		printName();		// public
		printHeight();		// protected
		// default메서드 printWeight() 사용불가
		// private메서드 printAge()는 사용할 수 없음
	}
}
