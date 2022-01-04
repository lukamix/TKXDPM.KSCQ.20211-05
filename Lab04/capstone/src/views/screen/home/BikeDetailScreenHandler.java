package views.screen.home;

import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Configs;
import views.screen.BaseScreenHandler;
import views.screen.givebikeback.PaymentFormHandler;
import views.screen.payment.PaymentScreenHandler;

public class BikeDetailScreenHandler extends BaseScreenHandler{
	public BikeDetailScreenHandler(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	private ImageView imageBike;
	@FXML
	private Label bikeId;
	@FXML
	private Label type;
	@FXML
	private Label deposit;
	@FXML
	private Label battery;
	@FXML
	private Label maxDistance;
	@FXML
	private Button okbtn;

	// Event Listener on Button[#okbtn].onMouseClicked
	@FXML
	public void onOKbtnClick(MouseEvent event) {
		back();
	}
	@FXML
	public void onRentBtnClick(MouseEvent event) throws IOException {
		PaymentScreenHandler mPaymentScreenHandler = new PaymentScreenHandler(this.stage, Configs.PAYMENT_SCREEN_PATH);
		mPaymentScreenHandler.setPreviousScreen(this);
		mPaymentScreenHandler.setHomeScreenHandler(homeScreenHandler);
		mPaymentScreenHandler.setScreenTitle("Thanh toán");
		mPaymentScreenHandler.show();
	}
}
