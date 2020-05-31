package com.payPal;

import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTestCases = Integer.valueOf(scanner.nextLine());

        while (noOfTestCases > 0) {

            String[] strArray = scanner.nextLine().split(" ");
            int N = Integer.valueOf(strArray[0]);
            int K = Integer.valueOf(strArray[1]);

            int[] inputArray = new int[N];

            String[] str0 = scanner.nextLine().split(" ");
            for (int itr = 0; itr < str0.length; itr++)
                inputArray[itr] = Integer.valueOf(str0[itr]);

            int[] inputArrayForBob = inputArray;
            int[] inputArrayForAlice = inputArray;


            int[] checkMax = new int[100000];

            int counter = 0;
            int kForFillSubArrays = K;
            StringBuilder stringBuilderForAlice = new StringBuilder();
            while (kForFillSubArrays > 0) {
                String[] splitted = scanner.nextLine().split(" ");
                stringBuilderForAlice.append(splitted[0] + "," + splitted[1] + ",");
                if (Integer.valueOf(splitted[0]) == Integer.valueOf(splitted[1])) {
                    checkMax[counter] = Integer.valueOf(splitted[0]);
                    counter += 1;
                } else {
                    for (int i = Integer.valueOf(splitted[0]); i <= Integer.valueOf(splitted[1]); i++)
                        checkMax[counter++] = i;
                }
                kForFillSubArrays -= 1;
            }

            int index = 0;
            for (int i = 0; i < checkMax.length; i++) {
                if(checkMax[i] == 0) {
                    index = i;
                    break;
                }
            }

            int[] checkMax2 = new int[index];
            for (int i = 0; i < checkMax2.length; i++)
                checkMax2[i] = checkMax[i];

            checkMax = checkMax2;

            // For Alice Calculation.

            int sumForAlice = 0, kForAlice = K;
            String[] aliceArray = stringBuilderForAlice.toString().substring(0, stringBuilderForAlice.toString().length() - 1).split(",");
            int counterForAlice = 0;
            while (kForAlice > 0) {
                for (int i = Integer.valueOf(aliceArray[counterForAlice]) -1 ; i <= Integer.valueOf(aliceArray[counterForAlice+1]) -1; i++) {
                    sumForAlice = sumForAlice + inputArrayForAlice[i];
                }
                counterForAlice+=2;
                kForAlice -= 1;
            }


            // For Bob Calculation

            Arrays.sort(inputArrayForBob);

            Map<Integer, Integer> occurencesAndStoredInMap = checkOccurencesAndStoredInMap(checkMax);

            int sumForBob = 0;
            int rightPtr = inputArrayForBob.length - 1;
            int kForSum = K;

            while (kForSum > 0 && rightPtr >=0) {
                Map.Entry<Integer, Integer> maxEntry = checkMaxValue(occurencesAndStoredInMap);
                int key = maxEntry.getKey();
                int value = maxEntry.getValue();
                sumForBob = sumForBob + value * inputArrayForBob[rightPtr];
                occurencesAndStoredInMap.remove(key);
                rightPtr -= 1;
                kForSum -= 1;
            }

            System.out.println(sumForBob-sumForAlice);
            noOfTestCases -= 1;
        }

    }

    private static Map.Entry<Integer, Integer> checkMaxValue(Map<Integer, Integer> occurencesAndStoredInMap) {
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : occurencesAndStoredInMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        return maxEntry;
    }

    private static Map<Integer, Integer> checkOccurencesAndStoredInMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int itr = 0; itr < array.length; itr++) {
            if (map.containsKey(array[itr])) {
                int value = map.get((int) array[itr]);
                map.put(array[itr], value + 1);
            } else {
                map.put(array[itr], 1);
            }
        }
        return map;
    }
}
