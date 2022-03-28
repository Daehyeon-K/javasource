package classtest;

public class GoodsStockEx {
	public static void main(String[] args) {
		GoodsStock goods1 = new GoodsStock("P1010", 100);
		
		System.out.println("제품번호 : "+goods1.goodsCode);
		System.out.println("현재 재고 수량 : "+goods1.goodsStock);
		
		
		System.out.println("현재 재고 수량 : "+goods1.getStock());// 메소드 호출
		
		goods1.addStock(200);
		
		System.out.println("현재 재고 수량 : "+goods1.getStock());
		
		goods1.minusStock(400);
		
		goods1.minusStock(300);
		
		System.out.println("현재 재고 수량 : "+goods1.getStock());
		
		

	}
}
