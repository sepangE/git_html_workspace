package j0625;

public abstract class Unit {
	int x, y;
	String name;
	int hitPoint; // 체력
	final int MAX_HP; // 최대채력
	// 생성자
	Unit(int hp){ 		// 파이널 붙은 친구들은 원래라면 생성과 동시에 초기화 해야함
		MAX_HP = hp;	// 근데 클래스에서 생성자에서는 초기화 가능하게 해줌
	}
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정지함");
	}
}
// 추상클래스					상속   추상클래스
abstract class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
	// 추상메서드 move를 구현하지 않아 추상클래스로 선언함
} // GroundUnit
// GroundUnit을 상속받고
class Tank extends GroundUnit implements Repariable{
	
	Tank(){
		super(150); // 객체 선언 시 체력을 150으로만들어줌
		hitPoint = MAX_HP;	name = "tank";
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
} // Tank

class Marine extends GroundUnit{
	Marine(){
		super(60); hitPoint = MAX_HP; name = "marine";
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
} // Marine
class Scv extends GroundUnit implements Repariable{
	Scv(){
		super(40); hitPoint = MAX_HP; name = "scv";
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
	void repair(Repariable g) {
		if(g instanceof Unit) {
			Unit u = (Unit)g;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}//while
		}//if
	} // repair
} // Scv
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
}// AirUnit
class DropShip extends AirUnit implements Repariable{
	DropShip(){
		super(120); hitPoint = MAX_HP; name = "dropship";
	}
	void move(int x, int y) {
		System.out.printf("%s : [x:%d, y:%d] 좌표로 이동!\n",
				name,x,y);
	}
}