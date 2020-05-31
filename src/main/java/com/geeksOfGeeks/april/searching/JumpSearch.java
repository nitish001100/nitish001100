package com.geeksOfGeeks.april.searching;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int elementToBeFind = 55;
        int index = jumpSearch(arr, elementToBeFind);
        System.out.println(index);
    }

    /** How much Jump we have to do - that we will decide thru sqrt(arr.length) = sqrt(16) = 4
     *  Math.floor(Math.sqrt(17)) = Math.floor ( 4.2222563789809897) = (int)4.0  = 4
     */

    private static int jumpSearch(int[] arr, int elementToBeFind) {

        int jumpTooBeTaken = (int) Math.floor(Math.sqrt(arr.length));
        int slowPtr = 0;
        int fastPtr = slowPtr + jumpTooBeTaken;

        while (!(arr[slowPtr] <= elementToBeFind && elementToBeFind <= arr[fastPtr])) {
            slowPtr = fastPtr + 1;
            fastPtr = slowPtr + jumpTooBeTaken;
        }

        //linear Search between slowPtr && fastPtr.
        for (int itr = slowPtr; itr < fastPtr; itr++) {
            if (arr[slowPtr] == elementToBeFind)
                return slowPtr;
        }

        return -1;
    }

    /** Time complexity = sqrt(n) = Let's say n=4, so sqrt(n) = 2 **/
}
