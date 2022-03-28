package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx8 {
	public static void main(String[] args) {
		// Scanner를 사용하여 5개의 실수 값을 사용자로부터 받아 ArrayList에 저장한 후
		// 검색하여 가장 큰 수 출력
		// 예시) 입력값: 3.14 2.1 -5.5 99.9 33.7 // 출력값: 가장 큰 수는 99.9
		
		Scanner sc = new Scanner(System.in);
		List<Double> dl = new ArrayList<Double>();
		Double max1;
		
		System.out.print("실수 값을 입력하시오 : ");
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		while (st.hasMoreTokens()) {
			dl.add(Double.parseDouble(st.nextToken()));
		}
		
		max1 = dl.get(0);
		
		for (Double d : dl) {
			if (d > max1) {
				max1 = d;
			}
		}
		
		System.out.println("가장 큰 수는 "+max1);
		
		System.out.println("가장 큰 수는 "+Collections.max(dl));
			
		
		
		
	}
}
