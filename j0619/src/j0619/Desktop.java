package j0619;

public class Desktop extends Electronic{
	private String graphic; // 그래픽 제조사
	
	Desktop (){}
	Desktop (String brand, String name, int price, String graphic){
		super(brand,name,price);
		this.graphic = graphic;
	}
	
	public String toString() {
		return super.toString()+", graphic=" + graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	//getter setter
}
