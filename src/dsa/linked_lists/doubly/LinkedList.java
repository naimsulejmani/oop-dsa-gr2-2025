package dsa.linked_lists.doubly;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return size == 0; // return head == null; return tail == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (size == 1) {
            head = tail = null;
        } else {
//            Node temp = head;
            head = head.getNext();
            head.setPrev(null);
//            temp.setNext(null);
        }
        size--;
    }

    public void removeLast() {
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
    }

}













