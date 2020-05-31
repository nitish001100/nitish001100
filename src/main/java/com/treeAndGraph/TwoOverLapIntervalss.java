package com.treeAndGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoOverLapIntervalss {

    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "["+this.start+","+this.end+"]" ;
        }
    }


    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,5));
        intervals.add(new Interval(6,10));
        intervals.add(new Interval(12,15));
        overLapFunction(intervals);
        intervals.add(new Interval(3,7));
        overLapFunction(intervals);



        findIntervalOverlaps(intervals);

    }

    // Logic -1 // Not much efficient
    private static void overLapFunction(ArrayList<Interval> intervals){
        System.out.println("Given Interval: " + Arrays.toString(intervals.toArray()));
        boolean isIntersect = false;
        Collections.sort(intervals, (o1, o2) -> o1.start - o2.start);
        Interval prevInterval = (Interval) intervals.get(0);
        for (int i = 1; i <intervals.size() ; i++) {
            Interval current = (Interval)intervals.get(i);

            if(current.start<prevInterval.end){
                isIntersect = true;
                break;
            }
        }
        if(isIntersect)
            System.out.println("Intervals are overlapping");
        else
            System.out.println("No intervals overlap");
        System.out.println("-------------------------------------------");
    }
    //  Logic -2 // Efficient Solution -- Nice and efficient Approach in O(N + last_end_time).
    //  1: Find the max end time, so that you can initialize an array of same size ( len + 1 ), +1 because index start from 0 and lowest interval time will 1.
    //  2: Initialize start time to 1 and end time to -1. Why ?????????????????
    //  1     5,    6     10,   12   15
    //     3           7
    //  1    -1
    //              1     -1
    //                          1     -1
    //     1          -1
    // See, two 1's come together, because there is overlap in interval.

    public static void findIntervalOverlaps(ArrayList<Interval> intervals){

        System.out.println("Given Interval: " + Arrays.toString(intervals.toArray()));

        //find the last end time
        int lastTime = -1;
        for (int i = 1; i <intervals.size() ; i++) {
            if(lastTime<intervals.get(i).end)
                lastTime = intervals.get(i).end;
        }

        int [] count = new int[lastTime+1];
        boolean isIntersect = false;
        for (int i = 0; i <intervals.size() ; i++) {
            Interval current = intervals.get(i);
            //mark the count +1 for start time and -1 for end time
            count[current.start] = 1;
            count[current.end] = -1;
        }

        int sum = 0;
        for (int i = 0; i <count.length ; i++) {
            sum += count[i];
            if(sum>1){
                isIntersect = true;
                break;
            }
        }
        if(isIntersect)
            System.out.println("Intervals are overlapping");
        else
            System.out.println("No intervals overlap");

        System.out.println("-------------------------------------------");
    }

}
