/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NQDtotty
 */
public class SumArray {
    
    public static double sum(double[] a, int n) {
        if(n == 0) return 0;
        return sum(a, n-1) + a[n-1];
    } 
    
    public static void main(String[] args) {
        double a[] = { 1.5,  2,  4,  5,  2, 6.5 };
        System.out.println( sum(a, 6));
    }
    
}
