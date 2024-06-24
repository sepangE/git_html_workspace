package j0624;
import java.util.*;
// 클래스는 객체를 정의, 생성하는데 사용됨 (필드 + 메서드)
public class Product { 
	// 필드 (iv, cv) - 클래스에 포함된 변수
	private String name;
	private int price;
	private int point;
	// 생성자(constructor) - 특정 작업을 수행하기위한 명령문의 집합
	Product(){}
	Product(String name, int pirce, int point){
		this.name = name;	this.price = pirce; 	this.point = point;
	}
	// 메서드 - 특정 작업을 수행하기 위한 명령문의 집합
	// toString() 은 Object객체의 메서드를 오버라이딩 한 것
	public String toString() {
		return String.format("%s, %d, %d", name, price, point);
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
	
}