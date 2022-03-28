package api;

public class ObjectEx1 {

	public static void main(String[] args) {
		
		// 객체 생성 : default 생성자 호출
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// 메소드 호출
		// equals() : String 문자열 비교 시 == 대신
		//			: String에선 오버라이딩 해서 값의 비교
		if (obj1.equals(obj2)) { // 주소 비교 => 다르다
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (obj1==obj2) { // 주소 비교 => 다르다
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2)?"같다":"다르다"); // 오버라이딩 안되고 부모가 넘겨준거라 이것도 오버라이딩 안하면 다르다 나옴
		System.out.println(value1==value2?"같다":"다르다");
		
		System.out.println("obj1.toString()"+obj1.toString()); //obj1.toString()java.lang.Object@5f282abb
		System.out.println("obj2.toString()"+obj2.toString()); //obj2.toString()java.lang.Object@167fdd33
		
		System.out.println("value1.toString()"+value1.toString()); //value1.toString()api.Value@1e965684
		System.out.println("value2.toString()"+value2.toString()); //value1.toString()api.Value@2d323532
		System.out.println(value1); // 동일 결과
		
		
	}

}
