package com.payPal;

import java.sql.Array;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.valueOf(scanner.nextLine());

        while (testCases > 0) {

            String[] nmk = scanner.nextLine().split(" ");

            int N = Integer.valueOf(nmk[0]);
            int M = Integer.valueOf(nmk[1]);
            int K = Integer.valueOf(nmk[2]);

            String[] houses = scanner.nextLine().split(" ");

            List<int[]> costList = new ArrayList<>();

            int counter = N;

            while (counter > 0) {
                String[] splittedCost = scanner.nextLine().split(" ");
                int[] arr = new int[2];
                for (int ptr = 0; ptr < splittedCost.length; ptr++)
                    arr[ptr] = Integer.valueOf(splittedCost[ptr]);
                costList.add(arr);
                counter -= 1;
            }

            int[] housesInInteger = new int[houses.length];

            for (int ptr = 0; ptr < houses.length; ptr++)
                housesInInteger[ptr] = Integer.valueOf(houses[ptr]);

            int value = solution(housesInInteger, K, costList);
            System.out.println("Solution -> " + value);

            testCases -= 1;
        }

    }


    private static void solution(int[] arr, List<int[]> costList, int paint, int houses, int K) {

        int sum = 0;
        for (int itr = 0; itr < arr.length; itr++) {
            if (arr[itr] == 0) {

                /*  100 20
                    30 59
                    71 81
                    9 200
                 */

                Map<Integer, Integer> map = new HashMap<>();
                // K,costs

                int ptr = 0;

                while (houses > 0) {
                    int lastPaint = paint;
                    while (paint > 0) {
                        while (lastPaint < houses) {





                            lastPaint+=1;
                        }
                        paint -= 1;
                    }
                    houses += 1;
                }
            }

        }
    }


    private static int checkContagiousAndReturnK(int[] arr) {

        int slowPtr = 0, fastPtr = 1, count = 0;
        while (slowPtr < arr.length) {
            while (fastPtr < arr.length) {

                if (arr[slowPtr] == arr[fastPtr]) {
                    slowPtr += 1;
                    fastPtr += 1;
                } else {
                    count += 1;
                    slowPtr = fastPtr;
                    fastPtr = fastPtr + 1;
                }

                if (fastPtr == arr.length) {
                    count += 1;
                }
            }
            return count;
        }
        return -1;
    }


    private static int solution(int[] housesInInteger, int K, List<int[]> costList) {
        int[] costArray = new int[housesInInteger.length];

        for (int i = 0; i < housesInInteger.length; i++)
            costArray[i] = housesInInteger[i];

        int value = Integer.MAX_VALUE;
        int sum = 0;

        if (K == 1) {
            for (int itr = 0; itr < housesInInteger.length; itr++) {
                if (housesInInteger[itr] != 0)
                    if (housesInInteger[itr] != 0 && housesInInteger[itr] < value) {
                        value = housesInInteger[itr];
                    }
            }
            for (int itr = 0; itr < housesInInteger.length; itr++) {
                if (costArray[itr] == 0) {
                    costArray[itr] = cost(costList, itr, value);
                    sum += costArray[itr];
                }
            }
        }

        if (K != 1) {


            int[] houses = housesInInteger;

            int[] costHouse = new int[houses.length];
            Arrays.fill(costHouse, 0);

            int ptrForCostHouse = 0;
            for (int i = 0; i < houses.length; i++) {
                if (houses[i] != 0) {
                    costHouse[i] = houses[i];
                    ptrForCostHouse += 1;
                }
            }

            int numbersOfHousesAlreadyPainted = ptrForCostHouse;

            int checkForK = 0;
            int remainingKs = 0;

            for (int itr = 0; itr < numbersOfHousesAlreadyPainted; itr++) {
                if (costHouse[itr] == costHouse[itr + 1]) {
                    checkForK += 1;
                    remainingKs = K - checkForK;
                } else if (costHouse[itr + 1] == 0) {
                    checkForK += 1;
                    remainingKs = K - checkForK;
                } else if (costHouse[itr] != costHouse[itr + 1]) {
                    checkForK += 2;
                    remainingKs = K - checkForK;
                }
            }

            for (int itr = numbersOfHousesAlreadyPainted + 1; itr <= costHouse.length - remainingKs; itr++) {
                int var = returnCostForNonKEqualToOne(costList, itr - 1);
                System.out.println(var);
            }
        }
        return sum;
    }


    private static int returnCostForNonKEqualToOne(List<int[]> costList, int index) {
        int minValue = minCost(costList, index, index - 1);
        return minValue;
    }

    private static int cost(List<int[]> costList, int itr, int value) {
        int[] var = costList.get(itr);
        return var[value - 1];
    }

    private static int minCost(List<int[]> costList, int index, int prevIndex) {
        int[] arr = costList.get(index);
        int min = Integer.MAX_VALUE;
        for (int itr = 0; itr < arr.length; itr++) {
            if (itr != prevIndex)
                if (min > arr[itr]) {
                    min = arr[itr];
                }
        }
        return min;
    }


}
