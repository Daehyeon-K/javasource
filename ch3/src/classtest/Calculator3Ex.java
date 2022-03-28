package classtest;

public class Calculator3Ex {
	
	public static void main(String[] args) {
		Calculator3 calc = new Calculator3();
		calc.a = 10;
		calc.b = 5;
		
		System.out.println("a + b = "+calc.add());
		System.out.println("a - b = "+calc.subtract());
		System.out.println("a * b = "+calc.multiply());
		System.out.println("a / b = "+calc.divide()+"\n");
		
		// 클래스 메소드 호출
		System.out.println("a + b = "+Calculator3.add(10,5));
		System.out.println("a - b = "+Calculator3.subtract(10,5));
		System.out.println("a * b = "+Calculator3.multiply(10,5));
		System.out.println("a / b = "+Calculator3.divide(10,5));
	}
}
