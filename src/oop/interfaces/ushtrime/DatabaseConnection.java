package oop.interfaces.ushtrime;

import java.util.List;

public interface DatabaseConnection {

    void connect() throws SQLException;

    void disconnect() throws SQLException;

    boolean isConnected();

    int executeUpdate(String query) throws SQLException;

    List<Object> executeQuery(String query) throws SQLException;
}
