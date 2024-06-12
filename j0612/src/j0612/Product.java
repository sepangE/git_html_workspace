package j0612;
public class Product {
	
	private static int count = 1000;
	private int pId;
	private String pName;
	private int price;
	private double tax;
	int x;
	// pId 1001 > 2번째 생성되는 애는 1002, 3번째는 1003...
	// 출력용 메서드 만들거나 getter만들어 사용
	{ // 초기화 블럭
		count++;
		x = count;
	}
	Product(){} // 기본생성자
	
	Product(String pName, int price, double tax){

		this.pId = count;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
	
	
	public void print() {
		System.out.printf("%d번\t%s\t%d원\t세금%.2f\n",pId,pName,price,tax);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
