package classtest;

public class DataEx {
	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		
		System.out.println("main d.x = "+d.x);
		System.out.println();
		
		change(d.x);
		System.out.println();
		
		System.out.println("[ change 호출 후 ]");
		System.out.println(">> main d.x = "+d.x);
		// 당연히 값이 10이 나옴. change 메소드에서 생성된 로컬변수 x의 값을 1000으로 바꾼거니까
		// 많이 하는 실수!
		
		System.out.println();
		
		correctChange(d); // 만약 이 메소드가 static이 아니면 메소드 호출이 불가.
		// 근데 다른 클래스의 논스태틱 메소드는 왜 사용 가능? => 객체가 이미 생성 되어 버리면 함께 준비가 되어 있다는 거니까 가능한 거
		System.out.println();
		
		System.out.println("[ correctChange 호출 후 ]");
		System.out.println(">> main d.x = "+d.x);
		
		DataEx de = new DataEx();
		de.print(); // => 요렇게 객체 생성하면 가능
	}
	static void change(int x) { // 여기 int x는 기본형 매개변수(인자) -> 스택의 change 공간에 x라는 변수가 생김
		x=1000;
		System.out.println("changed x = " + x);
	}
	static void correctChange(Data obj) { // 여기 Data obj는 참조형 매개변수 -> 스택의 correctChange 공간에 obj라는 변수에 클래스 주소 들어감
		obj.x = 1000;
		System.out.println("correctly changed x = "+obj.x);
	}
	void print() {};
}
