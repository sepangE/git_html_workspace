package j0617;

public class Trans {
	int number;			// 교통수단 번호
	int passengerCount; // 교통수단의 승객 수 default 0
	int money;			// 교통수단의 금액 default 0
	
	
	
	void take(int money) {
		this.passengerCount++;
		this.money += money; 
		
	}
	
	
}

	