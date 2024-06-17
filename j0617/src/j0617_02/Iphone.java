package j0617_02;

public class Iphone implements Phone{
	public String getCompany() {
		// 인터페이스의 규격에 맞게 재정의한다
		return "Apple";
	}
	public String getOS() {
		return "iOS";
	}

}
class WindowPhone implements Phone{
	public String getCompany() {
		return "MS";
	}
	public String getOS() {
		return "Android";
	}
}