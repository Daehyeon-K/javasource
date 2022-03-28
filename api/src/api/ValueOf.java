package api;
public class ValueOf {

	public static void main(String[] args) {
		
		// 지정된 값을 문자열로 변환
		
		String b = String.valueOf(false);
		System.out.println(b); // "false"
		
		String c = String.valueOf('c');
		System.out.println(c); // "c"
		
		String f1 = String.valueOf(10f);
		System.out.println(f1); // "10.0"
		
		String l = String.valueOf(10l);
		System.out.println(l); // "10"
		
		
		// 반대 개념 => "b" => boolean
		boolean b2 = Boolean.parseBoolean(b);
		
		// "3" => boolean 타입
		int i = Integer.parseInt("3");
		System.out.println(i);
		
		// 10.0 => float 타입
		float f2 = Float.parseFloat(f1);
		System.out.println(f2);
	}
}
