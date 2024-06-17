package j0617_02;

public class C0617_02 {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 5;
		
		CalcComp c = new CalcComp();
		// CalComp의 부모클래스에게서..
		// 부모클래스 멤버도 자신의 멤버이기때문에
		System.out.println(c.add(n1, n2));
		// CalComp의 부모클래스에게서..
		System.out.println(c.sub(n1, n2));
		// CalComp에서..
		System.out.println(c.mul(n1, n2));
		// CalComp에서..
		System.out.println(c.div(n1, n2));
		
		// 객체 생성
		Galaxy ga = new Galaxy();
		System.out.println(ga.getCompany());
		System.out.println(ga.getOS());
		Iphone ip = new Iphone();
		System.out.println(ip.getCompany());
		System.out.println(ip.getOS());
		WindowPhone wp = new WindowPhone();
		
		
		getInfo(ga);
		getInfo(ip);
		getInfo(wp);

	}
	static void getInfo(Phone p) {
		System.out.println(p.getCompany());
		System.out.println(p.getOS());
	}
}
