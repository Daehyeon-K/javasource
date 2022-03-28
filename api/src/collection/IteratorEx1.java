package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Iterator
// 컬렉션에 저장된 요소를 접근하는 데 사용되는 인터페이스
// List는 get으로 순서대로 호출 가능한데 Set은 그게 안되니까 통일된 호출 방식이 없음. 이거 표준화하려는 방식
// hasNext() : 읽어올 요소가 있는지
// next() : 다음 요소 읽어오기
// remove() : next()로 읽어온 요소 삭제

public class IteratorEx1 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(2);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
