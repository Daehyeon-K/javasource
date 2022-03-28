package etcetra;

import java.util.Scanner;

public class warYear {
	public static void main(String[] args) {
		int year, month, day, result;
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arr.length;i++) {
			System.out.print("Put year : ");
			year = sc.nextInt();
			System.out.print("Put month : ");
			month = sc.nextInt();
			System.out.print("Put day : ");
			day = sc.nextInt();
		
			result = (year/100)+(year%100)+month+day;
		
			System.out.println("Result : "+result);
			arr[i] = result;
		}
		
		sc.close();
	}
}
