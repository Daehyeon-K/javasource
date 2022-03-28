package collection;

import java.util.Vector;
import java.util.List;

// ArrayList와 Vector 사용법 같음

public class ListEx4 {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("7");
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println("clear() 후"+list);
	}
}
