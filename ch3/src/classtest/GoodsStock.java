package classtest;

public class GoodsStock {
	// 속성 - 상품코드(P1010), 재고수량(25)
	String goodsCode;
	int goodsStock;
	
	public GoodsStock(String code, int stock) {
		this.goodsCode = code;
		this.goodsStock = stock;
	}
	
	
	
//	public GoodsStock(String goodsCode, int goodsStock) {
//		super();
//		this.goodsCode = goodsCode;
//		this.goodsStock = goodsStock;
//	}
	// 우클릭 후 source, 아래에서 field 이용해 만들기 하면 타이핑 안해도 편하게 가능



	// 기능 - 재고추가, 재고감소
	// 메소드(== 함수) : 어떤 기능을 가지고 있음
	// 리턴타입 메소드명(인자...){ 할 일 }


	void addStock(int i) {
		this.goodsStock += i;
	}
	
	void minusStock(int i) {
		if (this.goodsStock < i) {
			System.out.println("재고가 모자랍니다.");
		}
		else {
			this.goodsStock -=i;
		}
	}
	
	int getStock() {
		return this.goodsStock;
	}
}
