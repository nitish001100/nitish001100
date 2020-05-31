package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

import java.util.Arrays;

//TODO
class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeInterval {
    public static void main(String[] args) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        Arrays.sort(arr);

        printArray(arr);
//        mergeInterval(arr);
    }

    private static void printArray(Interval[] arr) {
        for (int itr = 0; itr < arr.length; itr++)
            System.out.print(arr[itr]+" ");
    }

    private static void mergeInterval(Interval[] arr) {
        int counter = 0;
        int len = arr.length - 1;
        int start = 0;
        int end = 0;

        while (counter < len) {
            if (start == 0) {
                start = arr[counter].start;
            } else if (arr[counter].start < start) {
                start = arr[counter].start;
            } else {

            }

            if (end == 0) {
                end = arr[counter].end;
            } else if (arr[counter].end < end) {
                end = arr[counter].end;
            }
        }
    }
}
