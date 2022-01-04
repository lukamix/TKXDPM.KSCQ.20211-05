package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizeException;
import entity.paymentTransaction.PaymentTransaction;
import entity.paymentTransaction.CreditCard;

/**
 * class nay dung de ket noi voi InterbankSubsystem de thuc hien mot giao dich
 * @author LENOVO
 *
 */
public interface InterbankInterface {

	/**
	 * payorder, return payment transaction
	 * @param card 		- creditcard de thanh toan
	 * @param amount 	- tien phai thanh toan
	 * @param contends  - noi dung thanh toan
	 * @return {@link entity.paymentTransaction.PaymentTransaction PaymentTransaction}  - neu thanh toan thanh cong
	 * @throw PaymentException 	- neu gap phai mot loi da biet truoc
	 * @throw UnrecognizeException 	- neu gap mot loi khong ro nguyen nhan hoac something went wrong
	 */
	public abstract PaymentTransaction payOrder(CreditCard card, int amount, String contents) throws PaymentException, UnrecognizeException;
	/**
	 * Refund, return payment transaction
	 * @param card 		- creditcard de thanh toan 
	 * @param amount 	- tien phai thanh toan
	 * @param contends  - noi dung thanh toan
	 * @return {@link entity.paymentTransaction.PaymentTransaction PaymentTransaction}  - neu thanh toan thanh cong
	 * @throw PaymentException 	- neu gap phai mot loi da biet truoc
	 * @throw UnrecognizeException 	- neu gap mot loi khong ro nguyen nhan hoac something went wrong
	 */
	public abstract PaymentTransaction refund(CreditCard card, int amount, String contents) throws PaymentException, UnrecognizeException;
}
