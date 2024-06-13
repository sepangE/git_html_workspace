package j0613;

public class Manager extends Employee{
	private String rank;
	private int bonus;
	
	Manager(){}
	Manager(int coNum, String name, String dept,String rank, int bonus){
		//this.coNum = coNum; > 부모변수가 private하기 때문에 직접 접근 불가능
		super(coNum,name,dept);
		this.rank = rank; 
		this.bonus = bonus;
	}
	
	public void setSalary(int sal) {
		sal = sal + this.bonus;
		super.setSalary(sal);
	}
}
