package oop.summary_inheritance_composition;

//products - table ne db
public class Product {
    private int id;
    private String name;
    private double price;
    private Category category; // foreign key
    private Supplier supplier; // foreign key

    public Product(int id, String name, double price, Category category, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
