package controller;

import java.sql.SQLException;
import java.util.List;

import entity.bike.Bike;
import entity.bike.EBike;
import entity.parking.Parking;

/**
 * 
 * @author quocc
 *
 */
public class ViewBikeInforController { 

	/**
	 * Lấy ra danh sách các bãi đỗ xe tìm kiếm theo từ khóa 
	 * @param keyword : từ khóa người dùng nhập vào 
	 * @return List[Parking] : list các bãi đỗ xe 
	 * @throws SQLException
	 */
	public List<Parking> getListParkingByKeyWord(String keyword) throws SQLException{
		return new Parking().getListParkingByKeyWord(keyword); 
	}
	
	/**
	 * Lấy ra danh sách tất cả các bãi đỗ xe  
	 * @return List[Parking] : danh sách bãi đỗ xe
	 * @throws SQLException
	 */
	public List<Parking> getAllParking() throws SQLException {
		return new Parking().getListParking();
	}
	
	/**
	 * Lấy thông tin chi tiết của xe 
	 * @param bikeID : ID của xe 
	 * @return Bike : đối tượng Bike
	 * @throws SQLException
	 */
	public Bike getBikeDetail(int bikeID) throws SQLException{
		return new Bike().getBikeDetailById(bikeID);
	}
	
	/**
	 * Lấy thông tin chi tiết của xe đạp điện 
	 * @param bikeID : id của xe 
	 * @return Bike 
	 * @throws SQLException
	 */
	public Bike getEBikeDetail(int bikeID) throws SQLException {
		return new EBike().getBikeDetailById(bikeID);
	}

	/**
	 * Lấy ra danh sách tất cả các xe hiện có trong bãi xe
	 * @param parkingID : id của bãi xe
	 * @return List[Bike] : danh sách xe 
	 * @throws SQLException
	 */
	public List<Bike> getParkingDetail(int parkingID) throws SQLException {
		return new Parking().getAllBikeInParking(parkingID);
	}
}
