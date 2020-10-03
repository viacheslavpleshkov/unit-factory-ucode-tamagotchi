package world.ucode.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TamagotchiModel extends ConnectDatabase {

    public TamagotchiModel() {
        this.createNewTable();
    }

    /**
     * Create a new table in the test database
     */
    public void createNewTable() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS tamagotchi (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	person int,\n"
                + "	health int,\n"
                + "	happiness int,\n"
                + "	thirst int,\n"
                + "	cleanliness int,\n"
                + "	givewater int,\n"
                + "	givemedicine int,\n"
                + "	cleanup int\n"
                + ");";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createNewCharacter(String name, int person) {
        // SQL statement for creating a new table
        String sql = "INSERT INTO tamagotchi " +
                "(name, person, health, happiness, thirst, cleanliness, givewater, givemedicine, cleanup) " +
                "VALUES ('" + name + "', "+ person+" , 0, 0, 0, 0, 0, 0, 0);";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}