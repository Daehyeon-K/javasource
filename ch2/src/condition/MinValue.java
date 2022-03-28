package condition;

import java.util.Scanner;

public class MinValue {
	public static void main(String[] args) {
		// 세 개의 정수를 입력 받아 가장 작은 수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫째 정수를 입력하시오: ");
		int i1 = sc.nextInt();
		System.out.print("둘째 정수를 입력하시오: ");
		int i2 = sc.nextInt();
		System.out.print("셋째 정수를 입력하시오: ");
		int i3 = sc.nextInt();
		int min = 0;
		int max = 0;
		
		if (i1<=i2) {
			min = i1;
			if (i1<=i3) {
				System.out.printf("최솟값은 %d 입니다.", min);
			}
			else if (i1>i3) {
				min = i3;
				System.out.printf("최솟값은 %d 입니다.", min);
			}
		}
		else if (i1>i2) {
			min = i2;
			if (i2<=i3) {
				System.out.printf("최솟값은 %d 입니다.", min);
			}
			else if (i2>i3) {
				min = i3;
				System.out.printf("최솟값은 %d 입니다.", min);
			}
		}
		
		
		min=0;
		max = 0;
		if (i1<=i2) {
			min += i1;
			if (i1>i3) {
				min -= i1;
				min += i3;
			}
		}
		else if (i1>i2) {
			min += i2;
			if (i2>i3) {
				min -= i2;
				min += i3;
			}
		}
		if (i1>=i2) {
			max += i1;
			if (i1<i3) {
				max -= i1;
				max += i3;
			}
		}
		else if (i1<i2) {
			max += i2;
			if (i2<i3) {
				max -= i2;
				max += i3;
			}
		}
		System.out.printf("최솟값은 %d, 최댓값은 %d 입니다.", min, max);
		
		min = i1;
		max = i1;
		if (min>i2) {
			min = i2;
		}
		if (min>i3) {
			min = i3;
		}
		if (max<i2) {
			max = i2;
		}
		if (max<i3) {
			max = i3;
		}
		System.out.printf("최솟값은 %d, 최댓값은 %d 입니다.", min, max);
		
		sc.close();
		
		
		
	

	}
}
