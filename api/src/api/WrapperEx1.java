package api;

// Wrapper 클래스
// 기본형 타입을 객체로 다루기 위한 클래스들

// int => Integer (Integer.parseInt())
// boolean => Boolean (Boolean.parseBoolean())
// byte => Byte
// short => Short
// char => Character

public class WrapperEx1 {
	public static void main(String[] args) {
		//Boolean b = new Boolean(true); // 이렇게 지운 건 버전에서 Deprecated 됐다는 거. (이전 버전 때문에 남아 있지만 쓰지 마라)
		
		//Integer i = new Integer(100); // 이렇게 지운 건 버전에서 Deprecated 됐다는 거. (이전 버전 때문에 남아 있지만 쓰지 마라)
		
		Boolean b = Boolean.valueOf(true);
		
		Integer i = Integer.valueOf(100);
		
		int i2 = 100;
		
		System.out.println(i==i2);
		System.out.println(i);
	}
}
