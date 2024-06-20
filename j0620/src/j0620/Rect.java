package j0620;

public class Rect extends Shape {
	double width;
	double height;
	
	Rect(){}
	Rect(double w, double h){
		this(new Point(0,0),w,h);
	} // 생성자 w, h
	Rect(Point p, double w, double h){
		super(p);
		width = w;
		height = h;
	}// 생성자 p, w, h
	
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		if(width == height) return true;
		else return false;
	}
	
}
