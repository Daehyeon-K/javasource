// prac5

package exam;

import java.util.Scanner;

public class CalcEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Num1 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Input Num2 : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.print("Input operator : ");
		String c = sc.nextLine();
		
		if (c.equals("+")) {
			Calc add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		}else if (c.equals("-")) {
			Calc sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		}else if (c.equals("*")) {
			Calc mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		}else if (c.equals("/")) {
			Calc div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}else {
			System.out.println("잘못된 연산자입니다.");
			
			sc.close();
		}
	}
}
