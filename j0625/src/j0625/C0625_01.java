package j0625;
import java.util.*;
public class C0625_01 {
	public static void main(String[] args) {
		
		Tank t = new Tank(); // 탱크1 객체 생성
		// Tank 객체를 생성하면 150hp 초기화
		System.out.println("탱크1 폭탄맞음");
		t.hitPoint -= 10;
		System.out.println("탱크1 폭탄 맞음");
		t.hitPoint -= 10;
		System.out.println("탱크1 총알 맞음");
		t.hitPoint -= 2;
		System.out.println("탱크 1 체력 : "+t.hitPoint);
		
		Scv s = new Scv();
		Marine m = new Marine();
		// Tank는 Repariable를 구현함
		s.repair(t);
		System.out.println("탱크 1 체력 : "+t.hitPoint);
		// s.repair(m); > marine은 repariable를 구현하지 않음
		// AirUnit의 자손
		DropShip ds = new DropShip();
		System.out.println("드랍쉽1 총알 맞음");
		ds.hitPoint -= 20;
		System.out.println("드랍쉽 체력 : "+ds.hitPoint);
		s.repair(ds);
		System.out.println("드랍쉽 체력 : "+ds.hitPoint);
		
		// 인터페이스는 전혀 관련이 없는 탱크, 드랍쉽을 묶어서
		// scv로 수리가 가능하게 만들어 주었다
		
		// unit : 할아버지
		// GroundUnit, AirUnit : 부모
		// Marine, Tank, DropShip, scv : 자손
		Unit[] group = new Unit[5]; // 부모클래스 객체선언
		// 다형성
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();
		group[3] = new Tank();
		group[4] = new Marine();
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
		System.out.println("======================================");
		List<Unit> u = new ArrayList<Unit>();
		u.add(new Marine());
		u.add(new Tank());
		u.add(new DropShip());
		u.add(new Scv());
		
		for(int i = 0; i < u.size(); i++) {
			u.get(i).move(100, 200);
		}
		
		
		
		
	}
}
