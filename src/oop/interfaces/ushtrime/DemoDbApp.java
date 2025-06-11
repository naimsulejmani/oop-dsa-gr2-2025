package oop.interfaces.ushtrime;

import java.util.List;

public class DemoDbApp {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection db = getDatabaseConnection();

        db.connect();
        db.executeQuery("INSERT INTO Users(name,age) VALUES ('Naim',38)");

        List<Object> results = db.executeQuery("SELECT * FROM Users");

    }

    private static DatabaseConnection getDatabaseConnection() {
//        return new MssqlDbConnection(
//                "Server=localhost;Database=TestDB;User Id=sa;Password=Password123");
        return new MySqlDbConnection(
                "jdbc:mysql://localhost:3306/TestDB?serverTimezone=UTC&Uid=naim&Pwd=pass");
    }
}
