package op;

import java.util.Scanner;

public class ConditionalOperatorEx2 {

	public static void main(String[] args) {
		//숫자 입력받고, 숫자 양 음 판단 및 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오. : ");
		double num = sc.nextDouble();
		
		System.out.println(num>=0 ? "양수입니다." : "음수입니다.");
		
		sc.close();

	}

}
