package utils;

import java.io.IOException;

import entity.bike.Bike;
import javafx.scene.control.ListCell;
import views.screen.items.BikeItem;

public class BikeItemCell extends ListCell<Bike> {
	public void updateItem(Bike bike, boolean empty) {
		super.updateItem(bike,empty);
        if(bike != null)
        {
            BikeItem data;
			try {
				data = new BikeItem(Configs.BIKE_ITEM_PATH);
	            data.setProperties(bike.getType(),bike.getBattery(),Integer.toString(bike.getBikeId()),bike.getImage());
	            setGraphic(data.getAnchorPane());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
}
