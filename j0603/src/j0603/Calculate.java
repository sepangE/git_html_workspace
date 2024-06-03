package j0603;

public class Calculate {
	// 인스턴스 변수 선언
	long n1, n2;
	
	
	
	
	
	
	
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	int sub(int n1, int n2) {
		return n1-n2;
	}
	void print() {
		System.out.println("이곳은 void 메서드로 리턴값이 없습니다.");
	}
	
	long ADD(long num1, long num2) {
		return num1+num2;
	}
	long SUB(long num1, long num2) {
		return num1-num2;
	}
	long AXB(long num1, long num2) {
		return num1*num2;
	}
	double AB(long num1, long num2) {
		return (double)num1/num2;
	}
	long ab(long num1, long num2) {
		return num1%num2;
	}
	
	int min(int n1, int n2) {
		if(n1<n2) return n1;
		else return n2;
	}
	
	int Min(int n1, int n2, int n3) {
		if (n1<n2 && n1<n3) return n1;
		else if(n2<n1 && n2<n3) return n2;
		else return n3;
	}
	int Max(int n1, int n2, int n3) {
		if (n1>n2 && n1>n3) return n1;
		else if(n2>n1 && n2>n3) return n2;
		else return n3;
	}
	
	// 최대값
	int max(int n1, int n2) {
		return (n1>n2)?n1:n2; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
