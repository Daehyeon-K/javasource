package collection;

import java.util.LinkedList;
import java.util.List;

// ArrayList, Vector 단점을 보완
// 크기 변경, 비순차적인 데이터의 추가(add), 삭제에 시간이 많이 걸리는 단점 보완

public class ListEx7 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("사과");
		list.add("포도");
		list.add("메론");
		list.add("바나나");
		list.add("수박");
		list.add("참외");
		
		System.out.println(list);
		
		// 시스템적으로 ArrayList나 Vector와 다른게 있어서 메모리상의 특징을 구현해 놓은 LinkedList의 메소드가 따로 있음
	}
}
