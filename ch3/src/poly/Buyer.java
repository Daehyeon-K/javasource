package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	int i = 0;
	Product items[] = new Product[10];
	
	void buy(Product p) { // 매개변수의 다형성 이용 가능한 메소드
		if(money<p.price) {
			System.out.println("잔액 부족으로 물건 구매 불가");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;
		System.out.println(p+"을(를) 구매하였습니다.");
	}
}
