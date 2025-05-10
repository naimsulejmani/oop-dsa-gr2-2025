package dsa.trees;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public BinarySearchTree() {
        //default constructor
    }

    public boolean isEmpty() {
        return root == null; // return size == 0;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            root = newNode;
        } else {
            insertRec(data, root);
        }
        size++;
    }


    private void insertRec(T data, Node<T> root) {
        Node<T> newNode = new Node<>(data);

        if (data.compareTo(root.getData()) <= 0) {
            if (root.getLeft() == null) {
                root.setLeft(newNode);
            } else {
                insertRec(data, root.getLeft());
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(newNode);
            } else {
                insertRec(data, root.getRight());
            }
        }
    }

    public int size() {
        return size;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(Node<T> root) {
        if (root == null) {
            return;
        }
        // M, RR, D
        inOrderRec(root.getLeft()); // M
        System.out.println(root.getData()); // RR
        inOrderRec(root.getRight()); // D
    }

    public void preOrderTraversal() {
        preOrderRec(root);
    }

    private void preOrderRec(Node<T> root) {
        if (root == null)
            return;
        System.out.println(root.getData()); // Rr
        preOrderRec(root.getLeft()); // M
        preOrderRec(root.getRight()); // D
    }

    public void postOrderTraversal() {
        postOrderRec(root);
    }

    private void postOrderRec(Node<T> root) {
        if (root == null) return;
        postOrderRec(root.getLeft()); // M
        postOrderRec(root.getRight()); // D
        System.out.println(root.getData()); // Rr
    }

    public T min() {
        if (isEmpty()) return null;
        return minRec(root).getData();
    }

    private Node<T> minRec(Node<T> root) {
        if (root.getLeft() == null) return root;
        return minRec(root.getLeft());
    }
    /*
    Node<T> temp = root;
     while(temp.getLeft() != null) {
        temp = temp.getLeft();
    }
    return temp;

     */

    public T max() {
        if (isEmpty()) return null;
        return maxRec(root).getData();
    }

    private Node<T> maxRec(Node<T> root) {
        if (root.getRight() == null) return root;
        return maxRec(root.getRight());
    }

    public boolean contains(T data) {
        return containsRec(data, root) != null;
    }

    private Node<T> containsRec(T data, Node<T> root) {
        if (root == null || root.getData().compareTo(data) == 0)
            return root;

        if (root.getData().compareTo(data) < 0)
            return containsRec(data, root.getRight());
        return containsRec(data, root.getLeft());
    }

    public void delete(T data) {
        root = deleteRec(data, root);
        size--;
    }

    private Node<T> deleteRec(T data, Node<T> root) {
        if (root == null) return null;
        if (data.compareTo(root.getData()) < 0) {
            root.setLeft(deleteRec(data, root.getLeft()));
        } else if (data.compareTo(root.getData()) > 0) {
            root.setRight(deleteRec(data, root.getRight()));
        } else {
            if (root.getLeft() == null && root.getRight() == null) {
                return null;
            } else if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            Node<T> minNode = minRec(root.getRight());
            root.setData(minNode.getData());
            root.setRight(deleteRec(minNode.getData(), root.getRight()));
        }
        return root;
    }
}











