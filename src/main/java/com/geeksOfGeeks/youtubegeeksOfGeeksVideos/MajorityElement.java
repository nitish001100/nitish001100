package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        int element = majorityElement(arr);

        if (element == -1)
            System.out.println("No Such Element!!");
        else
            System.out.println("Majority Element is: " + element);
    }

    private static int majorityElement(int[] arr) {

        int majorityElementTrace = arr.length / 2;
        int maxCount = 0;
        int countTrace = 0;
        boolean[] trace = new boolean[arr.length];

        for (int itr = 0; itr < trace.length; itr++)
            trace[itr] = false;

        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if (trace[itr2] == false) {
                    if (arr[itr1] == arr[itr2]) {
                        countTrace = arr[itr2];
                    }
                }

                if (maxCount < countTrace) {
                    maxCount = countTrace;
                }

                if (maxCount < majorityElementTrace)
                    return maxCount;
            }
            trace[itr1] = true;
        }
        return -1;
    }
}
