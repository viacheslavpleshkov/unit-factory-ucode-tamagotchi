package world.ucode;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 */
public class ConnectDatabase {
    /**
     * Connect to the test.db database
     * @return the Connection object
     */
    public Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:/Users/spleshkov/Desktop/unit-factory-ucode-tamagotchi/tamagotchi.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}