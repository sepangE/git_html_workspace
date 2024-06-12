package StuPkg;

public class Student {
	// student 객체가 가져야할 멤버들을 먼저 생각해서 만들기
	// 객체들을 private 하게 만들어주는것이 안전하다
	private String name;
	private int stuNo;
	private int count;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	{ // 초기화 블럭을 이용해서 학생 수 자동 증가
		count++;
	}
	Student(){}
	Student(String name, int kor, int eng, int math){
		stuNo = count;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	}
	public void printStuInfo() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
				stuNo,name,kor,eng,math,total,avg,rank);	
	}
	public void reTotal() {
		this.total = this.kor+this.eng+this.math;
	}
	public void reAvg() {
		this.avg = (this.kor+this.eng+this.math)/3.0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	// 외부와의 소통창구
	// 생성자를 public이나 default.
	// setter, getter를 사용해서 변수에 접근할 수 있도록
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
