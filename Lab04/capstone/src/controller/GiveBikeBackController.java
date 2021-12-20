package controller;

import entity.paymentTransaction.PaymentTransaction;

/**
 * controller tra xe 
 */
public class GiveBikeBackController {
	
	/**
	 * This method to request payment
	 */
	public void requestPayment() {
		
	}
	
	/**
	 * This method calculate rent bike fee from the time user use bike
	 * @param time is the time user rent bike
	 * @return rent bike fee (VND)
	 */
	public int calculateRentBikeFee(int time) {
		int fee = 0;
		if(time<=10) {
			fee = 0;
		}
		else if (time<=40) {
			fee = 10000;
		}
		else {
			int heso = (time-40)/15;
			if ((heso*15)<time-40) heso++;
			heso=(heso+1)*heso/2;
			fee = 10000 + heso*3000;
		}
        return fee;
	}
	/**
	 * @param rentfee is the rent bike fee calculted by caculateRentBikeFee method
	 * @param bike_cost is value of the bike and has one in three values below:
	 * (Config.SINGLE_BIKE_COST||Configs.SINGLE_ELCTRO_BIKE_COST||Configs.DOUBLE_BIKE_COST)
	 * @return refund 
	 */
	public int calculateRefund(int rentfee,int bike_cost) {
		int refund = 0;
		refund =(int) (bike_cost*0.4 - rentfee);
		return refund;
	}
	/**
	 * This method save payment transaction and request to save it to server database
	 * @param paymentTransaction is payment transaction information
	 */
	public void savePaymentTransaction(PaymentTransaction paymentTransaction) {
		
	}
}
