package classtest;

public class StudentEx2 {

	public static void main(String[] args) {
		// Student2 객체 생성
		Student2 stu = new Student2();
		System.out.println("학생 이름 : "+stu.name);
		System.out.println("학생 주소 : "+stu. address);
		System.out.println("학생 학번 : "+stu.stuId);
		System.out.println("학생 핸드폰 : "+stu.phone+"\n");
		
		
		Student2 stu2 = new Student2("권대현", "서울시 마포구");
		// 인자는 순서가 중요. 순서대로 받도록 됨
		
		System.out.println("학생 이름 : "+stu2.name);
		System.out.println("학생 주소 : "+stu2. address);
		System.out.println("학생 학번 : "+stu2.stuId);
		System.out.println("학생 핸드폰 : "+stu2.phone+"\n");
		
		Student2 stu3 = new Student2("홍길동", "서울시 마포구", "010-1234-5678", 20220307);
		System.out.println("학생 이름 : "+stu3.name);
		System.out.println("학생 주소 : "+stu3. address);
		System.out.println("학생 학번 : "+stu3.stuId);
		System.out.println("학생 핸드폰 : "+stu3.phone+"\n");
	}

}
