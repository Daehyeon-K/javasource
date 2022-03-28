package array;

import java.util.Arrays;

// 이차원 배열

public class ArrayEx9 {
	public static void main(String[] args) {
		int scores[][] = new int[3][3];
		
		for (int i = 0; i<scores.length; i++) { // 행 길이
			for (int j = 0; j<scores[i].length ; j++) { // 열 길이
				scores[i][j] = ((j+1)*10)+(i*30);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		// for (int score : scores) -> 2차원 배열에서 이거 그냥 돌리면 배열이 와서 안되는 거
		for (int score[] : scores) {
			for (int i : score) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
