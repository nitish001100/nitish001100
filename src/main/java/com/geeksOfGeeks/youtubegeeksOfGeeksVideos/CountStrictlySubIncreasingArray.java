package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class CountStrictlySubIncreasingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int num = countStrictlySubIncreasingArray(arr);
        print(num);
    }

    private static void print(int num) {
        if (num == -1)
            System.out.println("No Such Element.");
        else
            System.out.println(num);
    }

    //TC- O(n2)
    private static int countStrictlySubIncreasingArray(int[] arr) {
        int count = 0;
        for (int itr1 = 0; itr1 < arr.length; itr1++) {
            for (int itr2 = itr1 + 1; itr2 < arr.length; itr2++) {
                if (arr[itr2 - 1] < arr[itr2])
                    count += 1;
                else
                    break;
            }
        }
        return count;
    }
}
