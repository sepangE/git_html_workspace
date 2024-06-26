package j0626;
import java.util.*;
public class Americano extends Cafe{
	private int shot;
	
	Americano(){
		this("아메리카노", 2500, false); // 자기생성자 호출 > 10줄 호출
		this.shot = 2; 
	}
	Americano(String name, int price, boolean isHot){
		super(name, price, isHot); // 부모생성자 호출 >Cafe클래스 13줄 호출
		this.shot = 2;
	}
	
	public void addShot(int a) {
		shot += a;
		super.setPrice(super.getPrice()+(a*500));
	}

	
	@Override
	public String toString() {
		return super.toString()+", "+shot+"샷";
	}

	public int getShot() {
		return shot;
	}

	public void setShot(int shot) {
		this.shot = shot;
	}
	
	
	
}
