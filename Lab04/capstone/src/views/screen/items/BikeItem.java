package views.screen.items;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import utils.Configs;
import views.screen.FXMLScreenHandler;
import views.screen.home.DockDetailScreenHandler;

public class BikeItem extends FXMLScreenHandler{
	public BikeItem(String screenPath) throws IOException {
		super(screenPath);
		// TODO Auto-generated constructor stub
	}
	@FXML
	private AnchorPane bikeItem;
	@FXML
	private Label type;
	@FXML
	private Label battery;
	@FXML
	private Label labelBattery;
	@FXML
	private ImageView image;
	@FXML
	private Label bikeId;
	
	
	public void setProperties(String type,String battery,String bikeId,String image) {
		this.type.setText(type);
		this.battery.setText(battery);
		this.bikeId.setText(bikeId);
		File file1 = new File(image);
        Image img1 = new Image(file1.toURI().toString());
        this.image.setImage(img1);
	}
	public AnchorPane getAnchorPane() {
		return this.bikeItem;
	}
}
