package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class ReverseSkipSpecialCharacters {
    public static void main(String[] args) {
        // 65 to 90  && 97 to 122
        String str = "Ab,c,de!$";
        char[] array = reverseSkipSpecialCharacters(str.toCharArray());
        printCharacterArray(array);
    }

    private static void printCharacterArray(char[] array) {
        for (int itr = 0; itr < array.length; itr++)

            System.out.print(array[itr]);
    }

    private static boolean isAlphabet(char x) {
        return ((x >= 'A' && x <= 'Z') ||
                (x >= 'a' && x <= 'z'));
    }


    private static char[] reverseSkipSpecialCharacters(char[] chArray) {

        int left = 0;
        int right = chArray.length - 1;

        while (left < right) {
            if (!isAlphabet(chArray[left]))
                left++;
            else if (!isAlphabet(chArray[right]))
                right--;
            else {
                char ch = 0;
                ch = chArray[left];
                chArray[left] = chArray[right];
                chArray[right] = ch;
                left++;
                right--;
            }
        }
        return chArray;
    }
}
