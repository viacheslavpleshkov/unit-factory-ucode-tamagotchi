package world.ucode.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class TamagotchiModel extends ConnectDatabase {
    private double health = 1.0;
    private double happiness = 1.0;
    private double hunger = 1.0;
    private double thirst = 1.0;
    private double cleanliness = 1.0;

    public TamagotchiModel() {
        this.createNewTable();
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public double getHunger() {
        return this.hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public double getThirst() {
        return this.thirst;
    }

    public void setThirst(double thirst) {
        this.thirst = hunger;
    }

    public double getCleanliness() {
        return this.cleanliness;
    }

    public void setCleanliness(double cleanliness) {
        this.cleanliness = cleanliness;
    }

    /**
     * Create a new table in the test database
     */
    public void createNewTable() {
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
        String sql = "INSERT INTO tamagotchi " +
                "(name, person, health, happiness, thirst, cleanliness, givewater, givemedicine, cleanup) " +
                "VALUES (?, ?, 0, 0, 0, 0, 0, 0, 0);";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, person);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}