package poly;

// 포함관계 : 한 클래스의 멤버 변수로 다른 클래스 타입의 참조 변수 선언
public class Circle {
	// int x, y; => Point 클래스로 대신 하는 것. 어차피 같은거 가지고 있는 클래스 있으니
	
	//Point p = new Point(); // 포함관계로서, 꽤 많이 쓰임
	
	Point p; // 선언만 하고 이후 생성자에서 받아서 초기화하는 포함관계도 있ㅇ,ㅁ
	
	int r;

	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}
	
	
}
