package oop.interfaces.ushtrime;

import java.util.List;

    public class MssqlDbConnection implements DatabaseConnection {
    //Server=myServerAddress;User Id=myUsername;Database=myDataBase;Password=myPassword;

    private String connectionString;
    private boolean connected = false;


    public MssqlDbConnection(String connectionString) {
        if (connectionString == null) {
            throw new IllegalArgumentException("Connection string cannot be null");
        } else if (connectionString.isBlank()) {
            throw new IllegalArgumentException("Connection string cannot be empty");
        } else if (connectionString.split(";").length != 4) {
            {
                throw new IllegalArgumentException("Connection string must contain exactly 4 parts");
            }
        }
        this.connectionString = connectionString;

    }

    @Override
    public void connect() throws SQLException {
        if (connected) {
            System.out.println("Already connected to MSSQL database");
            return;
        }
        System.out.println("Connecting to MSSQL database with connection string: " + connectionString);
        connected = true;
    }

    @Override
    public void disconnect() throws SQLException {
        if (!connected) {
            System.out.println("Not connected to MSSQL database");
            return;
        }

        System.out.println("Disconnecting from MSSQL database");
        connected = false;
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public int executeUpdate(String query) throws SQLException {
        if (!connected) {
            throw new SQLException("Not connected to MSSQL database");
        }
        if (query == null || query.isBlank()) {
            return 0;
        }

        if (query.toLowerCase().startsWith("SELECT")) {
            throw new SQLException("MSSQL does not support SELECT queries for update!");
        }
        System.out.println("Executing update query on MSSQL database: " + query);
        return 1;
    }

    @Override
    public List<Object> executeQuery(String query) throws SQLException {
        if (!connected) {
            throw new SQLException("Not connected to MSSQL database");
        }
        if (query == null || query.isBlank()) {
            return List.of();
        }

        if (!query.toLowerCase().startsWith("SELECT")) {
            throw new SQLException("MSSQL does not support INSERT/UPDATE/DELETE queries for Query!");
        }
        System.out.println("Executing select query on MSSQL database: " + query);
        return List.of(1, 2, 3, 45, 6);
    }
}
