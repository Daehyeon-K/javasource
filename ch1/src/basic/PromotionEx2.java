package basic;

// 형 변환

public class PromotionEx2 {

	public static void main(String[] args) {
		byte b1 = 3;
		short s1 = 10;
		
		//short result = b1 + s1;
		// -> int보다 작은 타입들을 연산하는 경우 결과가 int로 돌아옴
		
		int result = b1 + s1;
		// 연산 과정에서 int보다 작은 타입 정수들은 int로 자동 형 변환
		// 그렇기에 주로 간편하게 int 타입을 사용
		System.out.println("result = "+result);
		

	}

}
