package j0605;
public class Car {
	
	String company ="현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//2. 생성자
	Car(){
		// 기본생성자
	};
	Car(String model){
		this("소나타","은색",250); // this()는 첫 문장에서만 사용가능
		this.model = model;
		this.color = "은색";
		this.maxspeed = 250;
		
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	
	
}
