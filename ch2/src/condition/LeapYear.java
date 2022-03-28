package condition;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// 윤년, 평년 구하기
		// 연도 입력 받은 후 윤년, 평년인지 출력
		// 윤년= 연도를 4로 나눈 나머지가 0이고, 연도를 100으로 나눈 나머지가 0이 아니거나
		//      연도를 400으로 나눈 나머지가 0인 연도

		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오 : ");
		int year = sc.nextInt();
		
		if ((year%4==0 && year%100!=0)||year%400==0) { //윤년 개념에 따라 다를 수 있음
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("평년입니다.");
		}
		sc.close();
	}
}
