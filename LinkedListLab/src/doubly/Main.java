/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doubly;

/**
 *
 * @author NQDtotty
 */
public class Main {
    
    public static void main(String[] args) {
        
        FlowerList list = new FlowerList();
        
        // Adds
        list.addFirst("Hung. Rose", "Hungary", 20);
        list.addFirst("Dalat Rose", "Viet Nam", 2);
        list.addLast("White Tulip", "Hungary", 10);
        list.addLast("Orchid", "French", 30);
        list.addLast("Gladiolus", "Viet Nam", 1);
        
        // Traversals
        System.out.println("\nFlowers in the list: ");
        list.printAll();
        System.out.println("\nFlower in the lits, Reverse order: ");
        list.printAll_reverse();
        System.out.println("\nFlower from Hungary");
        list.printAll_Org("Hungary");
        System.out.println();
        
        // Search operation
        String name = "Tigon";
        Node result = list.search(name);
        if(result == null) System.out.println("Search: " + name + ": Not found!");
        else System.out.println("Search: " + result.flower);
        name = "Orchid";
        result = list.search(name);
        if(result == null) System.out.println("Search: " + name + ": Not found!");
        else System.out.println("Search: " + result.flower);
        System.out.println();
        
        // Remove
        System.out.println("\nRemove first operation");
        list.removeFirst();
        System.out.println("\nFlower in the list: ");
        list.printAll();
        System.out.println("\nRemove last operation");
        list.removeLast();
        System.out.println("\nFlower in the list: ");
        list.printAll();
        System.out.println("\nSearch and remove: ");
        name = "Tigon";
        Flower f = list.remove(name);
        if(f == null) System.out.println("Remove failed! " + name);
        else System.out.println("Remove successfully: " + f);
        name = "White Tulip";
        f = list.remove(name);
        if(f == null) System.out.println("Remove failed! " + name);
        else System.out.println("Remove successfully: " + f);
        
        // Print all elements
        System.out.println("\nFlower in the list: ");
        list.printAll();
    }
}
