package classtest;

public class Student2 {
	// 속성(특성): 필수는 아님 - 멤버변수(property)
	// 기능(동작): 필수는 아님 - 멤버메소드
	// 생성자 개념까지! : default 생성자(무조건 하나), 인자를 받는 생성자(인자를 다르게 해서 여러개 가능) 
	// 인자(인수): argument. 괄호 안에 들어있는 변수이자 전달인자
	// 접근제한자 클래스명() {}
		
	// 속성 - 학번, 이름, 주소, 핸드폰
	int stuId;
	String name;
	String address;
	String phone;
		
	// 생성자: 초기화 담당, 객체 생성하며 필요한 사전작업 담당
	public Student2() {
		System.out.println("Student2 객체 생성");
	} // default 생성자
	
	public Student2(String name, String address) {
		System.out.println("인자를 두 개 받아 Student2 객체 생성");
		this.name = name;
		this.address = address;
	} // 인자를 받는 생성자
	
	
	public Student2(String address, int stuId) {
		System.out.println("인자를 두 개 받아 Student2 객체 생성");
		this.stuId = stuId;
		this.address = address;
	}
	
	public Student2(int stuId, String address) {
		System.out.println("인자를 두 개 받아 Student2 객체 생성");
		this.stuId = stuId;
		this.address = address;
	} // 이런 식으로 개수가 다르지 않아도 자료형의 순서가 다르면 됨. 스트링 두개로 변수 순서만 바꾸는 건 안됨. 인티저랑 스트링이라 가능
	
	
	public Student2(String name, String address, String phone) {
		System.out.println("인자를 세 개 받아 Student2 객체 생성");
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Student2(String name, String address, String phone, int stuId) {
		System.out.println("인자를 네 개 받아 Student2 객체 생성");
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.stuId = stuId;
	}
	
	
	// 기능 - 핸드폰 번호 변경, 주소 변경
	void setPhone() {}
	void setAddress() {}
}
