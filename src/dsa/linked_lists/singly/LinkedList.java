package dsa.linked_lists.singly;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {

    }

    public boolean isEmpty() {
        return head == null; // return size == 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
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
        size--;
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
        size++;
    }


    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public int size() {
        return size;
    }


    public Integer getLast() {
        if (isEmpty()) {
            return null;
        }
        Node temp = head;
        //perderisa nyja ka elementin next (kam ku me shku ne nyje tjeter)
        //shko, perndryshe ke mberri ne nyjen e fundit
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Lista eshte empty!");
            return;
        }
        if (size == 1) {
            removeFirst();
        } else {
            Node temp = head;
            while (temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            size--;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    private Node findNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of range!");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void addAt(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Index out of range!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = findNodeByIndex(index - 1);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
        }
    }

    public void addAfter(int index, int data) {
        addAt(index + 1, data);
    }

    public Integer get(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of range!");
            return null;
        }

        if (index == 0) {
            return getFirst();
        } else if (index == size - 1) {
            return getLast();
        } else {
            Node temp = findNodeByIndex(index);
            return temp.getData();
        }
    }

    public Integer getAfter(int index) {
        return get(index + 1);
    }


    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Lista eshte e zbrazet!");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index out of range!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = findNodeByIndex(index - 1);
            temp.setNext(temp.getNext().getNext());
            size--;
        }
    }



    /*





        remove(int index);
        addAll(...)
        removeAll(...)
        toArray() -> Node[], int[]
        printAll()
        print(int index)
        setFirst(int data)
        setLast(int data)
        set(int index, int data)
        contains(int data)
        indexOf(int data)
        indexOf(int afterIndex, int data)

     */
}
