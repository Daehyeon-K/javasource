package arrays;

import java.util.Arrays;

// Arrays :배열 처리를 쉽게 하도록 도와주는 클래스 

public class ArraysEqual {
	public static void main(String[] args) {
		int arr1[] = {10, 73, 2, -5, 42};
		int arr2[] = {10, 73, 2, -5, 41};
		
		// arr1의 요소와 arr2의 요소 비교
		System.out.println(Arrays.equals(arr1, arr2)?"배열 요소가 같음":"배열 요소가 다름"); // for 문 안짜도 되어서 편함
		
		System.out.println(arr1); // 주소
		System.out.println(Arrays.toString(arr1)); // 값을 문자열로 출력
		
	}
}
