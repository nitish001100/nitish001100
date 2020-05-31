package com.costProblems;

import org.apache.spark.sql.sources.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Methods in Stack class :-
 * <p>
 * Object push(Object element) :
 * Pushes an element on the top of the stack.
 * <p>
 * Object pop() :
 * Removes and returns the top element of the stack. An ‘EmptyStackException’ exception is thrown if we call pop() when the invoking stack is empty.
 * <p>
 * Object peek() :
 * Returns the element on the top of the stack, but does not remove it.
 * <p>
 * boolean empty() :
 * It returns true if nothing is on the top of the stack. Else, returns false.
 * <p>
 * int search(Object element) :
 * It determines whether an object exists in the stack. If the element is found, it returns the position of the element from the top of the stack.
 * Else, it returns -1.
 */

public class CreateStack {

    static List<Integer> stack;
    static Stack<Integer> stackForInteger;
    static int[] array = null;
    static int counter = 2;

    public static void main(String[] args) {
        stack = new ArrayList<>();
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        System.out.println(pop());
        System.out.println(peek());
        System.out.println(empty());
        System.out.println(search(20));
        System.out.println("---------------------------------------------------------------------------------------------------");

        int num = 100;
        reverseAIntegerUsingStack(num);

        array = new int[3];
        reverseAStackUsingRecursion();
    }

    private static void reverseAIntegerUsingStack(int num) {

        stackForInteger = new Stack<>();

        while (num != 0) {
            int remainder = num % 10;
            num = num / 10;
            stackForInteger.add(remainder);
        }

        int[] arr = new int[3];
        int counter = arr.length - 1;

        while (!stackForInteger.isEmpty()) {
            arr[counter] = stackForInteger.pop();
            counter -= 1;
        }

        for (int itrv = 0; itrv < arr.length; itrv++)
            System.out.print(arr[itrv] + " ");
    }

    private static int reverseAStackUsingRecursion() {
        if (stackForInteger.isEmpty()) {
            return -1;
        } else {
            array[counter--] = stackForInteger.pop();
            reverseAStackUsingRecursion();
        }
        return 1;
    }


    private static int search(int num) {
        for (int i = stack.size() - 1; i > 0; i--) {
            if (stack.get(i) == num)
                return stack.size() - i;
        }
        return -1;
    }

    private static boolean empty() {
        return stack.isEmpty() ? true : false;
    }

    private static int peek() {
        return stack.get(stack.size() - 1);
    }

    private static void push(Integer num) {
        stack.add(num);
    }

    private static int pop() {
        int returnEle = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return returnEle;
    }
}
