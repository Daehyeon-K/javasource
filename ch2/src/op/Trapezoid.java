package op;

public class Trapezoid {
	public static void main(String[] args) {
		// 사다리꼴 넓이 구하기
		// 윗변 = 5, 아랫변 = 10, 높이 = 7로 변수 선언하기
		
		double top = 5;
		double bottom = 10;
		double height = 7;
		System.out.println("사다리꼴의 넓이: "+((top+bottom)*height/2));

		int intTop = 5;
		int intBottom = 10;
		int intHeight = 7;
		double area = (double)(intTop+intBottom)*intHeight/2; //자동 형 변환과 강제 형 변환
		System.out.println("\n사다리꼴의 넓이: "+area);
	}
}
