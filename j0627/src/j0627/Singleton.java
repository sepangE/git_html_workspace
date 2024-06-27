package j0627;

public class Singleton {

		private static int num;
		// 같은 클래스 내에서만 s 사용가능
		private static Singleton s = new Singleton();
		// private로 지정한 생성자 만들둬야함
		private Singleton(){
			num = 10;
					
		}
		// getInstance 메서드
		static Singleton getInstance() {
// default type 리턴형(자기자신) 메서드명(매개변수
			if(s==null) {
				s = new Singleton();// 객체선언 다시
			}
			return s;
		}
		public static int getNum() {
			return num;
		}
		public static void setNum(int num) {
			Singleton.num = num;
		}
		
		public void call() {
			System.out.println("부르셨나요 ??? ");
		}
		
		
		
		
		
		
		public static Singleton getS() {
			return s;
		}
		public static void setS(Singleton s) {
			Singleton.s = s;
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
