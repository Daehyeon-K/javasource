package op;

// 논리 연산자: 결과가 true or false

public class LogicalOperatorEx1 {
	public static void main(String[] args) {
		boolean result = (5 > 3) && (5 > 2);
		System.out.println("result : "+result);
		
		result = (5 > 3) /*|| (5 < 2)*/;
		System.out.println("result : "+result);

	}
}
