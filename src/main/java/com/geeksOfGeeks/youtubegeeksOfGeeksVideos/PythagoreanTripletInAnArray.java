package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class PythagoreanTripletInAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
//        int[] arr = {10, 4, 6, 12, 5};
        boolean num = pythagoreanTripletInAnArrayN3(arr);
        print(num);
    }

    private static void print(boolean num) {
        if (num == false)
            System.out.println("No Such pythagorean triplet in an array.");
        else
            System.out.println(num);
    }

    // TC: O(n3)
    private static boolean pythagoreanTripletInAnArrayN3(int[] arr) {
        boolean presentFlag = false;
        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                for (int itr3 = itr2 + 1; itr3 < arr.length; itr3++) {
                    if ((Math.pow(arr[itr1], 2) + Math.pow(arr[itr2], 2)) == (Math.pow(arr[itr3], 2))) {
                        presentFlag = true;
                        break;
                    }
                }
            }
        }
        return presentFlag;
    }

    /**
     Method 2 (Use Sorting) :
     We can solve this in O(n2) time by sorting the array first.
     1) Sort the squared array in increasing order. This step takes O(nLogn) time.
     2) To find a triplet (a, b, c) such that a2 = b2 + c2, do following.
     */

    private static boolean pythagoreanTripletInAnArrayN2(int[] arr) {

        return false;
    }
}
