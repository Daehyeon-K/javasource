package api;

public class StringEx1 {
	public static void main(String[] args) {
		
		// 문자열 만들 때 2가지 방법
		// 문자열 리터럴을 지정
		// String 클래스 생성자 이용
		String str1 = "Hello";
		String str2 = "Hello"; // 이렇게 같은 리터럴로 생성하면 메모리 새로 안 잡고, 같은 곳 주소만 가리키게 됨
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1 == str2); // true나옴. 같은 주소를 가리키고 있기에 주소가 같다는 게 됨
		System.out.println(str3 == str4); // false나옴. 각 다른 주소 잡혀서
		// => 내용비교 equals()
	}
}
