/*
Esther Hwang
Reading Exercise 4/4/2017
 */

public class Tree<T> {
    private static class Node<T> {
        public T value;
        public Node<T> left;
        public Node<T> right;
        public Node(T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    
    private Node<T> root;
    
    public Tree() {
        root = null;
    }
    
    public void printInOrder() {
        printInOrderH(root);
    }

    public static String printInOrderH() {
        if (cur == null) {
            return;               
        } else {
            printInOrderH(cur.left);
            System.out.println(cur.value);
            printInOrderH(cur.right);
            System.out.println(cur.value);
        }
    }
