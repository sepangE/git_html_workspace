package j0626;
import java.util.*;
public class Latte extends Cafe{
	private String milk;
	
	Latte(){
		this("카페라떼", 3500, false); // 자기생성자 호출 > 10줄 호출
		this.milk = "우유"; 
	}
	Latte(String name, int price, boolean isHot){
		super(name, price, isHot); // 부모생성자 호출 >Cafe클래스 13줄 호출
		this.milk = "우유"; 
	}
	
	public void changeMilk(String milk) {
		this.milk = milk;
		super.setPrice(super.getPrice()+500);
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+milk;
	}




	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}
	
	
}
