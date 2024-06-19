package j0619;

public class NoteBook extends Electronic{
	private int usbPort; // usb 포트 개수
	
	NoteBook(){}
	NoteBook(String brand,String name, int price,int usbPort){
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	public String toString() {
		return super.toString()+", usbPort=" + usbPort;
	}
	
	
}
