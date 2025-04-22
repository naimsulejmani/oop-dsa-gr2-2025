package dsa.linked_lists.singly;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(100);
        list.addFirst(90);
        list.addFirst(200);

        list.removeFirst();
        list.addLast(200);
        list.addLast(300);

        list.addAt(2, 150);
        list.setLast(250);
        System.out.println("First element: " + list.getFirst());
        System.out.println("-----------------------");
        list.printAll();
        System.out.println("-----------------------");
        System.out.println("Total Elements: " + list.size());
        var exists300 = list.contains(300);
        var exists250 = list.contains(250);
        System.out.println("Exists 300: " + exists300);
        System.out.println("Exists 250: " + exists250);
//        var x1 = 10F;
//        list.printAll();
//        System.out.println("-----------------------");


    }
}
