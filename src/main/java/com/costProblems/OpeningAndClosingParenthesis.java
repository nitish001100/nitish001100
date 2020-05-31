package com.costProblems;

import java.util.Stack;

public class OpeningAndClosingParenthesis {
    public static void main(String[] args) {

        String checkBalancedExpr1 = checkBalancedParenthesis("a*(b+c)-(d*e)");
        System.out.println("a*(b+c)-(d*e) : " + checkBalancedExpr1);
        String checkBalancedExpr2 = checkBalancedParenthesis("(a*(b-c)*{d+e}");
        System.out.println("(a*(b-c)*{d+e} : " + checkBalancedExpr2);
    }

    public static String checkBalancedParenthesis(String expr) {
        if (expr.isEmpty())
            return "Balanced";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char current = expr.charAt(i);

            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return "Not Balanced";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Balanced";
            }
        }
        return stack.isEmpty() ? "Balanced" : "Not Balanced";
    }

    private static String checker(String str) {
        char[] chArray = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        if (stack.isEmpty())
            return "Balanced";

        for (int itr = 0; itr < chArray.length; itr++) {

            Character ch = chArray[itr];

            if (ch == '(') {
                stack.push(ch);
            }

            if (ch == ')') {
                if (stack.isEmpty())
                    System.out.println("Not Balanced");

                char last = stack.peek();
                if (ch == ')' && last == '(') {
                    stack.pop();
                } else
                    System.out.println("Not Balanced");
            }
        }
        return stack.isEmpty() ? "B" : "NB";
    }
}
