package basic;

public class VariableScope2 {
	public static void main(String[] args) {
		int v1 = 15;
		
		if (v1 > 10) {
			int v2 = v1 - 10;
			System.out.println("v1 = "+v1+", v2 = "+v2);
			//이 블록 안에선 당연히 됨
		}
		
		//System.out.println("v1 = "+v1+", v2 = "+v2);
		// -> v2는 선언된 블록을 빠져 나왔으니 오류
		// -> v2 cannot be resolved to a variable
		
	}
}
