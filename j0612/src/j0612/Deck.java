package j0612;

public class Deck {
	Card[] c = new Card[52]; //52개의 카드
	//생성자
	Deck() {
		for(int i = 0; i< c.length; i++) {
			c[i] = new Card(); // 객체선언
			// 카드 숫자넣기 1~10JQK
			if(i%13==10) {
				c[i].number = "J";
			}else if(i%13 ==11) {
				c[i].number = "Q";
			}else if(i%13 == 12) {
				c[i].number = "K";
			}else {					//	+""는 문자열로 바꿔줌
				c[i].number = ((i%13)+1)+"";
			}
			if(i/13==0) {
				c[i].kind = "Spade";
			}else if(i/13==1) {
				c[i].kind ="Diamond";
			}else if(i/13 == 2) {
				c[i].kind = "Heart";
			}else {
				c[i].kind = "Clover";
			}
		}// for
	} // deck
	
	Card pick(int k) {
		return c[k%52];
	}
	
	// 카드 섞는 메서드
	
	void shuffle() {
		Card temp = null;
		for(int i = 0; i < 500; i++) {
			int k = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[k];
			c[k] = temp;
		}
	}
	
	
	
	
	
}
