package views.screen.payment;

import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Configs;
import views.screen.BaseScreenHandler;
import views.screen.givebikeback.PaymentFormHandler;

public class PaymentScreenHandler extends BaseScreenHandler{
	public PaymentScreenHandler(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	private ImageView bike_image;
	@FXML
	private Label bike_code;
	@FXML
	private Label bike_name;
	@FXML
	private Label rent_fee;
	@FXML
	private Label bonus_fee;
	@FXML
	private Label start_rent_time;
	@FXML
	private Label first_money;
	@FXML
	private TextArea card_code;

	// Event Listener on Button.onMouseClicked
	@FXML
	public void onConfirmbtnClick(MouseEvent event) throws IOException {
		PaymentFormHandler mPaymentFormHandler = new PaymentFormHandler(this.stage, Configs.PAYMENT_SCREEN_FORM);
		mPaymentFormHandler.setPreviousScreen(this);
		mPaymentFormHandler.setHomeScreenHandler(homeScreenHandler);
		mPaymentFormHandler.setScreenTitle("Thanh toán");
		mPaymentFormHandler.show();
	}
	@FXML
	public void onBackbtnClick(MouseEvent event) {
		back();
	}
}
