package j0612;

import java.util.Scanner;

public class C0612_03 {
// 10칸짜리 객체배열 만들어서 사용
	static C0612_03 c = new C0612_03();
	static Product[] pr = new Product[10];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		loop:while(true) {
			System.out.println("== 제품관리메뉴 ==");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 정보 조회");
			System.out.println("0. 프로그램 종료");
			int menu = scan.nextInt();
			switch(menu) {
			case 1 :
				c.productInput();
				// 제품명, 제품가격, 제품세금을 입력받아 객체 생성하는 메서드
				break;
			case 2 :
				c.productPrint();
				// 현재까지 입력된 정보를 출력하는 메서드
				break;
			case 0 :
				break loop;
			}
		}
		
	}// main
	static String name;
	static int price;
	static double tax;
	static int cnt;
	// 메서드 만들기
	static 	Scanner scan = new Scanner(System.in);
	static void productInput() {
		for(int i = 0; i<pr.length; i++) {
			System.out.println("제품명 입력");
			System.out.println("0. 이전화면");
			name = scan.next();
			if(name.equals("0")) break;
			System.out.println("제품가격 입력");
			price = scan.nextInt();
			System.out.println("제품 세금 입력");
			tax = scan.nextDouble();
			
			pr[i] = new Product(name, price, tax);
			cnt ++;
		}// for
	}// productInput
	static void productPrint() {
		for(int i = 0; i<cnt; i++) {
			pr[i].print();			
		}
	}
	

} // class
