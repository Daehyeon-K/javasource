package op;

// 증감 연산자는 선치 후치 모두 가능
// 각 경우 연산의 순서가 달라짐

public class IncreaseDecreaseOperatorEx2 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int result1 = ++x + 20; //22
		// 1. x += 1
		// 2. (1.) + 20
		// 3. result1 = (2.) (대입 연산자 실행)
		System.out.println("result1 = "+result1);
		
		int result2 = --y + 20; //20
		// 1. y -= 1
		// 2. (1.) + 20
		// 3. result2 = (2.) (대입 연산자 실행)
		System.out.println("result2 = "+result2);
		
		x = 1;
		y = 1;
		
		int result3 = x++ + 20;
		// 1. x + 20
		// 2. result3 = (1.) (대입 연산자 실행)
		// 3. x += 1
		System.out.println("result3 = "+result3);
		
		int result4 = y-- + 20;
		// 1. y + 20
		// 2. result4 = (1.) (대입 연산자 실행)
		// 3. y -= 1
		System.out.println("result4 = "+result4);

	}
}
