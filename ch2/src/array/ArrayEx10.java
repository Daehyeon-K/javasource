package array;

public class ArrayEx10 {
	public static void main(String[] args) {
		int scores[][] = {{15, 25},{45, 55, 65},{75, 85, 95, 105}};
		
		// 행의 개수는 동일하지만 열의 개수는 지정 안하고 행마다 열 개수 다를 수도 있음.
		
		for (int score[]:scores) {
			for(int i : score){
			System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
