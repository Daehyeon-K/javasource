package basic;

public class EscapeChar {

	public static void main(String[] args) {
		// \n, \t 등
		char CR = 13;
		System.out.println("안녕하세요\nㅎㅇㅎㅇ");
		System.out.println("\t안녕하세요\n\tㅎㅇㅎㅇ");
		System.out.println("하세요\r안녕\nㅇㅎㅇ\rㅎ"); //? -> 과거 타자기 개념이라 지금은 같이 개행 해줘버림
		System.out.println("하세요"+CR+"안녕\nㅇㅎㅇ"+CR+"ㅎ"); //? -> 과거 타자기 개념이라 지금은 같이 개행 해줘버림
		//System.out.println("C:\"); 역슬래시 필요
		System.out.println("C:\\");
		System.out.println("'Hello'");
		//System.out.println(" "Hello" "); 역슬래시 필요
		System.out.println("\"Hello\"\n");
		
		System.out.print("Hello\n");
		System.out.print("world");
	}

}
