package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class TwoStacks {
    static int lowerBoundForArr1;
    static int upperBoundForArr1;

    static int lowerBoundForArr2;
    static int upperBoundForArr2;

    static int[] arr;

    public static void main(String[] args) {

        /** Below approach is cause and issue - because we divided the array in two parts. Suppose we push only elements in first half array and
         and if we want to push more elements in left part of array, in that case we can't do, we assign only 0 to mid to first stack.
        So what we can do is: - keep two ptr one should be extreme left and one should be extreme right and they grow as we push the data. **/


        // Approach- 1 Tc - O(n2)
        arr = new int[100];
        lowerBoundForArr1 = 0;
        upperBoundForArr1 = arr.length / 2;

        lowerBoundForArr2 = arr.length / 2 + 1;
        upperBoundForArr2 = arr.length - 1;

        push1(10);
        push1(20);
        push1(30);
        push1(40);

        push2(60);
        push2(70);
        push2(80);
        push2(90);

        pop1();
        pop2();
    }

    private static void push1(int num) {
        arr[lowerBoundForArr1] = num;
        System.out.println("Pushed " + num);
        lowerBoundForArr1 += 1;
    }

    private static void push2(int num) {
        arr[lowerBoundForArr2] = num;
        System.out.println("Pushed " + num);
        lowerBoundForArr2 += 1;
    }

    private static void pop1() {
        arr[lowerBoundForArr1] = 0;
        System.out.println("Popped last element");
        lowerBoundForArr1 -= 1;
    }

    private static void pop2() {
        arr[lowerBoundForArr1] = 0;
        System.out.println("Popped last element");
        lowerBoundForArr1 -= 1;
    }

    // Approach- 2. Tc - O(n)

}
