package common.exception;

public class NotEnoughBalanceException extends PaymentException {
	public NotEnoughBalanceException() {
		super("ERROR: Invalid Version Information!");
	}
}
