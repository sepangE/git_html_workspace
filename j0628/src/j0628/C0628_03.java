package j0628;
import java.util.*;
public class C0628_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductM pm = new ProductM();
		Map<String, Object> map = new HashMap<String, Object>();
		List<Product> list = new ArrayList<Product>();
		int count = 0;
		loop : while(true) {
			System.out.println("1. 상품 입력하기");
			System.out.println("2. 상품 전체 출력하기");
			System.out.println("3. 상품 검색하기");
			System.out.println("4. 상품 총액 출력하기");
			System.out.println("8. 파일에서 읽어오기");
			System.out.println("9. 파일로 출력하기");
			System.out.println("0. 종료");
			System.out.println("====================");
			System.out.println("원하는 번호 입력");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				map = pm.productInput(list, count);
				count = (int)map.get("cnt");
				list = (List<Product>)map.get("list");
				break;
			case 2 :
				pm.productPrint(list);
				break;
			case 3 :
				pm.searchP(list);
				break;
			case 4 :
				int total = pm.calPrice(list);
				System.out.printf("%,d\n",total);
				break;
			case 8 :
				map = pm.readF();
				list = (List<Product>)map.get("list");
				break;
			case 9 :
				try {
					pm.pSave(list);
				} catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 0 : 
				System.out.println("프로그램 종료");
				break loop;
			}
		}
	}
}
