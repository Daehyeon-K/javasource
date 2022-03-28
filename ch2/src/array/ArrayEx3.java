package array;

public class ArrayEx3 {
	public static void main(String[] args) {
		// score 배열명으로, 5개의 int 값 받는 배열 생성
		// 값의 초기화는 0, 10, 20, 30, 40
		
		int score[] = new int[5];
		for (int i = 0; i<score.length ; i++) { // 배열.length 기억!
			score[i]=i*10;
			System.out.println("score["+i+"] = "+score[i]);
		}
		
		int score2[] = {48, 78, 25, 65, 36, 79};
		double s2Mean;
		int s2Sum=0;
		for (int i = 0; i<score2.length; i++) {
			s2Sum += score2[i];
		}
		s2Mean = (double)s2Sum/score2.length;
		System.out.printf("score2의 평균: %f, 합: %d", s2Mean, s2Sum);
	}
}
