package views.screen.items;

import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import views.screen.FXMLScreenHandler;

public class ParkingItem extends FXMLScreenHandler{
	public ParkingItem(String screenPath) throws IOException {
		super(screenPath);
		// TODO Auto-generated constructor stub
	}
	@FXML
	private AnchorPane parkingitem;
	@FXML
	private Label name;
	@FXML
	private Label numberOfBike;
	@FXML
	private Label address;
	public void setProperties(String name,String numberOfBike,String address) {
		this.name.setText(name);
		this.numberOfBike.setText(numberOfBike);
		this.address.setText(address);
	}
	public AnchorPane getAnchorPane() {
		return this.parkingitem;
	}
}
