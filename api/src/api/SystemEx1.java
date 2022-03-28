package api;

public class SystemEx1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.print(i+"\t");
			
			if(i==5) {
				//System.exit(0); // 프로그램 종료, 0은 정상 종료를 의미
			}
		}
		
		System.out.println();
		
		// System.nanoTime(); 나노초
		
		long sum = 0;
		long start = System.currentTimeMillis();
		for (int i=1; i<10000000;i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("1 ~ 10,000,000 합 : "+sum);
		System.out.println("1 ~ 10,000,000 합 구하는 데 걸리는 시간 : "+(end-start)+"ms");
		
		System.out.println(System.currentTimeMillis());
		
	}
}
