package j0620;

public class Rectangle extends Point{
	// 변수
	public int height;
	public int width;
	// 생성자
	Rectangle(){}
	Rectangle(int x, int y, int height, int width){
		super(x,y);
		this.height = height;
		this.width = width;
	}
	// 메서드
	public String toString() {
		return "x : "+ getX() + ", y : " + getY()
		+ ", w : "+ getWidth() + ", h : " + getHeight();
	}
	// getter setter
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
class RectangleController{
	private Rectangle r = new Rectangle();
	
	public String calcPerimeter(int x, int y, int w, int h) {
		r.setX(x); r.setY(y); r.setHeight(h); r.setWidth(w);
		String str = "넓이 : "+(r.getHeight()*r.getWidth());
		return r.toString()+str;
	}
	public String calcRectArea(int x, int y, int w, int h) {
		r.setX(x); r.setY(y); r.setHeight(h); r.setWidth(w);
		String str = "넓이 : " + (r.getHeight()*r.getWidth());
		return r.toString() + str; 
	}
}
