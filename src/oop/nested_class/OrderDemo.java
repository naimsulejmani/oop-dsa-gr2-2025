package oop.nested_class;

public class OrderDemo {
    public static void main(String[] args) {
        Order order = new Order();
        var item1 = order.new Item("Laptop", 1000);
        Order.Item item2 = order.new Item("Tablet", 500);
        Order.Item item3 = order.new Item("Tablet", 300);

    }
}
