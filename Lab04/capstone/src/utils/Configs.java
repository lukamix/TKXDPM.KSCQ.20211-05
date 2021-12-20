package utils;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Configs {
	
		public static String CURRENCY = "VND";
		public static float PERCENT_VAT = 10;

		// static resource
		public static final String IMAGE_PATH = "assets/images";
		public static final String PAYMENT_SCREEN_PATH = "/views/fxml/payment.fxml";
		public static final String PAYMENT_SCREEN_FORM = "/views/fxml/paymentform.fxml";
		public static final String RESULT_SCREEN_PATH = "/views/fxml/Result_Screen.fxml";
		public static final String SPLASH_SCREEN_PATH = "/views/fxml/Splash_Screen.fxml";
		public static final String HOME_PATH  = "/views/fxml/Home_Screen.fxml";
		public static final String GIVE_BIKE_BACK_SCREEN = "/views/fxml/Give_Bike_Back_Screen.fxml";
		
		public static int SINGLE_BIKE_COST = 1000000;
		public static int SINGLE_ELCTRO_BIKE_COST= 1750000;
		public static int DOUBLE_BIKE_COST = 1375000;
		
		//not currently working now
		public static final String PROCESS_TRANSACTION_URL = "https://ecopark-system-api.herokuapp.com/api/card/processTransaction";
}
