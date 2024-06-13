package j0613;

public class Cellphone {
	//iv
	String model;
	String color;
	Cellphone(){
		// model = "sky"; color = "black";
		this("sky","black"); // 자신의 생성자를 호출
	}
	Cellphone(String model, String color){
		this.model = model;
		this.color = color;
	}
	void printAttr() {
		System.out.println("폰 모델 : "+model+", 색 : "+color);
	}
	void powerOn() {
		System.out.println("폰 전원을 켭니다");
	}
	void powerOff() {
		System.out.println("폰 전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendMessage(String message) {
		System.out.println("나 : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("상대방 : "+message);
	}
	
	
	
}
