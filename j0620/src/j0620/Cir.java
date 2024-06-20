package j0620;

public class Cir extends Shape {
	double radius;
	
	Cir(){}
	Cir(double r){
		this(new Point(0,0),r);
	}
	Cir(Point p, double r){
		super(p); 
		radius = r;
	}
	// 추상메서드 완성시킴
	double calcArea() {
		return Math.PI*radius*radius;
	}
}
