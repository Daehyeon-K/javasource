// prac3

package exam;

public class Odd extends OddDetector{
	
	public Odd(int i) {
		n = i;
	}

	@Override
	public boolean isOdd() {
		if (n%2==0) {
			return false;
		}
		return true;
	}
}
