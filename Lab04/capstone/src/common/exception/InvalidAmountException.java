package common.exception;

public class InvalidAmountException extends PaymentException {
	public InvalidAmountException(String message) {
		super(message);
	}
}
