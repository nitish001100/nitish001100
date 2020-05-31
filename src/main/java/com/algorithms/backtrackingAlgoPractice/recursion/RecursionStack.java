package com.algorithms.backtrackingAlgoPractice.recursion;

public class RecursionStack {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 34};

        // output = two times print for 34 found. if we add return true after line 15 in that case,
        // it will return for first 34 and second will not come in output.

//        int[] arr = {12, 3, 54, 2, 3}; //


        // Note: what ever base condition returns: that will be the output. Better to check what base condition returns and then compare it whether it is true or false and
        // then return the output.

        recursiveFunc(arr, 0, 34);

        char[] chArray = "geeksforgeeks".toCharArray();

        char[] toSearch = "quiz".toCharArray();

        System.out.println("----------------------------------------------------" +
                recursiveFuncForSubString(chArray, toSearch, 0, 0));

        System.out.println("----------------------------------------------------" +
                funcForSubString(chArray, toSearch));
    }


    private static boolean recursiveFunc(int[] arr, int index, int x) {
        if (index == arr.length)
            return true;

        if (arr[index] == x)
            System.out.println("Found value " + arr[index] + " at index: " + index);

        if (recursiveFunc(arr, index + 1, x) == true)
            return true;

        return false;
    }

    private static boolean recursiveFuncForSubString(char[] charArray, char[] toSearch, int charArrayPtr, int toSearchPtr) {

        if(charArrayPtr == charArray.length) {
            return false;
        } else if (toSearchPtr == toSearch.length)
            return true;

        if(charArray[charArrayPtr] == toSearch[toSearchPtr]){
            toSearchPtr += 1;
        } else {
            toSearchPtr  = 0;
        }

        if(recursiveFuncForSubString(charArray, toSearch, charArrayPtr + 1, toSearchPtr) == true)
            return true;

        return false;
    }

    private static boolean funcForSubString(char[] chArray, char[] toSearch) {

        int leftPtr = 0;
        int searchPtr = 0;

        while (leftPtr < chArray.length) {

            if (searchPtr == toSearch.length)
                return true;

            if (chArray[leftPtr] == toSearch[searchPtr])
                searchPtr += 1;
            else
                searchPtr = 0;
            leftPtr += 1;
        }

        return false;
    }
}
