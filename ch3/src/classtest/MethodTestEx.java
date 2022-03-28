package classtest;

import java.util.Arrays;

public class MethodTestEx {
	public static void main(String[] args) { // 아웃풋이 없는 정적 메소드, 인자 하나
		MethodTest1 obj = new MethodTest1();
		
		System.out.println(obj.sum(5, 6));
		
		char charValue = obj.method1();
		
		int value = charValue+1;
		
		System.out.println(value);
		
		double dValue = obj.divide1(99, 33);
		System.out.println(dValue);
		
		int arr[] = {1,2,3,4,5};
		int[] intArr = obj.array(arr);
		System.out.println(Arrays.toString(intArr));
		

	}
}
