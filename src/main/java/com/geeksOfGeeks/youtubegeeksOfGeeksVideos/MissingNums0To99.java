package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class MissingNums0To99 {

    public static void main(String[] args) {
        int[] arr = {88, 105, 3, 2, 200, 0, 10};
        missingNum0To99(arr);
    }


    //TC : O(N)
    private static void missingNum0To99(int[] arr) {
        boolean[] flagArray = new boolean[100];
        for (int itr = 0; itr < flagArray.length; itr++)
            flagArray[itr] = false;

        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] < 100)
                flagArray[itr] = true;
        }

        int LIMIT = 100;

        int i = 0;
        while (i < LIMIT) {
            if (flagArray[i] == false) {
                int j = i + 1;
                while (j < LIMIT && flagArray[j] == false)
                    j++;
                int p = j - 1;
                System.out.println(i + 1 == j ? i : i + "-" + p);
                i = j;
            } else
                i++;
        }
    }
}