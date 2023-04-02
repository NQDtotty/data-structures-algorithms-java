/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NQDtotty
 */
public class CalculateMinValue {
    
    public static double min( int[] a, int n) {
        if(n == 1) return a[0];
        double m = min(a, n-1);
        return m < a[n-1] ? m : a[n-1]; 
    }
    
    public static void main(String[] args) {
        int b[] = { 1, 5, 9, 7, 2, 19,10 };
        System.out.println( min(b, 7)); 
    }
    
}
