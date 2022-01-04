package views.screen.rentbike;

import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextArea;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Configs;
import views.screen.BaseScreenHandler;
import views.screen.home.BikeDetailScreenHandler;

public class RentBikeScreenHandler extends BaseScreenHandler{
	public RentBikeScreenHandler(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	private Button rentbtn;
	@FXML
	private TextArea bike_code;

	// Event Listener on Button[#rentbtn].onMouseClicked
	@FXML
	public void onRentBtnClick(MouseEvent event) throws IOException {
		BikeDetailScreenHandler mBikeDetailScreenHandler = new BikeDetailScreenHandler(this.stage, Configs.BIKE_DETAIL_SCREEN_PATH);
		mBikeDetailScreenHandler.setPreviousScreen(this);
		mBikeDetailScreenHandler.setHomeScreenHandler(homeScreenHandler);
		mBikeDetailScreenHandler.setScreenTitle("Chi tiết xe");
		mBikeDetailScreenHandler.show();
	}
	
	@FXML
	public void onbackbtnClick(MouseEvent event) {
		back();
	}
}
