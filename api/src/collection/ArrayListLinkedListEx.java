package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 런타임 에러 뜸

// 순차 추가, 삭제는 ArrayList가 LinkedList보다 빠름
// 중간 추가, 삭제는 LinkedList가 ArrayList보다 빠름

public class ArrayListLinkedListEx {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(2000000); // 이렇게 공간을 잡아두고 공간의 크기가 넉넉해야 순차에서 얘가 효율적인 것
		LinkedList<String> ll = new LinkedList<String>();
		
		System.out.println("--- 순차적 추가 ---");
		System.out.println("ArrayList : "+add1(al));
		System.out.println("LinkedList : "+add1(ll));
		
		System.out.println("--- 중간에 추가 ---");
		System.out.println("ArrayList : "+add2(al));
		System.out.println("LinkedList : "+add2(ll));
		
		System.out.println("--- 중간에서 삭제 ---");
		System.out.println("ArrayList : "+remove2(al));
		System.out.println("LinkedList : "+remove2(ll));
		
		System.out.println("--- 순차적으로 추가 ---");
		System.out.println("ArrayList : "+remove1(al));
		System.out.println("LinkedList : "+remove1(ll));
		
		
	}
	
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i=0; i<100000; i++) {
			list.add(i+""); // 순차적 추가
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i=0; i<1000; i++) {
			list.add(500,"X"); // 500번대 위치에 추가 (중간에서 추가)
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i=list.size(); i>=0; i--) {
			list.remove(i); // 순차적 제거
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i=0; i<1000; i++) {
			list.remove(i); // 삭제하고 땡기고 하는 작업 있으니 중간에서 삭제하는 거
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
}
