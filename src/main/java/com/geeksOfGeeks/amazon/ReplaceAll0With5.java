package com.geeksOfGeeks.amazon;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll0With5 {
    public static void main(String[] args) {
        int num = 102;
        System.out.println(num + replace0with5(num));
    }

    private static double replace0with5(int num) {
        List<Integer> integerList = new ArrayList<>();

        while (num!=0) {
            if (num % 10 == 0)
                integerList.add(1);
            num = num / 10;
        }


        double numToBeAdd = 0.0;

        for (int itr = 0; itr < integerList.size(); itr++)
            numToBeAdd = 5 * Math.pow(10, integerList.get(itr));

        return numToBeAdd;
    }
}
