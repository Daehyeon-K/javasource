package op;

// 산술 연산자의 오버플로우

public class ArithmeticOperatorEx2 {
	public static void main(String[] args) {
//		int x = 1000000;
//		int y = 1000000;
//		
//		int z = x * y;
//		
//		System.out.println("x * y = "+z);
		// garbage in & garbage out
		// 잘못 넣으면 당연히 잘못 나옴
		// 로직을 잘못 짜서(코딩을 잘못 해서) int의 범위를 넘어서 오버플로우 되는 것
		
		long x = 1000000;
		long y = 1000000;
		
		long z = x * y;
		
		System.out.println("x * y = "+z);
		// long 범위 내이기에 가능. 특히 이 경우엔 x, y에 L 안붙이고 int로 계산해도 출력 변수가 long이니까 맞춰서 들어감		
		
	}
}
