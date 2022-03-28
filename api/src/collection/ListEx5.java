package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member("hong", "홍길동", "hong123"));
		list.add(new Member("kang", "강길동", "kang123"));
		list.add(new Member("park", "박길동", "park123"));
		list.add(new Member("kim", "김길동", "kim123"));
		
		System.out.println(list);
		
		for (Member m : list) {
			System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPassword());
		}
		for (int i = 0 ; i<list.size();i++) {
			System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+list.get(i).getPassword());
		}
	}
}
