package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class MaximumSum {
    public static void main(String[] args) {
        int arr[] = {5, 5, 10, 100, 10, 5};
        maxSum(arr);
    }

    /**
     arr[] = {5,  5, 10, 40, 50, 35}

     incl = 5
     excl = 0

     For i = 1 (current element is 5)
     incl =  (excl + arr[i])  = 5
     excl =  max(5, 0) = 5

     For i = 2 (current element is 10)
     incl =  (excl + arr[i]) = 15
     excl =  max(5, 5) = 5

     For i = 3 (current element is 40)
     incl = (excl + arr[i]) = 45
     excl = max(5, 15) = 15

     For i = 4 (current element is 50)
     incl = (excl + arr[i]) = 65
     excl =  max(45, 15) = 45

     For i = 5 (current element is 35)
     incl =  (excl + arr[i]) = 80
     excl =  max(65, 45) = 65

     And 35 is the last element. So, answer is max(incl, excl) =  80

     */
    private static void maxSum(int[] arr) {
        int incl = arr[0], excl = 0, excl_new = 0;

        for (int itr = 1; itr < arr.length; itr++) {
            excl_new = (incl > excl) ? incl : excl;
            incl = (excl + arr[itr]);
            excl = excl_new;
        }

        System.out.println(Math.max(incl, excl));
    }
}
