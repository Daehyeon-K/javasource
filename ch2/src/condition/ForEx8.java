package condition;

public class ForEx8 {

	public static void main(String[] args) {
		// 직각 삼각형 모양 별
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = 0 ; j < i+1 ; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		for (int i = 0 ; i <5 ; i++) {
			for (int j = 4 ; j > i ; j--) {
				System.out.print("  ");
			}
			for (int k = 0; k <= i ; k++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		for (int i = 1 ; i <=5 ; i++) {
			for (int j = 5 ; j >= 1 ; j--) {
				if (j<=i) {
					System.out.print(" *");
					}
				else {
					System.out.print("  ");	
					}
				}
			System.out.print("\n");
			}
		for (int i = 1 ; i <=5 ; i++) {
			for (int j = 5 ; j >= 1 ; j--) {
				System.out.print(j<=i?" *":"  ");
				}
			System.out.print("\n");
			}
			
		
		

	}

}
