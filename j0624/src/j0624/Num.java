package j0624;

public class Num {
	int x;
	double y;
	
	Num(int x){
		this.x = x;
	}
	// 생성자 오버로딩 : 매개변수가 다를때
	Num(double y){
		this.y = y;
	}
	public String toString() {
		return ""+x;
	}
	
	
}
