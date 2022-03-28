package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort4 {
	public static void main(String[] args) {
		String arr[] = {"대한민국", "우리나라", "서울", "대구", "부산", "나주"};
		
		// 오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 정렬
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
	}
}
