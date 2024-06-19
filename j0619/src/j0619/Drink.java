package j0619;

public class Drink extends Menu{
	private int size;
	
	Drink(){}
	Drink(String name,int price, int size){
		super(name,price);
		this.size = size;
	}
	
	public void sell(int orderQuantity) {
		System.out.println("마실 것 :  "+super.getName()+" , 사이즈(ml)  : "+size+
				", 주문 량 : "+orderQuantity+" , 주문 가격 : "+super.getPrice()*orderQuantity);
	}
	
	
	
	
	
}
