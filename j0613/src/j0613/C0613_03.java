package j0613;

public class C0613_03 {
	public static void main(String[] args) {
		// 1. 직원 정보 관리를 위한 객체를 생성. Employee
		// 변수로 반드시 사번, 이름, 부서가 있어야함
		Employee e1 = new Employee(1234123,"고길동","영업");
		// 2. 생성된 직원의 연봉을 설정할 수 있어야함.
		e1.setSalary(4000);
		System.out.println("연봉은 "+e1.getSalary());
		// 3. 월급을 계산해서 반환해줘야함
		System.out.println(e1.getName()+"님의 월급은 "+e1.getMonth());
		
		//연봉은 4000  고길동님의 월급은 333
		
		
		// 매니저 클래스를 만들어서 (직원클래스 상속받음)
		// 직책(rank)와 보너스(bonus)의 정보를 가지고있어야함 
		Manager m1 = new Manager(131312,"강백호","영업","부장",100);
		m1.setSalary(6000); 
		// 1.메서드 오버라이딩으로 자식메서두 호출 > 자식메서드에서 부모메서드 호출> 연봉객체 변함
		// 입력받은 금액과 보너스를 합한 금액이 salary가 된다
		//								부모클래스에서의 메서드호출
		System.out.println("연봉 : "+m1.getSalary());
		System.out.println(m1.getName()+"님의 월급은 "+m1.getMonth());
		//					부모클래스메서드 호출			부모클래스메서드 호출
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
