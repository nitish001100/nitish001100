package com.treeAndGraph;

public class OddPairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        oddPairSum(arr);
        System.out.println("------------------------------------------------------------");
        oddPairSum2(arr);
    }

    private static void oddPairSum(int[] arr) {
        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] % 2 != 0) {
                int itr2 = 0;
                while (itr2 < arr.length) {
                    if (arr[itr2] % 2 == 0)
                        System.out.println(arr[itr] + "," + arr[itr2]);
                    itr2 += 1;
                }
            }
        }
    }


    private static void oddPairSum2(int[] arr) {
        int leftPtr = 0;
        int rightPtr = arr.length - 1;

        while (leftPtr < rightPtr) {
            while (leftPtr < rightPtr) {
                if (arr[leftPtr] % 2 != 0) {
                    if (arr[rightPtr] % 2 == 0) {
                        System.out.println(arr[leftPtr] + "," + arr[rightPtr]);
                    }
                    rightPtr -= 1;
                }
                else
                    leftPtr+=1;
            }
            leftPtr += 1;
            rightPtr = arr.length - 1;
        }
    }
}
