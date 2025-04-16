package dsa.linked_lists.singly;

public class LinkedList {
    private Node head;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }


    public Integer getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getData();
    }

    //public Integer removeFirst() {}
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Lista eshte e zbrazet ska qka fshine ktu!");
            return;
        }
        head = head.getNext();
    }


    public void addLast(int data) {
        // Check if the list is empty
        if (isEmpty()) {
            // If it is empty, just add the node at the beginning (which also becomes the last node)
            addFirst(data);
            // After adding it at the front, we don’t need to do anything else; exit the method
            return;
        }
        // If the list is not empty, create a new node with the given data
        Node newNode = new Node(data);
        // Start from the head of the list
        Node temp = head;
        // Traverse the list until you reach the final node (the one whose next is null)
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        // Set the final node's next reference to the new node, effectively adding it to the end
        temp.setNext(newNode);
    }


    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }


    /*
        isEmpty()
        size()
        addFirst(...)
        addLast(...)
        addAfter(int index, int data)
        addBefore(int index, int data)
        getFirst()
        getLast()
        get(int index);
        removeFirst();
        removeLast();
        remove(int index);
        addAll(...)
        removeAll(...)
        toArray() -> Node[], int[]
        printAll()
        print(int index)
        setFirst(int data)
        setLast(int data)
        set(int index, int data)
        clear()
        contains(int data)
        indexOf(int data)
        indexOf(int afterIndex, int data)

     */
}
