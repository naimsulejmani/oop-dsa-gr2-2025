package dsa.linked_lists.singly;

public class NodeDemo {
    public static void main(String[] args) {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node15 = new Node(15);


        node10.setNext(node20);
        node10.setNext(node15);
        node15.setNext(node20);
        System.out.println(node10);
        System.out.println(node20);
    }
}
