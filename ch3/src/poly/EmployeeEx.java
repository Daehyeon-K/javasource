package poly;

public class EmployeeEx {
	public static void main(String[] args) {
		//기존
		System.out.println("<<기존 // 다형성 없이>>");
		Employee employee1 = new Employee();
		employee1.setName("홍길동");
		employee1.setPosition("사원");
		//employee1.work();
		work(employee1);
		
		Ceo ceo1 = new Ceo();
		ceo1.setName("이몽룡");
		ceo1.setPosition("대표");
		//ceo1.work();
		work(ceo1);
		
		PartTime partTime1 = new PartTime();
		partTime1.setName("권대현");
		partTime1.setPosition("시간제 근로자");
		//parttime1.work();
		work(partTime1);
		
		Administrator admin1 = new Administrator();
		admin1.setName("성춘향");
		admin1.setPosition("관리자");
		//admin1.work();
		work(admin1);
		System.out.println("");
		
		// 매개변수의 다형성
		
	}
	
	// 매개변수의 다형성
	// => 각 클래스를 인자로 갖는 여러 메소드를 오버로드해서 만드는 것 보단
	// 메소드 하나에 매개변수의 다형성이 낫다
	
	public static void work(Employee employee) {
	// 이렇게 아래 나머지 메소드 안만들고 그냥 돌리면 매개변수를 받을 때 이런 식으로 돌아감
		// Employee employee = employee1; == Employee employee = new Employee;
		// Employee ceo = ceo1; == Employee ceo = new Ceo;
		// Employee partTime = partTime1; == Employee partTime = new PartTime;
		// Employee admin = admin1; == Employee admin = new Admin;
		employee.work();
	} // 개별로 안만들어도 상속이 되는 거라 매개변수 안에서 다형성되며 인자를 받는 것.
	
	
//	public static void work(Ceo ceo) {
//		ceo.work();
//	}
//	public static void work(PartTime partTime) {
//		partTime.work();
//	}
//	public static void work(Administrator admin) {
//		admin.work();
//	}
	
}
