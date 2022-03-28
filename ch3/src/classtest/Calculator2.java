package classtest;

// 클래스 : 멤버변수, 메소드를 내부에서 사용할 때는 이름만 사용해서 작성

public class Calculator2 {
	
	int plus(int x, int y) {
		return x+y;
	}
	double avg(int x, int y) { // 만약 int sum = x+y 한 후에 계산하면 몫만 정수로 나온 뒤, 반환값은 실수로 내야 하니 소수점 붙여서 나옴
		return (x+y)/2;
	}
	void execute(int x, int y) {
		int resultPlus = plus(x, y);
		double resultAvg = avg(x, y);
		println("<<실행결과>>\n합: "+resultPlus+", 평균: "+resultAvg);
	}
	void println(String message) {
		System.out.println(message);
	}
	
	
}
