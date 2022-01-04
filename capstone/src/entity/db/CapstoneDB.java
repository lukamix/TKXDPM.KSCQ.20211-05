package entity.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

import utils.Utils;

public class CapstoneDB {
	private static Logger LOGGER = Utils.getLogger(Connection.class.getName());
	private static Connection connect;

    public static Connection getConnection() {
        if (connect != null) return connect;
        try {
			Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:assets/db/capstone.db3";
            connect = DriverManager.getConnection(url);
            LOGGER.info("Connect database successfully");
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        } 
        return connect;
    }
    

    public static void main(String[] args) {
        CapstoneDB.getConnection();
    }
}
