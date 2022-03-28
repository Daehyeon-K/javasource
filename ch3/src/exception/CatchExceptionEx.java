package exception;

// 여러 오류 나타날 때 catch로 한 번에 처리하는 법 => catch(Exception e) 모든 exception 처리 가능
// 여러 오류 나타날 때 다중 catch로 처리

public class CatchExceptionEx {
	public static void main(String[] args) {
		
		try {
			// ArrayIndexOutOfBoundsException 가능
			String data1 = args[0];
			String data2 = args[1];
			
			// NumberFormatException
			int value1 = Integer.parseInt(data1); // "a100"
			int value2 = Integer.parseInt(data2);
			
			
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값 부족 or 숫자로 변경 불가");
		} 
	}
}
