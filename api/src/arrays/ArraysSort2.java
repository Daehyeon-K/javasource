package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort2 {
	public static void main(String[] args) {
		//int arr[] = {37, 21, 56, 99, 88, 58, 62, 15, 39, 78};
		Integer arr[] = {37, 21, 56, 99, 88, 58, 62, 15, 39, 78};
		
		// 내림차순 정렬
		// Arrays.sort(arr, Comparator.reverseOrder()); => sort(int[]) in the type Arrays is not applicable for the arguments
		// sort(T[] a, Compar~)
		// T, E, K, V 등 대문자로 나오는 타입이 있음. 이건 객체라는 이야기.
		// 지금 arr은 기본형이라 객체 타입으로 들어와야 하는 것
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
		/*System.out.println(Arrays.binarySearch(arr, 56));*/
		
	}
}
