package entity.parking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.exception.BikeNotAvailableException;
import entity.bike.Bike;
import entity.db.CapstoneDB;

public class Parking {
	private int ID;
	private String Name;
	private String Address ;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public Parking(int iD, String name, String address) {
		super();
		ID = iD;
		Name = name;
		this.Address = address;
	}
	public Parking() {
	}
	
	public static List<Parking> getListParking() throws SQLException {
		String query = "select * from Parking";
		List<Parking> listAll = new ArrayList<>();
		Connection conn = CapstoneDB.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet res = stmt.executeQuery(query);
		while(res.next()) {
			int i= res.getInt("ID");
			String Name = res.getString("Name");
			String Address = res.getString("Address");
			Parking p = new Parking(i,Name,Address);
			listAll.add(p);
		}
		return listAll;
	}
	public static List<Parking> getListParkingByKeyWord(String keyword) throws SQLException {
		String query = "select * from Parking where Name like '%?%' or Address like '%?%' ";
		List<Parking> listAll = new ArrayList<>();
		Connection connection = CapstoneDB.getConnection();
		PreparedStatement prep = connection.prepareStatement(query);
		prep.setString(1 , keyword);
		prep.setString(2, keyword);
		ResultSet res = prep.executeQuery();
		while(res.next()) {
			int i= res.getInt("ID");
			String Name = res.getString("Name");
			String Address = res.getString("Address");
			Parking p = new Parking(i,Name,Address);
			listAll.add(p);
		}
		return listAll;
	}
	
	public static List<Bike> getAllBikeInParking(int idparking) throws SQLException {
		String query = "select * from Bike where IsAvailable = true and ParkingID = ?" ;
		List<Bike> listAllBike = new ArrayList<>();
		Connection connection = CapstoneDB.getConnection();
		PreparedStatement prep = connection.prepareStatement(query);
		prep.setInt(1, idparking);
		ResultSet res = prep.executeQuery();
		while(res.next()) {
			int BikeId = res.getInt("BikeId");
			String Type = res.getString("Type");
			String Producer = res.getString("Producer");
			int Deposit = res.getInt("Deposit");
			String Image = res.getString("Image");
			int ParkingID = res.getInt("ParkingID");
			boolean isAvailable = res.getBoolean("isAvailable");
			Bike p = new Bike(BikeId, Type,Producer,Deposit,Image,ParkingID,isAvailable);
			listAllBike.add(p);
		}
		return listAllBike;
	}
	public static void checkBikeAvailability(int BikeID, int idparking) throws SQLException, BikeNotAvailableException {
		boolean avail = false;
		List<Bike> allBike = getAllBikeInParking(idparking);
		for (Bike p : allBike ) {
			if (p.getBikeId() == BikeID && p.isAvailable()== true) avail = true;
		}
		if(!avail) {
			throw new BikeNotAvailableException();
		}
	}
} 
