/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiffelv.csc413.assignment4;

/**
 *
 * @author Eiffel
 */
public class BST {

    Node root;

    
    // Constructor
    public BST() {
        this.root = null;
    }

    // Insertion
    public void insert(int value) {
        this.root = insertRecursive(root, value);
    }
    
    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        }
        else if (value >= current.value) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    // Search for a node
    public Node search(int value) {
        Node current = root;
        while (current != null) {
            if (value == current.value) {
                return current;
            } else if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null; // Node not found
    }

    // Delete a node
    public BST delete(int value) {
        root = deleteRecursive(root, value);
        return this;
    }

    // Recursive helper function for deletion
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null; // Node not found
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = deleteRecursive(current.right, value);
        } else {
            // Node found, handle deletion cases
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            // Node with two children: find in-order successor
            current.value = minValue(current.right);
            current.right = deleteRecursive(current.right, current.value);
        }

        return current;
    }

    // Find the minimum value node in a subtree
    private int minValue(Node node) {
        int minVal = node.value;
        while (node.left != null) {
            minVal = node.left.value;
            node = node.left;
        }
        return minVal;
    }

    // In-order traversal
    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node current) {
        if (current != null) {
            inOrderRecursive(current.left);
            System.out.print(current.value + " ");
            inOrderRecursive(current.right);
        }
    }

    // Pre-order traversal (similar logic as in-order)
    public void preOrder() {
        preOrderRecursive(root);
    }

    private void preOrderRecursive(Node current) {
        if (current != null) {
            System.out.print(current.value + " ");
            preOrderRecursive(current.left);
            preOrderRecursive(current.right);
        }
    }

    // Post-order traversal (similar logic as in-order)
    public void postOrder() {
        postOrderRecursive(root);
    }

    private void postOrderRecursive(Node current) {
        if (current != null) {
            postOrderRecursive(current.left);
            postOrderRecursive(current.right);
            System.out.print(current.value + " ");
        }
    }
}
