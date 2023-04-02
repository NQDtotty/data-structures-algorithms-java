/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly;

/**
 *
 * @author NQDtotty
 */
public class Node {
    
    SoftDrink data;
    Node next;

    public Node(SoftDrink aSD) {
        this.data = aSD;
        next = null;
    }
    
    public Node(String productLine, String company, int volume, int price) {
        SoftDrink aSD = new SoftDrink(productLine, company, volume, price);
        this.data = aSD;
        next = null;
    }
}
