package views.screen.home;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import entity.bike.Bike;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.ListView;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;
import utils.BikeItemCell;
import utils.Configs;
import views.screen.BaseScreenHandler;
import views.screen.rentbike.RentBikeScreenHandler;

public class DockDetailScreenHandler extends BaseScreenHandler implements Initializable{
	public DockDetailScreenHandler(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	private ListView listBike;
	@FXML
	private Label tenBaiXe;
	@FXML
	private Label viTriBaiXe;
	@FXML
	private Label soXeDap;
	@FXML
	private Label soXeDapDoi;
	@FXML
	private Label soXeDapDien;
	@FXML
	private Button okbtn;
	
	private List<Bike> bikeSet;
	ObservableList observableList;
	
	public void setListView()
    {
		observableList = FXCollections.observableArrayList();
		bikeSet = new ArrayList<>(3);
        bikeSet.add(new Bike(1,Configs.SINGLE_ELCTRO_BIKE_TYPE,"Thống Nhất",Configs.SINGLE_ELCTRO_BIKE_COST,
        		Configs.SINGLE_ELCTRO_BIKE_IMAGE_PATH,13,true));
        bikeSet.add(new Bike(2,Configs.SINGLE_ELCTRO_BIKE_TYPE,"Thống Nhất",Configs.SINGLE_ELCTRO_BIKE_COST,
        		Configs.SINGLE_ELCTRO_BIKE_IMAGE_PATH,13,true));
        bikeSet.add(new Bike(3,Configs.SINGLE_ELCTRO_BIKE_TYPE,"Thống Nhất",Configs.SINGLE_ELCTRO_BIKE_COST,
        		Configs.SINGLE_ELCTRO_BIKE_IMAGE_PATH,13,true));
        observableList.setAll(bikeSet);
        listBike.setItems(observableList);
        listBike.setCellFactory(new Callback<ListView<Bike>, javafx.scene.control.ListCell<Bike>>()
        {
            
			@Override
			public ListCell<Bike> call(ListView<Bike> param) {
				// TODO Auto-generated method stub
				return new BikeItemCell();
			}
        });
    }
	@FXML
	public void handleItemClick(MouseEvent event) throws IOException {
		// Display DockDetail Screen
		BikeDetailScreenHandler mBikeDetailScreenHandler = new BikeDetailScreenHandler(this.stage, Configs.BIKE_DETAIL_SCREEN_PATH);
		mBikeDetailScreenHandler.setPreviousScreen(this);
		mBikeDetailScreenHandler.setHomeScreenHandler(homeScreenHandler);
		mBikeDetailScreenHandler.setScreenTitle("Chi tiết xe");
		mBikeDetailScreenHandler.show();
	}
	// Event Listener on Button[#okbtn].onMouseClicked
	@FXML
	public void onOKbtnClick(MouseEvent event) {
		back();
	}
	@FXML
	public void onRentBikebtnClick(MouseEvent event) throws IOException {
		RentBikeScreenHandler mRentBikeScreenHandler = new RentBikeScreenHandler(this.stage,Configs.RENT_BIKE_SCREEN_PATH);
		mRentBikeScreenHandler.setPreviousScreen(this);
		mRentBikeScreenHandler.setHomeScreenHandler(homeScreenHandler);
		mRentBikeScreenHandler.setScreenTitle("Thuê xe");
		mRentBikeScreenHandler.show();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setListView();
	}
}
