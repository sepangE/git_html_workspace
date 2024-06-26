package stuPkg;
import java.util.*;
public class Student {
	private int stuNo;
	static int count;
	private String name;
	private int kor,eng,math,total,rank;
	private double avg;
	{
		count++;
	}
	Student(String name, int kor, int eng, int math){
		this.name = name; this.kor = kor;
		this.eng = eng; this.math = math;
		this.total = kor+eng+math;
		this.avg = (double)total/3;
		this.stuNo = count;
		
	}

	@Override
	public String toString() {
		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
				stuNo, name, kor, eng, math, total, avg, rank );
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
}
