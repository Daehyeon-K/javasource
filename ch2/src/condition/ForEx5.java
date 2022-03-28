package condition;

public class ForEx5 {
	public static void main(String[] args) {
		// 구구단 작성
		
		for (int i=1; i<10; i++) {
			System.out.println("< "+i+"단 >");
			for (int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("\n");
		}

	}
}
