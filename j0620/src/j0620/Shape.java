package j0620;

public abstract class Shape {
	// 변수
	Point p = new Point();
	// 생성자
	Shape(){ // 기본생성자, 포인트를 매개변수로 받는 생성자
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
}
