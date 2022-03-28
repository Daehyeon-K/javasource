package op;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 "); // 이 메세지가 있어야 사용자로 하여금 디렉션을 명확히 알 수 있어서 있는 것
		int num = sc.nextInt(); // 사용자에게 정수를 입력받는 부분 (문자 입력 시 exception 발생)
		
		System.out.println("입력한 숫자는 "+num);
		
		sc.close();
	}
}
