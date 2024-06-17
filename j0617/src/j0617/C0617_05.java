package j0617;



public class C0617_05 {
	public static void main(String[] args) {
	/* 추상메서드 : 선언부만 있고 구현부가(body)가 없는 메서드
	   추상클래스 : 추상메서드를 한개이상 가지고 있는 클래스.
	   추상클래스는 완성된 설계도가 아니기때문에 객체를 생성할 수 없다
	   추상클래스를 상속바는 자식클래스들은 반드시 추상메서드 구현부를 완성해야함
	   
	   사용목적 : 추상메서드가 포함된 클레스를 상속받는 자식클래스가 반드시
	   			메서드를 구현하도록 하기 위함
	   			일반 메서드 사용시 오버라이딩을 통해 구현할 수 도 있고 안할수 도 있음
	   			추상메서드경우는 반드시 구현해야함
	   			
	   abstract class 클래스명{
	   		abstract 반환타입 메서드명();
	   }
	   
	*/
		
		// 추상클래스는 객체를 생성할 수 없다.
		// Animal a = new Animal();
		// 자손들은 객체 생성 가능(완성된 설계도)
		Human hu = new Human();
		hu.readBook();
		Tiger ti = new Tiger();
		ti.hunting();
		// 다형성 : 자손으로 객체를 생성함
		Animal ea = new Eagle();
		ea.eat();
		ea.move();
		// 부모클래스에서는 move라는 메서드가 미완성이지만
		// 자손클래스에서 move를 완성시켰기때문에 사용할 수 있다.
		
		// aniList 객체가 아니라 배열
		// aniList 객체를 담을 수 있는 배열을 선언하고 생성함
		Animal[] aniList = new Animal[3];
		aniList[0] = new Human();
		aniList[1] = ti;
		aniList[2] = ea;
		
		for(int i = 0; i < aniList.length; i++) {
			aniList[i].move();
		}
		
		
		
		
	}
}
