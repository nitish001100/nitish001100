package com.mediumSiteCodes.basicProblems.problemsProgrammer;

public class RearrangeAnArrayInOrderLargestSecondLargestSmallestSecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        rearrangeAnArrayInOrderLargestSecondLargestSmallestSecondSmallest(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rearrangeAnArrayInOrderLargestSecondLargestSmallestSecondSmallest(int[] arr) {
        for (int i = 0; i < arr.length-1; i += 2) {
            MaxAndMin maxAndMin = findMaxAndMin(arr, i);
            swapForMin(arr, maxAndMin, i, maxAndMin.getMinIndex());
            swapForMax(arr, maxAndMin, i + 1, maxAndMin.getMaxIndex());
        }
    }

    private static void swapForMax(int[] arr, MaxAndMin maxAndMin, int i, int maxIndex) {
        int temp = arr[i];
        arr[i] = maxAndMin.getMax();
        arr[maxIndex] = temp;
    }

    private static void swapForMin(int[] arr, MaxAndMin maxAndMin, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = maxAndMin.getMin();
        arr[minIndex] = temp;
    }

    public static MaxAndMin findMaxAndMin(int[] arr, int ptr) {
        MaxAndMin maxAndMin = new MaxAndMin();
        maxAndMin.setMax(Integer.MIN_VALUE);
        maxAndMin.setMin(Integer.MAX_VALUE);
        for (int i = ptr; i < arr.length; i++) {
            if (arr[i] > maxAndMin.getMax()) {
                maxAndMin.setMax(arr[i]);
                maxAndMin.setMaxIndex(i);
            }

            if (arr[i] < maxAndMin.getMin()) {
                maxAndMin.setMin(arr[i]);
                maxAndMin.setMinIndex(i);
            }
        }
        return maxAndMin;
    }

    static class MaxAndMin {
        private int max;
        private int min;
        private int maxIndex;
        private int minIndex;

        public int getMaxIndex() {
            return maxIndex;
        }

        public void setMaxIndex(int maxIndex) {
            this.maxIndex = maxIndex;
        }

        public int getMinIndex() {
            return minIndex;
        }

        public void setMinIndex(int minIndex) {
            this.minIndex = minIndex;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }
}
