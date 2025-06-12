package oop.nested_class;

import java.time.LocalDate;
import java.util.List;

public class Order {

    public LocalDate orderDate;
    public List<Item> items;


    public class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
