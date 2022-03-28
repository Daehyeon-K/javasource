package classtest;

public class StudentEx {
	public static void main(String[] args) {
		// 객체 생성, 실행
		Student stu1 = new Student(); // 힙에 생성됨
		// 초기화 작업
		stu1.address = "서울시 마포구 염리동";
		stu1.name = "권대현";
		stu1.phone = "010-8908-3589";
		stu1.stuId = 20160348;
		stu1.setAddress();
		stu1.setPhone();
		
		Student stu2 = new Student(); // 힙에 생성됨
		// 초기화 작업
		stu2.address = "서울시 마포구 대흥동";
		stu2.name = "홍길동";
		stu2.phone = "010-1234-5678";
		stu2.stuId = 20220348;
		stu2.setAddress();
		stu2.setPhone();

	}
}
