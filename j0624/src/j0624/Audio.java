package j0624;

public class Audio extends Product{
	private String speakerPower;
	private boolean power; // iv - default값이 있음 bool : false
	Audio(){
		this("브릿지오디오",300000,3000,"30W");
	}
	Audio(String name, int price, int point, String speakerPower){
		super(name, price, point);
		this.speakerPower = speakerPower;
	}
	// 메서드 오버라이딩
	public String toString() { // 리턴타입이 String인 메서드
		return super.toString()+", "+speakerPower;
		// super는 부모객체를 뜻함
	}
	// 자식객체의 메서드
	void powerOn() { // void : 리턴타입이 없는 메서드 : return 생략가능
		power = true;
	}
	void powerOff() {
		power = false;
	}
	
	
	
}
