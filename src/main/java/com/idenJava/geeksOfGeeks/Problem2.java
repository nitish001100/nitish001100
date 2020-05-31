package com.idenJava.geeksOfGeeks;

/**
    Minimum increment or decrement operations required to make the array sorted.
 */

public class Problem2 {

    static int[] solution(int[] arr){
        for (int i = 0; i < arr.length; ) {
            for (int j = i+1; j < arr.length;) {
                if(!(arr[i] < arr[j])){
                    int diff = arr[i] - arr[j];
                    arr[j] = arr[j] + diff;
                    i = i+2;
                    j = j+2;
                }else {
                    i = i+1;
                    j = j+1;
                }
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 3};
        int[] resultedArray = solution(arr);

        for (int i = 0; i < resultedArray.length; i++) {
            System.out.print(resultedArray[i]+" ");
        }
    }
}
