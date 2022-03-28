package api;

public class Equals {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		
		System.out.println(str1.equals(str2)); // 문자열 비교
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 무시하고 비교
	}
}
