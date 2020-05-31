package com.algorithms.backtrackingAlgoPractice.importantQuestions;

import java.util.ArrayList;

class FormStringWithXAndY {

    static int inputOne = 3, inputZero = 2, count = 0;

    public static void main(String[] args) {
        char arr[] = {'1', '1', '1', '0', '0'};

        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            al.add(arr[i]);

        getPermutations("", al)
                .stream()
                .forEach(input -> {
                        if (fun(input) == true) {
                            if (isValid(input) == true) {
                                count+=1;
                        }
                    }
                });

        System.out.println(count % 999983);
    }

    public static boolean isValid(String str) {

        int zero = 0, one = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                zero += 1;
            if (str.charAt(i) == '1')
                one += 1;
        }

        if (inputOne == one && inputZero == zero)
            return true;

        return false;
    }


    public static boolean fun(String s) {
        int one = 0, zero = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0')
                zero++;
            else
                one++;
        }
        if (zero > one)
            return false;
        return true;
    }

    private static ArrayList<String> getPermutations(String currentResult, ArrayList<Character> possibleChars) {
        ArrayList<String> result = new ArrayList<>(possibleChars.size());
        for (char append : possibleChars) {
            String permutation = currentResult + append;
            result.add(permutation);
            if (possibleChars.size() > 0) {
                ArrayList<Character> possibleCharsUpdated = (ArrayList) possibleChars.clone();
                possibleCharsUpdated.remove(new Character(append));
                result.addAll(getPermutations(permutation, possibleCharsUpdated));
            }
        }
        return result;
    }


}