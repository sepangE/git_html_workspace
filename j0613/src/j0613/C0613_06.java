package j0613;
import java.util.Scanner;
public class C0613_06 {
	public static void main(String[] args) {
		Buyer me = new Buyer(1000,0);
		Tv tv = new Tv();
		Tablet tb = new Tablet();
		Pc pc = new Pc();
		Scanner scan = new Scanner(System.in);
		loop:while(true) {
			System.out.println("1. 돈 충전 ");
			System.out.println("2. 티비 구매 ");
			System.out.println("3. 테블릿 구매");
			System.out.println("4. 컴퓨터 구매");
			System.out.println("5. 잔액(보너스)확인");
			System.out.println("6. 구매내역");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호 입력: ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("충전할 금액 입력");
				me.addMoney();
				break;
			case 2:
				me.buy(tv);
				break;
			case 3:
				me.buy(tb);
				break;
			case 4:
				me.buy(pc);
				break;
			case 5:
				me.printInfo();
				break;
			case 6: // 생략
				me.checkCart();
				break;
			case 0:
				break loop; 
			}
			
			
			
		}
		
		
		
		
	}

}