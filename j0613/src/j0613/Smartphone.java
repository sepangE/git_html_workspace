package j0613;
// 상속
// 	   class 자식클래스 	extends 부모클래스
public class Smartphone extends Cellphone{
	int capacity; // 폰 용량
	// 생성자
	
	Smartphone(){super(); }// 조상의 생성자 호출하면 Cellphone(){} 호출
	// this, super 는 자기자신을 의미. super > 조상이 있을때 조상을 의미함
	Smartphone(String model, String color, int capacity){
		//this.model = model; this.color = color; 
		//super.model = model; super.color = color;
		super(model,color); // 조상의 생성자 Cellphone(String modell, String color){} 호출
		this.capacity = capacity;
	}
	// 메서드 오버라이딩
	// 부모클래스와 같은 선언부 가지고 있음
	// 선언부는 부모랑 같고 구현부는 자식의 특성에 맞게 고쳐서 사용할 수 있음
	void printAttr() {
		System.out.println("폰 모델 : "+model+", 색 : "+color+", 용량 : "+capacity);
	}
	void downloadApp(int appcapacity) {
		System.out.println(appcapacity+"Gb 어플을 다운받습니다..");
		this.capacity -= appcapacity;
		System.out.println("현재 폰 잔여 용량은 : "+this.capacity);
	}
	void deleteApp(int appcapacity) {
		System.out.println("어플을 삭제합니다..");
		this.capacity += appcapacity;
		System.out.println("현재 폰 잔여 용량은 : "+this.capacity);
	}
	
	
	
	
	
}
