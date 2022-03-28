package classtest;

public class MethodTest1 {
	// true, false 리턴하는 메소드 작성 (이름은 isRedirect())
	// 인자는 없음
	boolean isRedirect() {
		return true; // return false;
	}
	
	// 정수 타입 리턴, sum()
	// 인자는 정수 2개 입력 받음
	// 넘어온 정수 더해 결과 리턴
	int sum(int i1, int i2) {
		return i1+i2;
	}
	
	// 문자 하나 리턴, method1()
	// 인자 없음
	char method1() {
		return 'a';
	}
	
	// 실수 리턴, devide1()
	// 인자 실수 2개
	double divide1(double d1, double d2) {
		return d1/d2;
	}
	
	// int 타입의 배열 리턴
	// array() : 입력받은 비열을 리턴
	// 인자는 int 타입의 배열
	
	int[] array(int iArr[]) {
		iArr[0]=8;
		return iArr;
	}
	
	// 문자열 타입 리턴
	// method2() : 인삿말 리턴
	// 인자는 없음
	String method2() {
		return "안녕하세요!";
	}
}
