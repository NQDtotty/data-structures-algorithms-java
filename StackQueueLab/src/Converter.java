/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Stack;
/**
 *
 * @author NQDtotty
 */
public class Converter {
    
    public static String convert(int n, int base) {
        String res = "";
        Stack<Integer> stk = new Stack<>();
        do {
            stk.push(n % base);
            n /= base;
        } while(n > 0);
        while(!stk.empty()) {
            int value = stk.pop();
            res += Character.forDigit(value, base);
        }
        return res;
    }
    
    public static void main(String[] args) {
        int n = 106;
        System.out.println(convert(n, 2) + "b");
        System.out.println(convert(n, 8) + "q");
        System.out.println(convert(n, 10) + "d");
        System.out.println(convert(n, 16) + "h");
    }
}
