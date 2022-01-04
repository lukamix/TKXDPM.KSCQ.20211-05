package entity.bike ;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.db.CapstoneDB;

public class Bike {
	public static int value = 1000000;
	
	
	private int BikeId ;
	private String Type;
	private final String Battery ="90%";
	

	private String Producer;
	private int Deposit;
	private String Image;
	private int ParkingID;
	private boolean isAvailable;
	
	public Bike () {}
	
	
	public Bike(int bikeId, String type, String producer, int deposit, String image, int parkingID,
			boolean isAvailable) {
		super();
		BikeId = bikeId;
		Type = type;
		Producer = producer;
		Deposit = deposit;
		Image = image;
		ParkingID = parkingID;
		this.isAvailable = isAvailable;
	}

	public String getBattery() {
		return Battery;
	}
	public int getBikeId() {
		return BikeId;
	}
	public void setBikeId(int bikeId) {
		BikeId = bikeId;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getProducer() {
		return Producer;
	}
	public void setProducer(String producer) {
		Producer = producer;
	}
	public int getDeposit() {
		return Deposit;
	}
	public void setDeposit(int deposit) {
		Deposit = deposit;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public int getParkingID() {
		return ParkingID;
	}
	public void setParkingID(int parkingID) {
		ParkingID = parkingID;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public  Bike getBikeDetailById(int bikeid) throws SQLException   {
		String query = "select * from Bike where BikeId = ?";
		PreparedStatement prep = CapstoneDB.getConnection().prepareStatement(query);
		prep.setInt(1, bikeid);
		ResultSet res =  prep.executeQuery();
		if(res.next()) {
			return new Bike(res.getInt("BikeId"),res.getString("Type"),
					res.getString("Producer"),res.getInt("Deposit"),res.getString("Image"),
					res.getInt("ParkingID"),res.getBoolean("isAvailable"));
		}
		return null;
	}

}
