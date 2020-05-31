package com.idenJava.ds.DataStructures;

import java.util.BitSet;

public class MissingNumbers {

    void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,6,7,9};
        MissingNumbers missingNumbers = new MissingNumbers();
        missingNumbers.printMissingNumber(arr,10);
    }
}
