package com.mediumSiteCodes.basicProblems;


// @impByNitish, check the code - ownLogic.

public class MinimumNumberOfPlatformsNeededInTheStation {
    public static void main(String[] args) {
        double[] arrival = {2.00, 2.10, 3.00, 3.20, 3.50, 5.00};
        double[] departure = {2.30, 3.40, 3.20, 4.30, 4.00, 5.20};
        System.out.println(countPlatforms(arrival, departure));
    }

    private static int countPlatforms(double[] arrival, double[] departure) {
        int platforms = 0, ptr = 0, ptrArrival = 0, ptrDeparture = 0, len = arrival.length;

        while (ptr < len) {
            if (arrival[ptrArrival] < departure[ptrDeparture]) {
                platforms += 1;
                ptrArrival += 1;
            } else {
                platforms -= 1;
                ptrDeparture += 1;
            }
            ptr += 1;
        }
        return platforms;
    }

   //@code copied from http://www.techiedelight.com/minimum-number-of-platforms-needed-avoid-delay-arrival-train.
   /* public static int minPlatforms(double[] arrival, double[] departure) {
        int count = 0;
        int platforms = 0;
        int i = 0, j = 0;
        while (i < arrival.length) {
            if (arrival[i] < departure[j]) {
                platforms = Integer.max(platforms, ++count);
                i++;
            }
            else {
                count--;
                j++;
            }
        }
        return platforms;
    }*/
}
