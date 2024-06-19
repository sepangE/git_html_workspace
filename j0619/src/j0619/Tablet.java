package j0619;

public class Tablet extends Electronic{
	private boolean penFlag; // 펜 유무
	
	Tablet(){}
	Tablet(String brand, String name, int price, boolean penFlag){
		super(brand,name,price);
		this.penFlag = penFlag;
	}
	
	public String toString() {
		return super.toString()+ ", penFlag=" + penFlag;
	}
	
}
