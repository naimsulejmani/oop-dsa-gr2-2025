package oop.generics.db_sample;

import java.time.LocalDate;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private double price;
    private LocalDate date;

    public Product(String id, String name, double price, LocalDate date) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public int compareTo(Product o) {
        int cmp = this.date.getYear() - o.getDate().getYear();
        if (cmp == 0) {
            cmp = this.date.getMonthValue() - o.getDate().getMonthValue();
            if (cmp == 0) {
                cmp = this.date.getDayOfMonth() - o.getDate().getDayOfMonth();

            }
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
