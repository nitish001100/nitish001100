package com.costProblems;

import org.apache.spark.sql.sources.In;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        nextGreaterEle(arr);
        usingStack(arr);
    }


    /*
    Algorithm :

        1: Push the first element to stack.
        2: Pick rest of the elements one by one and follow the following steps in loop.
        3: Mark the current element as next.
        4: If stack is not empty, compare top element of stack with next.
        5: If next is greater than the top element,Pop element from stack. next is the next greater element for the popped element.
        6: Keep popping from the stack while the popped element is smaller than next. next becomes the next greater element for all such popped elements
        7: Finally, push the next in the stack.
        8: After the loop in step 2 is over, pop all the elements from stack and print -1 as next element for them.
     */
    private static void usingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);

        if (stack.empty())
            System.out.println("Stack is Empty");

        for (int itr = 1; itr < arr.length; itr++) {

            while (!stack.isEmpty()) {
                int next = arr[itr];
                int poppedEle = stack.pop();

                if (!(next > poppedEle)) {
                    System.out.println("Next Greater ");
                }
            }
        }
    }

    //Tc -O(N2)
    private static void nextGreaterEle(int[] arr) {
        for (int itr = 0; itr < arr.length; itr++) {
            int max = findMax(arr, itr);
            System.out.println("Right most max element for " + arr[itr] + " is " + max);
            if (itr == arr.length - 1)
                System.out.println("Right most max element for " + arr[itr] + " is " + -1);
        }
    }

    private static int findMax(int[] arr, int index) {
        int max = Integer.MIN_VALUE;
        for (int itr = index; itr < arr.length; itr++) {
            if (max < arr[itr]) {
                max = arr[itr];
            }
        }
        return max;
    }
}
