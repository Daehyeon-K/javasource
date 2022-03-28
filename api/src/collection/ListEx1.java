package collection;

import java.util.ArrayList;
import java.util.List;

// List 인터페이스
// 순서가 있음
// 데이터 중복 허용
// 구현 클래스 : ArrayList, Vector, LinkedList, Stack...
// 배열과 거의 동일. 단, 배열보다 다루기 더욱 편함. 향상된 버전

public final class ListEx1 {
	public static void main(String[] args) {
		
		// 정수 int의 Wrapper 클래스, Integer 사용 필요
		
		List<Integer> list = new ArrayList<Integer>(); // 리스트는 이렇게 뭐 담을 지 얘기 해야 함
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(2);
		
		System.out.println(list);
		
		list.add(3, 11);
		
		System.out.println(list);
		
		for(Integer i : list){
			System.out.println(i);
		}
	}
}
