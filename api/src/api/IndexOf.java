package api;

public class IndexOf {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		// indexOf() : 문자열 포함 여부
		int pos = str1.indexOf("프");
		System.out.println(pos); // 3
		
		System.out.println(str1.indexOf("크")); // -1
		
		if(str1.indexOf("자바") == -1) {
			System.out.println("자바 문자열 없음");
		} else {
			System.out.println("자바 문자열 있음");
		}
		
		String str2 = new String("HelloHelloHello World");
		// 가장 처음에 만나는 위치
		System.out.println(str2.indexOf('o'));
		
		// 가장 마지막에 만나는 위치
		System.out.println(str2.lastIndexOf('o'));
		
		// 해당 위치 이후 처음에 만나는 위치
		System.out.println(str2.indexOf('o', 6));
		
		// 해당 위치 이전 마지막에 만나는 위치
		System.out.println(str2.lastIndexOf('o', 6));
		
	}
}
