package exam;

public class Printer {
	public void println(int i) {
		System.out.println("정수 값: "+i);
	}
	public void println(boolean b) {
		System.out.println("논리 값: "+b);
	}
	public void println(double d) {
		System.out.println("실수 값: "+d);
	}
	public void println(String s) {
		System.out.println("문자열 값: "+s);
	}
}
