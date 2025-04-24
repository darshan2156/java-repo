package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems.BSTImplementation;

public class BinarySearchTreeImplemention {
    public static void main(String[] args) {
        BST tree = new BST(7);
        tree.insert(3);
        tree.insert(9);
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);

        tree.printTree();
    }
}
