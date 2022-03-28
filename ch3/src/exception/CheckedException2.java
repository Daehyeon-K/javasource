package exception;

// 예외 떠넘기기 : throws 예외 클래스 명

public class CheckedException2 {
	public static void main(String[] args) throws ClassNotFoundException { // 직접 라인에서 처리 안하고 호출한 쪽으로 예외 떠넘기기 여기선 JVM으로 넘어감
		
		// Checked Exception
		Class.forName(null);
		
		
		
	}
}
