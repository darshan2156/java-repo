package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems.BSTImplementation;

public class BST {
    private Node head;

    public BST(int headData) {
        head = new Node(headData);
    }

    public void insert(int newData) {
        Node currentNode = head;
        while (currentNode != null) {
            if (newData < currentNode.data) {
                if (currentNode.leftNode == null) {
                    currentNode.leftNode = new Node(newData);
                    break;
                }
                currentNode = currentNode.leftNode;
            } else {
                if (currentNode.rightNode == null) {
                    currentNode.rightNode = new Node(newData);
                    break;
                }
                currentNode = currentNode.rightNode;
            }
        }
    }

    public void printTree() {
        Node cur = head;
        while (cur != null) {
            if (cur.leftNode == null) {
                System.out.println(cur.data);
                cur = cur.rightNode;
            } else {
                Node prev = cur.leftNode;
                while (prev.rightNode != null && prev.rightNode != cur) {
                    prev = prev.rightNode;
                }
                if (prev.rightNode == null) {
                    prev.rightNode = cur;
                    cur = cur.leftNode;
                } else {
                    prev.rightNode = null;
                    System.out.println(cur.data);
                    cur = cur.rightNode;
                }
            }
        }
    }
}
