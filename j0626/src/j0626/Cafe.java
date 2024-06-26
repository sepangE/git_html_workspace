package j0626;
public class Cafe {
	private String name;
	private int price;
	private boolean isHot = true;
	
	Cafe(){
		this("아메리카노",2500,true);
	}
	
	Cafe(String name, int price, boolean isHot){
		this.name = name; this.price = price;
		this.isHot = isHot;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		if(isHot) {
			return "이름 : " + name + ", 가격 : " + price + ", hot";
		}
		else {
			return "이름 : " + name + ", 가격 : " + price + ", ice";
		}
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
	public boolean isHot() {
		return isHot;
	}
	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
		
}
