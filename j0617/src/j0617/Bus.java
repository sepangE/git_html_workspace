package j0617;

public class Bus extends Trans{
//	* Bus - iv:  number, passengerCount, money
//    - method : take 승객을 태움
//                   showInfo
//                    : 버스 00번 승객은 00명이고
//                     버스수입은 00원입니다
	Bus(int number){
		this.number = number;
	}
	void showInfo() {
		System.out.println("버스"+this.number+"번 승객은 "+this.passengerCount+
				"명이고 버스수입은 "+this.money+"원입니다");
	}
	
/*	
	int number;
	int passengerCount;
	int money;
	
	Bus(){}
	Bus(int number){
		this.number = number;
	}
	
	void take() {
		this.passengerCount++;
		this.money += 1000; 
		
	}
	void showInfo() {
		System.out.println("버스"+this.number+"번 승객은 "+this.passengerCount+
				"명이고 버스수입은 "+this.money+"원입니다");
	}*/
	
	
	
	
}
