/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doubly;

/**
 *
 * @author NQDtotty
 */
public class Node {
    
    Flower flower;
    Node next;
    Node previous;
    
    public Node(Flower f) {
        this.flower = f;
        next = previous = null;
    }
    
    public Node(String name, String original, int price) {
        this(new Flower(name, original, price));
    }
    
}
