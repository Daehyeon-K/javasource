package api;

public class StringBuilderEx {
	public static void main(String[] args) {
		// String 클래스와 다른 점은
		// StringBuilder : 문자열 클래스, 싱글 스레드
		// StringBuffer : 문자열 클래스, 멀티 스레드
		// 둘의 사용법이 같지만 스레드 사용이 다름
		
		StringBuilder builder = new StringBuilder("Hello Java");
		System.out.println(builder);
		builder.append(" 안녕하세요");
		System.out.println(builder);
		
		// builder = "ttt"; (X) 리터럴로는 안됨
		
		System.out.println(builder.delete(0, 2));
		System.out.println(builder);
		
		builder.insert(2, "T");
		System.out.println(builder);
		
		StringBuilder builder1 = new StringBuilder("Hello");
		StringBuilder builder2 = new StringBuilder("Hello");
		
		// 오버라이딩 없이 사용 중 => 주소 비교 됨
		System.out.println(builder1.equals(builder2));
		
		// 다형성을 통해 오버라이딩 된 equals() 사용 가능 => String 메소드 가져와서 좀 쓸 수 있다.
		String str1 = new String(builder1);
		String str2 = new String(builder2);
		System.out.println(str1.equals(str2));
	}
}
