package dsa.trees;

public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(40);
        bst.insert(30);
        bst.insert(60);
        bst.insert(55);
        bst.insert(70);
        bst.insert(45);

        System.out.println("Size of BST: " + bst.size());
        System.out.println("Is BST empty? " + bst.isEmpty());
        System.out.println("In-order Traversal of BST:");
        System.out.println("---------------------------------");
        bst.inOrderTraversal();
        System.out.println("Pre-order Traversal of BST:");
        System.out.println("---------------------------------");
        bst.preOrderTraversal();
        System.out.println("Post-order Traversal of BST:");
        System.out.println("---------------------------------");
        bst.postOrderTraversal();
        System.out.println("----------------------------------");
        System.out.println("Minimum value in BST: " + bst.min());
        System.out.println("Maximum value in BST: " + bst.max());

        System.out.println("Searching for 55: " + bst.contains(55));
        System.out.println("Searching for 56: " + bst.contains(56));
    }
}











