package controller;

import java.sql.SQLException;

import common.exception.BikeNotAvailableException;
import entity.parking.Parking;

public class RentBikeController {

	/**
	 * @param bikeID
	 */
	public void requestToRentBike(String bikeID) {
		
	}
	
	/**
	 * This method request to payment.
	 */
	public void requestPayment() {
		
	}
	/**
	 * This method make a transaction to deposit money for rent bike
	 * @param bike_cost is value of the bike
	 * @return deposit fee
	 */
	public int depositMoney(int bike_cost) {
		int fee = 0;
		fee = (int) (bike_cost*0.4);
		return fee;
	}
	/**
	 * This method check Availability of the bike
	 * @param bikeID is the id of the bike
	 * @param idparking the id of parking place
	 * @throws SQLException check exception while connect to database
	 * @throws BikeNotAvailableException check exception if bike is not available.
	 */
	public void checkBikeAvailability(int bikeID, int idparking) throws SQLException, BikeNotAvailableException{
       Parking.checkBikeAvailability(bikeID, idparking);
    }
	/**
	 * This method confirm payment transaction
	 */
	public void confirmPayment() {
		
	}
}
