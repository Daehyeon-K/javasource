// prac4

package exam;

public class Won2Dollar extends Converter {
	private String srcString = "원화", destString = "달러"; 
	
	@Override
	protected double convert(double src) {
		//return (int)(src*0.00081); //2022_03_11_17_49 환율
		return (Math.round((src*0.00081)*100))/100.0; //2022_03_11_17_49 환율
	}

	@Override
	protected String getSrcString() {
		return srcString;
	}

	@Override
	protected String getDestString() {
		return destString;
	}
}
