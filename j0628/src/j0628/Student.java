package j0628;

public class Student {
	private int stuNo,kor,eng,math,total;
	static int count = 100;
	private String name;
	private double avg;
	{
		count++;
	}
	public Student(String name,int kor, int eng, int math ) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = (double)total/3;
		stuNo = count;
	}
	@Override
	public String toString() {
		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\n",
				stuNo, name, kor, eng, math, total, avg);
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
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
	
	
}
