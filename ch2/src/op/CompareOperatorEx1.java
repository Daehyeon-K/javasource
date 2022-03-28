package op;

// 비교연산자
// ==, !=, <, >, <=, >=

public class CompareOperatorEx1 {
	public static void main(String[] args) {
		
		int a=10, b=20, c=30; // 한 줄에 선언 가능
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		System.out.println("result1 = "+result1);
		
		boolean result2 = (num1 != num2);
		System.out.println("result2 = "+result2);
		
		boolean result3 = (num1 <= num2);
		System.out.println("result3 = "+result3);
		
		char ch = 'A';
		char ch2 = 'B';
		int num = 65;
		
		boolean result4 = (ch == num); // 타입은 달라도 65를 갖고 있는 거라 true 뜸
		System.out.println("result4 = "+result4);
		
		boolean result5 = (ch <= ch2); // ASCII 코드로 65 66이니까
		System.out.println("result5 = "+result5);
		// 문자 까지도 코드 변환으로 인해 가능
		
		System.out.println(a+" "+b+" "+c);
	}
}
