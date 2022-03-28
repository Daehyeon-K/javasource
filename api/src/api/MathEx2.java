package api;

// Math 떼어내고 사용하는 방법 (가지고 있는 메소드가 모두 static인 클래스의 경우 가능)
import static java.lang.Math.*;

public class MathEx2 {
	public static void main(String[] args) {
		double val = 90.7552;
		
		System.out.println("반올림"+round(val));
		System.out.println("올림"+ceil(val));
		System.out.println("버림"+floor(val));
		
		System.out.println(random());
		System.out.println(E);
		System.out.println(PI);
		
	}
}
