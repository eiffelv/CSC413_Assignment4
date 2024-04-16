/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiffelv.csc413.assignment4;

/**
 *
 * @author Eiffel
 */
public class Node {

    int value;
    
    Node left;
    Node right;

    public Node(int data) {
        this.value = data;
        this.left = null;
        this.right = null;
    }
}
