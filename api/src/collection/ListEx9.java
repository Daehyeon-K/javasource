package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx9 {
	public static void main(String[] args) {
		// 한 어린이의 키를 2015 ~ 2021년 사이에 1년 단위로 입력받아
		// ArrayList에 저장, 가장 키가 많이 자란 연도 출력하기
		// 예시) 입력: 120 122 125 130 139 145 149 // 출력)
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		Integer year=0, max=0;
		
		for (int i = 2015; i<2022; i++) {
			System.out.print(i+"년의 키를 입력하시오 >> ");
			list.add(sc.nextInt());
		}
		
		for (int i= 2016; i<2022; i++) {
			if (max < list.get(i-2015)-list.get(i-2016)) {
				max = list.get(i-2015)-list.get(i-2016);
				year = i;
			}
		}
			
		
		System.out.println("키가 가장 많이 자란 년도는 "+year+"년 "+max+"cm");
	}
}
