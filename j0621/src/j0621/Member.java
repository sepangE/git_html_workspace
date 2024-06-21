package j0621;

public class Member {
	//변수
	private String name;
	private String id;
	private int age;
	private String email;
	
	//생성자
	Member(){}
	Member(String name, String id, int age, String email){
		this.name = name; this.id = id;
		this.age = age; this.email = email;
	}
	
	public String toString() {
		return "이름 : "+name+" 아이디 : "+id+" 나이 : "+age+" 이메일 : "+email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
