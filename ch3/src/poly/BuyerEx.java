package poly;

public class BuyerEx {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv()); // 매개변수의 다형성
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 포인트 : "+b.bonusPoint+"\n");
		
		b.buy(new Computer()); // 매개변수의 다형성
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 포인트 : "+b.bonusPoint+"\n");
		
		b.buy(new Audio()); // 매개변수의 다형성
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 포인트 : "+b.bonusPoint+"\n");
	}
}
