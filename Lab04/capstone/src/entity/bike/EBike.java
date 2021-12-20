package entity.bike;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.db.CapstoneDB;

public class EBike extends Bike {
	private int MaxSpeed ;
	private int RemainingBattery ;
	private String LicensePlate ;
	public EBike(int bikeId, String type, String producer, int deposit, String image, int parkingID,
			boolean isAvailable , int maxspeed,int remainingbattery , String license) {
		super(bikeId, type, producer, deposit, image, parkingID, isAvailable);
		this.MaxSpeed=maxspeed;
		this.RemainingBattery=remainingbattery;
		this.LicensePlate=license;
	}
	
	@Override
	public Bike getBikeDetailById(int bikeid) throws SQLException {
		String query = "select * from Bike join EBike on Bike.BikeId=EBike.BikeId where EBike.BikeId= ?";
		PreparedStatement prep = CapstoneDB.getConnection().prepareStatement(query);
		prep.setInt(1, bikeid);
		ResultSet res =  prep.executeQuery();
		if(res.next()) {
			return new EBike(res.getInt("BikeId"),res.getString("Type"),
					res.getString("Producer"),res.getInt("Deposit"),res.getString("Image"),
					res.getInt("ParkingID"),res.getBoolean("isAvailable"), res.getInt("MaxSpeed"),
					res.getInt("RemainingBattery"),res.getString("LicensePlate"));
		}
		return null;
	}
	
	public int getMaxSpeed() {
		return MaxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}
	public int getRemainingBattery() {
		return RemainingBattery;
	}
	public void setRemainingBattery(int remainingBattery) {
		RemainingBattery = remainingBattery;
	}
	public String getLicensePlate() {
		return LicensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}
	
	
	
	

}
