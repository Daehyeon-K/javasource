package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx11 {
	public static void main(String[] args) {
		// 단어 맞추기
		// 사용자에게 문제를 내기. 각 문자의 단어들 섞은 다음, 맞출 수 있게
		
		Scanner sc = new Scanner(System.in);
		String words[] = {"television", "computer", "mouse", "phone"}, replay;
		int endFlag=0;
		
		System.out.println("<< 단어 맞추기 >>");
		
		while (endFlag==0) {
			int pickWord=(int)(Math.random()*words.length);
		
			char temp, pickedWord[] = words[pickWord].toCharArray();
			int random1 = (int)(Math.random()*(pickedWord.length));
		
			for (int i = 0 ; i < pickedWord.length ; i++) {
				temp = pickedWord[i];
				pickedWord[i] = pickedWord[random1];
				pickedWord[random1] = temp;
			}
		
			System.out.println("\n주어진 단어는 "+Arrays.toString(pickedWord)+"입니다.");	
		
			while(true) {
				System.out.print("정답 >> ");
				String answer = sc.nextLine();
				// new String(pickWord) -> char 배열을 다시 문자열로 만들어 쓸 수도 있음
				if (answer.equals(words[pickWord])) { //words[pickWord] 대신 new String(pickWord) 하면 됨
					System.out.println("\n정답입니다!");
					break;
				}
				else {
					System.out.println("\n오답입니다..\n다시 시도해보세요!");
				}
			}
			System.out.print("한 번 더? (y/n)\n>> ");
			replay = sc.nextLine();
			if (replay.equals("n")||replay.equals("N")) {
				System.out.println("게임을 종료합니다. 플레이 해주셔서 감사합니다.");
				break;
			}
			else if (replay.equals("y")||replay.equals("Y")) {
				continue;
			}
			else {
				System.out.println("잘못된 입력입니다. 장비를 정지합니다.");
				endFlag=1;
			}
		}
		sc.close();
	}
}
