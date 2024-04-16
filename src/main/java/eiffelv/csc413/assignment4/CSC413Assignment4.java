/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package eiffelv.csc413.assignment4;

/**
 *
 * @author Eiffel
 */
public class CSC413Assignment4 {

    public static void main(String[] args) {
        BST treeTest = new BST();

        // Insert elements
        treeTest.insert(50);
        treeTest.insert(30);
        treeTest.insert(20);
        treeTest.insert(40);
        treeTest.insert(70);
        treeTest.insert(60);
        treeTest.insert(80);

        // Search for a node
        System.out.println("Search for 40: " + (treeTest.search(40) != null ? "Found" : "Not Found"));

        // In-order traversal
        System.out.print("In-order traversal: ");
        treeTest.inOrder();
        System.out.println();

        // Delete a node
        treeTest.delete(60);

        // Pre-order traversal
        System.out.print("Pre-order traversal: ");
        treeTest.preOrder();
        System.out.println();
    }
}
