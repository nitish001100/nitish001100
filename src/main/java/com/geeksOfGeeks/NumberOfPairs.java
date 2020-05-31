package com.geeksOfGeeks;

public class NumberOfPairs {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 6};
        int[] arr2 = {1, 5};
        int count = 0;


        for (int firsrPtr = 0; firsrPtr < arr1.length; firsrPtr++) {
            for (int secondPtr = 0; secondPtr < arr2.length; secondPtr++) {
                if (Math.pow(arr1[firsrPtr], arr2[secondPtr]) > Math.pow(arr2[secondPtr], arr1[firsrPtr]))
                    count = count + 1;

            }
        }
        System.out.println(count);
    }
}
