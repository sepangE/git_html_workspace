package j0619;

public class C0619_03 {
	public static void main(String[] args) {
		
		Menu[] m = new Menu[3];
		m[0] = new Meat("냉삼",12000,160);
		m[1] = new Drink("코카콜라",3000,500);
		m[2] = new Drink("참이슬",8000,360);
		
		// 장사하기
		m[0].sell(3); // 3인분
		m[2].sell(2); // 1병
		m[0].sell(2); // 2인분
		m[1].sell(3); // 1병
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
