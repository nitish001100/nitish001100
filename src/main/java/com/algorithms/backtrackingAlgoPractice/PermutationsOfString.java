package com.algorithms.backtrackingAlgoPractice;

public class PermutationsOfString {
    public static void main(String[] args) {
        char[] ch = new char[]{
                'A', 'B', 'C'
        };
        char[] result = new char[3];
        int[] count = new int[]{
                1, 1, 1
        };

        permutationsOfString(ch, result, count, 0);

    }

    private static void permutationsOfString(char[] input, char[] result, int[] count, int level) {
        if (level == input.length) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < input.length; i++) {
                if (count[i] == 0) {
                    continue;
                } else {
                    result[level] = input[i];
                    count[i]--;
                    permutationsOfString(input, result, count, level + 1);
                    count[i]++;
                }
            }
        }
    }
}
