package collection;

import java.util.HashSet;
import java.util.Set;

// Set
// 순서가 없음
// 중복 허용 안함
// HashSet, TreeSet

public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Jsp");
		set.add("Jdk");
		set.add("Servlet");
		set.add("Oracle");
		set.add("Oracle"); // 이렇게 넣는다고 해도 set 구조 특성상 저장이 안됨
		
		System.out.println(set);
	}
}
