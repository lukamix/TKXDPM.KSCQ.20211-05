package views.screen.payment;

import java.io.IOException;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utils.Configs;
import views.screen.BaseScreenHandler;
import views.screen.home.HomeScreenHandler;

public class ResultScreenHandler extends BaseScreenHandler{
	
	public ResultScreenHandler(Stage stage, String screenPath, String result, String message) throws IOException {
		super(stage, screenPath);
		this.result.setText(result);
		this.message.setText(message);
	}
	@FXML
	private Label result;
	@FXML
	private Label message;
	@FXML
	private Button confirmbtn;

	// Event Listener on Button[#confirmbtn].onMouseClicked
	@FXML
	public void onConfirmbtnClick(MouseEvent event) throws IOException {
		HomeScreenHandler homeHandler = new HomeScreenHandler(this.stage, Configs.HOME_PATH);
		homeHandler.setScreenTitle("Home Screen");
		homeHandler.show();
	}
}
