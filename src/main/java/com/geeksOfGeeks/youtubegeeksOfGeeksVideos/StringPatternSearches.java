package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class StringPatternSearches {
    public static void main(String[] args) {
        String str = "AABAACAADAABAABA";
        String pattern = "AABA";

        search(str.toCharArray(), pattern.toCharArray());
    }

    //TODO  KMP Algorithm
    private static void search(char[] chArray, char[] patternArray) {

        int left = 0, right = chArray.length - 1, patterPtr = 0, lenPattern = patternArray.length;

        while (left < right) {
            if (chArray[left] == patternArray[patterPtr]) {
                left += 1;
                patterPtr += 1;
            } else {
                left += 1;
            }

            if (patterPtr == lenPattern){
                System.out.println("Pattern found at index "+(left-lenPattern));
                patterPtr = 0;
            }

        }
    }
}
