package api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {
	public static void main(String[] args) {
		// 사용자로부터 문자열을 입력받아 공백으로 분리된 어절이 몇 개인가 출력
		
		// 오늘은 화요일 입니다. => 3
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		while (true) {
			System.out.print("문자열 입력 (종료는 exit) >>");
			str = sc.nextLine();
			if (str.equals("exit")) { System.out.println("종료합니다."); break; }
			StringTokenizer st = new StringTokenizer(str);
			System.out.println("어절의 수는 "+st.countTokens()+"입니다.");
			
		}
	}
}
