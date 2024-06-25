package j0625;

public class Worker extends Person{
	// 필드
	private String work;
	// 생성자
	Worker(){super();}
	Worker(String name, int age, String work) {
		super(name, age);
		this.work = work;
	}
	
	@Override
	public String toString() {
		return super.toString()+", 직장 : "+work;
	}
	
	// getter setter
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
	
	
}
