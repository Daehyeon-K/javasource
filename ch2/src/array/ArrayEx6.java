package array;

import java.util.Arrays;

// 배열 응용

public class ArrayEx6 {
	public static void main(String[] args) {
		// 10 명의 점수를 배열로 생성하고
		// 점수 최댓값, 최솟값 출력
		
		int score[] = new int[10], max, min;
		
		for (int i = 0; i < score.length ; i++) {
			score[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(score));
		
		max = score[0];
		min = score[0]; 
		for (int i = 1; i < score.length; i++) {
			if (score[i]>=max) {
				max=score[i];
			}
			if (score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("Max_score: "+max+"\tMin_score: "+min);
	}
}
