package classtest;

public class Calculator3 {
	long a, b; // 인스턴스 변수 (멤버 변수)
	
	// 멤버 메소드 (인스턴스 메소드)
	long add() {
		return a+b;
	}
	long subtract() {
		return a-b;
	}
	long multiply() {
		return a*b;
	}
	double divide() {
		return (double)a/b;
	}
	
	// 클래스 메소드
	// 공유, 객체 생성 없이 사용 가능
	
//	static long add2() {
//		return a+b; => 스태틱 메소드에선 스태틱 변수를 사용해야 함 => 스태틱이 아닌 필드 참조 불가능
//		add(); => 스태틱 메소드에선 스태틱 메소드를 사용해야 함 (여기선 static add(~))
//	} 
	//=> 인스턴스 변수나 인스턴스 메소드 사용 불가 (인스턴스는 객체 생성하고 써야되는데 스태틱은 먼저 올라가야 하니까)
	
	static long add(long c, long d) {
		return c+d;
	}
	static long subtract(long c, long d) {
		return c-d;
	}
	static long multiply(long c, long d) {
		return c*d;
	}
	static double divide(long c, long d) {
		return (double)c/d;
	}
}
