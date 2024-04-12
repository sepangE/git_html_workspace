package j0327;

public class C0327_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수타입 변수명 = 리터럴;
		
		// 변수 > 리터럴인 경우 가능
		char ch1 = 'a';   
		int ch = 'a';   // int > char
		long l = 123;   // long > int
		double d = 3.14f;   // double > float
		
		// 변수 < 리터럴인 경우 error
		// int n = 2147483648; // int 범위를 벗어남
		//long l2 = 3.14f; // long은 정수형
//	    float f = 3.14d // double > float
		
		// byte short에 int값을 저장 가능 범위에 주의
		byte b = 100; // -128 ~ 127
		
		

		
		
	}

}
