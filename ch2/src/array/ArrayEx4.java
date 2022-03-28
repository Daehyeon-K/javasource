package array;

// 향상된 for: 배열, 리스트에서 사용
// for (타입 변수명 : 배열명 or 리스트명) { 수행문 }

public class ArrayEx4 {
	public static void main(String[] args) {
		char chArr[] = {'a', 'b', 'c', 'd', 'e'};
		for (int i = 0; i<chArr.length; i++) {
			System.out.println("chArr["+i+"] = "+chArr[i]);
		}
		
		String strArr[] = {"a", "b", "c", "d", "e"};
		for (int i = 0; i<strArr.length; i++) {
			System.out.println("strArr["+i+"] = "+strArr[i]);
		}
		
		System.out.println(chArr); // abcde -> char 배열만 println에서 오버라이딩 되어 그럼
		System.out.println(strArr); // [Ljava.lang.String;@396f6598
		
		for (char chArrElement : chArr) { // = 해당 배열에서 차례로 하나씩 가져와서 변수에 넣고 반환
			System.out.println("chArrElement = "+chArrElement); // 차례로 무언가(특히 단순 출력 등) 하는 경우엔 이 향상된 for가 더 편함
		}
		
		for (String strArrElement : strArr) {
			System.out.println("strArrElement = "+strArrElement);
		}
		
		
	}
}
