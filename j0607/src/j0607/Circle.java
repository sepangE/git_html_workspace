package j0607;

public class Circle {
	
	int r;
	static double pi = 3.14;
	
	Circle(){}
	Circle(int r){
		this.r = r;
	}
	
	double area() {
		return	pi*r*r;
	}
	double area(int a) {
		return pi*a*a;
	}
	double area(double a) {
		return pi*a*a;
	}
	double size() {
		return 2*pi*r;
	}
	double size(int a) {
		return 2*pi*a;
	}
	double size(double a) {
		return 2*pi*a;
	}
	
	void plusr() {
		r++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
