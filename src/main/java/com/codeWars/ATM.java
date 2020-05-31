package com.codeWars;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    public int solve(int n) {

        int amount = n;
        int[] notes = new int[]{500, 200, 100, 50, 20, 10};

        int[] noteCounter = new int[6];

        for (int i = 0; i < 6; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        int count = 0, counter = 0;
        for (int i = 0; i < 6; i++) {
            if (noteCounter[i] != 0) {
                count = count + noteCounter[i] * notes[i];
                counter = counter + noteCounter[i];
            }
        }

        if (count == n)
            return counter;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ATM().solve(1500));
        System.out.println(decode("6015mer"));
        System.out.println(decode("5057aan"));
        int[] arr = {4, 5, 6, 7, 8, 9, 11};

        System.out.println(find(arr));
    }

    public static String decode(String r) {
        char[] aplhabets = new char[26];

        for (int i = 0; i < aplhabets.length; i++)
            aplhabets[i] = (char) (i + 97);

        char[] chArray = r.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        int num = 0, ptr = 0;
        for (int i = 0; i < chArray.length; i++) {
            if (((int) chArray[i] - 48) >= 0 && ((int) chArray[i] - 48) <= 9) {
                num = 10 * num + ((int) chArray[i] - 48);
                ptr += 1;
            }
        }

        for (int i = ptr; i < chArray.length; i++) {
            stringBuilder.append(aplhabets[((int) chArray[i] - 97) * num % 26]);
        }

        if ((num + stringBuilder.toString()).equals(r))
            return "Impossible to decode";
        else
            return num + stringBuilder.toString();
    }

    static Integer find(final int[] array) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            if (array[i] == (array[i - 1] + 1))
                continue;
            else {
                list.add(array[i]);
            }
        }

        if (list.size() == array.length || list.size() == 0)
            return null;
        else
            return list.get(0);
    }
}
