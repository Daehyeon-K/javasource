package classtest;

public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "현대";
		car1.model = "아반떼";
		car1.color = "white";
		car1.maxSpeed = 200;
		
		System.out.println("제조사 : "+car1.company);
		System.out.println("모델명 : "+car1.model);
		System.out.println("색상 : "+car1. color);
		
		car1.forward();
		car1.backward();
		
		/*Student stu1 = new Student();*/
		
	}
}
