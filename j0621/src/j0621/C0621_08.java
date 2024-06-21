package j0621;
import java.util.*;
public class C0621_08 {
	public static void main(String[] args) {
		List<Card> list = new ArrayList<Card>();
		//			  cv : 클래스명.변수명
		Card c1 = new Card(Card.kinds[0],1);
		Card c2 = new Card(Card.kinds[1],1);
		Card c3 = new Card(Card.kinds[2],1);
		Card c4 = new Card(Card.kinds[3],1);
		//System.out.println(c1);	System.out.println(c2);	System.out.println(c3);	System.out.println(c4);
		
		// Q1. list에 Spade1 ~ Spade 13 까지 넣어보기
		
		for(int i = 0; i < Card.numbers.length; i++) {
			list.add(new Card(Card.kinds[0],(i+1)));
			}
		for(Card a : list) {
			System.out.println(a);
		}
		System.out.println("==============");
		List<Card> cd = new ArrayList<Card>();
		// Q2. cd에 Spade5, Heart5, Diamond5, Clover5 를 넣어보기
		
		for(int i = 0; i < Card.kinds.length; i++) {
			cd.add(new Card(Card.kinds[i],5));
		}
		for(Card a : cd) {
			System.out.println(a);
		}
		System.out.println("==============");
		List<Card> deck = new ArrayList<Card>();
		// spade1 ~ clover 13까지 덱이 넣어보기
		for(int i = 0; i <Card.kinds.length; i++) {
			for(int j = 0; j < 13; j++) {
				deck.add(new Card(Card.kinds[i],(j+1)));
			}
		}
		for(Card a : deck) {
			System.out.println(a);
			
		}
		
		
	}// main
}// class
