package oop.interfaces.ushtrime;

import java.util.List;

public class MySqlDbConnection implements DatabaseConnection {
    private String connectionString;
    private boolean connected = false;
    //Server=myServerAddress;Database=myDataBase;Uid=myUsername;Pwd=myPassword;
    //jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC&Uid=naim&Pwd=pass


    public MySqlDbConnection(String connectionString) {
        if (connectionString == null) {
            throw new IllegalArgumentException("Connection string cannot be null");
        } else if (connectionString.isBlank()) {
            throw new IllegalArgumentException("Connection string cannot be empty");
        } else if (connectionString.split(";").length != 4) {
            throw new IllegalArgumentException("Connection string must contain exactly 4 parts");
        }
        this.connectionString = connectionString;
    }

    @Override
    public void connect() throws SQLException {
        if (connected) {
            System.out.println("Already connected to MySQL database");
            return;
        }
        System.out.println("Connecting to MySQL database with connection string: " + connectionString);
        connected = true;
    }

    @Override
    public void disconnect() throws SQLException {
        if (!connected) {
            System.out.println("Not connected to MySQL database");
            return;
        }
        System.out.println("Disconnecting from MySQL database");
        connected = false;
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public int executeUpdate(String query) throws SQLException {
        if (!connected) {
            throw new SQLException("Not connected to MySQL database");
        }
        if (query == null || query.isBlank()) {
            return 0;
        }
        System.out.println("Executing update query: " + query);
        // Simulate successful execution
        return 1; // Assuming one row affected
    }

    @Override
    public List<Object> executeQuery(String query) throws SQLException {
        if (!connected) {
            throw new SQLException("Not connected to MySQL database");
        }
        if (query == null || query.isBlank()) {
            return List.of();
        }
        System.out.println("Executing query: " + query);
        // Simulate returning a list of results
        return List.of("Result1", "Result2", "Result3"); // Example results
    }
}
