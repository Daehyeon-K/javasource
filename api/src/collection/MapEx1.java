package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map
// key, value 구조로 저장
// key 값은 중복 안됨. value만 중복 가능

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		// 요소 추가 => 애들이 다 Map.Entry 객체 형태
		map.put("id_0123", "홍길동");
		map.put("id_0124", "김길동");
		map.put("id_0125", "최길동");
		map.put("id_0126", "박길동");
		
		System.out.println("키에 해당하는 값 가져오기 "+map.get("id_0123"));
		System.out.println("키가 존재하는 지 확인하기 "+map.containsKey("id_0123"));
		System.out.println("값이 존재하는 지 확인하기 "+map.containsValue("김길동"));
		System.out.println("Map이 비어있는 지 확인하기 "+map.isEmpty());
		System.out.println("Map 크기 : "+map.size());
		System.out.println("Map 요소 삭제 : "+map.remove("id_0126"));
		
		
		// 키 값만 가져오기
		// map.keySet() => Set<String> 반환함. 키도 중복 불가. Set도 중복 불가라서 이렇게 나오는 거
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// value 값만 가져오기
		// map.values() => Collection<String> 반환
		Collection<String> values = map.values();
		System.out.println(values);
		
		// Iterator를 이용한 값 호출 => 키만 쭉 가져오고, 이걸 기준으로 값까지 나오게 되는.
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = map.get(key);
			System.out.println(key +" : "+ value);
		}
	}
}
