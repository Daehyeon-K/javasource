package condition;

import java.util.Scanner;

// 중첩 조건문도 가능

public class IfEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		char opt = ' '; // 공백도 문자. 공백으로 초기화 한 것
		char grade = ' ';
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			}
			else {
				opt = '-';
			}
		}
		else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			}
			else {
				opt = '-';
			}
		}
		else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);
		sc.close();
	}
}
