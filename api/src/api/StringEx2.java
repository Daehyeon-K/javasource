package api;

public class StringEx2 {
	public static void main(String[] args) {
		// String 생성자 확인 (다양한 환경에서 다양한 형태로 들어오는 인자 대응)
		String str1 = new String();
		System.out.println("str1 = "+str1);
		
		char chArr[] = {'a', 'b', 'c', 'd', 'e'};
		String str2 = new String(chArr);
		System.out.println("str2 = "+str2);
		
		byte bytes[] = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str3 = new String(bytes);
		System.out.println("str3 = "+str3);
	}
}
