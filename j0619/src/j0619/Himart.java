package j0619;

public class Himart {
	private Electronic[] e= new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic e) {
		this.e[count] = e;	
		count++;
	}
	public Electronic[] select() {
		return e;
	}
}
