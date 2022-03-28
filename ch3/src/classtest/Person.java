package classtest;

public class Person {
	// final String nation;
	// final String ssn;
	// => final 필드가 초기화되지 않았다는 오류
	
	final String nation="Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn; // 생성자에서 초기화 한다 하니 9번째 줄에 에러 메시지 사라짐
		// ^^^^ 위의 줄을 없애면 ssn 초기화 해야 한다며 Person~라인에 에러 뜸
		this.name = name;
	} // 이게 전체 필드 가져온 거임
	
	// final은 초기화가 필수. 직접해도 되고 생성자에서 해도 되고
	// 최종 값이기에 수정 불가
	// 변수, 클래스, 메소드 모두 붙일 수 있음
	
	
}
