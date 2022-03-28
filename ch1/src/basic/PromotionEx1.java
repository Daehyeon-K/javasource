package basic;


// 형 변환
// 자동 형 변환과 강제 형 변환


public class PromotionEx1 {
	public static void main(String[] args) {
		byte byteValue = 10;
		
		int intValue = byteValue; // 자동 형 변환
		System.out.println("intValue = "+ intValue);
		
		char charValue = 'A';
		intValue = charValue; // 자동 형 변환
		System.out.println("intValue = "+ intValue);
		
		intValue = 500;
		long longValue = intValue; // 자동 형 변환
		System.out.println("longValue = "+longValue);
		
		float floatValue = intValue; // 자동 형 변환
		// 다만, 소수점으로 만들어야 하기에 0을 붙이는 것
		System.out.println("floatValue = "+floatValue);
		
		floatValue = 35.2f;
		double doubleValue = floatValue; // 자동 형 변환
		// double이 더욱 정확하기에, float에 있는 수 외엔 모두 무작위로 들어가는 것
		System.out.println("doubleValue = "+doubleValue);
		
		int v1 = 10;
		double d1 = 5.5;
		
		double d2 = v1 + d1; // 두 서로 다른 타입을 산술연산할 때 큰 타입을 따라감
		System.out.println("d2 = v1 + d1 = "+d2);
		
		//int d3 = v1 + d2;
		// -> 이대로 연산된 double 값을 int로 바꿀 수는 없음. 연산은 되지만 대입이 안됨
		
	}
}
