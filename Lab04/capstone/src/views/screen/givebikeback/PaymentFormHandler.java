package views.screen.givebikeback;

import java.io.IOException;
import java.util.Map;

import controller.PaymentController;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Configs;
import views.screen.BaseScreenHandler;
import views.screen.payment.ResultScreenHandler;

public class PaymentFormHandler extends BaseScreenHandler{
	public PaymentFormHandler(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	private Label bike_code;
	@FXML
	private Label bike_type;
	@FXML
	private Label first_money;
	@FXML
	private Button confirmbtn;
	@FXML
	private Label total_fee;
	@FXML
	private TextArea card_code;
	@FXML
	private TextArea holder_name;
	@FXML
	private TextArea card_pin;
	@FXML
	private TextArea expired_date;

	// Event Listener on Button[#confirmbtn].onMouseClicked
	@FXML
	public void onConfirmbtnClick(MouseEvent event) throws IOException {
		confirmToPayOrder();
	}

	void confirmToPayOrder() throws IOException{
		String contents = "rent bike";
		PaymentController ctrl = new PaymentController();
		Map<String, String> response = ctrl.payOrder(50, contents, card_code.getText(), holder_name.getText(),
				expired_date.getText(), card_pin.getText());

		BaseScreenHandler resultScreen = new ResultScreenHandler(this.stage, Configs.RESULT_SCREEN_PATH, response.get("RESULT"), response.get("MESSAGE") );
		resultScreen.setPreviousScreen(this);
		resultScreen.setHomeScreenHandler(homeScreenHandler);
		resultScreen.setScreenTitle("Result Screen");
		resultScreen.show();
	}
}
