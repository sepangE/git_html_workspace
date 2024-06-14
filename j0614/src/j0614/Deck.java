package j0614;		//Deck은 Card를 가지고 있음 has-a 관계
public class Deck {	// Deck 클래스 안에 Card 객체를 생성해서 사용 : 포함관계
	//1. 변수
	Card[] c = new Card[52];// 카드52개를 담을 수 있는 배열 생성
	//2. 생성자 (기본생성자: 매개변수 없음)
	Deck() {
		for(int i = 0; i<4; i++) { // 카드는 총 4종류
			for(int j = 0; j<13; j++) { // 번호는 총 13개
				c[i*13+j] = new Card(Card.kinds[i],Card.numbers[j]);
				// c: 배열   
				// c[n] 번째 방에 new Card(kind,number)를 통해서 캐드를 생성
				// static 변수는 클래스명.변수명으로 사용함
			} // for-j
		}// for-i
	}
	
	void shuffle() {
		// Card temp = null; 참조형 변수는 null
		int k;
		for(int i = 0; i<500; i++) {
			k = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[k];
			c[k] = temp;
		} // for
	} // shuffle
	Card pick(int number) {
		return c[number];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
