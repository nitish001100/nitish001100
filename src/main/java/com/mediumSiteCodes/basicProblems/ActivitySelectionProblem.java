package com.mediumSiteCodes.basicProblems;


class Activity {
    private int startTime;
    private int endTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 8}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 13}, {12, 14}};

        Activity[] activities = new Activity[arr.length];

        for (int i = 0; i < arr.length; i++) {
            Activity activity = new Activity();
            activity.setStartTime(arr[i][0]);
            activity.setEndTime(arr[i][1]);
            activities[i] = activity;
        }

        activitySelectionProblem(activities);


    }

    private static void activitySelectionProblem(Activity[] arr) {

        int finishTime = arr[0].getEndTime();

        System.out.println(arr[0].getStartTime() + "," + arr[0].getEndTime());
        for (int i = 1; i < arr.length; i++) {
            if (finishTime < arr[i].getStartTime()) {
                System.out.println(arr[i].getStartTime() + "," + arr[i].getEndTime());
                finishTime = arr[i].getEndTime();
            }
        }
    }
}
