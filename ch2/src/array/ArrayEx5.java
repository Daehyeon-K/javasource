package array;

import java.util.Arrays;

public class ArrayEx5 {
	public static void main(String[] args) {
		int iArr[] = {1, 2, 3, 4, 5};
		String strArr[] = {"abc", "cde", "spring"};
		
		// 단순 확인을 위해선 Arrays.toString(배열명) = 가장 간단
		System.out.println(iArr); // [I@7d6f77cc
		System.out.println(Arrays.toString(iArr)); // [1, 2, 3, 4, 5]
		
		System.out.println(strArr); // [Ljava.lang.String;@5aaa6d82
		System.out.println(Arrays.toString(strArr)); // [abc, cde, spring]
		

	}
}
