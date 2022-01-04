package utils;

import java.io.IOException;

import entity.parking.Parking;
import javafx.scene.control.ListCell;
import views.screen.items.ParkingItem;

public class ParkingItemCell extends ListCell<Parking>{
	public void updateItem(Parking parking, boolean empty) {
		super.updateItem(parking,empty);
        if(parking != null)
        {
            ParkingItem data;
			try {
				data = new ParkingItem(Configs.PARKING_ITEM_PATH);
	            data.setProperties(parking.getName(),Integer.toString(parking.getNumberOfBike()),parking.getAddress());
	            setGraphic(data.getAnchorPane());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}
