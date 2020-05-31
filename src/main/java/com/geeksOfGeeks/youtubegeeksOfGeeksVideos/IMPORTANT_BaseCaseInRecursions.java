package com.geeksOfGeeks.youtubegeeksOfGeeksVideos;

public class IMPORTANT_BaseCaseInRecursions {
    public static void main(String[] args) {
        int num = 4;
        int result = factorialOfANumber(num);
        System.out.println(result);
    }

    private static int factorialOfANumber(int num) {
        if (num == 0)
            return 1;

        return num * factorialOfANumber(num - 1);
    }
}
