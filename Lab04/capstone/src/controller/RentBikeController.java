package controller;

import java.sql.SQLException;

import common.exception.BikeNotAvailableException;
import entity.parking.Parking;

public class RentBikeController {
/**
 * controller rentbike
 * 
 */
	public void requestToRentBike(String bikeID) {
		/**
		 * request to rent bike
		 * @param bikeID
		 */
	}
	public void requestPayment() {
		
	}
	public int depositMoney(int bike_cost) {
		int fee = 0;
		fee = (int) (bike_cost*0.4);
		return fee;
	}
	public void checkBikeAvailability(int bikeID, int idparking) throws SQLException, BikeNotAvailableException{
       Parking.checkBikeAvailability(bikeID, idparking);
    }
	public void confirmPayment() {
		
	}
}
