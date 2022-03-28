package op;

// 여러 문자열 형태에 따른 비교

public class CompareOperatorEx2 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동"); //사실 이 방식이 맞긴 함
		// 이런 문자열의 경우 String 클래스를 이용하는 것임 Scanner 역시 클래스
		
		System.out.println("str1 == str2 : "+(str1==str2));
		System.out.println("str1 == str3 : "+(str1==str3));
		//이게 false인 이유는 문자열의 경우 자료형과 다른 방식으로 만들어진다는 것
		// 문자열 비교하고 싶을 땐 == 쓰면 안됨. .equals 메소드 사용
		System.out.println("str1 == str3 : "+(str1.equals(str2)));
		System.out.println("str1 == str3 : "+(str1.equals(str3)));

	}
}
