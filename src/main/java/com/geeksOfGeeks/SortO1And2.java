package com.geeksOfGeeks;

public class SortO1And2 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        Solution.sortColors(arr);
    }
}


class Solution {
    static public void sortColors(int[] nums) {
        int arr_size = nums.length;
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}