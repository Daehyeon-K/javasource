package op;



public class LogicalOperatorEx2 {
	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println("charCode = "+charCode);
		char char1 = 'A';
		System.out.println("char1 = "+char1);
		
		if((charCode >= 65)&&(charCode <= 90)) {
			System.out.println("대문자");
		}
		
		if(!(charCode < 48)&&!(charCode > 57)) {
			System.out.println("숫자");
		}
		
		int value = 6;
		if ((value % 2 == 0)||(value%3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
	}
}
