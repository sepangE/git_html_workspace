package j0619;

public class Meat extends Menu{
	private int perGram;
	
	Meat(){}
	Meat(String name,int price, int perGram){
		super(name,price);
		this.perGram = perGram;
	}
	
	public void sell(int orderQuantity) {
		System.out.println("고기 :  "+super.getName()+" , 1인분 무게(g) : "+perGram+
			", 주문 량 : "+orderQuantity+" , 주문 가격 : "+super.getPrice()*orderQuantity);
	}
}
