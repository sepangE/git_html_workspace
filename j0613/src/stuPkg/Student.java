package stuPkg;

public class Student {
	public String name;
	public int count;
	public int stuNo;	
	public int kor;
	public int eng;
	public int math;
	public int total;
	public double avg;
	public int rank;
	{
		count++;
	}
	Student(){}
	Student(String name,int kor,int eng,int math){
		stuNo = count;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
