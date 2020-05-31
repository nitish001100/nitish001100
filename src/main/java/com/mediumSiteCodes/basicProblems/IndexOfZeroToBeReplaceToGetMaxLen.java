package com.mediumSiteCodes.basicProblems;

//TODO
/** http://www.techiedelight.com/find-index-0-replaced-get-maximum-length-sequence-of-continuous-ones/ **/

public class IndexOfZeroToBeReplaceToGetMaxLen {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};
        int len = findIndexofZero(arr);
        System.out.println(len);
    }

    public static int findIndexofZero(int[] A) {
        int max_count = 0;    // stores maximum number of 1's (including 0)
        int max_index = -1;   // stores index of 0 to be replaced

        int prev_zero_index = -1;   // stores index of previous zero
        int count = 0;            // store current count of zeros

        // consider each index i of the array
        for (int i = 0; i < A.length; i++) {
            // if current element is 1
            if (A[i] == 1) {
                count++;
            } else
            // if current element is 0
            {
                // reset count to 1 + no. of ones to the left of current 0
                count = i - prev_zero_index;

                // update prev_zero_index to current index
                prev_zero_index = i;
            }

            // update maximum count & index of 0 to be replaced if required
            if (count > max_count) {
                max_count = count;
                max_index = prev_zero_index;
            }
        }

        // return index of 0 to be replaced or -1 if array contains all 1's
        return max_index;
    }
}