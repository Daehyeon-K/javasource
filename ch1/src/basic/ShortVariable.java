package basic;

public class ShortVariable {

	public static void main(String[] args) {
		short s1 = 200;
		System.out.println("s1 = "+s1);
		
		byte b1 = 12;
		short s2 = 25;
		
		System.out.println("b1 + s2 = "+(b1+s2));
		
		//short result = b1 + s2;
		// -> 마찬가지로 오류
		//System.out.println("result = "+result);

	}

}
