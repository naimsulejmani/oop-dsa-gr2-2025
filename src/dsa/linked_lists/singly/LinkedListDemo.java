package dsa.linked_lists.singly;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(100);
        list.addFirst(90);
        list.addFirst(200);

        list.removeFirst();
        System.out.println("First element: " + list.getFirst());
        System.out.println("-----------------------");
        list.printAll();
        System.out.println("-----------------------");
//        list.printAll();
//        System.out.println("-----------------------");


    }
}
