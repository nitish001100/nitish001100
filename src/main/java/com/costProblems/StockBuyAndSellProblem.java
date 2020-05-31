package com.costProblems;

public class StockBuyAndSellProblem {
    public static void main(String[] args) {
        int[] stockArray = {100, 120, 150, 200, 80, 50, 110, 150, 200, 210};
        findMinAndMax(stockArray);
    }


    private static void findMinAndMax(int[] stockArray) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = 0;
        int maxIndex = 0;

        for (int itr = 0; itr < stockArray.length; itr++) {
            if (stockArray[itr] < min) {
                min = stockArray[itr];
                minIndex = itr;
            }

            if (stockArray[itr] > max) {
                max = stockArray[itr];
                maxIndex = itr;
            }
        }

        System.out.println("Min Value - " + min + "\nMin Index - " + (minIndex + 1) + "\nMax Value - " + max + "\nMax Index - " + (maxIndex + 1));
        double profit = calculateProfit(min, max);
        System.out.println("Profit in percentage - " + profit);

    }

    private static double calculateProfit(int min, int max) {
        return ((max - min) * 100) / min;
    }
}
