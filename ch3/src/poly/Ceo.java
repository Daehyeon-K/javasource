package poly;

public class Ceo extends Employee{
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+" 적당히 일을 합니다.");
	}
}
