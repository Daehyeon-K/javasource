package api;

public class Replace {
	public static void main(String[] args) {
		String str1 = "Hello Java. Hello Java";
		str1.replace("Java", "자바"); // 안변함. String은 불변(immutable) 객체 => 효율이 떨어지는 편
									 // => StringBuffer나 StringBuilder가 나음
									 // => 해당하는 거 모두 다 변경해줌
		System.out.println(str1);
		System.out.println(str1.replace("Java", "자바")); // 여기선 변한 거. 즉, 기존 객체는 변하지 않고 바꾼 새 문자열 리턴
	
		String str3 = str1.replace("Java", "자바"); // 새 문자열 대입
		System.out.println(str3);
		
		String str4 = str1.replaceFirst("Java", "자바"); // 모두 바꾸진 않고 처음 것만
		System.out.println(str4);
		
		String str2 = "Hello"; // 아래 모두 Hello 뒤에 붙인 게 아니라 기존 것 없애고 다시 합쳐서 만드는 것
		str2 += " 안녕하세요";
		str2 += " 반가워요";
		str2 += " 잘있어요";
		str2 += " 다시만나요";
		System.out.println(str2);
	}
}
