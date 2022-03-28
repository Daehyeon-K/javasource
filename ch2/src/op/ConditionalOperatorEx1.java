package op;

// 삼항 연산자 : (조건) ? (참일때 수행할 코드) : (거짓일 때 수행할 코드)

public class ConditionalOperatorEx1 {
	public static void main(String[] args) {
		
		int score = 85;
		System.out.println("score 판단 : "+(score <= 90 ? 'A' : 'B')); 
		
		char grade = score <= 90 ? 'A' : 'B';
		System.out.println("score 판단 : "+grade); 
		
		// 90 이상은 A, 80 이상은 B, 나머지 C
		grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';
		System.out.println("score 판단 : "+grade);
	}
}
