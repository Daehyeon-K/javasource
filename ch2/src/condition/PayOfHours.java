package condition;

import java.util.Scanner;

public class PayOfHours {
	public static void main(String[] args) {
		// 사용자로부터 근무시간 입력받기
		// 근무시간 중 8시간 까지는 시간당 9800원 지급
		// 8시간을 초과하는 근무시간은 시간 당 급여의 1.5배로 지급
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간을 입력하세요. : ");
		int hours = sc.nextInt();
		int salary;
		
		if (hours<=8) {
			salary = 9800*hours;
		}
		else {
			salary = (9800*hours)+9800/2*(hours-8);
		}
		
		System.out.printf("급여는 %d원 입니다.", salary);
		sc.close();
	}
}
