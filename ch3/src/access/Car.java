package access;

public class Car {
	private int speed;
	private boolean stop;
	
	private Car(int speed, boolean stop) {
		super();
		this.speed = speed;
		this.stop = stop;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() { // boolean 타입은 get으로 안나오고 is
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}
