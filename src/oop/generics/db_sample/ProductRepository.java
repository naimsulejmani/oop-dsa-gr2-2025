package oop.generics.db_sample;

import oop.interfaces.ushtrime.DatabaseConnection;
import oop.interfaces.ushtrime.MssqlDbConnection;
import oop.interfaces.ushtrime.SQLException;

import java.util.List;

public class ProductRepository implements CrudRepository<Product, String> {
  //  DatabaseConnection connection = new MssqlDbConnection("Server=myServerAddress;User Id=myUsername;Database=myDataBase;Password=myPassword;");
    @Override
    public Product add(Product entity) {
        // INSERT INTO products (id, name, price) VALUES (?, ?, ?);
        return null;
    }

    @Override
    public Product modify(String id, Product entity) {
        // UPDATE products SET name = ?, price = ? WHERE id = ?;

        String updateQuery = String.format("""
                UPDATE consumer SET name = '%s', price = %.2f 
                WHERE id='%s'
                """, entity.getName(), entity.getPrice(), id);


        //db.executeUpdate(updateQuery);
        return null;
    }

    @Override
    public boolean removeById(String s) {
        return false;
    }

    @Override
    public boolean remove(Product entity) {
        return false;
    }

    @Override
    public Product findById(String s) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
