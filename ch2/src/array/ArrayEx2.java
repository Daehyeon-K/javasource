package array;

// 배열 선언, 생성, 초기화의 다양한 방식

public class ArrayEx2 {
	public static void main(String[] args) {
		// 방법 1 - 배열 선언, 생성, 초기화
		int arr[] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// 방법 2 - 배열 선언, 생성, 초기화
		int arr1[] = new int[] {10, 20, 30};
		
		// 방법 3 - 배열 선언, 생성, 초기화
		int arr2[] = {10, 20, 30}; // 주로 이거 쓸 거긴 함

		// 방법 4 - 배열 선언, 생성, 초기화
		int arr3[];
		arr3 = new int[] {10, 20, 30};
		
		System.out.println("arr2[0] = "+arr2[0]);
		System.out.println("arr2[1] = "+arr2[1]);
		System.out.println("arr2[2] = "+arr2[2]+"\n");
		// 위의 반복적인 부분 반복문으로 해결하기
		for (int i = 0; i <3; i++) {
			System.out.println("arr1["+i+"] = "+arr1[i]);
		}
		for (int i = 0; i <3; i++) {
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
		for (int i = 0; i <3; i++) {
			System.out.println("arr3["+i+"] = "+arr3[i]);
		}
		
		
		
	}
}
