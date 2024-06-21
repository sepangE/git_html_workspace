package j0621;
import java.util.*;
public class C0621_06 {
	public static void main(String[] args) {
//		1. subject 클래스 : title, score
//		2. student 클래스 : stuNo, stuName, subList
		
		
		Student hong = new Student(1, "홍길동");
		hong.addSubject("국어", 100);
		hong.addSubject("영어", 90);
		
		Student kang = new Student(2, "강백호");
		kang.addSubject("국어", 60);
		kang.addSubject("영어", 50);
		kang.addSubject("수학", 30);
		
		hong.showInfo();
		kang.showInfo();
		
		
		
	}
}
