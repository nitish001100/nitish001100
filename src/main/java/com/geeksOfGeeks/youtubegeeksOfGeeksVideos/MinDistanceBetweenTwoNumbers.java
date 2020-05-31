package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class MinDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 5, 4, 4, 2, 3};
        int x = 3, y = 2;
        int count = minDistance(arr, x, y);

        if (count == -1)
            System.out.println("No end point is available");
        else
            System.out.println("Min Distance is: " + count + " <== this solves with complexity of O(n2) ");

        int maxCount = minDistanceWithComplexityN(arr, x, y);
        if (maxCount == 0)
            System.out.println("No distance found.");
        else
            System.out.println("Max Distance is: " + maxCount +" <== this solves with complexity of O(n) ");
    }

    // Worst Case  Tc : O(n2)
    private static int minDistance(int[] arr, int startPoint, int endPoint) {
        int x = startPoint;
        int y = endPoint;
        int count = 1;
        int counter = 0;
        int len = arr.length;
        while (counter < len) {
            if (arr[counter] == x) {
                x = counter;
                for (int i = counter + 1; i < arr.length; i++) {
                    if (!(arr[i] == y))
                        count += 1;
                    else {
                        y = counter;
                        break;
                    }
                }
            }
            counter += 1;
        }
        if (endPoint == 0)
            return -1;
        else
            return count;
    }


    private static int minDistanceWithComplexityN(int[] arr, int startPoint, int endPoint) {

        int len = arr.length, frontSide = 0, backSide = len - 1, count = 0;

        while (len > 0) {
            if (!(arr[frontSide] == startPoint)) {
                frontSide += 1;
            } else if (!(arr[backSide] == endPoint)) {
                backSide -= 1;
            }

            if (arr[frontSide] == startPoint && arr[backSide] == endPoint) {
                count = backSide - frontSide;
                break;
            }
        }

        return count;
    }
}
