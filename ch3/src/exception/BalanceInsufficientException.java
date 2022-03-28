package exception;

public class BalanceInsufficientException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BalanceInsufficientException() {
		super();
	}
	
	public BalanceInsufficientException(String s) {
		super(s);
	}
}
