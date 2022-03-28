package api;

public class Trim {
	public static void main(String[] args) {
		String s = "      Hello World   ";
		String s2 = "Hello World";
		System.out.println(s);
		System.out.println(s.equals(s2));
		System.out.println(s.trim().equals(s2)); // 앞 뒤의 공백 제거
		String s3 = s.trim();
		System.out.println(s3.equals(s2));
		
		
	}
}