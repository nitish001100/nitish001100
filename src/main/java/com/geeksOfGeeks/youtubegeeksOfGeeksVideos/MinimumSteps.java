package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class MinimumSteps {
    public static void main(String[] args) {
        int[] targetArr = {2, 1};
        minSteps(targetArr);
    }


    private static void oneMoreMethod(int[] arr) {
        /** We can do the same by taking the input array -
         1: If num is even, divide by 2 and see the sqrt and that will the count to make that even num to 0.
         2: If num is odd, reduce by 1 and see the sqrt and that will the count to make that even num to 0.
         */

        int count = 0;
        for (int itr = 0; itr < arr.length; itr++) {

            if(arr[itr] == 1){
                count+=1;
            }

            if(arr[itr] == 2){
                count+=1;
            }

            if (arr[itr] % 2 == 0 && arr[itr]!=2) {
                int value = (int) Math.sqrt(arr[itr]);

            } else if(arr[itr]!=1){

            }
        }
    }
    // Tc : O(N2)

    private static void minSteps(int[] arr) {
        int[] inputArr = new int[arr.length];

        int count = 0;
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = 1;
            count += 1;
        }

        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] % 2 == 0) {
                int value = (int) Math.sqrt(arr[itr]);

                for (int i = 0; i < inputArr.length; i++)
                    inputArr[i] *= Math.pow(value, 2);

                count += value;
                if (checker(inputArr, arr))
                    break;
                else
                    continue;
            } else {
                arr[itr] += 1;
                count += 1;
            }
        }
        System.out.println(count);
    }

    private static boolean checker(int[] arr1, int[] arr2) {
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                flag = true;
            } else
                flag = false;
        }
        return flag;
    }
}
