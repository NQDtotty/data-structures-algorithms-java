/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly;

/**
 *
 * @author NQDtotty
 */
public class SoftDrink implements Comparable<SoftDrink>{
    
    String productLine;
    String company = null;
    int volume = 0;
    int price = 0;

    public SoftDrink(String productLine) {
        this.productLine = productLine;
    }

    public SoftDrink(String pLine, String company, int volume, int price) {
        this.productLine = pLine;
        this.company = company;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        SoftDrink aSD = (SoftDrink)obj;
        return this.productLine.equals(aSD.productLine);
    }

    @Override
    public int compareTo(SoftDrink o) {
        int priceDif = this.price - o.price;
        if(priceDif < 0) return -1;
        if(priceDif > 0) return 1;
        return this.productLine.compareTo(o.productLine);
    }
    
    @Override
    public String toString() {
        return productLine + ", " + company + ", " + volume + ", " + price;
    }
    
}
