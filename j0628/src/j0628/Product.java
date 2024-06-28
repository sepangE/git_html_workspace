package j0628;

public class Product {
	// 이름, 가격
	private String name;
	private int price;
	Product(){}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
