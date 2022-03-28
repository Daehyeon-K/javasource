package condition;

public class ForEx3 {
	public static void main(String[] args) {
		// 1 ~ 10 까지의 합
		
		int sum = 0;
		for(int i=1; i<11;i++) {
			sum += i; // sum = sum + i;
		}
		// System.out.println(i); -> i가 사용 불가. 지역변수니까.
		// 해결하려면, for 문에서 i를 메소드 단위에서 선언하고 계산하면 가능.
		System.out.println("1~10 까지의 합 : "+sum);
		
		// 1 ~ 100 까지의 합
		
		sum = 0;
		for (int j = 1; j<101; j++) {
			sum += j;
		}
		System.out.println("1~100 까지의 합 : "+sum);
		
	}
}
