package j0620;

public class Circle extends Point{
	private int radius;
	
	Circle (){}
	Circle (int x, int y, int radius){
		super(x,y);
		this.radius = radius;
	}
	// 메서드
	public String toString() {
		return super.toString()+", 반지름"+radius+" ";
	}
	
	// getter setter
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
class CircleController{
	private Circle c = new Circle();
	
	public String calcCircum(int x, int y, int r) {
		c.setX(x); c.setY(y); c.setRadius(r);
		String str = "둘레 : "+2*Math.PI*c.getRadius();
		return c.toString()+str;
	}
	public String calcCirArea(int x, int y, int r) {
		c.setX(x); c.setY(y); c.setRadius(r);
		String str = "면적 : " + Math.PI * c.getRadius()*c.getRadius() ;
		return c.toString()+str; 
	}
}