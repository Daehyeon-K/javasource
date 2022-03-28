package op;

// 산술연산자

public class ArithmeticOperatorEx1 {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("v1 + v2 = "+result);
		
		result = v1 - v2;
		System.out.println("v1 - v2 = "+result);
		
		result = v1 * v2;
		System.out.println("v1 * v2 = "+result);
		
		result = v1 / v2; // int이기에 몫만
		System.out.println("v1 / v2 = "+result);
		
		result = v1 % v2; // 나머지 연산
		System.out.println("v1 % v2 = "+result);
		
		double result2 = (double)v1 / v2; // 큰 타입에 맞춰서 하나면 써도 알아서 됨
		System.out.println("result2 = "+result2); // double이기에 소수까지
		
		
		
	}
}
