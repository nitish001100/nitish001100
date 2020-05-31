package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        arr = reverseAnArray(arr);

        for (int itr = 0; itr < arr.length; itr++)
            System.out.print(arr[itr] + " ");

        System.out.println();

        String s = "Nitish";
        char[] chArray = reverseAnString(s.toCharArray());

        for (int itr = 0; itr < chArray.length; itr++)
            System.out.print(chArray[itr] + " ");

    }

    // Tc : O(N)
    private static int[] reverseAnArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = 0;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right-= 1;
        }
        return arr;
    }

    // Tc : O(N)
    private static char[] reverseAnString(char[] ch) {
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = 0;
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left += 1;
            right-=1;
        }

        return ch;
    }

}
