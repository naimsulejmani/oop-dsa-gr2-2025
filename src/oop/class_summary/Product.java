
package oop.class_summary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private LocalDate expirationDate = LocalDate.now().plusYears(3);

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal setPrice(double price) {
        return this.price = BigDecimal.valueOf(price);
    }
}
