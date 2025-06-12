package oop.nested_class.anonymous_class;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListRemove {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        System.out.println(list.size());

        Predicate<String> mbaronMeY = new Predicate<String>() {

            @Override
            public boolean test(String s) {
                return s.endsWith("y");
            }
        };

        list.removeIf(mbaronMeY);

//        list.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.toLowerCase().contains("a");
//            }
//        });

        System.out.println(list.size());
    }
}
