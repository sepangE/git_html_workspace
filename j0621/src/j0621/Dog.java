package j0621;

public class Dog extends Animal{
	// 변수
	private String species;
	// 생성자
	Dog(){}
	public Dog(String name, int age) {
		super(name, age);
	}
	public Dog(String name, int age, String species) {
		super(name, age);
		this.species = species;
	}
	//추상메서드 완성
	public void cry() {
		System.out.println("멍멍");
	}

	@Override
	public String toString() {
		return super.toString()+" 종 : "+species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}
