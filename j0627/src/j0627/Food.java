package j0627;

public class Food {
	private String name;
	private int pirce;
	public Food() {}
	public Food(String name, int pirce) {
		this.name = name;
		this.pirce = pirce;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + pirce;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPirce() {
		return pirce;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	
	
	
}

class Drink extends Food{
	private boolean achole;

	public Drink() {
		this("물",1000,false);
		}
	public Drink(String name, int pirce) {
		super(name, pirce);
		this.achole = false;
	}
	public Drink(String name, int pirce, boolean achole) {
		super(name, pirce);
		this.achole = achole;
	}
	@Override
	public String toString() {
		if(achole) {
			return super.toString()+ " 술";
		}
		else {
			return super.toString()+ " 음료수";
		}
	}
}

class Snack extends Food{
	private boolean sweet;
	
	Snack(){
		this("초코파이",500,true);
	}
	public Snack(String name, int pirce) {
		super(name, pirce);
		this.sweet = true;
	}
	public Snack(String name, int pirce, boolean sweet) {
		super(name, pirce);
		this.sweet = sweet;
	}
	@Override
	public String toString() {
		if(sweet == true) {
			return super.toString()+" 단거";
		}else {
			return super.toString()+" 안단거";
		}
	}
	
	
	
	
	
}