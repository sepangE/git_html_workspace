package j0618;
public class Tv extends Product{
	
	Tv(){
		this("75인치 smartTV",100,10);
	}
	Tv(String productName,	int pirce,int bonuspoint){
		this.productName =productName;
		this.pirce = pirce;
		this.bonuspoint = bonuspoint;
	}
}
