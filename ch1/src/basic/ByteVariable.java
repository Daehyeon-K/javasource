package basic;

public class ByteVariable {

	public static void main(String[] args) {
		byte b1 = 3;
		System.out.println("b1 = "+b1);
		
		byte b2 = -128;
		byte b3 = 127;
		//byte b4 = 128; int를 byte로 변경 불가
		System.out.println("b2 + b3 = "+(b2+b3));

	}

}
