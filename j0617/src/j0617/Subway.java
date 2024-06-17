package j0617;

public class Subway extends Trans{
//	* Subway- iv:  number, passengerCount, money
//    - method : take 승객을 태움
//                   showInfo
//                    : 지하철 00번 승객은 00명이고
//                     지하철수입은 00원입니다
//	int number;
//	int passengerCount;
//	int money;
	
	Subway(){}
	Subway(int number){
		this.number = number;
	}
	void showInfo() {
		System.out.println("지하철 "+number+"호선 승객은"+this.passengerCount+
				"명이고 지하철 수입은"+this.money+"원 입니다");
	}
	/*
	void take() {
		this.passengerCount ++;
		this.money += 1500;
	}
	void showInfo() {
		System.out.println("지하철 "+number+"호선 승객은"+this.passengerCount+
				"명이고 지하철 수입은"+this.money+"원 입니다");
	}
	*/
	
	
	
	
	
	
	
}
