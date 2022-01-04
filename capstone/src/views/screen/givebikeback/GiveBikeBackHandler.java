package views.screen.givebikeback;

import java.io.IOException;
import java.util.Map;

import controller.PaymentController;
import javafx.fxml.FXML;

import javafx.scene.control.Label;

import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Configs;
import views.screen.BaseScreenHandler;
import views.screen.payment.ResultScreenHandler;

public class GiveBikeBackHandler extends BaseScreenHandler{
	public GiveBikeBackHandler(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	private ImageView bike_image;
	@FXML
	private Label bike_code;
	@FXML
	private Label bike_type;
	@FXML
	private Label rent_fee;
	@FXML
	private Label bonus_fee;
	@FXML
	private Label start_rent_time;
	@FXML
	private Label finish_rent_time;
	@FXML
	private Label total_time;
	@FXML
	private Label recipe;
	@FXML
	private Label total_fee;
	@FXML
	private Label first_money;
	@FXML
	private Label refund_money;

	// Event Listener on Button.onMouseClicked
	@FXML
	public void onConfirmbtnClick(MouseEvent event) throws IOException {
		confirmGiveBikeBack();
	}
	void confirmGiveBikeBack() throws IOException{
		String contents = "give bike back";
		PaymentController ctrl = new PaymentController();
		Map<String, String> response = ctrl.payOrder(50, contents,
				"kscq1_group5_2021","Group 5","11/25","864");

		BaseScreenHandler resultScreen = new ResultScreenHandler(this.stage, Configs.RESULT_SCREEN_PATH, response.get("RESULT"), response.get("MESSAGE") );
		resultScreen.setPreviousScreen(this);
		resultScreen.setHomeScreenHandler(homeScreenHandler);
		resultScreen.setScreenTitle("Result Screen");
		resultScreen.show();
	}
}
