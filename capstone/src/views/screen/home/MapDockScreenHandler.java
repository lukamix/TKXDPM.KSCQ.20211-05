package views.screen.home;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import entity.bike.Bike;
import entity.parking.Parking;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;
import utils.BikeItemCell;
import utils.Configs;
import utils.ParkingItemCell;
import views.screen.BaseScreenHandler;

public class MapDockScreenHandler extends BaseScreenHandler implements Initializable{
	public MapDockScreenHandler(Stage stage, String screenPath) throws IOException {
		super(stage, screenPath);
		// TODO Auto-generated constructor stub
	}

	@FXML
	private ListView listParking;
	
	private List<Parking> parkingSet;
	ObservableList observableList;
	
	public void setListView()
    {
		observableList = FXCollections.observableArrayList();
		parkingSet = new ArrayList<>(1);
		parkingSet.add(new Parking(1,"Bãi xe Hồ Gươm","Hồ Gươm,Hà Nội"));
        observableList.setAll(parkingSet);
        listParking.setItems(observableList);
        listParking.setCellFactory(new Callback<ListView<Parking>, javafx.scene.control.ListCell<Parking>>()
        {
            
			@Override
			public ListCell<Parking> call(ListView<Parking> param) {
				// TODO Auto-generated method stub
				return new ParkingItemCell();
			}
        });
    }
	@FXML
	public void onbackbtnClick(MouseEvent event) {
		back();
	}
	@FXML
	public void handleItemClick(MouseEvent event) throws IOException {
		// Display DockDetail Screen
		DockDetailScreenHandler mDockDetailScreenHandler = new DockDetailScreenHandler(this.stage, Configs.DOCK_DETAIL_SCREEN_PATH);
		mDockDetailScreenHandler.setPreviousScreen(this);
		mDockDetailScreenHandler.setHomeScreenHandler(homeScreenHandler);
		mDockDetailScreenHandler.setScreenTitle("Chi tiết bãi xe");
		mDockDetailScreenHandler.show();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setListView();
	}
}
