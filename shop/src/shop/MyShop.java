package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	private String title;
	private User users[] = new User[2];
	private Product products[] = new Product[5];
	private Product carts[] = new Product[10];
	private int cartIndex = 0;
	private Scanner sc = new Scanner(System.in);
	private int currentUser;
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		// User 객체 이용해 2명 생성
		// User 생성 후 배열에 담기
		users[0] = new User("이몽룡", PayType.CASH);
		users[1] = new User("성춘향", PayType.CARD);
	}

	@Override
	public void genProduct() {
		// 핸드폰 3개, TV 2개, 하나의 배열에
		products[0] = new CellPhone("S22", 1300000, "SKT");
		products[1] = new CellPhone("S22+", 1500000, "SKT");
		products[2] = new CellPhone("X12", 1700000, "KT");
		products[3] = new SmartTV("Samsung Eclipse", 2800000, "3840x2160");
		products[4] = new SmartTV("LG HD Conveterble", 1000000, "1920x1080");
	}

	@Override
	public void start() {
		String menu;
		
			int i=0;
			System.out.println(this.title+" : 메인화면 - 계정 선택");
			System.out.println("=========================");
			for(User user:users) {
				System.out.println("["+(i++)+"]"+user.getName()+"("+user.getPayType()+")");
			}
			System.out.println("[x]종료");
			System.out.print("선택 : ");
			menu = sc.nextLine();
		
			switch (menu) {
			case "0": case "1":
				System.out.println("## "+menu+" 선택 ##");
				currentUser=Integer.parseInt(menu);
				productList();
				break;
			case "x":
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("입력값을 확인해 주세요");
				start();
		
		}
		//sc.close();
	}
	
	@Override
	public void productList() {
		String menu;
		int j=0;
		System.out.println(this.title+" : 상품 목록 - 상품 선택");
		System.out.println("=========================");
		for(Product product:products) {
			System.out.print("["+(j++)+"]");
			product.printDetail();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		menu = sc.nextLine();
		
		switch (menu) {
		case "0" : case "1" : case "2" : case "3" : case "4" :
			System.out.println("## "+menu+" 장바구니에 담기 ##");
			carts[cartIndex++]=products[Integer.parseInt(menu)];
			productList();
			break;
		case "h" :
			start();
			break;
		case "c" : 
			System.out.println("## "+menu+" 선택 ##");
			checkOut();
			break;
		default :
			System.out.println("입력값을 확인해 주세요");
			productList();
		}
		//sc.close();
	}
	
	@Override
	public void checkOut() {
		String menu;
		int i=0;
		int cartPrice=0;
		System.out.println(this.title+" : 체크아웃");
		System.out.println("=========================");
		for(Product cart:carts) {
			if (cart==null) {break;}
			System.out.println("["+(i++)+"]"+cart.getName()+"("+cart.getPrice()+")");
			cartPrice+=cart.getPrice();
		}		
		System.out.println("=========================");
		System.out.println("결제 방법 : "+users[currentUser].getPayType());
		
		System.out.println("합계 : "+cartPrice+"원 입니다.");
		System.out.println("[p] 이전 화면");
		System.out.println("[q] 결제 완료");
		System.out.print("선택 : ");
		menu = sc.nextLine();
		switch (menu) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제 완료");
			break;
		default :
			System.out.println("입력값을 확인해 주세요");
			checkOut();
		}
	}

}
