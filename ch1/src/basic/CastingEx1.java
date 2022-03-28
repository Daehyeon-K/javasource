package basic;

// 형 변환, 특히 강제 형 변환
// 작은 크기 타입 = 큰 크기 타입
// 모든 경우는 아니나, 수의 손실이 일어날 수 있다

public class CastingEx1 {
	public static void main(String[] args) {
		int intValue = 1034;
		//byte byteValue = intValue; -> cannot convert from int to byte
		// -> byte의 range 밖이기에 개념 상 안됨. 근데 할 수는 있음 (캐스팅)
		
		byte byteValue = (byte)intValue; // 강제 형 변환
		System.out.println("byteValue = "+byteValue);
		// 변환 가능한 자리 만큼 여러 비트 중 뒤에서 잘라서 가져옴.
		// 0000000010000101 -> 0101 부분만 가져올 수 있어서
		// 손실이 있어서 원본 숫자 잘 기억 못함
		
		int num1 = 123456780;
		
		double num2 = num1; // 자동 형 변환
		//int num3 = num2;
		// -> 역시, 큰 자료형을 작은 자료형에 넣으려 하니 안됨
		System.out.println("num2 = "+num2);
		//이때는 지수 형태로 저장된 것을 확인 가능
		
		int num3 = (int)num2; // 강제 형 변환
		System.out.println("num3 = "+num3);
		// 이 경우엔 수의 손실이 없음
		
		
	}
}
