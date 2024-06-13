package j0613;

public class Employee {
	// 변수선언
	private int coNum;
	private String name;
	private String dept; 
	private int salary;
	
	// 생성자
	Employee(){}
	Employee(int coNum, String name, String dept){
		this.coNum = coNum; this.name = name; this.dept = dept;
	}
	
	// 메서드
	int getMonth() {
		return this.salary/12;
	}
	
	
	// getter setter
	public int getCoNum() {
		return coNum;
	}
	public void setCoNum(int coNum) {
		this.coNum = coNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
