package j0613;

public class Tablet extends Product{
	// 기본생성자
	Tablet(){
		this("태블릿",100,10);
	}
	Tablet(String name, int price, int bonusPoint){
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
	
}
