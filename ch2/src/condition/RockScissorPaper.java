package condition;

import java.util.Scanner;

public class RockScissorPaper {
	public static void main(String[] args) {
		// 가위바위보 프로그램
		// 가위 : 1, 바위 : 2, 보자기 : 3
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("가위! 바위! 보! (가위, 바위, 보자기 중 선택) : ");
			String pTurn = sc.nextLine();
			if (pTurn.equals("가위")||pTurn.equals("바위")||pTurn.equals("보자기")) {
				String cTurn = "";
				int cTurnNum = (int)(Math.random()*3)+1;
				switch (cTurnNum){
				case 1:
					cTurn = "가위";
					break;
				
				case 2:
					cTurn = "바위";
					break;
					
				case 3:
					cTurn = "보자기";
					break;
				}
				
				if (pTurn.equals(cTurn)) {
					System.out.println("플레이어: "+pTurn+" vs 컴퓨터: "+cTurn);
					System.out.println("비겼습니다!");
				}
				else if (pTurn.equals("가위")) {
					if (cTurn.equals("보자기")) {
						System.out.println("플레이어: "+pTurn+" vs 컴퓨터: "+cTurn);
						System.out.println("플레이어가 이겼습니다!");
					}
					else if (cTurn.equals("바위")) {
						System.out.println("플레이어: "+pTurn+" vs 컴퓨터: "+cTurn);
						System.out.println("컴퓨터가 이겼습니다...");
					}
				}
				else if (pTurn.equals("바위")) {
					if (cTurn.equals("가위")) {
						System.out.println("플레이어: "+pTurn+" vs 컴퓨터: "+cTurn);
						System.out.println("플레이어가 이겼습니다!");
					}
					else if (cTurn.equals("보자기")) {
						System.out.println("플레이어: "+pTurn+" vs 컴퓨터: "+cTurn);
						System.out.println("컴퓨터가 이겼습니다...");
					}
				}
				else if (pTurn.equals("보자기")) {
					if (cTurn.equals("바위")) {
						System.out.println("플레이어: "+pTurn+" vs 컴퓨터: "+cTurn);
						System.out.println("플레이어가 이겼습니다!");
					}
					else if (cTurn.equals("가위")) {
						System.out.println("플레이어: "+pTurn+" vs 컴퓨터: "+cTurn);
						System.out.println("컴퓨터가 이겼습니다...");
					}
				}
				break;
			}
			System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
		}
		
		sc.close();
	}
}
