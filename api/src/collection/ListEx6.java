package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("키위");
		list.add("포도");
		
		// list => 배열
		Object[] fruit =list.toArray();
		
		for(Object obj : fruit) {
			System.out.println(obj);
		}
		
		// 배열 => list
		String f[] = {"사과", "포도", "멜론", "수박", "참외", "자두", "바나나"};
		List<String> list1 =Arrays.asList(f);
		System.out.println(list1);
		
		// list1.add("딸기"); // 이거 런타임 예외(unchecked exception) 뜸. => 배열 자체가 고정크기 가지고 있어서 생기는 문제. 추가 개념 붙일 수가 없음.
		
		// 해결해주는 다른 생성법 (배열로부터 생성한 리스트의 변화가 필요할 때)
		List<String> list2 = new ArrayList(Arrays.asList(f)); // 아예 새로운 객체 생성
		list2.add("딸기");
		System.out.println(list2);
		
	}
}
