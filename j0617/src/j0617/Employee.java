package j0617;

public class Employee extends Person{
	/*
	자손들은 iv는 모두 private
	직원의 정보가 있는 Employee 클래스가 있다.
	해당 클래스에 회사, 직급, 부서를 나타내는 필드
	company, rank, dept
	해당 클래스에 생성자를 작성
	해당 클래스에 필드 정보를 출력하는 메소드
	 */
	private String company;
	private String rank;
	private String dept;
	
	Employee(){}
	Employee(String company, int age,String dept,String name, String rank){
		super(name,age); // 부모변수는 부모가 초기화(부모클래스 생성자 호출)
		this.company = company;
		this.rank = rank;
		this.dept = dept;
	}
	
	// 메서드 오버라이딩
	public void printInfo() {
		System.out.printf("이름: %s, 나이: %d살, 회사: %s, 부서: %s, 직급: %s\n",
				name,age,company,dept,rank);
	}
	
	// getter setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
