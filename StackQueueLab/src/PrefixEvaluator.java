/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Stack;
/**
 *
 * @author NQDtotty
 */
public class PrefixEvaluator {
    
    public static boolean isOperator(String S) {
        return (S.equals("+") || S.equals("-") || S.equals("*") || S.equals("/"));
    }
    
    public static Double evaluate(double a, double b, char operator){
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0.0;
    }
    
    public static Double evaluate(String expression) {

        Stack<Double> stack = new Stack<>();

        StringBuilder input = new StringBuilder(expression);
        input.reverse();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '*' || c == '/' || c == '^' || c == '+' || c == '-') {
                double s1 = stack.pop();
                double s2 = stack.pop();
                double temp = evaluate(s2, s1, c);
                stack.push(temp);
            } else {
                stack.push((double) (c-'0'));
            }
        }

        double result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String exp = "-/*2*5+3652";
        System.out.println(evaluate(exp));
    }
}
