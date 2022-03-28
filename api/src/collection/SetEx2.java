package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		// 로또 번호
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; set.size()<6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println(set);
		
		// 정렬해서 출력 (가지고 나오는 게 순서가 없어서 sort는 어려움)
		// Collections.sort(null); // 이건 다 리스트와 그 자식 타입만 인자로 들어갈 수 있음. 즉, 순서가 있어야 한다는 거
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
