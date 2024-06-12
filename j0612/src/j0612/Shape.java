package j0612;

public class Shape {
	private int area; // 넓이
	private int perimeter; // 둘레
	// t생성자
	public Shape() {}
	public Shape(int area, int perimeter) {
		this.area= area; this.perimeter = perimeter;
	}
	public void pirntInfo() {
		System.out.println("넓이 : "+area);
		System.out.println("둘레 : "+perimeter);
	}
	// Getter and Setters
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}
	
	
}
