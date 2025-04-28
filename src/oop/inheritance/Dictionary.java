package oop.inheritance;

public class Dictionary extends Book {
    private int definitions;

    public void definitionsMessage() {
        System.out.println("Number of definitions: " + definitions);
        System.out.println(pages);
//        System.out.println(super.pages);
    }
}
