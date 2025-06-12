package oop.nested_class.anonymous_class;

import oop.abstract_class.Shape;

import java.math.BigDecimal;
import java.util.Comparator;

public class OrderDemo {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getDiscount());

        Order order1 = new Order() {
            @Override
            public BigDecimal getDiscount() {
                return BigDecimal.valueOf(0.25);
            }
        };

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        };

        comparator.compare(5, 10);

        Shape shape1 = new Shape() {

            @Override
            public void draw() {

            }

            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
    }
}
