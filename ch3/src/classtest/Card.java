package classtest;

public class Card {
	String kind;
	int number;
	
	// width와 height는 변경되지 않으니, 클래스의 공통된 속성이다. 그러니 인스턴스 변수로 하지 말고 클래스 변수로.
	// static이 붙으면 클래스 변수 => 주로 바로 초기화 함 // 또한 공유하는 의미임
	static int width=100;
	static int height=150;
	
	// 생성자 => 도구 이용해서 만들면 클래스 변수 제외하고 이렇게 만들어 짐
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	void println() {
		System.out.println("Kind = "+kind+", Number = "+number+", Width = "+width+", Height = "+height+"\n");
	}
}
