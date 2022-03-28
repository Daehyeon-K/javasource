package op;

// 증감연산자 (++, --)

public class IncreaseDecreaseOperatorEx1 {
	public static void main(String[] args) {
		int i = 10;
		
		++i; // i = i + 1;
		System.out.println("i = "+i);
		
		i++; // i = i + 1;
		System.out.println("i = "+i);
		
		--i; // i = i - 1;
		System.out.println("i = "+i);
		
		i--; // i = i - 1;
		System.out.println("i = "+i+"\n\n");
		
		
		System.out.println("i = "+i);
		System.out.println("i = "+(++i));
		
		System.out.println("i = "+i);
		System.out.println("i = "+(i++));
		
		System.out.println("i = "+i);
		System.out.println("i = "+(--i));
		
		System.out.println("i = "+i);
		System.out.println("i = "+(i--));
		
		System.out.println("i = "+i);

	}
}
