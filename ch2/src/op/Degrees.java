package op;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		// 화씨온도 => 섭씨온도
		// 화씨온도 입력받은 수 섭씨온도로 변환하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 화씨온도를 입력하시오. : ");
		double fTemp = sc.nextDouble();
		double cTemp = (fTemp - 32) * 5 / 9.0; // 이거 하나가 더블 형태로 되어야 실수 형태로 잘 계산이 됨.
		// 저거 9.0 처럼 더블로 안하고 다 int면 안됨
		System.out.println("입력한 온도는 섭씨온도로 "+cTemp+"℃ 입니다.");
		System.out.printf("입력한 온도는 섭씨온도로 %.2f℃ 입니다. (소수 2자리까지 반올림)\n프로그램 종료",cTemp);
		//printf에선 더하기 대신 컴마
		//format 지정: %f(실수형), %d(정수형), %c(문자 - ’ ‘), %s(문자열 - “ “)
		sc.close();
	}
}
