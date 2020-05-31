package com.mediumSiteCodes.basicProblems;

public class TrappingWater {
    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        trap(arr);
    }

    public static int trap(int[] bars) {
        int n = bars.length;
        int water = 0;

        int[] left = new int[n - 1];
        left[0] = Integer.MIN_VALUE;

        for (int i = 1; i < n - 1; i++)
            left[i] = Integer.max(left[i - 1], bars[i - 1]);

        int right = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 1; i--) {
            right = Integer.max(right, bars[i + 1]);
            if (Integer.min(left[i], right) > bars[i])
                water += Integer.min(left[i], right) - bars[i];
        }
        return water;
    }
}
