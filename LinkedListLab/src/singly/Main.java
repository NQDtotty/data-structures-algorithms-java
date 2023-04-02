/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly;

/**
 *
 * @author NQDtotty
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
        
        String srcFname = "sourceSingly.txt";
        String binFname = "resultsSingly_bin.txt";
        String txtFname = "resultsSingly_text.txt";
        SoftDrinkList list = new SoftDrinkList();
        
        list.loadFromFile(srcFname);
        
        // Traversals
        System.out.println("Soft drinks in the list: ");
        list.printAll();
        System.out.println();
        System.out.println("Soft drinks of Coca: ");
        list.printCompanyBased("Coca");
        System.out.println();
        
        // Reverse the list
        list.reverse();
        System.out.println("Reverse the list: ");
        list.printAll();
        System.out.println();
        
        // Sorting
        list.ascSort_Price_then_pLine();
        System.out.println("Ascending sort by price the pLine");
        list.printAll();
        System.out.println();
        
        // Search operation
        String type = "Beer 33";
        SoftDrink result = list.search(type);
        if(result == null) System.out.println("Search" + type + ": Not found!");
        else System.out.println("Search: " + result);
        type = "Miranda";
        result = list.search(type);
        if(result == null) System.out.println("Search: " + type + ": Not found!");
        else System.out.println("Search: " + result);
        System.out.println();
        
        // Remove operation
        type = "Natural";
        result = list.remove(type);
        if(result == null) System.out.println("Remove failed! " + type);
        else System.out.println("Remove Successfully: " + result);
        type = "Natural orange1";
        result = list.remove(type);
        if(result == null) System.out.println("Remove failed! " + type);
        else System.out.println("Remove Successfully: " + result);
        
        // Print all elements after remove
        System.out.println("\nAfter removing: ");
        list.printAll();
        
        // Write list to file
        list.printAll_binF(binFname);
        list.printAll_txtF(txtFname);
    }
}
