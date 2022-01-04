package utils;

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
		public static final String DOCK_DETAIL_SCREEN_PATH = "/views/fxml/List_Bike.fxml";
		public static final String LIST_PARKING_SCREEN_PATH = "/views/fxml/List_parking_screeen.fxml";
		public static final String BIKE_ITEM_PATH = "/views/fxml/bike_item.fxml";
		public static final String PARKING_ITEM_PATH = "/views/fxml/parking_item.fxml";
		public static final String RENT_BIKE_SCREEN_PATH = "/views/fxml/Rent_bike.fxml";
		public static final String BIKE_DETAIL_SCREEN_PATH = "/views/fxml/bike_detail.fxml";
		
		public static final String SINGLE_ELCTRO_BIKE_IMAGE_PATH ="assets/images/xe_dap_dien.png";
		public static final int SINGLE_BIKE_COST = 1000000;
		public static final int SINGLE_ELCTRO_BIKE_COST= 1750000;
		public static final int DOUBLE_BIKE_COST = 1375000;
		
		public static final String SINGLE_BIKE_TYPE = "xe đạp";
		public static final String SINGLE_ELCTRO_BIKE_TYPE = "xe đạp điện";
		public static final String DOUBLE_BIKE_TYPE = "xe đạp đôi";

		//not currently working now
		public static final String PROCESS_TRANSACTION_URL = "https://ecopark-system-api.herokuapp.com/api/card/processTransaction";
		public static final String GET_BALANCE_URL = "https://ecopark-system-api.herokuapp.com/api/card/balance/118609_group1_2020";
		public static final String GET_VEHICLECODE_URL = "https://ecopark-system-api.herokuapp.com/api/get-vehicle-code/1rjdfasdfas";
		public static final String RESET_URL = "https://ecopark-system-api.herokuapp.com/api/card/reset";

}
