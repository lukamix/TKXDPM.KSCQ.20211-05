package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizeException;
import entity.paymentTransaction.CreditCard;
import entity.paymentTransaction.PaymentTransaction;
import subsystem.interbank.InterbankSubsystemController;

public class InterbankSubsystem implements InterbankInterface{
	
	/**
	 * Represent the controller of the subsystem
	 */
	private InterbankSubsystemController ctrl;

	/**
	 * Initializes a newly created {@code InterbankSubsystem} object so that it
	 * represents an Interbank subsystem.
	 */
	public InterbankSubsystem() {
		String str = new String();
		this.ctrl = new InterbankSubsystemController();
	}
	
	@Override
	public PaymentTransaction payOrder(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentTransaction refund(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizeException {
		// TODO Auto-generated method stub
		return null;
	}

}
