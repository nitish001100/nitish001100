package com.mediumSiteCodes.basicProblems;


//impByNitish http://www.techiedelight.com/find-maximum-sequence-of-continuous-1s-can-formed-replacing-k-zeroes-ones/
public class MaximumSequenceOfContinousOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0};

        maximumContinousOne(arr);

        int k = 0;
        longestSeq(arr, k);
    }

    public static void longestSeq(int[] A, int k) {
        int left = 0;    // left represents current window's starting index
        int count = 0;   // stores number of zeros in current window
        int window = 0;  // stores maximum number of continuous 1's found
        // so far (including k zeroes)

        int leftIndex = 0;  // store left index of max window found so far

        // maintain a window [left..right] containing at-most k zeroes
        for (int right = 0; right < A.length; right++) {
            // if current element is 0, increase count of zeros in the
            // current window by 1
            if (A[right] == 0) {
                count++;
            }

            // window becomes unstable if number of zeros in it becomes
            // more than
            while (count > k) {
                // if we have found zero, decrement number of zeros in the
                // current window by 1
                if (A[left] == 0) {
                    count--;
                }

                // remove elements from the window's left side till window
                // becomes stable again
                left++;
            }

            // when we reach here, the window [left..right] contains at-most
            // k zeroes and we update max window size and leftmost index
            // of the window
            if (right - left + 1 > window) {
                window = right - left + 1;
                leftIndex = left;
            }
        }
    }

    // Max subarray which contains all 1's in O(N).
    public static void maximumContinousOne(int[] arr) {
        int maxLen = Integer.MIN_VALUE, startIndex = 0, endIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = 0;
            if (arr[i] != 0) {
                len += 1;
                startIndex = i;
            } else {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] != 0) {
                    len += 1;
                } else {
                    endIndex = j - 1;
                    i = j + 1;
                    i = i - 1;
                    break;
                }
            }

            if (len > maxLen) {
                maxLen = len;
            }
        }

        System.out.println(maxLen + " startIndex : " + startIndex + " endIndex : " + endIndex);
    }
}
