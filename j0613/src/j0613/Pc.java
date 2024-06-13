package j0613;

public class Pc extends Product{
	int cpu;
	int ram;
	//기본생성자
	Pc(){
		this("컴퓨터", 150, 15);
	}
	// 생성자
	Pc(String name, int price, int bonusPoint){
		this.productName = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
