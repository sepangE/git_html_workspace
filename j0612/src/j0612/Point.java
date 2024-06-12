package j0612;
public class Point {
	int x; 
	int y; 
	
	Point(){}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	String getLoc() {
		String str = "x : "+x +", y: "+y; 
		return str; 
	}
}